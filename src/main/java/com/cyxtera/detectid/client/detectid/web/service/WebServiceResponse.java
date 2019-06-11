package com.cyxtera.detectid.client.detectid.web.service;

/**
 * Created by Jgutierrez on 10/03/2017.
 */
public class WebServiceResponse {

    private int resultCode;

    private String resultDescription;

    @Override
    public String toString() {
        return "WebServiceResponse{" +
                "resultCode=" + resultCode +
                ", resultDescription='" + resultDescription + '\'' +
                '}';
    }

    public int getResultCode() {
        return resultCode;
    }

    public WebServiceResponse setResultCode(int resultCode) {
        this.resultCode = resultCode;
        return this;
    }

    public String getResultDescription() {
        return resultDescription;
    }

    public WebServiceResponse setResultDescription(String resultDescription) {
        this.resultDescription = resultDescription;
        return this;
    }
}
