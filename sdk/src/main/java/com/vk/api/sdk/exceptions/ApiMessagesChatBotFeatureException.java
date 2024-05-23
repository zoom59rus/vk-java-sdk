// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiMessagesChatBotFeatureException extends ApiException {
    public static final Integer ERROR_CODE = 912;

    public static final String ERROR_DESCRIPTION = "This is a chat bot feature, change this status in settings";

    public ApiMessagesChatBotFeatureException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiMessagesChatBotFeatureException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}
