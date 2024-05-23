// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiWallDonutException extends ApiException {
    public static final Integer ERROR_CODE = 225;

    public static final String ERROR_DESCRIPTION = "Donut is disabled";

    public ApiWallDonutException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiWallDonutException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}
