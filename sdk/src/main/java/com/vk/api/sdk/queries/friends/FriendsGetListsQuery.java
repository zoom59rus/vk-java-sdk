// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.friends;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.friends.responses.GetListsResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Friends.getLists method
 */
public class FriendsGetListsQuery extends AbstractQueryBuilder<FriendsGetListsQuery, GetListsResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public FriendsGetListsQuery(VkApiClient client, UserActor actor) {
        super(client, "friends.getLists", GetListsResponse.class);
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
    public FriendsGetListsQuery userId(Long value) {
        return unsafeParam("user_id", value);
    }

    /**
     * '1' - to return system friend lists. By default: '0'.
     *
     * @param value value of "return system" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("return_system")
    public FriendsGetListsQuery returnSystem(Boolean value) {
        return unsafeParam("return_system", value);
    }

    @Override
    protected FriendsGetListsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
