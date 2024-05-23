// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.adsweb.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.adsweb.GetStatisticsResponseItemsItem;
import com.vk.api.sdk.objects.annotations.Required;

import java.util.List;
import java.util.Objects;

/**
 * GetStatisticsResponse object
 */
public class GetStatisticsResponse implements Validable {
    @SerializedName("items")
    @Required
    private List<GetStatisticsResponseItemsItem> items;

    @SerializedName("next_page_id")
    private String nextPageId;

    public List<GetStatisticsResponseItemsItem> getItems() {
        return items;
    }

    public GetStatisticsResponse setItems(List<GetStatisticsResponseItemsItem> items) {
        this.items = items;
        return this;
    }

    public String getNextPageId() {
        return nextPageId;
    }

    public GetStatisticsResponse setNextPageId(String nextPageId) {
        this.nextPageId = nextPageId;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nextPageId, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetStatisticsResponse getStatisticsResponse = (GetStatisticsResponse) o;
        return Objects.equals(nextPageId, getStatisticsResponse.nextPageId) &&
                Objects.equals(items, getStatisticsResponse.items);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetStatisticsResponse{");
        sb.append("nextPageId='").append(nextPageId).append("'");
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
