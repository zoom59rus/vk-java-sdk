// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.market;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.market.responses.AddResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Market.add method
 */
public class MarketAddQuery extends AbstractQueryBuilder<MarketAddQuery, AddResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param ownerId value of "owner id" parameter. Entity - owner
     *
     * @param name value of "name" parameter.
     * @param description value of "description" parameter.
     * @param categoryId value of "category id" parameter. Minimum is 0.
     */
    public MarketAddQuery(VkApiClient client, UserActor actor, Long ownerId, String name,
            String description, Integer categoryId) {
        super(client, "market.add", AddResponse.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        name(name);
        description(description);
        categoryId(categoryId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public MarketAddQuery(VkApiClient client, UserActor actor) {
        super(client, "market.add", AddResponse.class);
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
    public MarketAddQuery ownerId(Long value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Item name.
     *
     * @param value value of "name" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("name")
    public MarketAddQuery name(String value) {
        return unsafeParam("name", value);
    }

    /**
     * Item description.
     *
     * @param value value of "description" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("description")
    public MarketAddQuery description(String value) {
        return unsafeParam("description", value);
    }

    /**
     * Item category ID.
     *
     * @param value value of "category id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("category_id")
    public MarketAddQuery categoryId(Integer value) {
        return unsafeParam("category_id", value);
    }

    /**
     * Item price.
     *
     * @param value value of "price" parameter. Maximum is 2147483647. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("price")
    public MarketAddQuery price(Number value) {
        return unsafeParam("price", value);
    }

    /**
     * Set old price
     *
     * @param value value of "old price" parameter. Maximum is 2147483647. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("old_price")
    public MarketAddQuery oldPrice(Number value) {
        return unsafeParam("old_price", value);
    }

    /**
     * Item status ('1' - deleted, '0' - not deleted).
     *
     * @param value value of "deleted" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("deleted")
    public MarketAddQuery deleted(Boolean value) {
        return unsafeParam("deleted", value);
    }

    /**
     * Cover photo ID.
     *
     * @param value value of "main photo id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("main_photo_id")
    public MarketAddQuery mainPhotoId(Integer value) {
        return unsafeParam("main_photo_id", value);
    }

    /**
     * Url for button in market item.
     *
     * @param value value of "url" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("url")
    public MarketAddQuery url(String value) {
        return unsafeParam("url", value);
    }

    /**
     * Is main in their group.
     *
     * @param value value of "is main variant" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("is_main_variant")
    public MarketAddQuery isMainVariant(Boolean value) {
        return unsafeParam("is_main_variant", value);
    }

    /**
     * Set dimension width
     *
     * @param value value of "dimension width" parameter. Maximum is 100000. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("dimension_width")
    public MarketAddQuery dimensionWidth(Integer value) {
        return unsafeParam("dimension_width", value);
    }

    /**
     * Set dimension height
     *
     * @param value value of "dimension height" parameter. Maximum is 100000. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("dimension_height")
    public MarketAddQuery dimensionHeight(Integer value) {
        return unsafeParam("dimension_height", value);
    }

    /**
     * Set dimension length
     *
     * @param value value of "dimension length" parameter. Maximum is 100000. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("dimension_length")
    public MarketAddQuery dimensionLength(Integer value) {
        return unsafeParam("dimension_length", value);
    }

    /**
     * Set weight
     *
     * @param value value of "weight" parameter. Maximum is 100000000. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("weight")
    public MarketAddQuery weight(Integer value) {
        return unsafeParam("weight", value);
    }

    /**
     * Set sku
     *
     * @param value value of "sku" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("sku")
    public MarketAddQuery sku(String value) {
        return unsafeParam("sku", value);
    }

    /**
     * Set stock amount
     *
     * @param value value of "stock amount" parameter. Maximum is 999999. Minimum is -1.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("stock_amount")
    public MarketAddQuery stockAmount(Integer value) {
        return unsafeParam("stock_amount", value);
    }

    /**
     * photoIds
     * IDs of additional photos.
     *
     * @param value value of "photo ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("photo_ids")
    public MarketAddQuery photoIds(Integer... value) {
        return unsafeParam("photo_ids", value);
    }

    /**
     * IDs of additional photos.
     *
     * @param value value of "photo ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("photo_ids")
    public MarketAddQuery photoIds(List<Integer> value) {
        return unsafeParam("photo_ids", value);
    }

    /**
     * videoIds
     * IDs of additional videos.
     *
     * @param value value of "video ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("video_ids")
    public MarketAddQuery videoIds(Integer... value) {
        return unsafeParam("video_ids", value);
    }

    /**
     * IDs of additional videos.
     *
     * @param value value of "video ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("video_ids")
    public MarketAddQuery videoIds(List<Integer> value) {
        return unsafeParam("video_ids", value);
    }

    /**
     * variantIds
     * IDs of properties variants.
     *
     * @param value value of "variant ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("variant_ids")
    public MarketAddQuery variantIds(Integer... value) {
        return unsafeParam("variant_ids", value);
    }

    /**
     * IDs of properties variants.
     *
     * @param value value of "variant ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("variant_ids")
    public MarketAddQuery variantIds(List<Integer> value) {
        return unsafeParam("variant_ids", value);
    }

    @Override
    protected MarketAddQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("name", "description", "owner_id", "category_id", "access_token");
    }
}
