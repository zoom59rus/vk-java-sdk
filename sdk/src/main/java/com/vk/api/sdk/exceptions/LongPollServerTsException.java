package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

import java.util.HashMap;
import java.util.Map;

public class LongPollServerTsException extends ApiExtendedException {
    public static final Integer ERROR_CODE = 1;

    public static final String ERROR_DESCRIPTION = "Incorrect \'ts\' value";

    public LongPollServerTsException(Error error, Integer statusCode) {
        super(error, statusCode, new HashMap<>());
    }

    public LongPollServerTsException(Error error, Integer statusCode, Map<String, String> headers) {
        super(error, statusCode, headers);
    }
}
