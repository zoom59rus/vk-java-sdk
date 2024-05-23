// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiMarketOrdersInvalidStatusException extends ApiException {
    public static final Integer ERROR_CODE = 1456;

    public static final String ERROR_DESCRIPTION = "Order status is invalid";

    public ApiMarketOrdersInvalidStatusException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiMarketOrdersInvalidStatusException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}
