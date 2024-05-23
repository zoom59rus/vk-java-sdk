// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.callback;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.events.CallbackEvent;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;

import java.util.Objects;

/**
 * PollVoteNew object
 */
public class PollVoteNew implements Validable, CallbackEvent {
    @SerializedName("option_id")
    @Required
    private Integer optionId;

    /**
     * Entity: owner
     */
    @SerializedName("owner_id")
    @Required
    private Long ownerId;

    @SerializedName("poll_id")
    @Required
    private Integer pollId;

    /**
     * Entity: owner
     */
    @SerializedName("user_id")
    @Required
    private Long userId;

    public Integer getOptionId() {
        return optionId;
    }

    public PollVoteNew setOptionId(Integer optionId) {
        this.optionId = optionId;
        return this;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public PollVoteNew setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public Integer getPollId() {
        return pollId;
    }

    public PollVoteNew setPollId(Integer pollId) {
        this.pollId = pollId;
        return this;
    }

    public Long getUserId() {
        return userId;
    }

    public PollVoteNew setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pollId, optionId, ownerId, userId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PollVoteNew pollVoteNew = (PollVoteNew) o;
        return Objects.equals(pollId, pollVoteNew.pollId) &&
                Objects.equals(userId, pollVoteNew.userId) &&
                Objects.equals(ownerId, pollVoteNew.ownerId) &&
                Objects.equals(optionId, pollVoteNew.optionId);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("PollVoteNew{");
        sb.append("pollId=").append(pollId);
        sb.append(", userId=").append(userId);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", optionId=").append(optionId);
        sb.append('}');
        return sb.toString();
    }
}
