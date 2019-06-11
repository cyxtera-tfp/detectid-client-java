package net.easysol.oauth.exceptions;

/**
 * Created by Jgutierrez on 10/07/2016.
 */
public class AccessTokenException extends Exception {
    public AccessTokenException() {
    }

    public AccessTokenException(String message) {
        super(message);
    }

    public AccessTokenException(String message, Throwable cause) {
        super(message, cause);
    }

    public AccessTokenException(Throwable cause) {
        super(cause);
    }

    public AccessTokenException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
