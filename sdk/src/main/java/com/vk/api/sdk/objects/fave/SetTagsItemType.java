// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.fave;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum SetTagsItemType implements EnumParam<String> {
    @SerializedName("article")
    ARTICLE("article"),

    @SerializedName("clip")
    CLIP("clip"),

    @SerializedName("game")
    GAME("game"),

    @SerializedName("link")
    LINK("link"),

    @SerializedName("mini_app")
    MINI_APP("mini_app"),

    @SerializedName("narrative")
    NARRATIVE("narrative"),

    @SerializedName("page")
    PAGE("page"),

    @SerializedName("podcast")
    PODCAST("podcast"),

    @SerializedName("post")
    POST("post"),

    @SerializedName("product")
    PRODUCT("product"),

    @SerializedName("video")
    VIDEO("video"),

    @SerializedName("youla_product")
    YOULA_PRODUCT("youla_product");

    private final String value;

    SetTagsItemType(String value) {
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
