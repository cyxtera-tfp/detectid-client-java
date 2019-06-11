package net.easysol.detectid.easysoltokens;

import net.easysol.detectid.web.service.DetectIDConfiguration;
import net.easysol.detectid.web.service.WebServiceBase;
import net.easysol.detectid.web.service.WebServiceException;

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
