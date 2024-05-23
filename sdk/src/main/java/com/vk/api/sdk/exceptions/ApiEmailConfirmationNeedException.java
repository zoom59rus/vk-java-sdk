// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiEmailConfirmationNeedException extends ApiException {
    public static final Integer ERROR_CODE = 3304;

    public static final String ERROR_DESCRIPTION = "Email confirmation needed";

    public ApiEmailConfirmationNeedException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiEmailConfirmationNeedException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}
