// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.apps;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.apps.AddSnippetButton;
import com.vk.api.sdk.objects.apps.responses.AddSnippetResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Apps.addSnippet method
 */
public class AppsAddSnippetQuery extends AbstractQueryBuilder<AppsAddSnippetQuery, AddSnippetResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build service api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public AppsAddSnippetQuery(VkApiClient client, ServiceActor actor) {
        super(client, "apps.addSnippet", AddSnippetResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
    }

    /**
     * Set snippet id
     *
     * @param value value of "snippet id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("snippet_id")
    public AppsAddSnippetQuery snippetId(Integer value) {
        return unsafeParam("snippet_id", value);
    }

    /**
     * Set title
     *
     * @param value value of "title" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("title")
    public AppsAddSnippetQuery title(String value) {
        return unsafeParam("title", value);
    }

    /**
     * Set description
     *
     * @param value value of "description" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("description")
    public AppsAddSnippetQuery description(String value) {
        return unsafeParam("description", value);
    }

    /**
     * Set image url
     *
     * @param value value of "image url" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("image_url")
    public AppsAddSnippetQuery imageUrl(String value) {
        return unsafeParam("image_url", value);
    }

    /**
     * Set small image url
     *
     * @param value value of "small image url" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("small_image_url")
    public AppsAddSnippetQuery smallImageUrl(String value) {
        return unsafeParam("small_image_url", value);
    }

    /**
     * Set button
     *
     * @param value value of "button" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("button")
    public AppsAddSnippetQuery button(AddSnippetButton value) {
        return unsafeParam("button", value);
    }

    /**
     * vkRef
     * Set vk ref
     *
     * @param value value of "vk ref" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("vk_ref")
    public AppsAddSnippetQuery vkRef(String... value) {
        return unsafeParam("vk_ref", value);
    }

    /**
     * Set vk ref
     *
     * @param value value of "vk ref" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("vk_ref")
    public AppsAddSnippetQuery vkRef(List<String> value) {
        return unsafeParam("vk_ref", value);
    }

    /**
     * groupId
     * Set group id
     *
     * @param value value of "group id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("group_id")
    public AppsAddSnippetQuery groupId(Long... value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Set group id
     *
     * @param value value of "group id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("group_id")
    public AppsAddSnippetQuery groupId(List<Long> value) {
        return unsafeParam("group_id", value);
    }

    /**
     * hash
     * Set hash
     *
     * @param value value of "hash" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("hash")
    public AppsAddSnippetQuery hash(String... value) {
        return unsafeParam("hash", value);
    }

    /**
     * Set hash
     *
     * @param value value of "hash" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("hash")
    public AppsAddSnippetQuery hash(List<String> value) {
        return unsafeParam("hash", value);
    }

    @Override
    protected AppsAddSnippetQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
