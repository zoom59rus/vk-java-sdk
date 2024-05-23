// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.apps;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum GetScopesType implements EnumParam<String> {
    @SerializedName("group")
    GROUP("group"),

    @SerializedName("user")
    USER("user");

    private final String value;

    GetScopesType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toLowerCase();
    }
}
