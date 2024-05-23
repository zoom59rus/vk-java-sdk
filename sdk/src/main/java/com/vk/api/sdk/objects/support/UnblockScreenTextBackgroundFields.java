// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.support;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;

import java.util.Objects;

/**
 * UnblockScreenTextBackgroundFields object
 */
public class UnblockScreenTextBackgroundFields implements UnblockScreenItem, Validable {
    /**
     * Полный URL фонового изображения
     */
    @SerializedName("bg_image")
    private String bgImage;

    /**
     * Текст
     */
    @SerializedName("text")
    private String text;

    @SerializedName("type")
    @Required
    private UnblockScreenTextBackgroundFieldsType type;

    public String getBgImage() {
        return bgImage;
    }

    public UnblockScreenTextBackgroundFields setBgImage(String bgImage) {
        this.bgImage = bgImage;
        return this;
    }

    public String getText() {
        return text;
    }

    public UnblockScreenTextBackgroundFields setText(String text) {
        this.text = text;
        return this;
    }

    public UnblockScreenTextBackgroundFieldsType getType() {
        return type;
    }

    public UnblockScreenTextBackgroundFields setType(UnblockScreenTextBackgroundFieldsType type) {
        this.type = type;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, bgImage, type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnblockScreenTextBackgroundFields unblockScreenTextBackgroundFields = (UnblockScreenTextBackgroundFields) o;
        return Objects.equals(text, unblockScreenTextBackgroundFields.text) &&
                Objects.equals(type, unblockScreenTextBackgroundFields.type) &&
                Objects.equals(bgImage, unblockScreenTextBackgroundFields.bgImage);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("UnblockScreenTextBackgroundFields{");
        sb.append("text='").append(text).append("'");
        sb.append(", type='").append(type).append("'");
        sb.append(", bgImage='").append(bgImage).append("'");
        sb.append('}');
        return sb.toString();
    }
}
