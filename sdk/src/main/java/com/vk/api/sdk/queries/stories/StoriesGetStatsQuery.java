// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.stories;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.stories.responses.GetStatsResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Stories.getStats method
 */
public class StoriesGetStatsQuery extends AbstractQueryBuilder<StoriesGetStatsQuery, GetStatsResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build group api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param ownerId value of "owner id" parameter. Entity - owner
     *
     * @param storyId value of "story id" parameter. Minimum is 0.
     */
    public StoriesGetStatsQuery(VkApiClient client, GroupActor actor, Long ownerId,
            Integer storyId) {
        super(client, "stories.getStats", GetStatsResponse.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        storyId(storyId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build group api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public StoriesGetStatsQuery(VkApiClient client, GroupActor actor) {
        super(client, "stories.getStats", GetStatsResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param ownerId value of "owner id" parameter. Entity - owner
     *
     * @param storyId value of "story id" parameter. Minimum is 0.
     */
    public StoriesGetStatsQuery(VkApiClient client, UserActor actor, Long ownerId,
            Integer storyId) {
        super(client, "stories.getStats", GetStatsResponse.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        storyId(storyId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public StoriesGetStatsQuery(VkApiClient client, UserActor actor) {
        super(client, "stories.getStats", GetStatsResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Story owner ID.
     *
     * @param value value of "owner id" parameter. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("owner_id")
    public StoriesGetStatsQuery ownerId(Long value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Story ID.
     *
     * @param value value of "story id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("story_id")
    public StoriesGetStatsQuery storyId(Integer value) {
        return unsafeParam("story_id", value);
    }

    @Override
    protected StoriesGetStatsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("story_id", "owner_id", "access_token");
    }
}
