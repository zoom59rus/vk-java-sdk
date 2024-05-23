// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.support;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;

import java.util.Objects;

/**
 * UnblockScreenButtonSubmitFields object
 */
public class UnblockScreenButtonSubmitFields implements UnblockScreenItem, Validable {
    @SerializedName("disabled")
    private Boolean disabled;

    @SerializedName("id")
    private Number id;

    /**
     * Индекс экрана для перехода
     */
    @SerializedName("target_screen")
    private String targetScreen;

    /**
     * Надпись на кнопке
     */
    @SerializedName("text")
    private String text;

    @SerializedName("type")
    @Required
    private UnblockScreenButtonSubmitFieldsType type;

    public Boolean getDisabled() {
        return disabled;
    }

    public UnblockScreenButtonSubmitFields setDisabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }

    public Number getId() {
        return id;
    }

    public UnblockScreenButtonSubmitFields setId(Number id) {
        this.id = id;
        return this;
    }

    public String getTargetScreen() {
        return targetScreen;
    }

    public UnblockScreenButtonSubmitFields setTargetScreen(String targetScreen) {
        this.targetScreen = targetScreen;
        return this;
    }

    public String getText() {
        return text;
    }

    public UnblockScreenButtonSubmitFields setText(String text) {
        this.text = text;
        return this;
    }

    public UnblockScreenButtonSubmitFieldsType getType() {
        return type;
    }

    public UnblockScreenButtonSubmitFields setType(UnblockScreenButtonSubmitFieldsType type) {
        this.type = type;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(disabled, targetScreen, id, text, type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnblockScreenButtonSubmitFields unblockScreenButtonSubmitFields = (UnblockScreenButtonSubmitFields) o;
        return Objects.equals(disabled, unblockScreenButtonSubmitFields.disabled) &&
                Objects.equals(targetScreen, unblockScreenButtonSubmitFields.targetScreen) &&
                Objects.equals(id, unblockScreenButtonSubmitFields.id) &&
                Objects.equals(text, unblockScreenButtonSubmitFields.text) &&
                Objects.equals(type, unblockScreenButtonSubmitFields.type);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("UnblockScreenButtonSubmitFields{");
        sb.append("disabled=").append(disabled);
        sb.append(", targetScreen='").append(targetScreen).append("'");
        sb.append(", id=").append(id);
        sb.append(", text='").append(text).append("'");
        sb.append(", type='").append(type).append("'");
        sb.append('}');
        return sb.toString();
    }
}
