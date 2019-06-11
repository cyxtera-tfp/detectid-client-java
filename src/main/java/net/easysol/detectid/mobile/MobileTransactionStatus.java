package net.easysol.detectid.mobile;

/**
 * Created by Jgutierrez on 11/03/2017.
 */
public enum MobileTransactionStatus {

    OK(1010),
    PENDING(1011),
    WRONG(1012),
    EXPIRED(1013),
    MAX_WRONG_ATTEMPTS(1014),
    FAILED(1015);

    private int status;

    MobileTransactionStatus(int status) {
        this.status = status;
    }

    public static MobileTransactionStatus getByStatus(int status) {
        MobileTransactionStatus toReturn = null;
        for (MobileTransactionStatus response : MobileTransactionStatus.values()) {
            if (response.getStatus() == status) {
                toReturn = response;
                break;
            }
        }
        return toReturn;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
