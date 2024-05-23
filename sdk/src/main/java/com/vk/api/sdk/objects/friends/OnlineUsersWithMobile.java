// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.friends;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;

import java.util.List;
import java.util.Objects;

/**
 * OnlineUsersWithMobile object
 */
public class OnlineUsersWithMobile implements Validable {
    @SerializedName("online")
    @Required
    private List<Long> online;

    @SerializedName("online_mobile")
    @Required
    private List<Long> onlineMobile;

    /**
     * Total online friends number
     */
    @SerializedName("total_count")
    private Integer totalCount;

    public List<Long> getOnline() {
        return online;
    }

    public OnlineUsersWithMobile setOnline(List<Long> online) {
        this.online = online;
        return this;
    }

    public List<Long> getOnlineMobile() {
        return onlineMobile;
    }

    public OnlineUsersWithMobile setOnlineMobile(List<Long> onlineMobile) {
        this.onlineMobile = onlineMobile;
        return this;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public OnlineUsersWithMobile setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(online, onlineMobile, totalCount);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OnlineUsersWithMobile onlineUsersWithMobile = (OnlineUsersWithMobile) o;
        return Objects.equals(onlineMobile, onlineUsersWithMobile.onlineMobile) &&
                Objects.equals(totalCount, onlineUsersWithMobile.totalCount) &&
                Objects.equals(online, onlineUsersWithMobile.online);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("OnlineUsersWithMobile{");
        sb.append("onlineMobile=").append(onlineMobile);
        sb.append(", totalCount=").append(totalCount);
        sb.append(", online=").append(online);
        sb.append('}');
        return sb.toString();
    }
}
