package com.cyxtera.detectid.client.detectid.oob.sms;

import com.cyxtera.detectid.client.detectid.web.service.WebServiceRequest;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Jgutierrez on 24/05/2017.
 */
@XmlRootElement(name = "op:createNewSmsOtpCode")
public class CreateNewSmsOtpCodeRequest extends WebServiceRequest {

    private String sharedKey;

    private String purpose;

    private String contextBind;

    @Override
    public String toString() {
        return "CreateNewSmsOtpCodeRequest{" +
                "sharedKey='" + sharedKey + '\'' +
                ", purpose='" + purpose + '\'' +
                ", contextBind='" + contextBind + '\'' +
                "} " + super.toString();
    }

    public String getSharedKey() {
        return sharedKey;
    }

    public CreateNewSmsOtpCodeRequest setSharedKey(String sharedKey) {
        this.sharedKey = sharedKey;
        return this;
    }

    public String getPurpose() {
        return purpose;
    }

    public CreateNewSmsOtpCodeRequest setPurpose(String purpose) {
        this.purpose = purpose;
        return this;
    }

    public String getContextBind() {
        return contextBind;
    }

    public CreateNewSmsOtpCodeRequest setContextBind(String contextBind) {
        this.contextBind = contextBind;
        return this;
    }
}
