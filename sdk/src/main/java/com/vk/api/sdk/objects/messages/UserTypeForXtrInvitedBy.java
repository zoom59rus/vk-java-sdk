// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.messages;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Object type
 */
public enum UserTypeForXtrInvitedBy implements EnumParam<String> {
    @SerializedName("profile")
    PROFILE("profile"),

    @SerializedName("group")
    GROUP("group");

    private final String value;

    UserTypeForXtrInvitedBy(String value) {
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
