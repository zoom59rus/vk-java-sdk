// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiCompileException extends ApiException {
    public static final Integer ERROR_CODE = 12;

    public static final String ERROR_DESCRIPTION = "Unable to compile code";

    public ApiCompileException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiCompileException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}
