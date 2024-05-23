// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiMethod;
import com.vk.api.sdk.queries.board.*;

/**
 * List of Board methods
 */
public class Board extends AbstractAction {
    /**
     * Constructor
     *
     * @param client vk api client
     */
    public Board(VkApiClient client) {
        super(client);
    }

    /**
     * Creates a new topic on a community's discussion board.
     *
     * @param actor vk user actor
     * @param groupId ID of the community that owns the discussion board.
     * @param title Topic title.
     * @return query
     */
    @ApiMethod("board.addTopic")
    public BoardAddTopicQuery addTopic(UserActor actor, Long groupId, String title) {
        return new BoardAddTopicQuery(getClient(), actor, groupId, title);
    }

    /**
     * Creates a new topic on a community's discussion board.
     *
     * @param actor vk user actor
     * @return only actor query 
     */
    @ApiMethod("board.addTopic")
    public BoardAddTopicQuery addTopic(UserActor actor) {
        return new BoardAddTopicQuery(getClient(), actor);
    }

    /**
     * Closes a topic on a community's discussion board so that comments cannot be posted.
     *
     * @param actor vk user actor
     * @param groupId ID of the community that owns the discussion board.
     * @param topicId Topic ID.
     * @return query
     */
    @ApiMethod("board.closeTopic")
    public BoardCloseTopicQuery closeTopic(UserActor actor, Long groupId, Integer topicId) {
        return new BoardCloseTopicQuery(getClient(), actor, groupId, topicId);
    }

    /**
     * Closes a topic on a community's discussion board so that comments cannot be posted.
     *
     * @param actor vk user actor
     * @return only actor query 
     */
    @ApiMethod("board.closeTopic")
    public BoardCloseTopicQuery closeTopic(UserActor actor) {
        return new BoardCloseTopicQuery(getClient(), actor);
    }

    /**
     * Adds a comment on a topic on a community's discussion board.
     *
     * @param actor vk user actor
     * @param groupId ID of the community that owns the discussion board.
     * @param topicId ID of the topic to be commented on.
     * @return query
     */
    @ApiMethod("board.createComment")
    public BoardCreateCommentQuery createComment(UserActor actor, Long groupId, Integer topicId) {
        return new BoardCreateCommentQuery(getClient(), actor, groupId, topicId);
    }

    /**
     * Adds a comment on a topic on a community's discussion board.
     *
     * @param actor vk user actor
     * @return only actor query 
     */
    @ApiMethod("board.createComment")
    public BoardCreateCommentQuery createComment(UserActor actor) {
        return new BoardCreateCommentQuery(getClient(), actor);
    }

    /**
     * Deletes a comment on a topic on a community's discussion board.
     *
     * @param actor vk user actor
     * @param groupId ID of the community that owns the discussion board.
     * @param topicId Topic ID.
     * @param commentId Comment ID.
     * @return query
     */
    @ApiMethod("board.deleteComment")
    public BoardDeleteCommentQuery deleteComment(UserActor actor, Long groupId, Integer topicId,
            Integer commentId) {
        return new BoardDeleteCommentQuery(getClient(), actor, groupId, topicId, commentId);
    }

    /**
     * Deletes a comment on a topic on a community's discussion board.
     *
     * @param actor vk user actor
     * @return only actor query 
     */
    @ApiMethod("board.deleteComment")
    public BoardDeleteCommentQuery deleteComment(UserActor actor) {
        return new BoardDeleteCommentQuery(getClient(), actor);
    }

    /**
     * Deletes a comment on a topic on a community's discussion board.
     *
     * @param actor vk group actor
     * @param groupId ID of the community that owns the discussion board.
     * @param topicId Topic ID.
     * @param commentId Comment ID.
     * @return query
     */
    @ApiMethod("board.deleteComment")
    public BoardDeleteCommentQuery deleteComment(GroupActor actor, Long groupId, Integer topicId,
            Integer commentId) {
        return new BoardDeleteCommentQuery(getClient(), actor, groupId, topicId, commentId);
    }

