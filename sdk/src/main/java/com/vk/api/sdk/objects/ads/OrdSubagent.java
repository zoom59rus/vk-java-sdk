// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.ads;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;

import java.util.Objects;

/**
 * OrdSubagent object
 */
public class OrdSubagent implements Validable {
    @SerializedName("inn")
    private String inn;

    @SerializedName("name")
    @Required
    private String name;

    @SerializedName("phone")
    @Required
    private String phone;

    @SerializedName("type")
    @Required
    private OrdClientType type;

    public String getInn() {
        return inn;
    }

    public OrdSubagent setInn(String inn) {
        this.inn = inn;
        return this;
    }

    public String getName() {
        return name;
    }

    public OrdSubagent setName(String name) {
        this.name = name;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public OrdSubagent setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public OrdClientType getType() {
        return type;
    }

    public OrdSubagent setType(OrdClientType type) {
        this.type = type;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(phone, inn, name, type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrdSubagent ordSubagent = (OrdSubagent) o;
        return Objects.equals(phone, ordSubagent.phone) &&
                Objects.equals(inn, ordSubagent.inn) &&
                Objects.equals(name, ordSubagent.name) &&
                Objects.equals(type, ordSubagent.type);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("OrdSubagent{");
        sb.append("phone='").append(phone).append("'");
        sb.append(", inn='").append(inn).append("'");
        sb.append(", name='").append(name).append("'");
        sb.append(", type=").append(type);
        sb.append('}');
        return sb.toString();
    }
}
