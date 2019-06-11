package net.easysol.detectid.mobile;

import net.easysol.detectid.web.service.WebServiceResponse;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Jgutierrez on 10/03/2017.
 */
@XmlRootElement(name = "retrieveMobileActivationQRCodeResponse")
public class RetrieveMobileActivationQRCodeResponse extends WebServiceResponse {

    private String base64CodedbinaryStream;

    private int imageHeight;

    private int imageWidth;

    private String imageType;

    @Override
    public String toString() {
        return "RetrieveMobileActivationQRCodeResponse{" +
                "base64CodedbinaryStream='" + base64CodedbinaryStream + '\'' +
                ", imageHeight=" + imageHeight +
                ", imageWidth=" + imageWidth +
                ", imageType='" + imageType + '\'' +
                '}';
    }

    public String getBase64CodedbinaryStream() {
        return base64CodedbinaryStream;
    }

    public RetrieveMobileActivationQRCodeResponse setBase64CodedbinaryStream(String base64CodedbinaryStream) {
        this.base64CodedbinaryStream = base64CodedbinaryStream;
        return this;
    }

    public int getImageHeight() {
        return imageHeight;
    }

    public RetrieveMobileActivationQRCodeResponse setImageHeight(int imageHeight) {
        this.imageHeight = imageHeight;
        return this;
    }

    public int getImageWidth() {
        return imageWidth;
    }

    public RetrieveMobileActivationQRCodeResponse setImageWidth(int imageWidth) {
        this.imageWidth = imageWidth;
        return this;
    }

    public String getImageType() {
        return imageType;
    }

    public RetrieveMobileActivationQRCodeResponse setImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

}
