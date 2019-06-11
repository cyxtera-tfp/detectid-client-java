package com.cyxtera.detectid.client.detectid.oob.mail;

import com.cyxtera.detectid.client.detectid.web.service.WebServiceBase;
import com.cyxtera.detectid.client.detectid.web.service.WebServiceException;
import com.cyxtera.detectid.client.detectid.web.service.DetectIDConfiguration;

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
