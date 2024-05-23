// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.ads;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.base.responses.UndefinedResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Ads.deleteTargetPixel method
 */
public class AdsDeleteTargetPixelQuery extends AbstractQueryBuilder<AdsDeleteTargetPixelQuery, UndefinedResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param accountId value of "account id" parameter.
     * @param targetPixelId value of "target pixel id" parameter.
     */
    public AdsDeleteTargetPixelQuery(VkApiClient client, UserActor actor, Integer accountId,
            Integer targetPixelId) {
        super(client, "ads.deleteTargetPixel", UndefinedResponse.class);
        accessToken(actor.getAccessToken());
        accountId(accountId);
        targetPixelId(targetPixelId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public AdsDeleteTargetPixelQuery(VkApiClient client, UserActor actor) {
        super(client, "ads.deleteTargetPixel", UndefinedResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Set account id
     *
     * @param value value of "account id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("account_id")
    public AdsDeleteTargetPixelQuery accountId(Integer value) {
        return unsafeParam("account_id", value);
    }

    /**
     * Set client id
     *
     * @param value value of "client id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("client_id")
    public AdsDeleteTargetPixelQuery clientId(Integer value) {
        return unsafeParam("client_id", value);
    }

    /**
     * Set target pixel id
     *
     * @param value value of "target pixel id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("target_pixel_id")
    public AdsDeleteTargetPixelQuery targetPixelId(Integer value) {
        return unsafeParam("target_pixel_id", value);
    }

    @Override
    protected AdsDeleteTargetPixelQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("target_pixel_id", "account_id", "access_token");
    }
}