    /**
     * Deletes a comment on a topic on a community's discussion board.
     *
     * @param actor vk group actor
     * @return only actor query 
     */
    @ApiMethod("board.deleteComment")
    public BoardDeleteCommentQuery deleteComment(GroupActor actor) {
        return new BoardDeleteCommentQuery(getClient(), actor);
    }

    /**
     * Deletes a topic from a community's discussion board.
     *
     * @param actor vk user actor
     * @param groupId ID of the community that owns the discussion board.
     * @param topicId Topic ID.
     * @return query
     */
    @ApiMethod("board.deleteTopic")
    public BoardDeleteTopicQuery deleteTopic(UserActor actor, Long groupId, Integer topicId) {
        return new BoardDeleteTopicQuery(getClient(), actor, groupId, topicId);
    }

    /**
     * Deletes a topic from a community's discussion board.
     *
     * @param actor vk user actor
     * @return only actor query 
     */
    @ApiMethod("board.deleteTopic")
    public BoardDeleteTopicQuery deleteTopic(UserActor actor) {
        return new BoardDeleteTopicQuery(getClient(), actor);
    }

    /**
     * Edits a comment on a topic on a community's discussion board.
     *
     * @param actor vk user actor
     * @param groupId ID of the community that owns the discussion board.
     * @param topicId Topic ID.
     * @param commentId ID of the comment on the topic.
     * @return query
     */
    @ApiMethod("board.editComment")
    public BoardEditCommentQuery editComment(UserActor actor, Long groupId, Integer topicId,
            Integer commentId) {
        return new BoardEditCommentQuery(getClient(), actor, groupId, topicId, commentId);
    }

    /**
     * Edits a comment on a topic on a community's discussion board.
     *
     * @param actor vk user actor
     * @return only actor query 
     */
    @ApiMethod("board.editComment")
    public BoardEditCommentQuery editComment(UserActor actor) {
        return new BoardEditCommentQuery(getClient(), actor);
    }

    /**
     * Edits the title of a topic on a community's discussion board.
     *
     * @param actor vk user actor
     * @param groupId ID of the community that owns the discussion board.
     * @param topicId Topic ID.
     * @param title New title of the topic.
     * @return query
     */
    @ApiMethod("board.editTopic")
    public BoardEditTopicQuery editTopic(UserActor actor, Long groupId, Integer topicId,
            String title) {
        return new BoardEditTopicQuery(getClient(), actor, groupId, topicId, title);
    }

    /**
     * Edits the title of a topic on a community's discussion board.
     *
     * @param actor vk user actor
     * @return only actor query 
     */
    @ApiMethod("board.editTopic")
    public BoardEditTopicQuery editTopic(UserActor actor) {
        return new BoardEditTopicQuery(getClient(), actor);
    }

    /**
     * Pins a topic (fixes its place) to the top of a community's discussion board.
     *
     * @param actor vk user actor
     * @param groupId ID of the community that owns the discussion board.
     * @param topicId Topic ID.
     * @return query
     */
    @ApiMethod("board.fixTopic")
    public BoardFixTopicQuery fixTopic(UserActor actor, Long groupId, Integer topicId) {
        return new BoardFixTopicQuery(getClient(), actor, groupId, topicId);
    }

    /**
     * Pins a topic (fixes its place) to the top of a community's discussion board.
     *
     * @param actor vk user actor
     * @return only actor query 
     */
    @ApiMethod("board.fixTopic")
    public BoardFixTopicQuery fixTopic(UserActor actor) {
        return new BoardFixTopicQuery(getClient(), actor);
    }

    /**
     * Returns a list of comments on a topic on a community's discussion board.
     *
     * @param actor vk user actor
     * @param groupId ID of the community that owns the discussion board.
     * @param topicId Topic ID.
     * @return query
     */
    @ApiMethod("board.getComments")
    public BoardGetCommentsQuery getComments(UserActor actor, Long groupId, Integer topicId) {
        return new BoardGetCommentsQuery(getClient(), actor, groupId, topicId);
    }

