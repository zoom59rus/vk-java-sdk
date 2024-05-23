// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiTokenExtensionRequiredException extends ApiException {
    public static final Integer ERROR_CODE = 3609;

    public static final String ERROR_DESCRIPTION = "Token extension required";

    public ApiTokenExtensionRequiredException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiTokenExtensionRequiredException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}
