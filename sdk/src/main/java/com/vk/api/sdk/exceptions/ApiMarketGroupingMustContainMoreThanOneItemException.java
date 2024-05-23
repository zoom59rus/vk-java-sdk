// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiMarketGroupingMustContainMoreThanOneItemException extends ApiException {
    public static final Integer ERROR_CODE = 1425;

    public static final String ERROR_DESCRIPTION = "Grouping must have two or more items";

    public ApiMarketGroupingMustContainMoreThanOneItemException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiMarketGroupingMustContainMoreThanOneItemException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}
