// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiUserDeletedException extends ApiException {
    public static final Integer ERROR_CODE = 18;

    public static final String ERROR_DESCRIPTION = "User was deleted or banned";

    public ApiUserDeletedException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiUserDeletedException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}
