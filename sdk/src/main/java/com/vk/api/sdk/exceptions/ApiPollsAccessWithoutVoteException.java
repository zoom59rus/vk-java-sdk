// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiPollsAccessWithoutVoteException extends ApiException {
    public static final Integer ERROR_CODE = 253;

    public static final String ERROR_DESCRIPTION = "Access denied, please vote first";

    public ApiPollsAccessWithoutVoteException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiPollsAccessWithoutVoteException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}
