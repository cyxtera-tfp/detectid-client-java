package com.cyxtera.detectid.client.detectid.clients;

import com.cyxtera.detectid.client.detectid.web.service.DetectIDConfiguration;
import com.cyxtera.detectid.client.detectid.web.service.WebServiceBase;
import com.cyxtera.detectid.client.detectid.web.service.WebServiceException;

/**
 * Created by Jgutierrez on 19/05/2017.
 */
public class WSClientService extends WebServiceBase {

    private static final String SERVICE = "WSClientService";
    private static final String URI = "http://soap.easysol.net/detect/detectService";

    public WSClientService(DetectIDConfiguration detectIDConfiguration) {
        super(detectIDConfiguration);
    }

    public UpdateClientWithMailResponse updateClientWithMail(UpdateClientWithMailRequest request) throws WebServiceException {
        return callWebService(SERVICE, URI,
                "updateClientWithMail", request, UpdateClientWithMailResponse.class);
    }

    public DeleteClientResponse deleteClient(DeleteClientRequest request) throws WebServiceException {
        return callWebService(SERVICE, URI,
                "deleteClient", request, DeleteClientResponse.class);
    }

    public RetrieveClientsListResponse retrieveClientsList(RetrieveClientsListRequest request) throws WebServiceException{
        return callWebService(SERVICE, URI,
                "retrieveClientsList", request, RetrieveClientsListResponse.class);
    }

}
