// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.messages.responses.GetMessagesReactionsResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Messages.getMessagesReactions method
 */
public class MessagesGetMessagesReactionsQuery extends AbstractQueryBuilder<MessagesGetMessagesReactionsQuery, GetMessagesReactionsResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build group api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param peerId value of "peer id" parameter. Entity - peer
     *
     * @param cmids value of "cmids" parameter.
     */
    public MessagesGetMessagesReactionsQuery(VkApiClient client, GroupActor actor, Long peerId,
            Integer... cmids) {
        super(client, "messages.getMessagesReactions", GetMessagesReactionsResponse.class);
        accessToken(actor.getAccessToken());
        peerId(peerId);
        cmids(cmids);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build group api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param peerId value of "peer id" parameter. Entity - peer
     *
     * @param cmids value of "cmids" parameter.
     */
    public MessagesGetMessagesReactionsQuery(VkApiClient client, GroupActor actor, Long peerId,
            List<Integer> cmids) {
        super(client, "messages.getMessagesReactions", GetMessagesReactionsResponse.class);
        accessToken(actor.getAccessToken());
        peerId(peerId);
        cmids(cmids);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build group api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public MessagesGetMessagesReactionsQuery(VkApiClient client, GroupActor actor) {
        super(client, "messages.getMessagesReactions", GetMessagesReactionsResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param peerId value of "peer id" parameter. Entity - peer
     *
     * @param cmids value of "cmids" parameter.
     */
    public MessagesGetMessagesReactionsQuery(VkApiClient client, UserActor actor, Long peerId,
            Integer... cmids) {
        super(client, "messages.getMessagesReactions", GetMessagesReactionsResponse.class);
        accessToken(actor.getAccessToken());
        peerId(peerId);
        cmids(cmids);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param peerId value of "peer id" parameter. Entity - peer
     *
     * @param cmids value of "cmids" parameter.
     */
    public MessagesGetMessagesReactionsQuery(VkApiClient client, UserActor actor, Long peerId,
            List<Integer> cmids) {
        super(client, "messages.getMessagesReactions", GetMessagesReactionsResponse.class);
        accessToken(actor.getAccessToken());
        peerId(peerId);
        cmids(cmids);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public MessagesGetMessagesReactionsQuery(VkApiClient client, UserActor actor) {
        super(client, "messages.getMessagesReactions", GetMessagesReactionsResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Set peer id
     *
     * @param value value of "peer id" parameter. Entity - peer
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("peer_id")
    public MessagesGetMessagesReactionsQuery peerId(Long value) {
        return unsafeParam("peer_id", value);
    }

    /**
     * cmids
     * Set cmids
     *
     * @param value value of "cmids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("cmids")
    public MessagesGetMessagesReactionsQuery cmids(Integer... value) {
        return unsafeParam("cmids", value);
    }

    /**
     * Set cmids
     *
     * @param value value of "cmids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("cmids")
    public MessagesGetMessagesReactionsQuery cmids(List<Integer> value) {
        return unsafeParam("cmids", value);
    }

    @Override
    protected MessagesGetMessagesReactionsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("peer_id", "cmids", "access_token");
    }
}
