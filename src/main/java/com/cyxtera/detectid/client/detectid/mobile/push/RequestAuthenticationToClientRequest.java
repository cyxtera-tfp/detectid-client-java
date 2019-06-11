package com.cyxtera.detectid.client.detectid.mobile.push;

import com.cyxtera.detectid.client.detectid.web.service.WebServiceRequest;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Jgutierrez on 10/03/2017.
 */
@XmlRootElement(name = "op:requestAuthenticationToClient")
public class RequestAuthenticationToClientRequest extends WebServiceRequest {

    private String sharedKey;

    private String subject;

    private String message;

    private String externalIdentifier;

    @Override
    public String toString() {
        return "RequestAuthenticationToClientRequest{" +
                "sharedKey='" + sharedKey + '\'' +
                ", subject='" + subject + '\'' +
                ", message='" + message + '\'' +
                ", externalIdentifier='" + externalIdentifier + '\'' +
                "} " + super.toString();
    }

    public String getSharedKey() {
        return sharedKey;
    }

    public RequestAuthenticationToClientRequest setSharedKey(String sharedKey) {
        this.sharedKey = sharedKey;
        return this;
    }

    public String getSubject() {
        return subject;
    }

    public RequestAuthenticationToClientRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public RequestAuthenticationToClientRequest setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getExternalIdentifier() {
        return externalIdentifier;
    }

    public RequestAuthenticationToClientRequest setExternalIdentifier(String externalIdentifier) {
        this.externalIdentifier = externalIdentifier;
        return this;
    }
}
