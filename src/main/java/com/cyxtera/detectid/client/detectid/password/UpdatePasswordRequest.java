package com.cyxtera.detectid.client.detectid.password;

import com.cyxtera.detectid.client.detectid.web.service.WebServiceRequest;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Jgutierrez on 1/08/2017.
 */
@XmlRootElement(name = "op:updatePassword")
public class UpdatePasswordRequest extends WebServiceRequest {

    private String sharedKey;

    private Password password;

    public static class Password {
        private String value;

        private String valueConfirmation;

        public String getValue() {
            return value;
        }

        public Password setValue(String value) {
            this.value = value;
            return this;
        }

        public String getValueConfirmation() {
            return valueConfirmation;
        }

        public Password setValueConfirmation(String valueConfirmation) {
            this.valueConfirmation = valueConfirmation;
            return this;
        }
    }

    public String getSharedKey() {
        return sharedKey;
    }

    public UpdatePasswordRequest setSharedKey(String sharedKey) {
        this.sharedKey = sharedKey;
        return this;
    }

    public UpdatePasswordRequest.Password getPassword() {
        return password;
    }

    public UpdatePasswordRequest setPassword(UpdatePasswordRequest.Password password) {
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
