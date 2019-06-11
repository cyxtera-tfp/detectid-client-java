package net.easysol.detectid.oob.mail;

import net.easysol.detectid.web.service.WebServiceRequest;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Jgutierrez on 5/06/2017.
 */
@XmlRootElement(name = "op:insertClientEmail")
public class InsertClientEmailRequest extends WebServiceRequest {

    private String sharedKey;

    private String email;

    @Override
    public String toString() {
        return "InsertClientEmailRequest{" +
                "sharedKey='" + sharedKey + '\'' +
                ", email='" + email + '\'' +
                "} " + super.toString();
    }

    public String getSharedKey() {
        return sharedKey;
    }

    public InsertClientEmailRequest setSharedKey(String sharedKey) {
        this.sharedKey = sharedKey;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public InsertClientEmailRequest setEmail(String email) {
        this.email = email;
        return this;
    }
}
