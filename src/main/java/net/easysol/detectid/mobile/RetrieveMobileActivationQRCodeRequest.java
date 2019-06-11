package net.easysol.detectid.mobile;

import net.easysol.detectid.web.service.WebServiceRequest;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Jgutierrez on 10/03/2017.
 */
@XmlRootElement(name = "op:retrieveMobileActivationQRCode")
public class RetrieveMobileActivationQRCodeRequest extends WebServiceRequest {

    private String sharedKey;

    public String getSharedKey() {
        return sharedKey;
    }

    public RetrieveMobileActivationQRCodeRequest setSharedKey(String sharedKey) {
        this.sharedKey = sharedKey;
        return this;
    }
}
