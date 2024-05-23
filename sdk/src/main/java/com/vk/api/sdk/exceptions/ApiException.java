package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiException extends Exception {

    private final Error error;

    public ApiException(Error error) {
        this.error = error;
    }

    public String getDescription() {
        return error.getErrorText();
    }

    public Integer getCode() {
        return error.getErrorCode();
    }

    public String getMessageRaw() {
        return error.getErrorMsg();
    }

    public Error getErrorRaw() {
        return error;
    }

    @Override
    public String getMessage() {
        return error.getErrorText() + " (" + error.getErrorCode() + "): " + error.getErrorMsg();
    }

    public String getCustomMessage(String customErrorSuffix) {
        return error.getErrorText() + " (" + error.getErrorCode() + "): " + error.getErrorText() + ": " + customErrorSuffix;
    }
}
