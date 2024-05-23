// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiAsrNotFoundException extends ApiException {
    public static final Integer ERROR_CODE = 7704;

    public static final String ERROR_DESCRIPTION = "Task not found";

    public ApiAsrNotFoundException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiAsrNotFoundException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}
