// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.ads;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.ads.responses.ShareTargetGroupResponse;
import com.vk.api.sdk.objects.annotations.ApiParam;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Ads.shareTargetGroup method
 */
public class AdsShareTargetGroupQuery extends AbstractQueryBuilder<AdsShareTargetGroupQuery, ShareTargetGroupResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param accountId value of "account id" parameter.
     * @param targetGroupId value of "target group id" parameter.
     */
    public AdsShareTargetGroupQuery(VkApiClient client, UserActor actor, Integer accountId,
            Integer targetGroupId) {
        super(client, "ads.shareTargetGroup", ShareTargetGroupResponse.class);
        accessToken(actor.getAccessToken());
        accountId(accountId);
        targetGroupId(targetGroupId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public AdsShareTargetGroupQuery(VkApiClient client, UserActor actor) {
        super(client, "ads.shareTargetGroup", ShareTargetGroupResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Set account id
     *
     * @param value value of "account id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("account_id")
    public AdsShareTargetGroupQuery accountId(Integer value) {
        return unsafeParam("account_id", value);
    }

    /**
     * Set client id
     *
     * @param value value of "client id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("client_id")
    public AdsShareTargetGroupQuery clientId(Integer value) {
        return unsafeParam("client_id", value);
    }

    /**
     * Set target group id
     *
     * @param value value of "target group id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("target_group_id")
    public AdsShareTargetGroupQuery targetGroupId(Integer value) {
        return unsafeParam("target_group_id", value);
    }

    /**
     * Set share with client id
     *
     * @param value value of "share with client id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("share_with_client_id")
    public AdsShareTargetGroupQuery shareWithClientId(Integer value) {
        return unsafeParam("share_with_client_id", value);
    }

    @Override
    protected AdsShareTargetGroupQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("target_group_id", "account_id", "access_token");
    }
}
