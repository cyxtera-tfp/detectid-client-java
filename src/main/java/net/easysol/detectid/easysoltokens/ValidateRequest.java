package net.easysol.detectid.easysoltokens;

import net.easysol.detectid.web.service.WebServiceRequest;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Jgutierrez on 4/04/2017.
 */
@XmlRootElement(name = "op:validate")
public class ValidateRequest extends WebServiceRequest {

    private String sharedKey;

    private String otp;

    public String getSharedKey() {
        return sharedKey;
    }

    public ValidateRequest setSharedKey(String sharedKey) {
        this.sharedKey = sharedKey;
        return this;
    }

    public String getOtp() {
        return otp;
    }

    public ValidateRequest setOtp(String otp) {
        this.otp = otp;
        return this;
    }
}
