// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.video;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Sort order: '0' - newest video first, '1' - oldest video first
 */
public enum GetSortAlbum implements EnumParam<Integer> {
    @SerializedName("0")
    _0(0),

    @SerializedName("1")
    _1(1);

    private final Integer value;

    GetSortAlbum(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString().toLowerCase();
    }
}
