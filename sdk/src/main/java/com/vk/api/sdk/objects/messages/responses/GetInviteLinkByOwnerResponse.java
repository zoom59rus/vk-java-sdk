// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.messages.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.messages.GetInviteLinkByOwnerResponseItem;

import java.util.List;
import java.util.Objects;

/**
 * GetInviteLinkByOwnerResponse object
 */
public class GetInviteLinkByOwnerResponse implements Validable {
    @SerializedName("items")
    @Required
    private List<GetInviteLinkByOwnerResponseItem> items;

    public List<GetInviteLinkByOwnerResponseItem> getItems() {
        return items;
    }

    public GetInviteLinkByOwnerResponse setItems(List<GetInviteLinkByOwnerResponseItem> items) {
        this.items = items;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetInviteLinkByOwnerResponse getInviteLinkByOwnerResponse = (GetInviteLinkByOwnerResponse) o;
        return Objects.equals(items, getInviteLinkByOwnerResponse.items);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetInviteLinkByOwnerResponse{");
        sb.append("items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
