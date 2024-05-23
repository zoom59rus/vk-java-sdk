// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.stories;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Stories.hideAllReplies method
 */
public class StoriesHideAllRepliesQuery extends AbstractQueryBuilder<StoriesHideAllRepliesQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build group api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param ownerId value of "owner id" parameter. Entity - owner
     *
     */
    public StoriesHideAllRepliesQuery(VkApiClient client, GroupActor actor, Long ownerId) {
        super(client, "stories.hideAllReplies", OkResponse.class);
        accessToken(actor.getAccessToken());
        groupId(actor.getGroupId());
        ownerId(ownerId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build group api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public StoriesHideAllRepliesQuery(VkApiClient client, GroupActor actor) {
        super(client, "stories.hideAllReplies", OkResponse.class);
        accessToken(actor.getAccessToken());
        groupId(actor.getGroupId());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param ownerId value of "owner id" parameter. Entity - owner
     *
     */
    public StoriesHideAllRepliesQuery(VkApiClient client, UserActor actor, Long ownerId) {
        super(client, "stories.hideAllReplies", OkResponse.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public StoriesHideAllRepliesQuery(VkApiClient client, UserActor actor) {
        super(client, "stories.hideAllReplies", OkResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * ID of the user whose replies should be hidden.
     *
     * @param value value of "owner id" parameter. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("owner_id")
    public StoriesHideAllRepliesQuery ownerId(Long value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Set group id
     *
     * @param value value of "group id" parameter. Minimum is 0. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("group_id")
    public StoriesHideAllRepliesQuery groupId(Long value) {
        return unsafeParam("group_id", value);
    }

    @Override
    protected StoriesHideAllRepliesQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("owner_id", "access_token");
    }
}
