package com.cyxtera.detectid.client.detectid.clients;

import com.cyxtera.detectid.client.detectid.web.service.WebServiceResponse;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by Jgutierrez on 1/08/2017.
 */
@XmlRootElement(name = "retrieveClientsListResponse")
public class RetrieveClientsListResponse extends WebServiceResponse {

    private List<Client> clients;

    public static class Client {
        private String sharedKey;

        private String businessIdentifier;

        private String mail;

        private String statusCode;

        public String getSharedKey() {
            return sharedKey;
        }

        public Client setSharedKey(String sharedKey) {
            this.sharedKey = sharedKey;
            return this;
        }

        public String getBusinessIdentifier() {
            return businessIdentifier;
        }

        public Client setBusinessIdentifier(String businessIdentifier) {
            this.businessIdentifier = businessIdentifier;
            return this;
        }

        public String getMail() {
            return mail;
        }

        public Client setMail(String mail) {
            this.mail = mail;
            return this;
        }

        public String getStatusCode() {
            return statusCode;
        }

        public Client setStatusCode(String statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        @Override
        public String toString() {
            return "Client{" +
                    "sharedKey='" + sharedKey + '\'' +
                    ", businessIdentifier='" + businessIdentifier + '\'' +
                    ", mail='" + mail + '\'' +
                    ", statusCode='" + statusCode + '\'' +
                    '}';
        }
    }

    @XmlElementWrapper(name="clients")
    @XmlElement(name="client")
    public List<Client> getClients() {
        return clients;
    }

    public RetrieveClientsListResponse setClients(List<Client> clients) {
        this.clients = clients;
        return this;
    }

    @Override
    public String toString() {
        return "RetrieveClientsListResponse{" +
                "clients=" + clients +
                "} " + super.toString();
    }
}
