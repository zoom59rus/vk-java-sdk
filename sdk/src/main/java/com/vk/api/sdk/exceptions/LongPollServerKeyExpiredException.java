package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

import java.util.HashMap;
import java.util.Map;

public class LongPollServerKeyExpiredException extends ApiExtendedException {
    public static final Integer ERROR_CODE = 2;

    public static final String ERROR_DESCRIPTION = "Long poll server key expired";

    public LongPollServerKeyExpiredException(Error error, Integer statusCode) {
        super(error, statusCode, new HashMap<>());
    }

    public LongPollServerKeyExpiredException(Error error, Integer statusCode, Map<String, String> headers) {
        super(error, statusCode, headers);
    }
}
