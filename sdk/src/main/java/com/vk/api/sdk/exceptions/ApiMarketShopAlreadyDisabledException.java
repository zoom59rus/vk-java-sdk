// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiMarketShopAlreadyDisabledException extends ApiException {
    public static final Integer ERROR_CODE = 1432;

    public static final String ERROR_DESCRIPTION = "Market was already disabled in this group";

    public ApiMarketShopAlreadyDisabledException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiMarketShopAlreadyDisabledException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}
