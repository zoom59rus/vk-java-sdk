// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.photos;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.photos.responses.GetAlbumsResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Photos.getAlbums method
 */
public class PhotosGetAlbumsQuery extends AbstractQueryBuilder<PhotosGetAlbumsQuery, GetAlbumsResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build service api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public PhotosGetAlbumsQuery(VkApiClient client, ServiceActor actor) {
        super(client, "photos.getAlbums", GetAlbumsResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public PhotosGetAlbumsQuery(VkApiClient client, UserActor actor) {
        super(client, "photos.getAlbums", GetAlbumsResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * ID of the user or community that owns the albums.
     *
     * @param value value of "owner id" parameter. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("owner_id")
    public PhotosGetAlbumsQuery ownerId(Long value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Offset needed to return a specific subset of albums.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("offset")
    public PhotosGetAlbumsQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of albums to return.
     *
     * @param value value of "count" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("count")
    public PhotosGetAlbumsQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * '1' - to return system albums with negative IDs
     *
     * @param value value of "need system" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("need_system")
    public PhotosGetAlbumsQuery needSystem(Boolean value) {
        return unsafeParam("need_system", value);
    }

    /**
     * '1' - to return an additional 'thumb_src' field, '0' - (default)
     *
     * @param value value of "need covers" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("need_covers")
    public PhotosGetAlbumsQuery needCovers(Boolean value) {
        return unsafeParam("need_covers", value);
    }

    /**
     * '1' - to return photo sizes in a
     *
     * @param value value of "photo sizes" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("photo_sizes")
    public PhotosGetAlbumsQuery photoSizes(Boolean value) {
        return unsafeParam("photo_sizes", value);
    }

    /**
     * albumIds
     * Album IDs.
     *
     * @param value value of "album ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("album_ids")
    public PhotosGetAlbumsQuery albumIds(Integer... value) {
        return unsafeParam("album_ids", value);
    }

    /**
     * Album IDs.
     *
     * @param value value of "album ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("album_ids")
    public PhotosGetAlbumsQuery albumIds(List<Integer> value) {
        return unsafeParam("album_ids", value);
    }

    @Override
    protected PhotosGetAlbumsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
