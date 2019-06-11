package com.cyxtera.detectid.client.detectid.clients;

import com.cyxtera.detectid.client.detectid.web.service.WebServiceRequest;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Jgutierrez on 19/05/2017.
 */
@XmlRootElement(name = "op:deleteClient")
public class DeleteClientRequest extends WebServiceRequest {

    private String sharedKey;

    @Override
    public String toString() {
        return "DeleteClientRequest{" +
                "sharedKey='" + sharedKey + '\'' +
                '}';
    }

    public String getSharedKey() {
        return sharedKey;
    }

    public DeleteClientRequest setSharedKey(String sharedKey) {
        this.sharedKey = sharedKey;
        return this;
    }
}
