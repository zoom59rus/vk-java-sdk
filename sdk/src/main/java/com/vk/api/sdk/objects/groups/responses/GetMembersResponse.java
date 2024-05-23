// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.groups.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;

import java.util.List;
import java.util.Objects;

/**
 * GetMembersResponse object
 */
public class GetMembersResponse implements Validable {
    /**
     * Total members number
     */
    @SerializedName("count")
    @Required
    private Integer count;

    @SerializedName("items")
    @Required
    private List<Long> items;

    /**
     * Encoded string for a next page
     */
    @SerializedName("next_from")
    private String nextFrom;

    public Integer getCount() {
        return count;
    }

    public GetMembersResponse setCount(Integer count) {
        this.count = count;
        return this;
    }

    public List<Long> getItems() {
        return items;
    }

    public GetMembersResponse setItems(List<Long> items) {
        this.items = items;
        return this;
    }

    public String getNextFrom() {
        return nextFrom;
    }

    public GetMembersResponse setNextFrom(String nextFrom) {
        this.nextFrom = nextFrom;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, nextFrom, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetMembersResponse getMembersResponse = (GetMembersResponse) o;
        return Objects.equals(nextFrom, getMembersResponse.nextFrom) &&
                Objects.equals(count, getMembersResponse.count) &&
                Objects.equals(items, getMembersResponse.items);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetMembersResponse{");
        sb.append("nextFrom='").append(nextFrom).append("'");
        sb.append(", count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
