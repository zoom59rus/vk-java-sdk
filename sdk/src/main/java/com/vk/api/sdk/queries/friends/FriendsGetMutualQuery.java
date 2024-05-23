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
 * Query for Friends.getMutual method
 */
public class FriendsGetMutualQuery extends AbstractQueryBuilder<FriendsGetMutualQuery, List<Long>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public FriendsGetMutualQuery(VkApiClient client, UserActor actor) {
        super(client, "friends.getMutual", Utils.buildParametrizedType(List.class, Long.class));
        accessToken(actor.getAccessToken());
    }

    /**
     * ID of the user whose friends will be checked against the friends of the user specified in 'target_uid'.
     *
     * @param value value of "source uid" parameter. Minimum is 1. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("source_uid")
    public FriendsGetMutualQuery sourceUid(Long value) {
        return unsafeParam("source_uid", value);
    }

    /**
     * ID of the user whose friends will be checked against the friends of the user specified in 'source_uid'.
     *
     * @param value value of "target uid" parameter. Minimum is 1. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("target_uid")
    public FriendsGetMutualQuery targetUid(Long value) {
        return unsafeParam("target_uid", value);
    }

    /**
     * Sort order: 'random' - random order
     *
     * @param value value of "order" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("order")
    public FriendsGetMutualQuery order(String value) {
        return unsafeParam("order", value);
    }

    /**
     * Number of mutual friends to return.
     *
     * @param value value of "count" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("count")
    public FriendsGetMutualQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Offset needed to return a specific subset of mutual friends.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("offset")
    public FriendsGetMutualQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Return mutual friends total count
     *
     * @param value value of "need common count" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("need_common_count")
    public FriendsGetMutualQuery needCommonCount(Boolean value) {
        return unsafeParam("need_common_count", value);
    }

    /**
     * targetUids
     * IDs of the users whose friends will be checked against the friends of the user specified in 'source_uid'.
     *
     * @param value value of "target uids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("target_uids")
    public FriendsGetMutualQuery targetUids(Long... value) {
        return unsafeParam("target_uids", value);
    }

    /**
     * IDs of the users whose friends will be checked against the friends of the user specified in 'source_uid'.
     *
     * @param value value of "target uids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("target_uids")
    public FriendsGetMutualQuery targetUids(List<Long> value) {
        return unsafeParam("target_uids", value);
    }

    @Override
    protected FriendsGetMutualQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
