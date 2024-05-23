// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.board.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.board.TopicComment;
import com.vk.api.sdk.objects.polls.Poll;

import java.util.List;
import java.util.Objects;

/**
 * GetCommentsResponse object
 */
public class GetCommentsResponse implements Validable {
    /**
     * Total number
     */
    @SerializedName("count")
    @Required
    private Integer count;

    @SerializedName("items")
    @Required
    private List<TopicComment> items;

    @SerializedName("poll")
    private Poll poll;

    /**
     * Offset of comment
     */
    @SerializedName("real_offset")
    private Integer realOffset;

    public Integer getCount() {
        return count;
    }

    public GetCommentsResponse setCount(Integer count) {
        this.count = count;
        return this;
    }

    public List<TopicComment> getItems() {
        return items;
    }

    public GetCommentsResponse setItems(List<TopicComment> items) {
        this.items = items;
        return this;
    }

    public Poll getPoll() {
        return poll;
    }

    public GetCommentsResponse setPoll(Poll poll) {
        this.poll = poll;
        return this;
    }

    public Integer getRealOffset() {
        return realOffset;
    }

    public GetCommentsResponse setRealOffset(Integer realOffset) {
        this.realOffset = realOffset;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(realOffset, count, poll, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetCommentsResponse getCommentsResponse = (GetCommentsResponse) o;
        return Objects.equals(realOffset, getCommentsResponse.realOffset) &&
                Objects.equals(count, getCommentsResponse.count) &&
                Objects.equals(poll, getCommentsResponse.poll) &&
                Objects.equals(items, getCommentsResponse.items);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetCommentsResponse{");
        sb.append("realOffset=").append(realOffset);
        sb.append(", count=").append(count);
        sb.append(", poll=").append(poll);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
