// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.wall;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.base.UserGroupFields;
import com.vk.api.sdk.objects.wall.responses.GetByIdExtendedResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Wall.getById method
 */
public class WallGetByIdQueryWithExtended extends AbstractQueryBuilder<WallGetByIdQueryWithExtended, GetByIdExtendedResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build service api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param posts value of "posts" parameter.
     */
    public WallGetByIdQueryWithExtended(VkApiClient client, ServiceActor actor, String... posts) {
        super(client, "wall.getById", GetByIdExtendedResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        posts(posts);
        extended(true);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build service api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param posts value of "posts" parameter.
     */
    public WallGetByIdQueryWithExtended(VkApiClient client, ServiceActor actor,
            List<String> posts) {
        super(client, "wall.getById", GetByIdExtendedResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        posts(posts);
        extended(true);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param posts value of "posts" parameter.
     */
    public WallGetByIdQueryWithExtended(VkApiClient client, UserActor actor, String... posts) {
        super(client, "wall.getById", GetByIdExtendedResponse.class);
        accessToken(actor.getAccessToken());
        posts(posts);
        extended(true);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param posts value of "posts" parameter.
     */
    public WallGetByIdQueryWithExtended(VkApiClient client, UserActor actor, List<String> posts) {
        super(client, "wall.getById", GetByIdExtendedResponse.class);
        accessToken(actor.getAccessToken());
        posts(posts);
        extended(true);
    }

    /**
     * '1' - to return user and community objects needed to display posts, '0' - no additional fields are returned (default)
     *
     * @param value value of "extended" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("extended")
    protected WallGetByIdQueryWithExtended extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    /**
     * Sets the number of parent elements to include in the array 'copy_history' that is returned if the post is a repost from another wall.
     *
     * @param value value of "copy history depth" parameter. By default 2.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("copy_history_depth")
    public WallGetByIdQueryWithExtended copyHistoryDepth(Integer value) {
        return unsafeParam("copy_history_depth", value);
    }

    /**
     * posts
     * User or community IDs and post IDs, separated by underscores. Use a negative value to designate a community ID. Example: "93388_21539,93388_20904,2943_4276,-1_1"
     *
     * @param value value of "posts" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("posts")
    public WallGetByIdQueryWithExtended posts(String... value) {
        return unsafeParam("posts", value);
    }

    /**
     * User or community IDs and post IDs, separated by underscores. Use a negative value to designate a community ID. Example: "93388_21539,93388_20904,2943_4276,-1_1"
     *
     * @param value value of "posts" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("posts")
    public WallGetByIdQueryWithExtended posts(List<String> value) {
        return unsafeParam("posts", value);
    }

    /**
     * fields
     * Set fields
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("fields")
    public WallGetByIdQueryWithExtended fields(UserGroupFields... value) {
        return unsafeParam("fields", value);
    }

    /**
     * Set fields
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("fields")
    public WallGetByIdQueryWithExtended fields(List<UserGroupFields> value) {
        return unsafeParam("fields", value);
    }

    @Override
    protected WallGetByIdQueryWithExtended getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("posts", "access_token");
    }
}
