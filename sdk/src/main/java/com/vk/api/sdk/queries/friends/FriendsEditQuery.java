// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.friends;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Friends.edit method
 */
public class FriendsEditQuery extends AbstractQueryBuilder<FriendsEditQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param userId value of "user id" parameter. Minimum is 1. Entity - owner
     *
     */
    public FriendsEditQuery(VkApiClient client, UserActor actor, Long userId) {
        super(client, "friends.edit", OkResponse.class);
        accessToken(actor.getAccessToken());
        userId(userId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public FriendsEditQuery(VkApiClient client, UserActor actor) {
        super(client, "friends.edit", OkResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * ID of the user whose friend list is to be edited.
     *
     * @param value value of "user id" parameter. Minimum is 1. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("user_id")
    public FriendsEditQuery userId(Long value) {
        return unsafeParam("user_id", value);
    }

    /**
     * listIds
     * IDs of the friend lists to which to add the user.
     *
     * @param value value of "list ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("list_ids")
    public FriendsEditQuery listIds(Integer... value) {
        return unsafeParam("list_ids", value);
    }

    /**
     * IDs of the friend lists to which to add the user.
     *
     * @param value value of "list ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("list_ids")
    public FriendsEditQuery listIds(List<Integer> value) {
        return unsafeParam("list_ids", value);
    }

    @Override
    protected FriendsEditQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("user_id", "access_token");
    }
}
