package net.easysol.detectid.web.service;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.request.body.RequestBodyEntity;
import net.easysol.oauth.Oauth2Authenticator;
import net.easysol.util.Http;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import java.io.InputStream;
import java.io.StringWriter;

/**
 * Created by Jgutierrez on 10/03/2017.
 */
public abstract class WebServiceBase {

    private final Log logger = LogFactory.getLog(WebServiceBase.class);

    private DetectIDConfiguration detectIDConfiguration;

    protected Oauth2Authenticator oauth2Authenticator;

    private String url;

    private static final String XML_REQUEST = "" +
            "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:op=\"${URI}\">" +
            "   <soapenv:Header/>" +
            "   <soapenv:Body>${BODY}</soapenv:Body>" +
            "</soapenv:Envelope>";

    public WebServiceBase(DetectIDConfiguration detectIDConfiguration) {
        this.detectIDConfiguration = detectIDConfiguration;
        buildUrl();
        loadCloudEnvironment();
        Http.initiateUnirest(detectIDConfiguration.getTimeout());
        logger.debug("DetectID Configuration: " + detectIDConfiguration);
    }

    protected void buildUrl() {
        url = detectIDConfiguration.getUrl();
        if (!url.endsWith("/")) {
            url += "/";
        }
        if (!detectIDConfiguration.isCloud()) {
            url += "detect/services/";
        }
    }

    protected void loadCloudEnvironment() {
        if (detectIDConfiguration.isCloud()) {
            oauth2Authenticator = new Oauth2Authenticator(detectIDConfiguration);
        }
    }

    protected <T extends WebServiceRequest, M extends WebServiceResponse> M callWebService(
            String service, String uri, String soapAction, T request, Class<M> responseType) throws WebServiceException {
        try {
            StringWriter body = new StringWriter();
            JAXBContext jaxbContext = JAXBContext.newInstance(request.getClass());
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
            jaxbMarshaller.marshal(request, body);
            String xmlRequest = XML_REQUEST.replace("${URI}", uri).replace("${BODY}", body.toString());
            if (logger.isDebugEnabled()) {
                logger.debug("XML Request: " + xmlRequest);
            }
            RequestBodyEntity response = null;
            if (detectIDConfiguration.isCloud()) {
                String accessToken = oauth2Authenticator.getAccessToken();
                response = Unirest.post(url + service)
                        .header("host", detectIDConfiguration.getCloudHost())
                        .header("Authorization", "Bearer " + accessToken)
                        .header("SOAPAction", "urn:" + soapAction)
                        .body(xmlRequest);
            } else {
                response = Unirest.post(url + service)
                        .header("SOAPAction", "urn:" + soapAction)
                        .body(xmlRequest);
            }

            Node responseNode = cleanXmlResponse(response.asBinary().getBody());
            if (logger.isDebugEnabled()) {
                logger.debug("XML Response: " + responseNode.getTextContent());
            }
            Unmarshaller unmarshaller = JAXBContext.newInstance(responseType).createUnmarshaller();
            return (M) unmarshaller.unmarshal(responseNode);
        } catch (Exception e) {
            logger.error(e, e);
            throw new WebServiceException(e);
        }
    }

    private Node cleanXmlResponse(InputStream originalResponse) throws WebServiceException {
        DocumentBuilder b = null;
        try {
            b = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document doc = b.parse(originalResponse);
            XPath xPath = XPathFactory.newInstance().newXPath();
            return (Node) xPath.evaluate("/Envelope/Body/*/*", doc.getDocumentElement(), XPathConstants.NODE);
        } catch (Exception e) {
            throw new WebServiceException(e);
        }
    }
}