    /**
     * Returns a list of comments on a topic on a community's discussion board.
     *
     * @param actor vk user actor
     * @return only actor query 
     */
    @ApiMethod("board.getComments")
    public BoardGetCommentsQuery getComments(UserActor actor) {
        return new BoardGetCommentsQuery(getClient(), actor);
    }

    /**
     * Returns a list of comments on a topic on a community's discussion board.
     *
     * @param actor vk service actor
     * @param groupId ID of the community that owns the discussion board.
     * @param topicId Topic ID.
     * @return query
     */
    @ApiMethod("board.getComments")
    public BoardGetCommentsQuery getComments(ServiceActor actor, Long groupId, Integer topicId) {
        return new BoardGetCommentsQuery(getClient(), actor, groupId, topicId);
    }

    /**
     * Returns a list of comments on a topic on a community's discussion board.
     *
     * @param actor vk service actor
     * @return only actor query 
     */
    @ApiMethod("board.getComments")
    public BoardGetCommentsQuery getComments(ServiceActor actor) {
        return new BoardGetCommentsQuery(getClient(), actor);
    }

    /**
     * Returns a list of comments on a topic on a community's discussion board.
     *
     * @param actor vk user actor
     * @param groupId ID of the community that owns the discussion board.
     * @param topicId Topic ID.
     * @return query
     */
    @ApiMethod("board.getComments")
    public BoardGetCommentsQueryWithExtended getCommentsExtended(UserActor actor, Long groupId,
            Integer topicId) {
        return new BoardGetCommentsQueryWithExtended(getClient(), actor, groupId, topicId);
    }

    /**
     * Returns a list of comments on a topic on a community's discussion board.
     *
     * @param actor vk service actor
     * @param groupId ID of the community that owns the discussion board.
     * @param topicId Topic ID.
     * @return query
     */
    @ApiMethod("board.getComments")
    public BoardGetCommentsQueryWithExtended getCommentsExtended(ServiceActor actor, Long groupId,
            Integer topicId) {
        return new BoardGetCommentsQueryWithExtended(getClient(), actor, groupId, topicId);
    }

    /**
     * Returns a list of topics on a community's discussion board.
     *
     * @param actor vk user actor
     * @param groupId ID of the community that owns the discussion board.
     * @return query
     */
    @ApiMethod("board.getTopics")
    public BoardGetTopicsQueryWithExtended getTopicsExtended(UserActor actor, Long groupId) {
        return new BoardGetTopicsQueryWithExtended(getClient(), actor, groupId);
    }

    /**
     * Returns a list of topics on a community's discussion board.
     *
     * @param actor vk service actor
     * @param groupId ID of the community that owns the discussion board.
     * @return query
     */
    @ApiMethod("board.getTopics")
    public BoardGetTopicsQueryWithExtended getTopicsExtended(ServiceActor actor, Long groupId) {
        return new BoardGetTopicsQueryWithExtended(getClient(), actor, groupId);
    }

    /**
     * Returns a list of topics on a community's discussion board.
     *
     * @param actor vk user actor
     * @param groupId ID of the community that owns the discussion board.
     * @return query
     */
    @ApiMethod("board.getTopics")
    public BoardGetTopicsQuery getTopics(UserActor actor, Long groupId) {
        return new BoardGetTopicsQuery(getClient(), actor, groupId);
    }

    /**
     * Returns a list of topics on a community's discussion board.
     *
     * @param actor vk user actor
     * @return only actor query 
     */
    @ApiMethod("board.getTopics")
    public BoardGetTopicsQuery getTopics(UserActor actor) {
        return new BoardGetTopicsQuery(getClient(), actor);
    }

