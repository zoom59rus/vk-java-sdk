// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.notes;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.notes.responses.GetByIdResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Notes.getById method
 */
public class NotesGetByIdQuery extends AbstractQueryBuilder<NotesGetByIdQuery, GetByIdResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param noteId value of "note id" parameter. Minimum is 0.
     */
    public NotesGetByIdQuery(VkApiClient client, UserActor actor, Integer noteId) {
        super(client, "notes.getById", GetByIdResponse.class);
        accessToken(actor.getAccessToken());
        noteId(noteId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public NotesGetByIdQuery(VkApiClient client, UserActor actor) {
        super(client, "notes.getById", GetByIdResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Note ID.
     *
     * @param value value of "note id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("note_id")
    public NotesGetByIdQuery noteId(Integer value) {
        return unsafeParam("note_id", value);
    }

    /**
     * Note owner ID.
     *
     * @param value value of "owner id" parameter. Minimum is 0. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("owner_id")
    public NotesGetByIdQuery ownerId(Long value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Set need wiki
     *
     * @param value value of "need wiki" parameter. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("need_wiki")
    public NotesGetByIdQuery needWiki(Boolean value) {
        return unsafeParam("need_wiki", value);
    }

    @Override
    protected NotesGetByIdQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("note_id", "access_token");
    }
}
