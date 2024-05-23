package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiLongPollException extends ApiException {
    public static final Integer ERROR_CODE = 2100;

    public static final String ERROR_DESCRIPTION = "LongPoll is not available for this group";

    public ApiLongPollException(Error error) {
        super(error);
    }
}
