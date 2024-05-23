package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

import java.util.Map;

public class ApiExtendedException extends ApiException {

    private Integer statusCode;
    private Map<String, String> headers;

    public ApiExtendedException(
            Error error,
            Integer statusCode,
            Map<String, String> headers
    ) {
        super(error);
        this.statusCode = statusCode;
        this.headers = headers;
    }

    public Integer getStatusCode() {
        return this.statusCode;
    }

    public Map<String, String> getHeaders() {
        return this.headers;
    }
}