// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.messages.responses.IsMessagesFromGroupAllowedResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Messages.isMessagesFromGroupAllowed method
 */
public class MessagesIsMessagesFromGroupAllowedQuery extends AbstractQueryBuilder<MessagesIsMessagesFromGroupAllowedQuery, IsMessagesFromGroupAllowedResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build group api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param groupId value of "group id" parameter. Minimum is 1. Entity - owner
     *
     * @param userId value of "user id" parameter. Minimum is 1. Entity - owner
     *
     */
    public MessagesIsMessagesFromGroupAllowedQuery(VkApiClient client, GroupActor actor,
            Long groupId, Long userId) {
        super(client, "messages.isMessagesFromGroupAllowed", IsMessagesFromGroupAllowedResponse.class);
        accessToken(actor.getAccessToken());
        groupId(actor.getGroupId());
        groupId(groupId);
        userId(userId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build group api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public MessagesIsMessagesFromGroupAllowedQuery(VkApiClient client, GroupActor actor) {
        super(client, "messages.isMessagesFromGroupAllowed", IsMessagesFromGroupAllowedResponse.class);
        accessToken(actor.getAccessToken());
        groupId(actor.getGroupId());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param groupId value of "group id" parameter. Minimum is 1. Entity - owner
     *
     * @param userId value of "user id" parameter. Minimum is 1. Entity - owner
     *
     */
    public MessagesIsMessagesFromGroupAllowedQuery(VkApiClient client, UserActor actor,
            Long groupId, Long userId) {
        super(client, "messages.isMessagesFromGroupAllowed", IsMessagesFromGroupAllowedResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
        userId(userId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public MessagesIsMessagesFromGroupAllowedQuery(VkApiClient client, UserActor actor) {
        super(client, "messages.isMessagesFromGroupAllowed", IsMessagesFromGroupAllowedResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Group ID.
     *
     * @param value value of "group id" parameter. Minimum is 1. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("group_id")
    public MessagesIsMessagesFromGroupAllowedQuery groupId(Long value) {
        return unsafeParam("group_id", value);
    }

    /**
     * User ID.
     *
     * @param value value of "user id" parameter. Minimum is 1. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("user_id")
    public MessagesIsMessagesFromGroupAllowedQuery userId(Long value) {
        return unsafeParam("user_id", value);
    }

    @Override
    protected MessagesIsMessagesFromGroupAllowedQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id", "user_id", "access_token");
    }
}
