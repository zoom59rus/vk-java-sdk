// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.market;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.market.responses.AddAlbumResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Market.addAlbum method
 */
public class MarketAddAlbumQuery extends AbstractQueryBuilder<MarketAddAlbumQuery, AddAlbumResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param ownerId value of "owner id" parameter. Entity - owner
     *
     * @param title value of "title" parameter.
     */
    public MarketAddAlbumQuery(VkApiClient client, UserActor actor, Long ownerId, String title) {
        super(client, "market.addAlbum", AddAlbumResponse.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        title(title);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public MarketAddAlbumQuery(VkApiClient client, UserActor actor) {
        super(client, "market.addAlbum", AddAlbumResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * ID of an item owner community.
     *
     * @param value value of "owner id" parameter. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("owner_id")
    public MarketAddAlbumQuery ownerId(Long value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Collection title.
     *
     * @param value value of "title" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("title")
    public MarketAddAlbumQuery title(String value) {
        return unsafeParam("title", value);
    }

    /**
     * Cover photo ID.
     *
     * @param value value of "photo id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("photo_id")
    public MarketAddAlbumQuery photoId(Integer value) {
        return unsafeParam("photo_id", value);
    }

    /**
     * Set as main ('1' - set, '0' - no).
     *
     * @param value value of "main album" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("main_album")
    public MarketAddAlbumQuery mainAlbum(Boolean value) {
        return unsafeParam("main_album", value);
    }

    /**
     * Set as hidden
     *
     * @param value value of "is hidden" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("is_hidden")
    public MarketAddAlbumQuery isHidden(Boolean value) {
        return unsafeParam("is_hidden", value);
    }

    @Override
    protected MarketAddAlbumQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("title", "owner_id", "access_token");
    }
}
