// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.apps;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.apps.GetLeaderboardType;
import com.vk.api.sdk.objects.apps.responses.GetLeaderboardResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Apps.getLeaderboard method
 */
public class AppsGetLeaderboardQuery extends AbstractQueryBuilder<AppsGetLeaderboardQuery, GetLeaderboardResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param type value of "type" parameter.
     */
    public AppsGetLeaderboardQuery(VkApiClient client, UserActor actor, GetLeaderboardType type) {
        super(client, "apps.getLeaderboard", GetLeaderboardResponse.class);
        accessToken(actor.getAccessToken());
        type(type);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public AppsGetLeaderboardQuery(VkApiClient client, UserActor actor) {
        super(client, "apps.getLeaderboard", GetLeaderboardResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Leaderboard type. Possible values: *'level' - by level,, *'points' - by mission points,, *'score' - by score ().
     *
     * @param value value of "type" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("type")
    public AppsGetLeaderboardQuery type(GetLeaderboardType value) {
        return unsafeParam("type", value);
    }

    /**
     * Rating type. Possible values: *'1' - global rating among all players,, *'0' - rating among user friends.
     *
     * @param value value of "global" parameter. By default true.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("global")
    public AppsGetLeaderboardQuery global(Boolean value) {
        return unsafeParam("global", value);
    }

    /**
     * 1 - to return additional info about users
     *
     * @param value value of "extended" parameter. By default false.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("extended")
    public AppsGetLeaderboardQuery extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    @Override
    protected AppsGetLeaderboardQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("type", "access_token");
    }
}
