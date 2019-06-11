package com.cyxtera.detectid.client.detectid.easysoltokens;

import com.cyxtera.detectid.client.detectid.web.service.DetectIDConfiguration;
import com.cyxtera.detectid.client.detectid.web.service.WebServiceBase;
import com.cyxtera.detectid.client.detectid.web.service.WebServiceException;

/**
 * Created by Jgutierrez on 4/04/2017.
 */
public class WSEasysolToken extends WebServiceBase {

    private static final String SERVICE = "WSEasysolToken";
    private static final String URI = "http://soap.easysol.net/detect/EasysolTokenService";

    public WSEasysolToken(DetectIDConfiguration detectIDConfiguration) {
        super(detectIDConfiguration);
    }

    public ValidateResponse validate(ValidateRequest validateRequest) throws WebServiceException {
        return callWebService(SERVICE, URI,
                "validate", validateRequest, ValidateResponse.class);
    }

}
