package com.cyxtera.detectid.client.detectid.password;

import com.cyxtera.detectid.client.detectid.web.service.WebServiceBase;
import com.cyxtera.detectid.client.detectid.web.service.DetectIDConfiguration;
import com.cyxtera.detectid.client.detectid.web.service.WebServiceException;

/**
 * Created by Jgutierrez on 1/08/2017.
 */
public class WSPasswordAuthService extends WebServiceBase {

    private static final String SERVICE = "WSPasswordAuthService";
    private static final String URI = "http://soap.easysol.net/detect/passwordAuthService";

    public WSPasswordAuthService(DetectIDConfiguration detectIDConfiguration) {
        super(detectIDConfiguration);
    }

    public RegisterPasswordResponse registerPassword(RegisterPasswordRequest request) throws WebServiceException {
        return callWebService(SERVICE, URI,
                "registerPassword", request, RegisterPasswordResponse.class);
    }

    public UpdatePasswordResponse updatePassword(UpdatePasswordRequest request) throws WebServiceException {
        return callWebService(SERVICE, URI,
                "updatePassword", request, UpdatePasswordResponse.class);
    }

    public ValidatePasswordResponse validatePassword(ValidatePasswordRequest request) throws WebServiceException {
        return callWebService(SERVICE, URI,
                "validatePassword", request, ValidatePasswordResponse.class);
    }
}
