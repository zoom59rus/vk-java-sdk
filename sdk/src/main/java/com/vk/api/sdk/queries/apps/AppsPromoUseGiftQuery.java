// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.apps;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.base.responses.BoolResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Apps.promoUseGift method
 */
public class AppsPromoUseGiftQuery extends AbstractQueryBuilder<AppsPromoUseGiftQuery, BoolResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build service api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param promoId value of "promo id" parameter. Minimum is 0.
     */
    public AppsPromoUseGiftQuery(VkApiClient client, ServiceActor actor, Integer promoId) {
        super(client, "apps.promoUseGift", BoolResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        promoId(promoId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build service api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public AppsPromoUseGiftQuery(VkApiClient client, ServiceActor actor) {
        super(client, "apps.promoUseGift", BoolResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param promoId value of "promo id" parameter. Minimum is 0.
     */
    public AppsPromoUseGiftQuery(VkApiClient client, UserActor actor, Integer promoId) {
        super(client, "apps.promoUseGift", BoolResponse.class);
        accessToken(actor.getAccessToken());
        promoId(promoId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public AppsPromoUseGiftQuery(VkApiClient client, UserActor actor) {
        super(client, "apps.promoUseGift", BoolResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Id of game promo action
     *
     * @param value value of "promo id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("promo_id")
    public AppsPromoUseGiftQuery promoId(Integer value) {
        return unsafeParam("promo_id", value);
    }

    /**
     * Set user id
     *
     * @param value value of "user id" parameter. Minimum is 0. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("user_id")
    public AppsPromoUseGiftQuery userId(Long value) {
        return unsafeParam("user_id", value);
    }

    @Override
    protected AppsPromoUseGiftQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("promo_id", "access_token");
    }
}
