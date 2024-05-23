// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Messages.restore method
 */
public class MessagesRestoreQuery extends AbstractQueryBuilder<MessagesRestoreQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build group api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public MessagesRestoreQuery(VkApiClient client, GroupActor actor) {
        super(client, "messages.restore", OkResponse.class);
        accessToken(actor.getAccessToken());
        groupId(actor.getGroupId());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public MessagesRestoreQuery(VkApiClient client, UserActor actor) {
        super(client, "messages.restore", OkResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * ID of a previously-deleted message to restore.
     *
     * @param value value of "message id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("message_id")
    public MessagesRestoreQuery messageId(Integer value) {
        return unsafeParam("message_id", value);
    }

    /**
     * Group ID (for group messages with user access token)
     *
     * @param value value of "group id" parameter. Minimum is 0. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("group_id")
    public MessagesRestoreQuery groupId(Long value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Set cmid
     *
     * @param value value of "cmid" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("cmid")
    public MessagesRestoreQuery cmid(Integer value) {
        return unsafeParam("cmid", value);
    }

    /**
     * Destination ID.
     *
     * @param value value of "peer id" parameter. Entity - peer
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("peer_id")
    public MessagesRestoreQuery peerId(Long value) {
        return unsafeParam("peer_id", value);
    }

    @Override
    protected MessagesRestoreQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
