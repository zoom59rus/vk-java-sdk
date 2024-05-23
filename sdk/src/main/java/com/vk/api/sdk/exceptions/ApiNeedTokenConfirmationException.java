// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiNeedTokenConfirmationException extends ApiException {
    public static final Integer ERROR_CODE = 25;

    public static final String ERROR_DESCRIPTION = "Token confirmation required";

    public ApiNeedTokenConfirmationException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiNeedTokenConfirmationException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}
