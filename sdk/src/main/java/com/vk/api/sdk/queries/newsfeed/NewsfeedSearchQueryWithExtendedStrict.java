// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.newsfeed;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.base.UserGroupFields;
import com.vk.api.sdk.objects.newsfeed.responses.SearchExtendedStrictResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Newsfeed.search method
 */
public class NewsfeedSearchQueryWithExtendedStrict extends AbstractQueryBuilder<NewsfeedSearchQueryWithExtendedStrict, SearchExtendedStrictResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build service api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public NewsfeedSearchQueryWithExtendedStrict(VkApiClient client, ServiceActor actor) {
        super(client, "newsfeed.search", SearchExtendedStrictResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        extended(true);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public NewsfeedSearchQueryWithExtendedStrict(VkApiClient client, UserActor actor) {
        super(client, "newsfeed.search", SearchExtendedStrictResponse.class);
        accessToken(actor.getAccessToken());
        extended(true);
    }

    /**
     * Search query string (e.g., 'New Year').
     *
     * @param value value of "q" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("q")
    public NewsfeedSearchQueryWithExtendedStrict q(String value) {
        return unsafeParam("q", value);
    }

    /**
     * '1' - to return additional information about the user or community that placed the post.
     *
     * @param value value of "extended" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("extended")
    public NewsfeedSearchQueryWithExtendedStrict extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    /**
     * Number of posts to return.
     *
     * @param value value of "count" parameter. Maximum is 200. Minimum is 0. By default 30.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("count")
    public NewsfeedSearchQueryWithExtendedStrict count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Geographical latitude point (in degrees, -90 to 90) within which to search.
     *
     * @param value value of "latitude" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("latitude")
    public NewsfeedSearchQueryWithExtendedStrict latitude(Number value) {
        return unsafeParam("latitude", value);
    }

    /**
     * Geographical longitude point (in degrees, -180 to 180) within which to search.
     *
     * @param value value of "longitude" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("longitude")
    public NewsfeedSearchQueryWithExtendedStrict longitude(Number value) {
        return unsafeParam("longitude", value);
    }

    /**
     * Earliest timestamp (in Unix time) of a news item to return. By default, 24 hours ago.
     *
     * @param value value of "start time" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("start_time")
    public NewsfeedSearchQueryWithExtendedStrict startTime(Integer value) {
        return unsafeParam("start_time", value);
    }

    /**
     * Latest timestamp (in Unix time) of a news item to return. By default, the current time.
     *
     * @param value value of "end time" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("end_time")
    public NewsfeedSearchQueryWithExtendedStrict endTime(Integer value) {
        return unsafeParam("end_time", value);
    }

    /**
     * Set start from
     *
     * @param value value of "start from" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("start_from")
    public NewsfeedSearchQueryWithExtendedStrict startFrom(String value) {
        return unsafeParam("start_from", value);
    }

    /**
     * fields
     * Additional fields of [vk.com/dev/fields|profiles] and [vk.com/dev/fields_groups|communities] to return.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("fields")
    public NewsfeedSearchQueryWithExtendedStrict fields(UserGroupFields... value) {
        return unsafeParam("fields", value);
    }

    /**
     * Additional fields of [vk.com/dev/fields|profiles] and [vk.com/dev/fields_groups|communities] to return.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("fields")
    public NewsfeedSearchQueryWithExtendedStrict fields(List<UserGroupFields> value) {
        return unsafeParam("fields", value);
    }

    @Override
    protected NewsfeedSearchQueryWithExtendedStrict getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
