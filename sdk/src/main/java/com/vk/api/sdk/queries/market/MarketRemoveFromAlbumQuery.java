// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.market;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Market.removeFromAlbum method
 */
public class MarketRemoveFromAlbumQuery extends AbstractQueryBuilder<MarketRemoveFromAlbumQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param ownerId value of "owner id" parameter. Entity - owner
     *
     * @param itemId value of "item id" parameter. Minimum is 0.
     * @param albumIds value of "album ids" parameter.
     */
    public MarketRemoveFromAlbumQuery(VkApiClient client, UserActor actor, Long ownerId,
            Integer itemId, Integer... albumIds) {
        super(client, "market.removeFromAlbum", OkResponse.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        itemId(itemId);
        albumIds(albumIds);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param ownerId value of "owner id" parameter. Entity - owner
     *
     * @param itemId value of "item id" parameter. Minimum is 0.
     * @param albumIds value of "album ids" parameter.
     */
    public MarketRemoveFromAlbumQuery(VkApiClient client, UserActor actor, Long ownerId,
            Integer itemId, List<Integer> albumIds) {
        super(client, "market.removeFromAlbum", OkResponse.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        itemId(itemId);
        albumIds(albumIds);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public MarketRemoveFromAlbumQuery(VkApiClient client, UserActor actor) {
        super(client, "market.removeFromAlbum", OkResponse.class);
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
    public MarketRemoveFromAlbumQuery ownerId(Long value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Item ID.
     *
     * @param value value of "item id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("item_id")
    public MarketRemoveFromAlbumQuery itemId(Integer value) {
        return unsafeParam("item_id", value);
    }

    /**
     * albumIds
     * Collections IDs to remove item from.
     *
     * @param value value of "album ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("album_ids")
    public MarketRemoveFromAlbumQuery albumIds(Integer... value) {
        return unsafeParam("album_ids", value);
    }

    /**
     * Collections IDs to remove item from.
     *
     * @param value value of "album ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("album_ids")
    public MarketRemoveFromAlbumQuery albumIds(List<Integer> value) {
        return unsafeParam("album_ids", value);
    }

    @Override
    protected MarketRemoveFromAlbumQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("item_id", "album_ids", "owner_id", "access_token");
    }
}
