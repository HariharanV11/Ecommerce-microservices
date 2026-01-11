package main.java.com.ecom.commonlib.exception;

import main.java.com.ecom.commonlib.utils.MessagesUtils;

public class ForbiddenException extends RuntimeException {
    private final String message;

    public ForbiddenException(String errorCode, Object... var2) {
        this.message = MessagesUtils.getMessage(errorCode, var2);
    }

    @Override
    public String getMessage() {
        return message;
    }

}
