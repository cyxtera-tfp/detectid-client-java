package net.easysol.detectid.mobile.push;

import net.easysol.detectid.web.service.DetectIDConfiguration;
import net.easysol.detectid.web.service.WebServiceBase;
import net.easysol.detectid.web.service.WebServiceException;
import net.easysol.detectid.web.service.WebServiceResponse;

/**
 * Created by Jgutierrez on 10/03/2017.
 */
public class WSPushAuth extends WebServiceBase {

    public WSPushAuth(DetectIDConfiguration detectIDConfiguration) {
        super(detectIDConfiguration);
    }

    public RequestAuthenticationToClientResponse requestAuthenticationToClient(RequestAuthenticationToClientRequest request) throws WebServiceException {
        return callWebService("WSDetectPushAuthService", "http://soap.easysol.net/detect/pushAuthService",
                "requestAuthenticationToClient", request, RequestAuthenticationToClientResponse.class);
    }


}
