// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.friends;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;

import java.util.List;
import java.util.Objects;

/**
 * MutualFriend object
 */
public class MutualFriend implements Validable {
    /**
     * Total mutual friends number
     */
    @SerializedName("common_count")
    private Integer commonCount;

    @SerializedName("common_friends")
    private List<Long> commonFriends;

    /**
     * User ID
     * Entity: owner
     */
    @SerializedName("id")
    private Long id;

    public Integer getCommonCount() {
        return commonCount;
    }

    public MutualFriend setCommonCount(Integer commonCount) {
        this.commonCount = commonCount;
        return this;
    }

    public List<Long> getCommonFriends() {
        return commonFriends;
    }

    public MutualFriend setCommonFriends(List<Long> commonFriends) {
        this.commonFriends = commonFriends;
        return this;
    }

    public Long getId() {
        return id;
    }

    public MutualFriend setId(Long id) {
        this.id = id;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(commonFriends, id, commonCount);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MutualFriend mutualFriend = (MutualFriend) o;
        return Objects.equals(commonCount, mutualFriend.commonCount) &&
                Objects.equals(commonFriends, mutualFriend.commonFriends) &&
                Objects.equals(id, mutualFriend.id);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("MutualFriend{");
        sb.append("commonCount=").append(commonCount);
        sb.append(", commonFriends=").append(commonFriends);
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
