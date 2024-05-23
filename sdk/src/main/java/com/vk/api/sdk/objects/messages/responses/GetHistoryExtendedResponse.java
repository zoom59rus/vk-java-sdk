// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.messages.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.groups.GroupFull;
import com.vk.api.sdk.objects.messages.Conversation;
import com.vk.api.sdk.objects.messages.Message;
import com.vk.api.sdk.objects.users.UserFull;

import java.util.List;
import java.util.Objects;

/**
 * GetHistoryExtendedResponse object
 */
public class GetHistoryExtendedResponse implements Validable {
    @SerializedName("conversations")
    private List<Conversation> conversations;

    /**
     * Total number
     */
    @SerializedName("count")
    @Required
    private Integer count;

    @SerializedName("groups")
    private List<GroupFull> groups;

    @SerializedName("items")
    @Required
    private List<Message> items;

    @SerializedName("profiles")
    private List<UserFull> profiles;

    public List<Conversation> getConversations() {
        return conversations;
    }

    public GetHistoryExtendedResponse setConversations(List<Conversation> conversations) {
        this.conversations = conversations;
        return this;
    }

    public Integer getCount() {
        return count;
    }

    public GetHistoryExtendedResponse setCount(Integer count) {
        this.count = count;
        return this;
    }

    public List<GroupFull> getGroups() {
        return groups;
    }

    public GetHistoryExtendedResponse setGroups(List<GroupFull> groups) {
        this.groups = groups;
        return this;
    }

    public List<Message> getItems() {
        return items;
    }

    public GetHistoryExtendedResponse setItems(List<Message> items) {
        this.items = items;
        return this;
    }

    public List<UserFull> getProfiles() {
        return profiles;
    }

    public GetHistoryExtendedResponse setProfiles(List<UserFull> profiles) {
        this.profiles = profiles;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, profiles, groups, conversations, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetHistoryExtendedResponse getHistoryExtendedResponse = (GetHistoryExtendedResponse) o;
        return Objects.equals(count, getHistoryExtendedResponse.count) &&
                Objects.equals(profiles, getHistoryExtendedResponse.profiles) &&
                Objects.equals(groups, getHistoryExtendedResponse.groups) &&
                Objects.equals(conversations, getHistoryExtendedResponse.conversations) &&
                Objects.equals(items, getHistoryExtendedResponse.items);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetHistoryExtendedResponse{");
        sb.append("count=").append(count);
        sb.append(", profiles=").append(profiles);
        sb.append(", groups=").append(groups);
        sb.append(", conversations=").append(conversations);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
