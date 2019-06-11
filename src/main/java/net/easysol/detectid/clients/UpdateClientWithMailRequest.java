package net.easysol.detectid.clients;

import net.easysol.detectid.web.service.WebServiceRequest;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Jgutierrez on 19/05/2017.
 */
@XmlRootElement(name = "op:updateClientWithMail")
public class UpdateClientWithMailRequest extends WebServiceRequest {

    private String sharedKey;

    private String businessIdentifier;

    private String mail;

    @Override
    public String toString() {
        return "UpdateClientWithMailRequest{" +
                "sharedKey='" + sharedKey + '\'' +
                ", businessIdentifier='" + businessIdentifier + '\'' +
                ", mail='" + mail + '\'' +
                "} " + super.toString();
    }

    public String getSharedKey() {
        return sharedKey;
    }

    public UpdateClientWithMailRequest setSharedKey(String sharedKey) {
        this.sharedKey = sharedKey;
        return this;
    }

    public String getBusinessIdentifier() {
        return businessIdentifier;
    }

    public UpdateClientWithMailRequest setBusinessIdentifier(String businessIdentifier) {
        this.businessIdentifier = businessIdentifier;
        return this;
    }

    public String getMail() {
        return mail;
    }

    public UpdateClientWithMailRequest setMail(String mail) {
        this.mail = mail;
        return this;
    }
}
