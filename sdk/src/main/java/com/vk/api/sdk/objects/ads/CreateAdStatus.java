// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.ads;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;

import java.util.Objects;

/**
 * CreateAdStatus object
 */
public class CreateAdStatus implements Validable {
    /**
     * Error code
     */
    @SerializedName("error_code")
    private Integer errorCode;

    /**
     * Error description
     */
    @SerializedName("error_desc")
    private String errorDesc;

    /**
     * Ad ID
     */
    @SerializedName("id")
    @Required
    private Integer id;

    /**
     * Stealth Post ID
     */
    @SerializedName("post_id")
    private Integer postId;

    public Integer getErrorCode() {
        return errorCode;
    }

    public CreateAdStatus setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorDesc() {
        return errorDesc;
    }

    public CreateAdStatus setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public CreateAdStatus setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getPostId() {
        return postId;
    }

    public CreateAdStatus setPostId(Integer postId) {
        this.postId = postId;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorDesc, errorCode, postId, id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateAdStatus createAdStatus = (CreateAdStatus) o;
        return Objects.equals(postId, createAdStatus.postId) &&
                Objects.equals(errorDesc, createAdStatus.errorDesc) &&
                Objects.equals(errorCode, createAdStatus.errorCode) &&
                Objects.equals(id, createAdStatus.id);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("CreateAdStatus{");
        sb.append("postId=").append(postId);
        sb.append(", errorDesc='").append(errorDesc).append("'");
        sb.append(", errorCode=").append(errorCode);
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
