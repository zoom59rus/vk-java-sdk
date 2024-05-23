// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiGroupTooManyAddressesException extends ApiException {
    public static final Integer ERROR_CODE = 706;

    public static final String ERROR_DESCRIPTION = "Too many addresses in club";

    public ApiGroupTooManyAddressesException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiGroupTooManyAddressesException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}
