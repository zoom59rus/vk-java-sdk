package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class OAuthException extends ApiException {
    public static final Integer ERROR_CODE = 0;

    private String redirectUri;

    public OAuthException(Error error, String redirectUri) {
        super(error);
        this.redirectUri = redirectUri;
    }

    public String getRedirectUri() {
        return redirectUri;
    }
}
