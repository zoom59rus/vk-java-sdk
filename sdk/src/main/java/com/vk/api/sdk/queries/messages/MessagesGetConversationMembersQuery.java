// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.messages.responses.GetConversationMembersResponse;
import com.vk.api.sdk.objects.users.Fields;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Messages.getConversationMembers method
 */
public class MessagesGetConversationMembersQuery extends AbstractQueryBuilder<MessagesGetConversationMembersQuery, GetConversationMembersResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build group api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param peerId value of "peer id" parameter. Entity - peer
     *
     */
    public MessagesGetConversationMembersQuery(VkApiClient client, GroupActor actor, Long peerId) {
        super(client, "messages.getConversationMembers", GetConversationMembersResponse.class);
        accessToken(actor.getAccessToken());
        groupId(actor.getGroupId());
        peerId(peerId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build group api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public MessagesGetConversationMembersQuery(VkApiClient client, GroupActor actor) {
        super(client, "messages.getConversationMembers", GetConversationMembersResponse.class);
        accessToken(actor.getAccessToken());
        groupId(actor.getGroupId());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param peerId value of "peer id" parameter. Entity - peer
     *
     */
    public MessagesGetConversationMembersQuery(VkApiClient client, UserActor actor, Long peerId) {
        super(client, "messages.getConversationMembers", GetConversationMembersResponse.class);
        accessToken(actor.getAccessToken());
        peerId(peerId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public MessagesGetConversationMembersQuery(VkApiClient client, UserActor actor) {
        super(client, "messages.getConversationMembers", GetConversationMembersResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Peer ID.
     *
     * @param value value of "peer id" parameter. Entity - peer
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("peer_id")
    public MessagesGetConversationMembersQuery peerId(Long value) {
        return unsafeParam("peer_id", value);
    }

    /**
     * Set offset
     *
     * @param value value of "offset" parameter. Minimum is 0. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("offset")
    public MessagesGetConversationMembersQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Set count
     *
     * @param value value of "count" parameter. Maximum is 1000. Minimum is 1. By default 20.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("count")
    public MessagesGetConversationMembersQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Extended flag
     *
     * @param value value of "extended" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("extended")
    public MessagesGetConversationMembersQuery extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    /**
     * Group ID (for group messages with group access token)
     *
     * @param value value of "group id" parameter. Minimum is 0. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("group_id")
    public MessagesGetConversationMembersQuery groupId(Long value) {
        return unsafeParam("group_id", value);
    }

    /**
     * fields
     * Profile fields to return.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("fields")
    public MessagesGetConversationMembersQuery fields(Fields... value) {
        return unsafeParam("fields", value);
    }

    /**
     * Profile fields to return.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("fields")
    public MessagesGetConversationMembersQuery fields(List<Fields> value) {
        return unsafeParam("fields", value);
    }

    /**
     * memberIds
     * Set member ids
     *
     * @param value value of "member ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("member_ids")
    public MessagesGetConversationMembersQuery memberIds(Integer... value) {
        return unsafeParam("member_ids", value);
    }

    /**
     * Set member ids
     *
     * @param value value of "member ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("member_ids")
    public MessagesGetConversationMembersQuery memberIds(List<Integer> value) {
        return unsafeParam("member_ids", value);
    }

    @Override
    protected MessagesGetConversationMembersQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("peer_id", "access_token");
    }
}
