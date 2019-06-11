package net.easysol.detectid.web.service;

/**
 * Created by Jgutierrez on 12/03/2017.
 */
public class DetectIDConfiguration {

    private boolean cloud = false;

    private String url;

    private int timeout = 2000;

    private String cloudClientId;

    private String cloudClientSecret;

    private String cloudHost;

    private DetectIDConfiguration(boolean cloud, String url, int timeout, String cloudClientId, String cloudClientSecret, String cloudHost) {
        this.cloud = cloud;
        this.url = url;
        this.timeout = timeout;
        this.cloudClientId = cloudClientId;
        this.cloudClientSecret = cloudClientSecret;
        this.cloudHost = cloudHost;
    }

    @Override
    public String toString() {
        return "DetectIDConfiguration{" +
                "cloud=" + cloud +
                ", url='" + url + '\'' +
                ", timeout=" + timeout +
                ", cloudClientId='" + cloudClientId + '\'' +
                ", cloudClientSecret='" + cloudClientSecret + '\'' +
                ", cloudHost='" + cloudHost + '\'' +
                '}';
    }

    public static class DetectIDConfigurationBuilder {

        private boolean nestedCloud = false;

        private String nestedUrl;

        private int nestedTimeout = 2000;

        private String nestedCloudClientId;

        private String nestedCloudClientSecret;

        private String nestedCloudHost;


        public DetectIDConfiguration build() {
            if (nestedUrl == null || nestedUrl.isEmpty()) {
                throw new IllegalArgumentException("URL is mandatory");
            }
            if (nestedCloud) {
                if (nestedCloudClientId == null || nestedCloudClientId.isEmpty()
                        || nestedCloudClientSecret == null || nestedCloudClientSecret.isEmpty()
                        || nestedCloudHost == null || nestedCloudHost.isEmpty()) {
                    throw new IllegalArgumentException("ClientID, ClientSecret and Host are mandatory for cloud web services");
                }
            }
            return new DetectIDConfiguration(nestedCloud, nestedUrl,
                    nestedTimeout, nestedCloudClientId, nestedCloudClientSecret, nestedCloudHost);
        }

        public boolean isNestedCloud() {
            return nestedCloud;
        }

        public DetectIDConfigurationBuilder setCloud(boolean nestedCloud) {
            this.nestedCloud = nestedCloud;
            return this;
        }

        public String getNestedUrl() {
            return nestedUrl;
        }

        public DetectIDConfigurationBuilder setUrl(String nestedUrl) {
            this.nestedUrl = nestedUrl;
            return this;
        }

        public int getNestedTimeout() {
            return nestedTimeout;
        }

        public DetectIDConfigurationBuilder setTimeout(int nestedTimeout) {
            this.nestedTimeout = nestedTimeout;
            return this;
        }

        public String getNestedCloudClientId() {
            return nestedCloudClientId;
        }

        public DetectIDConfigurationBuilder setCloudClientId(String nestedCloudClientId) {
            this.nestedCloudClientId = nestedCloudClientId;
            return this;
        }

        public String getNestedCloudClientSecret() {
            return nestedCloudClientSecret;
        }

        public DetectIDConfigurationBuilder setCloudClientSecret(String nestedCloudClientSecret) {
            this.nestedCloudClientSecret = nestedCloudClientSecret;
            return this;
        }

        public String getNestedCloudHost() {
            return nestedCloudHost;
        }

        public DetectIDConfigurationBuilder setCloudHost(String nestedCloudHost) {
            this.nestedCloudHost = nestedCloudHost;
            return this;
        }
    }

    public boolean isCloud() {
        return cloud;
    }

    public String getUrl() {
        return url;
    }

    public int getTimeout() {
        return timeout;
    }

    public String getCloudClientId() {
        return cloudClientId;
    }

    public String getCloudClientSecret() {
        return cloudClientSecret;
    }

    public String getCloudHost() {
        return cloudHost;
    }
}
