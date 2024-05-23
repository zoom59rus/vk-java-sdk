// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiMessagesCantEditPinnedYetException extends ApiException {
    public static final Integer ERROR_CODE = 949;

    public static final String ERROR_DESCRIPTION = "Can't edit pinned message yet";

    public ApiMessagesCantEditPinnedYetException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiMessagesCantEditPinnedYetException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}
