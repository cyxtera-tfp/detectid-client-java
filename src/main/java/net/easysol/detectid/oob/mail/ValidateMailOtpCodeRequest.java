package net.easysol.detectid.oob.mail;

import net.easysol.detectid.web.service.WebServiceRequest;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Jgutierrez on 24/05/2017.
 */
@XmlRootElement(name = "op:validateMailOtpCode")
public class ValidateMailOtpCodeRequest extends WebServiceRequest {

    private String sharedKey;

    private String otpCode;

    @Override
    public String toString() {
        return "ValidateMailOtpCodeRequest{" +
                "sharedKey='" + sharedKey + '\'' +
                ", otpCode='" + otpCode + '\'' +
                "} " + super.toString();
    }

    public String getOtpCode() {
        return otpCode;
    }

    public ValidateMailOtpCodeRequest setOtpCode(String otpCode) {
        this.otpCode = otpCode;
        return this;
    }

    public String getSharedKey() {
        return sharedKey;
    }

    public ValidateMailOtpCodeRequest setSharedKey(String sharedKey) {
        this.sharedKey = sharedKey;
        return this;
    }
}
