package net.easysol.detectid.mobile;

import net.easysol.detectid.web.service.WebServiceResponse;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by Jgutierrez on 11/03/2017.
 */
@XmlRootElement(name = "retrieveForClientAllRegisteredDevicesResponse")
public class RetrieveForClientAllRegisteredDevicesResponse extends WebServiceResponse {

    private List<Device> devices;

    @Override
    public String toString() {
        return "RetrieveForClientAllRegisteredDevicesResponse{" +
                "devices=" + devices +
                "} " + super.toString();
    }

    public static class Device{
        private boolean activated;
        private String description;
        private String id;
        private String model;
        private String os;
        private String sharedKey;

        @Override
        public String toString() {
            return "Device{" +
                    "activated=" + activated +
                    ", description='" + description + '\'' +
                    ", id='" + id + '\'' +
                    ", model='" + model + '\'' +
                    ", os='" + os + '\'' +
                    ", sharedKey='" + sharedKey + '\'' +
                    '}';
        }

        public boolean isActivated() {
            return activated;
        }

        public Device setActivated(boolean activated) {
            this.activated = activated;
            return this;
        }

        public String getDescription() {
            return description;
        }

        public Device setDescription(String description) {
            this.description = description;
            return this;
        }

        public String getId() {
            return id;
        }

        public Device setId(String id) {
            this.id = id;
            return this;
        }

        public String getModel() {
            return model;
        }

        public Device setModel(String model) {
            this.model = model;
            return this;
        }

        public String getOs() {
            return os;
        }

        public Device setOs(String os) {
            this.os = os;
            return this;
        }

        public String getSharedKey() {
            return sharedKey;
        }

        public Device setSharedKey(String sharedKey) {
            this.sharedKey = sharedKey;
            return this;
        }
    }

    public List<Device> getDevices() {
        return devices;
    }

    public RetrieveForClientAllRegisteredDevicesResponse setDevices(List<Device> devices) {
        this.devices = devices;
        return this;
    }
}