    /**
     * Returns a list of topics on a community's discussion board.
     *
     * @param actor vk service actor
     * @param groupId ID of the community that owns the discussion board.
     * @return query
     */
    @ApiMethod("board.getTopics")
    public BoardGetTopicsQuery getTopics(ServiceActor actor, Long groupId) {
        return new BoardGetTopicsQuery(getClient(), actor, groupId);
    }

    /**
     * Returns a list of topics on a community's discussion board.
     *
     * @param actor vk service actor
     * @return only actor query 
     */
    @ApiMethod("board.getTopics")
    public BoardGetTopicsQuery getTopics(ServiceActor actor) {
        return new BoardGetTopicsQuery(getClient(), actor);
    }

    /**
     * Re-opens a previously closed topic on a community's discussion board.
     *
     * @param actor vk user actor
     * @param groupId ID of the community that owns the discussion board.
     * @param topicId Topic ID.
     * @return query
     */
    @ApiMethod("board.openTopic")
    public BoardOpenTopicQuery openTopic(UserActor actor, Long groupId, Integer topicId) {
        return new BoardOpenTopicQuery(getClient(), actor, groupId, topicId);
    }

    /**
     * Re-opens a previously closed topic on a community's discussion board.
     *
     * @param actor vk user actor
     * @return only actor query 
     */
    @ApiMethod("board.openTopic")
    public BoardOpenTopicQuery openTopic(UserActor actor) {
        return new BoardOpenTopicQuery(getClient(), actor);
    }

    /**
     * Restores a comment deleted from a topic on a community's discussion board.
     *
     * @param actor vk user actor
     * @param groupId ID of the community that owns the discussion board.
     * @param topicId Topic ID.
     * @param commentId Comment ID.
     * @return query
     */
    @ApiMethod("board.restoreComment")
    public BoardRestoreCommentQuery restoreComment(UserActor actor, Long groupId, Integer topicId,
            Integer commentId) {
        return new BoardRestoreCommentQuery(getClient(), actor, groupId, topicId, commentId);
    }

    /**
     * Restores a comment deleted from a topic on a community's discussion board.
     *
     * @param actor vk user actor
     * @return only actor query 
     */
    @ApiMethod("board.restoreComment")
    public BoardRestoreCommentQuery restoreComment(UserActor actor) {
        return new BoardRestoreCommentQuery(getClient(), actor);
    }

    /**
     * Restores a comment deleted from a topic on a community's discussion board.
     *
     * @param actor vk group actor
     * @param groupId ID of the community that owns the discussion board.
     * @param topicId Topic ID.
     * @param commentId Comment ID.
     * @return query
     */
    @ApiMethod("board.restoreComment")
    public BoardRestoreCommentQuery restoreComment(GroupActor actor, Long groupId, Integer topicId,
            Integer commentId) {
        return new BoardRestoreCommentQuery(getClient(), actor, groupId, topicId, commentId);
    }

    /**
     * Restores a comment deleted from a topic on a community's discussion board.
     *
     * @param actor vk group actor
     * @return only actor query 
     */
    @ApiMethod("board.restoreComment")
    public BoardRestoreCommentQuery restoreComment(GroupActor actor) {
        return new BoardRestoreCommentQuery(getClient(), actor);
    }

    /**
     * Unpins a pinned topic from the top of a community's discussion board.
     *
     * @param actor vk user actor
     * @param groupId ID of the community that owns the discussion board.
     * @param topicId Topic ID.
     * @return query
     */
    @ApiMethod("board.unfixTopic")
    public BoardUnfixTopicQuery unfixTopic(UserActor actor, Long groupId, Integer topicId) {
        return new BoardUnfixTopicQuery(getClient(), actor, groupId, topicId);
    }

    /**
     * Unpins a pinned topic from the top of a community's discussion board.
     *
     * @param actor vk user actor
     * @return only actor query 
     */
    @ApiMethod("board.unfixTopic")
    public BoardUnfixTopicQuery unfixTopic(UserActor actor) {
        return new BoardUnfixTopicQuery(getClient(), actor);
    }
}
