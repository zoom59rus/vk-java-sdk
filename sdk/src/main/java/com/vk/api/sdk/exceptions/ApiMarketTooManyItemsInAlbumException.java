// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiMarketTooManyItemsInAlbumException extends ApiException {
    public static final Integer ERROR_CODE = 1406;

    public static final String ERROR_DESCRIPTION = "Too many items in album";

    public ApiMarketTooManyItemsInAlbumException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiMarketTooManyItemsInAlbumException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}
