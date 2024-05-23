// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.photos;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.base.responses.BoolResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Photos.restoreComment method
 */
public class PhotosRestoreCommentQuery extends AbstractQueryBuilder<PhotosRestoreCommentQuery, BoolResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param commentId value of "comment id" parameter.
     */
    public PhotosRestoreCommentQuery(VkApiClient client, UserActor actor, Integer commentId) {
        super(client, "photos.restoreComment", BoolResponse.class);
        accessToken(actor.getAccessToken());
        commentId(commentId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public PhotosRestoreCommentQuery(VkApiClient client, UserActor actor) {
        super(client, "photos.restoreComment", BoolResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * ID of the user or community that owns the photo.
     *
     * @param value value of "owner id" parameter. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("owner_id")
    public PhotosRestoreCommentQuery ownerId(Long value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * ID of the deleted comment.
     *
     * @param value value of "comment id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("comment_id")
    public PhotosRestoreCommentQuery commentId(Integer value) {
        return unsafeParam("comment_id", value);
    }

    @Override
    protected PhotosRestoreCommentQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("comment_id", "access_token");
    }
}
