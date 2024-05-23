// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiMessagesChatNotExistException extends ApiException {
    public static final Integer ERROR_CODE = 927;

    public static final String ERROR_DESCRIPTION = "Chat does not exist";

    public ApiMessagesChatNotExistException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiMessagesChatNotExistException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}
