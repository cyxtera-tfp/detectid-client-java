package com.cyxtera.detectid.client.detectid.password;

import com.cyxtera.detectid.client.detectid.web.service.WebServiceRequest;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Jgutierrez on 1/08/2017.
 */
@XmlRootElement(name = "op:validatePassword")
public class ValidatePasswordRequest extends WebServiceRequest {

    private String sharedKey;

    private Password password;

    public static class Password {
        private String value;

        public String getValue() {
            return value;
        }

        public Password setValue(String value) {
            this.value = value;
            return this;
        }
    }

    public String getSharedKey() {
        return sharedKey;
    }

    public ValidatePasswordRequest setSharedKey(String sharedKey) {
        this.sharedKey = sharedKey;
        return this;
    }

    public Password getPassword() {
        return password;
    }

    public ValidatePasswordRequest setPassword(Password password) {
        this.password = password;
        return this;
    }

    @Override
    public String toString() {
        return "RegisterPasswordRequest{" +
                "sharedKey='" + sharedKey + '\'' +
                ", password=" + password +
                "} " + super.toString();
    }

}
