// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiAccessMarketException extends ApiException {
    public static final Integer ERROR_CODE = 205;

    public static final String ERROR_DESCRIPTION = "Access denied";

    public ApiAccessMarketException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiAccessMarketException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}
