package com.cyxtera.detectid.client.detectid.mobile;

import com.cyxtera.detectid.client.detectid.web.service.WebServiceResponse;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * Created by Jgutierrez on 11/03/2017.
 */
@XmlRootElement(name = "retrieveAuthenticationRequestStatusResponse")
public class RetrieveAuthenticationRequestStatusResponse extends WebServiceResponse {

    private String channelId;

    private Date closureDate;

    private String deviceId;

    private String factor;

    private Date registrationDate;

    private String sharedKey;

    private int statusCode;

    private String transactionId;

    private MobileTransactionStatus status;

    @Override
    public String toString() {
        return "RetrieveAuthenticationRequestStatusResponse{" +
                "channelId='" + channelId + '\'' +
                ", closureDate=" + closureDate +
                ", deviceId='" + deviceId + '\'' +
                ", factor='" + factor + '\'' +
                ", registrationDate=" + registrationDate +
                ", sharedKey='" + sharedKey + '\'' +
                ", statusCode=" + statusCode +
                ", transactionId='" + transactionId + '\'' +
                ", status=" + status +
                '}';
    }

    public MobileTransactionStatus getStatus() {
        return status;
    }

    public String getChannelId() {
        return channelId;
    }

    public RetrieveAuthenticationRequestStatusResponse setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }

    @XmlElement(name = "closure_date")
    public Date getClosureDate() {
        return closureDate;
    }

    public RetrieveAuthenticationRequestStatusResponse setClosureDate(Date closureDate) {
        this.closureDate = closureDate;
        return this;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public RetrieveAuthenticationRequestStatusResponse setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    public String getFactor() {
        return factor;
    }

    public RetrieveAuthenticationRequestStatusResponse setFactor(String factor) {
        this.factor = factor;
        return this;
    }

    @XmlElement(name = "reg_date")
    public Date getRegistrationDate() {
        return registrationDate;
    }

    public RetrieveAuthenticationRequestStatusResponse setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
        return this;
    }

    public String getSharedKey() {
        return sharedKey;
    }

    public RetrieveAuthenticationRequestStatusResponse setSharedKey(String sharedKey) {
        this.sharedKey = sharedKey;
        return this;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public RetrieveAuthenticationRequestStatusResponse setStatusCode(int statusCode) {
        this.statusCode = statusCode;
        this.status = MobileTransactionStatus.getByStatus(statusCode);
        return this;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public RetrieveAuthenticationRequestStatusResponse setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }
}
