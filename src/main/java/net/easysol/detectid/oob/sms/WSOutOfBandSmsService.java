package net.easysol.detectid.oob.sms;

import net.easysol.detectid.web.service.DetectIDConfiguration;
import net.easysol.detectid.web.service.WebServiceBase;
import net.easysol.detectid.web.service.WebServiceException;

/**
 * Created by Jgutierrez on 24/05/2017.
 */
public class WSOutOfBandSmsService extends WebServiceBase {

    private static final String SERVICE = "WSOutOfBandSmsService";
    private static final String URI = "http://soap.easysol.net/detect/smsService";

    public WSOutOfBandSmsService(DetectIDConfiguration detectIDConfiguration) {
        super(detectIDConfiguration);
    }

    public CreateNewSmsOtpCodeResponse createNewSmsOtpCode(CreateNewSmsOtpCodeRequest request) throws WebServiceException {
        return callWebService(SERVICE, URI,
                "createNewSmsOtpCode", request, CreateNewSmsOtpCodeResponse.class);
    }

    public ValidateSmsOtpCodeResponse validateSmsOtpCode(ValidateSmsOtpCodeRequest request) throws WebServiceException {
        return callWebService(SERVICE, URI,
                "validateSmsOtpCode", request, ValidateSmsOtpCodeResponse.class);
    }

    public InsertClientPhoneNumberResponse insertClientPhoneNumber(InsertClientPhoneNumberRequest request) throws WebServiceException {
        return callWebService(SERVICE, URI,
                "insertClientPhoneNumber", request, InsertClientPhoneNumberResponse.class);
    }
}
