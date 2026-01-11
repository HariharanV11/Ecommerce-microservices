package main.java.com.ecom.commonlib.exception;

import main.java.com.ecom.commonlib.utils.MessagesUtils;

public class SignInRequiredException extends RuntimeException {
    private String message;

    public SignInRequiredException(String errorCode, Object... var2) {
        this.message = MessagesUtils.getMessage(errorCode, var2);
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
