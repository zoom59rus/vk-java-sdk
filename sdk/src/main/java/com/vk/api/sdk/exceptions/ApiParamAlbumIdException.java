// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiParamAlbumIdException extends ApiException {
    public static final Integer ERROR_CODE = 114;

    public static final String ERROR_DESCRIPTION = "Invalid album id";

    public ApiParamAlbumIdException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiParamAlbumIdException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}
