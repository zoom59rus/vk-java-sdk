// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.ads;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.ads.responses.CreateCampaignsResponse;
import com.vk.api.sdk.objects.annotations.ApiParam;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Ads.createCampaigns method
 */
public class AdsCreateCampaignsQuery extends AbstractQueryBuilder<AdsCreateCampaignsQuery, List<CreateCampaignsResponse>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param accountId value of "account id" parameter.
     * @param data value of "data" parameter.
     */
    public AdsCreateCampaignsQuery(VkApiClient client, UserActor actor, Integer accountId,
            String data) {
        super(client, "ads.createCampaigns", Utils.buildParametrizedType(List.class, CreateCampaignsResponse.class));
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
    public AdsCreateCampaignsQuery(VkApiClient client, UserActor actor) {
        super(client, "ads.createCampaigns", Utils.buildParametrizedType(List.class, CreateCampaignsResponse.class));
        accessToken(actor.getAccessToken());
    }

    /**
     * Advertising account ID.
     *
     * @param value value of "account id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("account_id")
    public AdsCreateCampaignsQuery accountId(Integer value) {
        return unsafeParam("account_id", value);
    }

    /**
     * Serialized JSON array of objects that describe created campaigns. Description of 'campaign_specification' objects see below.
     *
     * @param value value of "data" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("data")
    public AdsCreateCampaignsQuery data(String value) {
        return unsafeParam("data", value);
    }

    @Override
    protected AdsCreateCampaignsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("data", "account_id", "access_token");
    }
}
