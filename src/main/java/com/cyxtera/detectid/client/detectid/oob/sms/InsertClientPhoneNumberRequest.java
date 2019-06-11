package com.cyxtera.detectid.client.detectid.oob.sms;

import com.cyxtera.detectid.client.detectid.web.service.WebServiceRequest;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Jgutierrez on 5/06/2017.
 */
@XmlRootElement(name = "op:insertClientPhoneNumber")
public class InsertClientPhoneNumberRequest extends WebServiceRequest {

    private String sharedKey;

    private String phoneNumber;

    public String getSharedKey() {
        return sharedKey;
    }

    @Override
    public String toString() {
        return "InsertClientPhoneNumberRequest{" +
                "sharedKey='" + sharedKey + '\'' +
                ", phoneNumber=" + phoneNumber +
                "} " + super.toString();
    }

    public InsertClientPhoneNumberRequest setSharedKey(String sharedKey) {
        this.sharedKey = sharedKey;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public InsertClientPhoneNumberRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}
