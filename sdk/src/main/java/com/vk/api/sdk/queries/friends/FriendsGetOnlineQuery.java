// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.friends;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Friends.getOnline method
 */
public class FriendsGetOnlineQuery extends AbstractQueryBuilder<FriendsGetOnlineQuery, List<Long>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public FriendsGetOnlineQuery(VkApiClient client, UserActor actor) {
        super(client, "friends.getOnline", Utils.buildParametrizedType(List.class, Long.class));
        accessToken(actor.getAccessToken());
    }

    /**
     * User ID.
     *
     * @param value value of "user id" parameter. Minimum is 0. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("user_id")
    public FriendsGetOnlineQuery userId(Long value) {
        return unsafeParam("user_id", value);
    }

    /**
     * Friend list ID. If this parameter is not set, information about all online friends is returned.
     *
     * @param value value of "list id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("list_id")
    public FriendsGetOnlineQuery listId(Integer value) {
        return unsafeParam("list_id", value);
    }

    /**
     * '1' - to return an additional 'online_mobile' field, '0' - (default),
     *
     * @param value value of "online mobile" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("online_mobile")
    public FriendsGetOnlineQuery onlineMobile(Boolean value) {
        return unsafeParam("online_mobile", value);
    }

    /**
     * Sort order: 'random' - random order
     *
     * @param value value of "order" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("order")
    public FriendsGetOnlineQuery order(String value) {
        return unsafeParam("order", value);
    }

    /**
     * Number of friends to return.
     *
     * @param value value of "count" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("count")
    public FriendsGetOnlineQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Offset needed to return a specific subset of friends.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("offset")
    public FriendsGetOnlineQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    @Override
    protected FriendsGetOnlineQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
