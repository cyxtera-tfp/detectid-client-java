package com.cyxtera.detectid.client.detectid.mobile;

import com.cyxtera.detectid.client.detectid.web.service.WebServiceRequest;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Jgutierrez on 11/03/2017.
 */
@XmlRootElement(name = "op:retrieveAuthenticationRequestStatus")
public class RetrieveAuthenticationRequestStatusRequest extends WebServiceRequest {

    private String transactionId;

    public String getTransactionId() {
        return transactionId;
    }

    public RetrieveAuthenticationRequestStatusRequest setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }
}
