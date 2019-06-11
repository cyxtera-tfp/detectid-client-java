package net.easysol.detectid.oob.mail;

import net.easysol.detectid.web.service.WebServiceRequest;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Jgutierrez on 24/05/2017.
 */
@XmlRootElement(name = "op:createNewMailOtpCode")
public class CreateNewMailOtpCodeRequest extends WebServiceRequest {

    private String sharedKey;

    @Override
    public String toString() {
        return "CreateNewMailOtpCodeRequest{" +
                "sharedKey='" + sharedKey + '\'' +
                "} " + super.toString();
    }

    public String getSharedKey() {
        return sharedKey;
    }

    public CreateNewMailOtpCodeRequest setSharedKey(String sharedKey) {
        this.sharedKey = sharedKey;
        return this;
    }
}
