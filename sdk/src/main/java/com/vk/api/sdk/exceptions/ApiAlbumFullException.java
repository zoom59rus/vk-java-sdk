// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiAlbumFullException extends ApiException {
    public static final Integer ERROR_CODE = 300;

    public static final String ERROR_DESCRIPTION = "This album is full";

    public ApiAlbumFullException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiAlbumFullException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}
