package net.easysol.detectid.mobile.push;

import net.easysol.detectid.mobile.MobileTransactionStatus;
import net.easysol.detectid.web.service.WebServiceResponse;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Jgutierrez on 11/03/2017.
 */
@XmlRootElement(name = "requestAuthenticationToClientResponse")
public class RequestAuthenticationToClientResponse extends WebServiceResponse {

    @Override
    public String toString() {
        return "RequestAuthenticationToClientResponse{" +
                "status=" + status +
                ", statusCode=" + statusCode +
                ", transactionId='" + transactionId + '\'' +
                '}';
    }

    private MobileTransactionStatus status;

    private int statusCode;

    private String transactionId;

    public int getStatusCode() {
        return statusCode;
    }

    public RequestAuthenticationToClientResponse setStatusCode(int statusCode) {
        this.statusCode = statusCode;
        status = MobileTransactionStatus.getByStatus(statusCode);
        return this;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public RequestAuthenticationToClientResponse setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    public MobileTransactionStatus getStatus() {
        return status;
    }
}
