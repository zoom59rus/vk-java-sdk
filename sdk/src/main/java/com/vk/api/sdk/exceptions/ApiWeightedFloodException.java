// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiWeightedFloodException extends ApiException {
    public static final Integer ERROR_CODE = 601;

    public static final String ERROR_DESCRIPTION = "Permission denied. You have requested too many actions this day. Try later.";

    public ApiWeightedFloodException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiWeightedFloodException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}
