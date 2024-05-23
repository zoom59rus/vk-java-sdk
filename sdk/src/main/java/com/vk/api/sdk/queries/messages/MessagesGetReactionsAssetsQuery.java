// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.messages.responses.GetReactionsAssetsResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Messages.getReactionsAssets method
 */
public class MessagesGetReactionsAssetsQuery extends AbstractQueryBuilder<MessagesGetReactionsAssetsQuery, GetReactionsAssetsResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public MessagesGetReactionsAssetsQuery(VkApiClient client, UserActor actor) {
        super(client, "messages.getReactionsAssets", GetReactionsAssetsResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Set client version
     *
     * @param value value of "client version" parameter. Minimum is 1.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("client_version")
    public MessagesGetReactionsAssetsQuery clientVersion(Integer value) {
        return unsafeParam("client_version", value);
    }

    @Override
    protected MessagesGetReactionsAssetsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
