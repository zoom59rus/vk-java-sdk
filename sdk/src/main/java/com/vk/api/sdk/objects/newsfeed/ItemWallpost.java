// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.wall.WallpostFull;

import java.util.Objects;

/**
 * ItemWallpost object
 */
public class ItemWallpost extends WallpostFull implements NewsfeedItem, Validable {
    /**
     * Item source ID
     * Entity: owner
     */
    @SerializedName("source_id")
    @Required
    private Long sourceId;

    public Long getSourceId() {
        return sourceId;
    }

    public ItemWallpost setSourceId(Long sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemWallpost itemWallpost = (ItemWallpost) o;
        return Objects.equals(sourceId, itemWallpost.sourceId);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("ItemWallpost{");
        sb.append("sourceId=").append(sourceId);
        sb.append('}');
        return sb.toString();
    }
}
