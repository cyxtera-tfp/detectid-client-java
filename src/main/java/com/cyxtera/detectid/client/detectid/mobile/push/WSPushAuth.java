package com.cyxtera.detectid.client.detectid.mobile.push;

import com.cyxtera.detectid.client.detectid.web.service.SOAPWebServiceBase;
import com.cyxtera.detectid.client.detectid.web.service.WebServiceException;
import com.cyxtera.detectid.client.detectid.web.service.DetectIDConfiguration;

/**
 * Created by Jgutierrez on 10/03/2017.
 */
public class WSPushAuth extends SOAPWebServiceBase {

    public WSPushAuth(DetectIDConfiguration detectIDConfiguration) {
        super(detectIDConfiguration);
    }

    public RequestAuthenticationToClientResponse requestAuthenticationToClient(RequestAuthenticationToClientRequest request) throws WebServiceException {
        return callWebService("WSDetectPushAuthService", "http://soap.easysol.net/detect/pushAuthService",
                "requestAuthenticationToClient", request, RequestAuthenticationToClientResponse.class);
    }


}
