// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.docs;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Docs.restore method
 */
public class DocsRestoreQuery extends AbstractQueryBuilder<DocsRestoreQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param ownerId value of "owner id" parameter. Entity - owner
     *
     * @param docId value of "doc id" parameter. Minimum is 0.
     */
    public DocsRestoreQuery(VkApiClient client, UserActor actor, Long ownerId, Integer docId) {
        super(client, "docs.restore", OkResponse.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        docId(docId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public DocsRestoreQuery(VkApiClient client, UserActor actor) {
        super(client, "docs.restore", OkResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Set owner id
     *
     * @param value value of "owner id" parameter. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("owner_id")
    public DocsRestoreQuery ownerId(Long value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Set doc id
     *
     * @param value value of "doc id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("doc_id")
    public DocsRestoreQuery docId(Integer value) {
        return unsafeParam("doc_id", value);
    }

    @Override
    protected DocsRestoreQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("owner_id", "doc_id", "access_token");
    }
}
