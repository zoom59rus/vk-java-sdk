// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.ads;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.ads.responses.CreateAdsResponse;
import com.vk.api.sdk.objects.annotations.ApiParam;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Ads.createAds method
 */
public class AdsCreateAdsQuery extends AbstractQueryBuilder<AdsCreateAdsQuery, List<CreateAdsResponse>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param accountId value of "account id" parameter.
     * @param data value of "data" parameter.
     */
    public AdsCreateAdsQuery(VkApiClient client, UserActor actor, Integer accountId, String data) {
        super(client, "ads.createAds", Utils.buildParametrizedType(List.class, CreateAdsResponse.class));
        accessToken(actor.getAccessToken());
        accountId(accountId);
        data(data);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public AdsCreateAdsQuery(VkApiClient client, UserActor actor) {
        super(client, "ads.createAds", Utils.buildParametrizedType(List.class, CreateAdsResponse.class));
        accessToken(actor.getAccessToken());
    }

    /**
     * Advertising account ID.
     *
     * @param value value of "account id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("account_id")
    public AdsCreateAdsQuery accountId(Integer value) {
        return unsafeParam("account_id", value);
    }

    /**
     * Serialized JSON array of objects that describe created ads. Description of 'ad_specification' objects see below.
     *
     * @param value value of "data" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("data")
    public AdsCreateAdsQuery data(String value) {
        return unsafeParam("data", value);
    }

    @Override
    protected AdsCreateAdsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("data", "account_id", "access_token");
    }
}
