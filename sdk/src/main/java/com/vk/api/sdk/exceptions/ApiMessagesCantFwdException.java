// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiMessagesCantFwdException extends ApiException {
    public static final Integer ERROR_CODE = 921;

    public static final String ERROR_DESCRIPTION = "Can't forward these messages";

    public ApiMessagesCantFwdException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiMessagesCantFwdException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}
