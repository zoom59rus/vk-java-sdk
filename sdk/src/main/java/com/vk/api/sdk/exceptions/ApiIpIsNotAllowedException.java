// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiIpIsNotAllowedException extends ApiException {
    public static final Integer ERROR_CODE = 42;

    public static final String ERROR_DESCRIPTION = "IP is not allowed";

    public ApiIpIsNotAllowedException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiIpIsNotAllowedException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}
