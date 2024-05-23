// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiMessagesTooLongForwardsException extends ApiException {
    public static final Integer ERROR_CODE = 913;

    public static final String ERROR_DESCRIPTION = "Too many forwarded messages";

    public ApiMessagesTooLongForwardsException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiMessagesTooLongForwardsException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}
