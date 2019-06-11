package com.cyxtera.detectid.client.detectid.web.service;

/**
 * Created by Jgutierrez on 10/03/2017.
 */
public class WebServiceRequest {

    private ProcessContext processContext;

    public ProcessContext getProcessContext() {
        return processContext;
    }

    public WebServiceRequest setProcessContext(ProcessContext processContext) {
        this.processContext = processContext;
        return this;
    }

    public static class ProcessContext{
        private String channelId;
        private String externalId;
        private AlternativeSharedKey alternativeSharedKey;

        public AlternativeSharedKey getAlternativeSharedKey() {
            return alternativeSharedKey;
        }

        public void setAlternativeSharedKey(AlternativeSharedKey alternativeSharedKey) {
            this.alternativeSharedKey = alternativeSharedKey;
        }

        public String getChannelId() {
            return channelId;
        }

        public ProcessContext setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }

        public String getExternalId() {
            return externalId;
        }

        public ProcessContext setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
    }
}
