// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiMessagesTooBigException extends ApiException {
    public static final Integer ERROR_CODE = 910;

    public static final String ERROR_DESCRIPTION = "Can't sent this message, because it's too big";

    public ApiMessagesTooBigException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiMessagesTooBigException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}
