package com.cyxtera.detectid.client.detectid.web.service;

/**
 * Created by Jgutierrez on 10/03/2017.
 */
public class WebServiceException extends Exception {

    public WebServiceException() {
    }

    public WebServiceException(String message) {
        super(message);
    }

    public WebServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public WebServiceException(Throwable cause) {
        super(cause);
    }

    public WebServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
