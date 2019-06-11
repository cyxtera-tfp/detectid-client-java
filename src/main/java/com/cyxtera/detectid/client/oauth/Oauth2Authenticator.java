package com.cyxtera.detectid.client.oauth;

import com.cyxtera.detectid.client.detectid.web.service.DetectIDConfiguration;
import com.cyxtera.detectid.client.oauth.exceptions.AccessTokenException;
import com.cyxtera.detectid.client.util.Http;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.json.JSONException;

/**
 * Created by Jgutierrez on 30/06/2016.
 */
public class Oauth2Authenticator {

    private final Log logger = LogFactory.getLog(Oauth2Authenticator.class);

    public static final String OAUTH2AUTHENTICATOR_SERVICE = "oauth2/token";

    private DetectIDConfiguration detectIDConfiguration;

    private String token = null;

    private String url;

    public Oauth2Authenticator(DetectIDConfiguration detectIDConfiguration) {
        this.detectIDConfiguration = detectIDConfiguration;
        url = detectIDConfiguration.getUrl();
        if (!detectIDConfiguration.getUrl().endsWith("/")) {
            url += "/";
        }
        url += OAUTH2AUTHENTICATOR_SERVICE;
        Http.initiateUnirest(detectIDConfiguration.getTimeout());
    }

    public String getAccessToken() throws AccessTokenException {
        saveAccessToken();
        return token;
    }

    private void saveAccessToken() throws AccessTokenException {
        HttpResponse<JsonNode> jsonResponse = null;
        try {
            jsonResponse = Unirest.post(url)
                    .header("host", detectIDConfiguration.getCloudHost())
                    .queryString("grant_type", "client_credentials")
                    .queryString("client_id", detectIDConfiguration.getCloudClientId())
                    .queryString("client_secret", detectIDConfiguration.getCloudClientSecret())
                    .asJson();
            this.token = jsonResponse.getBody().getObject().get("access_token").toString();
        } catch (JSONException e) {
            logger.debug("error saveAccessToken:JSONException", e);
            throw new AccessTokenException("Access token could not be retrieved.", e);
        } catch (UnirestException e) {
            logger.debug("error saveAccessToken:UnirestException", e);
            throw new AccessTokenException("Access token could not be retrieved.", e);
        }
    }

}
