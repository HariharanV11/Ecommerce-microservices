package main.java.com.ecom.commonlib.exception;

import main.java.com.ecom.commonlib.utils.MessagesUtils;
import lombok.Setter;

@Setter
public class Forbidden extends RuntimeException {
    private String message;

    public Forbidden(String errorCode, Object... var2) {
        this.message = MessagesUtils.getMessage(errorCode, var2);
    }

    @Override
    public String getMessage() {
        return message;
    }

}
