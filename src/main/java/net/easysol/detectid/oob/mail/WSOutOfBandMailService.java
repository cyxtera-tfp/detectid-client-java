package net.easysol.detectid.oob.mail;

import net.easysol.detectid.web.service.DetectIDConfiguration;
import net.easysol.detectid.web.service.WebServiceBase;
import net.easysol.detectid.web.service.WebServiceException;

/**
 * Created by Jgutierrez on 24/05/2017.
 */
public class WSOutOfBandMailService extends WebServiceBase {

    private static final String SERVICE = "WSOutOfBandMailService";
    private static final String URI = "http://soap.easysol.net/detect/mailService";

    public WSOutOfBandMailService(DetectIDConfiguration detectIDConfiguration) {
        super(detectIDConfiguration);
    }

    public CreateNewMailOtpCodeResponse createNewMailOtpCode(CreateNewMailOtpCodeRequest request) throws WebServiceException {
        return callWebService(SERVICE, URI,
                "createNewMailOtpCode", request, CreateNewMailOtpCodeResponse.class);
    }

    public ValidateMailOtpCodeResponse validateMailOtpCode(ValidateMailOtpCodeRequest request) throws WebServiceException {
        return callWebService(SERVICE, URI,
                "validateMailOtpCode", request, ValidateMailOtpCodeResponse.class);
    }

    public InsertClientEmailResponse insertClientEmail(InsertClientEmailRequest request) throws WebServiceException {
        return callWebService(SERVICE, URI,
                "insertClientEmail", request, InsertClientEmailResponse.class);
    }
}
