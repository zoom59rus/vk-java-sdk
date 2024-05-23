// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiAdsLookalikeRequestExportAlreadyInProgressException extends ApiException {
    public static final Integer ERROR_CODE = 634;

    public static final String ERROR_DESCRIPTION = "Lookalike request audience save already in progress";

    public ApiAdsLookalikeRequestExportAlreadyInProgressException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiAdsLookalikeRequestExportAlreadyInProgressException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}
