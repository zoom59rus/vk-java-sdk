// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.pages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.pages.responses.GetHistoryResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Pages.getHistory method
 */
public class PagesGetHistoryQuery extends AbstractQueryBuilder<PagesGetHistoryQuery, List<GetHistoryResponse>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param pageId value of "page id" parameter.
     */
    public PagesGetHistoryQuery(VkApiClient client, UserActor actor, Integer pageId) {
        super(client, "pages.getHistory", Utils.buildParametrizedType(List.class, GetHistoryResponse.class));
        accessToken(actor.getAccessToken());
        pageId(pageId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public PagesGetHistoryQuery(VkApiClient client, UserActor actor) {
        super(client, "pages.getHistory", Utils.buildParametrizedType(List.class, GetHistoryResponse.class));
        accessToken(actor.getAccessToken());
    }

    /**
     * Wiki page ID.
     *
     * @param value value of "page id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("page_id")
    public PagesGetHistoryQuery pageId(Integer value) {
        return unsafeParam("page_id", value);
    }

    /**
     * ID of the community that owns the wiki page.
     *
     * @param value value of "group id" parameter. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("group_id")
    public PagesGetHistoryQuery groupId(Long value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Set user id
     *
     * @param value value of "user id" parameter. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("user_id")
    public PagesGetHistoryQuery userId(Long value) {
        return unsafeParam("user_id", value);
    }

    @Override
    protected PagesGetHistoryQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token", "page_id");
    }
}
