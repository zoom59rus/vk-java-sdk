// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiMethodPermissionException extends ApiException {
    public static final Integer ERROR_CODE = 20;

    public static final String ERROR_DESCRIPTION = "Permission to perform this action is denied for non-standalone applications";

    public ApiMethodPermissionException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiMethodPermissionException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}
