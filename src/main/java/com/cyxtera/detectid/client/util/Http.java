package com.cyxtera.detectid.client.util;

import com.mashape.unirest.http.Unirest;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContexts;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpRequestRetryHandler;
import org.apache.http.impl.client.HttpClients;

import javax.net.ssl.SSLContext;

/**
 * Created by Jgutierrez on 11/03/2017.
 */
public class Http {

    private static boolean initiated = false;

    private static int TIMEOUT = 5000;

    public static synchronized void initiateUnirest(int timeout){
        if(!initiated){
            TIMEOUT = timeout;
            Unirest.setHttpClient(makeClient());
        }
    }

    private static HttpClient makeClient() {
        javax.net.ssl.HttpsURLConnection.setDefaultHostnameVerifier(
                new javax.net.ssl.HostnameVerifier(){
                    public boolean verify(String hostname,
                                          javax.net.ssl.SSLSession sslSession) {
                        return true;
                    }
                });

        CloseableHttpClient httpclient = null;
        try {
            SSLContext sslcontext = SSLContexts.custom()
                    .loadTrustMaterial(null, new TrustSelfSignedStrategy())
                    .build();
            SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslcontext, SSLConnectionSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
            RequestConfig config = RequestConfig.custom()
                    .setConnectTimeout(TIMEOUT)
                    .setConnectionRequestTimeout(TIMEOUT)
                    .setSocketTimeout(TIMEOUT).build();
            httpclient = HttpClients.custom()
                    .setDefaultRequestConfig(config)
                    .setMaxConnTotal(400)
                    .setMaxConnPerRoute(400)
                    .setRetryHandler(new DefaultHttpRequestRetryHandler(5, true))
                    .setSSLSocketFactory(sslsf)
                    .build();
        } catch (Exception e) {
            throw new RuntimeException("Unirest could not be initiated.", e);
        }
        return httpclient;
    }

}
