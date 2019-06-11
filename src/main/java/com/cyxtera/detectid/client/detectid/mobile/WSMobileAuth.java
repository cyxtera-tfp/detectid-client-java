package com.cyxtera.detectid.client.detectid.mobile;

import com.cyxtera.detectid.client.detectid.web.service.DetectIDConfiguration;
import com.cyxtera.detectid.client.detectid.web.service.WebServiceBase;
import com.cyxtera.detectid.client.detectid.web.service.WebServiceException;

/**
 * Created by Jgutierrez on 10/03/2017.
 */
public class WSMobileAuth extends WebServiceBase {

    private static final String SERVICE = "WSDetectMobileAuthService";
    private static final String URI = "http://soap.easysol.net/detect/mobileAuthService";

    public WSMobileAuth(DetectIDConfiguration detectIDConfiguration) {
        super(detectIDConfiguration);
    }

    public RetrieveMobileActivationQRCodeResponse retrieveMobileActivationQRCode(RetrieveMobileActivationQRCodeRequest request) throws WebServiceException {
        return callWebService(SERVICE, URI,
                "retrieveMobileActivationQRCode", request, RetrieveMobileActivationQRCodeResponse.class);
    }

    public RetrieveForClientAllRegisteredDevicesResponse retrieveForClientAllRegisteredDevices(RetrieveForClientAllRegisteredDevicesRequest request) throws WebServiceException {
        return callWebService(SERVICE, URI,
                "retrieveForClientAllRegisteredDevices", request, RetrieveForClientAllRegisteredDevicesResponse.class);
    }

    public RetrieveAuthenticationRequestStatusResponse retrieveAuthenticationRequestStatus(RetrieveAuthenticationRequestStatusRequest request) throws WebServiceException {
        return callWebService(SERVICE, URI,
                "retrieveAuthenticationRequestStatus", request, RetrieveAuthenticationRequestStatusResponse.class);
    }

}
