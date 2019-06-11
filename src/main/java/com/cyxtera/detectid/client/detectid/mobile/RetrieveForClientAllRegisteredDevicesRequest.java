package com.cyxtera.detectid.client.detectid.mobile;

import com.cyxtera.detectid.client.detectid.web.service.WebServiceRequest;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Jgutierrez on 11/03/2017.
 */
@XmlRootElement(name = "op:retrieveForClientAllRegisteredDevices")
public class RetrieveForClientAllRegisteredDevicesRequest extends WebServiceRequest {

    private String sharedKey;

    @Override
    public String toString() {
        return "RetrieveForClientAllRegisteredDevicesRequest{" +
                "sharedKey='" + sharedKey + '\'' +
                '}';
    }

    public String getSharedKey() {
        return sharedKey;
    }

    public RetrieveForClientAllRegisteredDevicesRequest setSharedKey(String sharedKey) {
        this.sharedKey = sharedKey;
        return this;
    }
}
