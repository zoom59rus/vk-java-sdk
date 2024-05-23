// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.newsfeed.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;

import java.util.List;
import java.util.Objects;

/**
 * GetBannedResponse object
 */
public class GetBannedResponse implements Validable {
    @SerializedName("groups")
    private List<Long> groups;

    @SerializedName("members")
    private List<Long> members;

    public List<Long> getGroups() {
        return groups;
    }

    public GetBannedResponse setGroups(List<Long> groups) {
        this.groups = groups;
        return this;
    }

    public List<Long> getMembers() {
        return members;
    }

    public GetBannedResponse setMembers(List<Long> members) {
        this.members = members;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(members, groups);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetBannedResponse getBannedResponse = (GetBannedResponse) o;
        return Objects.equals(members, getBannedResponse.members) &&
                Objects.equals(groups, getBannedResponse.groups);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetBannedResponse{");
        sb.append("members=").append(members);
        sb.append(", groups=").append(groups);
        sb.append('}');
        return sb.toString();
    }
}
