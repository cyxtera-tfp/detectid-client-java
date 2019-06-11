package com.cyxtera.detectid.client.detectid.oob.sms;

import com.cyxtera.detectid.client.detectid.web.service.WebServiceRequest;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Jgutierrez on 24/05/2017.
 */
@XmlRootElement(name = "op:validateSmsOtpCode")
public class ValidateSmsOtpCodeRequest extends WebServiceRequest {

    private String sharedKey;

    private String otpCode;

    private String contextBind;

    @Override
    public String toString() {
        return "ValidateSmsOtpCodeRequest{" +
                "sharedKey='" + sharedKey + '\'' +
                ", otpCode='" + otpCode + '\'' +
                ", contextBind='" + contextBind + '\'' +
                "} " + super.toString();
    }

    public String getSharedKey() {
        return sharedKey;
    }

    public ValidateSmsOtpCodeRequest setSharedKey(String sharedKey) {
        this.sharedKey = sharedKey;
        return this;
    }

    public String getOtpCode() {
        return otpCode;
    }

    public ValidateSmsOtpCodeRequest setOtpCode(String otpCode) {
        this.otpCode = otpCode;
        return this;
    }

    public String getContextBind() {
        return contextBind;
    }

    public ValidateSmsOtpCodeRequest setContextBind(String contextBind) {
        this.contextBind = contextBind;
        return this;
    }
}
