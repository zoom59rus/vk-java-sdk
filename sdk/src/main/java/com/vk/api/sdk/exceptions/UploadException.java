package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tsivarev on 18.08.16.
 */
public class UploadException extends ApiExtendedException {

    public UploadException(Error error, Integer statusCode) {
        super(error, statusCode, new HashMap<>());
    }

    public UploadException(Error error, Integer statusCode, Map<String, String> headers) {
        super(error, statusCode, headers);
    }
}
