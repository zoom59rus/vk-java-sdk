// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.video;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.video.responses.StopStreamingResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Video.stopStreaming method
 */
public class VideoStopStreamingQuery extends AbstractQueryBuilder<VideoStopStreamingQuery, StopStreamingResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public VideoStopStreamingQuery(VkApiClient client, UserActor actor) {
        super(client, "video.stopStreaming", StopStreamingResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Set group id
     *
     * @param value value of "group id" parameter. Minimum is 1. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("group_id")
    public VideoStopStreamingQuery groupId(Long value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Set video id
     *
     * @param value value of "video id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("video_id")
    public VideoStopStreamingQuery videoId(Integer value) {
        return unsafeParam("video_id", value);
    }

    @Override
    protected VideoStopStreamingQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
