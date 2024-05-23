// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.wall;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.base.responses.BoolResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Wall.closeComments method
 */
public class WallCloseCommentsQuery extends AbstractQueryBuilder<WallCloseCommentsQuery, BoolResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build group api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param ownerId value of "owner id" parameter. Entity - owner
     *
     * @param postId value of "post id" parameter. Minimum is 0.
     */
    public WallCloseCommentsQuery(VkApiClient client, GroupActor actor, Long ownerId,
            Integer postId) {
        super(client, "wall.closeComments", BoolResponse.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        postId(postId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build group api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public WallCloseCommentsQuery(VkApiClient client, GroupActor actor) {
        super(client, "wall.closeComments", BoolResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param ownerId value of "owner id" parameter. Entity - owner
     *
     * @param postId value of "post id" parameter. Minimum is 0.
     */
    public WallCloseCommentsQuery(VkApiClient client, UserActor actor, Long ownerId,
            Integer postId) {
        super(client, "wall.closeComments", BoolResponse.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        postId(postId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public WallCloseCommentsQuery(VkApiClient client, UserActor actor) {
        super(client, "wall.closeComments", BoolResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Set owner id
     *
     * @param value value of "owner id" parameter. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("owner_id")
    public WallCloseCommentsQuery ownerId(Long value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Set post id
     *
     * @param value value of "post id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("post_id")
    public WallCloseCommentsQuery postId(Integer value) {
        return unsafeParam("post_id", value);
    }

    @Override
    protected WallCloseCommentsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("post_id", "owner_id", "access_token");
    }
}
