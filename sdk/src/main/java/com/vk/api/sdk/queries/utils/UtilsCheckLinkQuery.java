// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.utils;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.utils.responses.CheckLinkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Utils.checkLink method
 */
public class UtilsCheckLinkQuery extends AbstractQueryBuilder<UtilsCheckLinkQuery, CheckLinkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build group api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param url value of "url" parameter.
     */
    public UtilsCheckLinkQuery(VkApiClient client, GroupActor actor, String url) {
        super(client, "utils.checkLink", CheckLinkResponse.class);
        accessToken(actor.getAccessToken());
        url(url);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build group api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public UtilsCheckLinkQuery(VkApiClient client, GroupActor actor) {
        super(client, "utils.checkLink", CheckLinkResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build service api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param url value of "url" parameter.
     */
    public UtilsCheckLinkQuery(VkApiClient client, ServiceActor actor, String url) {
        super(client, "utils.checkLink", CheckLinkResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        url(url);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build service api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public UtilsCheckLinkQuery(VkApiClient client, ServiceActor actor) {
        super(client, "utils.checkLink", CheckLinkResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param url value of "url" parameter.
     */
    public UtilsCheckLinkQuery(VkApiClient client, UserActor actor, String url) {
        super(client, "utils.checkLink", CheckLinkResponse.class);
        accessToken(actor.getAccessToken());
        url(url);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public UtilsCheckLinkQuery(VkApiClient client, UserActor actor) {
        super(client, "utils.checkLink", CheckLinkResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Link to check (e.g., 'http://google.com').
     *
     * @param value value of "url" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("url")
    public UtilsCheckLinkQuery url(String value) {
        return unsafeParam("url", value);
    }

    @Override
    protected UtilsCheckLinkQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("url", "access_token");
    }
}
