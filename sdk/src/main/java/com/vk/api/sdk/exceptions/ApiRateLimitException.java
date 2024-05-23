// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiRateLimitException extends ApiException {
    public static final Integer ERROR_CODE = 29;

    public static final String ERROR_DESCRIPTION = "Rate limit reached";

    public ApiRateLimitException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiRateLimitException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}
