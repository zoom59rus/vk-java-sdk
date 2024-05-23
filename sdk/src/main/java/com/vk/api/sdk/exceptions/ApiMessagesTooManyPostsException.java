// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiMessagesTooManyPostsException extends ApiException {
    public static final Integer ERROR_CODE = 940;

    public static final String ERROR_DESCRIPTION = "Too many posts in messages";

    public ApiMessagesTooManyPostsException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiMessagesTooManyPostsException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}
