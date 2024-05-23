package com.vk.api.sdk.events;

import com.google.gson.*;
import com.vk.api.sdk.client.GsonHolder;
import com.vk.api.sdk.objects.callback.*;
import com.vk.api.sdk.objects.callback.messages.CallbackMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public interface CallbackEvent {

    static final String OVERRIDING_ERR = "Method of handling event is not overridden";

    static final Logger LOG = LoggerFactory.getLogger(CallbackEvent.class);

    static final Gson GSON = new GsonHolder().getGson();

    default MessageNew getCallbackEventAsMessageNew() {
        return (MessageNew) this;
    }

    default MessageReply getCallbackEventAsMessageReply() {
        return (MessageReply) this;
    }

    default MessageAllow getCallbackEventAsMessageAllow() {
        return (MessageAllow) this;
    }

    default MessageEdit getCallbackEventAsMessageEdit() {
        return (MessageEdit) this;
    }

    default PhotoNew getCallbackEventAsPhotoNew() {
        return (PhotoNew) this;
    }

    default PhotoComment getCallbackEventAsPhotoCommentNew() {
        return (PhotoComment) this;
    }

    default PhotoComment getCallbackEventAsPhotoCommentEdit() {
        return (PhotoComment) this;
    }

    default PhotoComment getCallbackEventAsPhotoCommentRestore() {
        return (PhotoComment) this;
    }

    default PhotoCommentDelete getCallbackEventAsPhotoCommentDelete() {
        return (PhotoCommentDelete) this;
    }

    default AudioNew getCallbackEventAsAudioNew() {
        return (AudioNew) this;
    }

    default VideoNew getCallbackEventAsVideoNew() {
        return (VideoNew) this;
    }

    default VideoComment getCallbackEventAsVideoCommentNew() {
        return (VideoComment) this;
    }

    default VideoComment getCallbackEventAsVideoCommentEdit() {
        return (VideoComment) this;
    }

    default VideoComment getCallbackEventAsVideoCommentRestore() {
        return (VideoComment) this;
    }

    default VideoCommentDelete getCallbackEventAsVideoCommentDelete() {
        return (VideoCommentDelete) this;
    }

    default WallPostNew getCallbackEventAsWallPostNew() {
        return (WallPostNew) this;
    }

    default WallRepost getCallbackEventAsWallRepost() {
        return (WallRepost) this;
    }

    default WallReplyNew getCallbackEventAsWallReplyNew() {
        return (WallReplyNew) this;
    }

    default WallReplyEdit getCallbackEventAsWallReplyEdit() {
        return (WallReplyEdit) this;
    }

    default WallReplyRestore getCallbackEventAsWallReplyRestore() {
        return (WallReplyRestore) this;
    }

    default WallCommentDelete getCallbackEventAsWallReplyDelete() {
        return (WallCommentDelete) this;
    }

    default BoardPostNew getCallbackEventAsBoardPostNew() {
        return (BoardPostNew) this;
    }

    default BoardPostEdit getCallbackEventAsBoardPostEdit() {
        return (BoardPostEdit) this;
    }

    default BoardPostRestore getCallbackEventAsBoardPostRestore() {
        return (BoardPostRestore) this;
    }

    default BoardPostDelete getCallbackEventAsBoardPostDelete() {
        return (BoardPostDelete) this;
    }

    default GroupLeave getCallbackEventAsGroupLeave() {
        return (GroupLeave) this;
    }

    default GroupJoin getCallbackEventAsGroupJoin() {
        return (GroupJoin) this;
    }

    default GroupChangeSettings getCallbackEventAsGroupChangeSettings() {
        return (GroupChangeSettings) this;
    }

    default GroupChangePhoto getCallbackEventAsGroupChangePhoto() {
        return (GroupChangePhoto) this;
    }

    default GroupOfficersEdit getCallbackEventAsGroupOfficersEdit() {
        return (GroupOfficersEdit) this;
    }

    default PollVoteNew getCallbackEventAsPollVoteNew() {
        return (PollVoteNew) this;
    }

    default UserBlock getCallbackEventAsUserBlock() {
        return (UserBlock) this;
    }

    default UserUnblock getCallbackEventAsUserUnblock() {
        return (UserUnblock) this;
    }

    default Confirmation getCallbackEventAsConfirmation() {
        return (Confirmation) this;
    }

    class Deserializer implements JsonDeserializer<CallbackEvent> {
        private static final String discriminatorField = "type";

        private static final Map<String, Class<? extends CallbackEvent>> subtypes = new HashMap<String, Class<? extends CallbackEvent>>() {{
            put("message_new", MessageNew.class);
            put("message_reply", MessageReply.class);
            put("message_allow", MessageAllow.class);
            put("message_deny", MessageDeny.class);
            put("message_edit", MessageEdit.class);
            put("photo_new", PhotoNew.class);
            put("photo_comment_new", PhotoComment.class);
            put("photo_comment_edit", PhotoComment.class);
            put("photo_comment_restore", PhotoComment.class);
            put("photo_comment_delete", PhotoCommentDelete.class);
            put("audio_new", AudioNew.class);
            put("video_new", VideoNew.class);
            put("video_comment_new", VideoComment.class);
            put("video_comment_edit", VideoComment.class);
            put("video_comment_restore", VideoComment.class);
            put("video_comment_delete", VideoCommentDelete.class);
            put("wall_post_new", WallPostNew.class);
            put("wall_repost", WallRepost.class);
            put("wall_reply_new", WallReplyNew.class);
            put("wall_reply_edit", WallReplyEdit.class);
            put("wall_reply_restore", WallReplyRestore.class);
            put("wall_reply_delete", WallCommentDelete.class);
            put("board_post_new", BoardPostNew.class);
            put("board_post_edit", BoardPostEdit.class);
            put("board_post_restore", BoardPostRestore.class);
            put("board_post_delete", BoardPostDelete.class);
            put("market_comment_new", MarketComment.class);
            put("market_comment_edit", MarketComment.class);
            put("market_comment_restore", MarketComment.class);
            put("market_comment_delete", MarketCommentDelete.class);
            put("group_leave", GroupLeave.class);
            put("group_join", GroupJoin.class);
            put("group_change_settings", GroupChangeSettings.class);
            put("group_change_photo", GroupChangePhoto.class);
            put("group_officers_edit", GroupOfficersEdit.class);
            put("poll_vote_new", PollVoteNew.class);
            put("user_block", UserBlock.class);
            put("user_unblock", UserUnblock.class);
            put("confirmation", Confirmation.class);
        }};

        @Override
        public CallbackEvent deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
            JsonObject data = json.getAsJsonObject();
            String resultSubtypeValue = data.get(discriminatorField).getAsString();
            if (subtypes.containsKey(resultSubtypeValue)) {
                return context.deserialize(data, subtypes.get(resultSubtypeValue));
            } else {
                throw new JsonParseException(
                        "There is no discriminator field in JSON-object",
                        new com.vk.api.sdk.exceptions.UnexpectedOneOfSubtypeException(
                                resultSubtypeValue,
                                Deserializer.class,
                                subtypes.keySet()
                        )
                );
            }
        }
    }

    default void messageNew(Integer groupId, MessageNew message) {
        LOG.error(OVERRIDING_ERR);
    }

    default void messageReply(Integer groupId, MessageReply message) {
        LOG.error(OVERRIDING_ERR);
    }

    default void messageEdit(Integer groupId, MessageEdit message) {
        LOG.error(OVERRIDING_ERR);
    }

    default void messageAllow(Integer groupId, MessageAllow message) {
        LOG.error(OVERRIDING_ERR);
    }

    default void messageDeny(Integer groupId, MessageDeny message) {
        LOG.error(OVERRIDING_ERR);
    }

    default void photoNew(Integer groupId, PhotoNew message) {
        LOG.error(OVERRIDING_ERR);
    }

    default void photoCommentNew(Integer groupId, PhotoComment message) {
        LOG.error(OVERRIDING_ERR);
    }

    default void photoCommentEdit(Integer groupId, PhotoComment message) {
        LOG.error(OVERRIDING_ERR);
    }

    default void photoCommentRestore(Integer groupId, PhotoComment message) {
        LOG.error(OVERRIDING_ERR);
    }

    default void photoCommentDelete(Integer groupId, PhotoCommentDelete message) {
        LOG.error(OVERRIDING_ERR);
    }

    default void audioNew(Integer groupId, AudioNew message) {
        LOG.error(OVERRIDING_ERR);
    }

    default void videoNew(Integer groupId, VideoNew message) {
        LOG.error(OVERRIDING_ERR);
    }

    default void videoCommentNew(Integer groupId, VideoComment message) {
        LOG.error(OVERRIDING_ERR);
    }

    default void videoCommentEdit(Integer groupId, VideoComment message) {
        LOG.error(OVERRIDING_ERR);
    }

    default void videoCommentRestore(Integer groupId, VideoComment message) {
        LOG.error(OVERRIDING_ERR);
    }

    default void videoCommentDelete(Integer groupId, VideoCommentDelete message) {
        LOG.error(OVERRIDING_ERR);
    }

    default void wallPostNew(Integer groupId, WallPostNew message) {
        LOG.error(OVERRIDING_ERR);
    }

    default void wallRepost(Integer groupId, WallRepost message) {
        LOG.error(OVERRIDING_ERR);
    }

    default void wallReplyNew(Integer groupId, WallReplyNew object) {
        LOG.error(OVERRIDING_ERR);
    }

    default void wallReplyEdit(Integer groupId, WallReplyEdit message) {
        LOG.error(OVERRIDING_ERR);
    }

    default void wallReplyRestore(Integer groupId, WallReplyRestore message) {
        LOG.error(OVERRIDING_ERR);
    }

    default void wallReplyDelete(Integer groupId, WallCommentDelete message) {
        LOG.error(OVERRIDING_ERR);
    }

    default void boardPostNew(Integer groupId, BoardPostNew message) {
        LOG.error(OVERRIDING_ERR);
    }

    default void boardPostEdit(Integer groupId, BoardPostEdit message) {
        LOG.error(OVERRIDING_ERR);
    }

    default void boardPostRestore(Integer groupId, BoardPostRestore message) {
        LOG.error(OVERRIDING_ERR);
    }

    default void boardPostDelete(Integer groupId, BoardPostDelete message) {
        LOG.error(OVERRIDING_ERR);
    }

    default void marketCommentNew(Integer groupId, MarketComment message) {
        LOG.error(OVERRIDING_ERR);
    }

    default void marketCommentEdit(Integer groupId, MarketComment message) {
        LOG.error(OVERRIDING_ERR);
    }

    default void marketCommentRestore(Integer groupId, MarketComment message) {
        LOG.error(OVERRIDING_ERR);
    }

    default void marketCommentDelete(Integer groupId, MarketCommentDelete message) {
        LOG.error(OVERRIDING_ERR);
    }

    default void groupLeave(Integer groupId, GroupLeave message) {
        LOG.error(OVERRIDING_ERR);
    }

    default void groupJoin(Integer groupId, GroupJoin message) {
        LOG.error(OVERRIDING_ERR);
    }

    default void groupChangeSettings(Integer groupId, GroupChangeSettings message) {
        LOG.error(OVERRIDING_ERR);
    }

    default void groupChangePhoto(Integer groupId, GroupChangePhoto message) {
        LOG.error(OVERRIDING_ERR);
    }

    default void groupOfficersEdit(Integer groupId, GroupOfficersEdit message) {
        LOG.error(OVERRIDING_ERR);
    }

    default void pollVoteNew(Integer groupId, PollVoteNew message) {
        LOG.error(OVERRIDING_ERR);
    }

    default void userBlock(Integer groupId, UserBlock message) {
        LOG.error(OVERRIDING_ERR);
    }

    default void userUnblock(Integer groupId, UserUnblock message) {
        LOG.error(OVERRIDING_ERR);
    }

    default String confirmation() {
        LOG.error(OVERRIDING_ERR);
        return null;
    }

    default String parse(CallbackMessage message) {
        System.out.println("Received callback message type: " + message.getType());
        System.out.println("Received callback message: " + message.getObject());

        String objectToDeserialize = message.getObject().toString();
        switch (message.getType()) {
            case MESSAGE_NEW:
            case MESSAGE_DENY:
            case MESSAGE_REPLY:
            case MESSAGE_EDIT:
            case MESSAGE_ALLOW: {
                objectToDeserialize = "{ \"object\": " + objectToDeserialize + "}";
            }
            default: {
                //ignored
            }
        }

        CallbackEvent event = GSON.fromJson(objectToDeserialize, message.getType().getType());

        System.out.println("Deserialized event object: " + event.toString());

        switch (message.getType()) {
            case CONFIRMATION: {
                confirmation();
                return "OK";
            }
            case MESSAGE_NEW: {
                messageNew(message.getGroupId(), (MessageNew) event);
                return "OK";
            }
            case MESSAGE_REPLY: {
                messageReply(message.getGroupId(), (MessageReply) event);
                return "OK";
            }
            case MESSAGE_EDIT: {
                messageEdit(message.getGroupId(), (MessageEdit) event);
                return "OK";
            }
            case MESSAGE_ALLOW: {
                messageAllow(message.getGroupId(), (MessageAllow) event);
                return "OK";
            }
            case MESSAGE_DENY: {
                messageDeny(message.getGroupId(), (MessageDeny) event);
                return "OK";
            }
            case PHOTO_NEW: {
                photoNew(message.getGroupId(), (PhotoNew) event);
                return "OK";
            }
            case PHOTO_COMMENT_NEW: {
                photoCommentNew(message.getGroupId(), (PhotoComment) event);
                return "OK";
            }
            case PHOTO_COMMENT_EDIT: {
                photoCommentEdit(message.getGroupId(), (PhotoComment) event);
                return "OK";
            }
            case PHOTO_COMMENT_RESTORE: {
                photoCommentRestore(message.getGroupId(), (PhotoComment) event);
                return "OK";
            }
            case PHOTO_COMMENT_DELETE: {
                photoCommentDelete(message.getGroupId(), (PhotoCommentDelete) event);
                return "OK";
            }
            case AUDIO_NEW: {
                audioNew(message.getGroupId(), (AudioNew) event);
                return "OK";
            }
            case VIDEO_NEW: {
                videoNew(message.getGroupId(), (VideoNew) event);
                return "OK";
            }
            case VIDEO_COMMENT_NEW: {
                videoCommentNew(message.getGroupId(), (VideoComment) event);
                return "OK";
            }
            case VIDEO_COMMENT_EDIT: {
                videoCommentEdit(message.getGroupId(), (VideoComment) event);
                return "OK";
            }
            case VIDEO_COMMENT_RESTORE: {
                videoCommentRestore(message.getGroupId(), (VideoComment) event);
                return "OK";
            }
            case VIDEO_COMMENT_DELETE: {
                videoCommentDelete(message.getGroupId(), (VideoCommentDelete) event);
                return "OK";
            }
            case WALL_POST_NEW: {
                wallPostNew(message.getGroupId(), (WallPostNew) event);
                return "OK";
            }
            case WALL_REPOST: {
                wallRepost(message.getGroupId(), (WallRepost) event);
                return "OK";
            }
            case WALL_REPLY_NEW: {
                wallReplyNew(message.getGroupId(), (WallReplyNew) event);
                return "OK";
            }
            case WALL_REPLY_EDIT: {
                wallReplyEdit(message.getGroupId(), (WallReplyEdit) event);
                return "OK";
            }
            case WALL_REPLY_RESTORE: {
                wallReplyRestore(message.getGroupId(), (WallReplyRestore) event);
                return "OK";
            }
            case WALL_REPLY_DELETE: {
                wallReplyDelete(message.getGroupId(), (WallCommentDelete) event);
                return "OK";
            }
            case BOARD_POST_NEW: {
                boardPostNew(message.getGroupId(), (BoardPostNew) event);
                return "OK";
            }
            case BOARD_POST_EDIT: {
                boardPostEdit(message.getGroupId(), (BoardPostEdit) event);
                return "OK";
            }
            case BOARD_POST_RESTORE: {
                boardPostRestore(message.getGroupId(), (BoardPostRestore) event);
                return "OK";
            }
            case BOARD_POST_DELETE: {
                boardPostDelete(message.getGroupId(), (BoardPostDelete) event);
                return "OK";
            }
            case MARKET_COMMENT_NEW: {
                marketCommentNew(message.getGroupId(), (MarketComment) event);
                return "OK";
            }
            case MARKET_COMMENT_EDIT: {
                marketCommentEdit(message.getGroupId(), (MarketComment) event);
                return "OK";
            }
            case MARKET_COMMENT_RESTORE: {
                marketCommentRestore(message.getGroupId(), (MarketComment) event);
                return "OK";
            }
            case MARKET_COMMENT_DELETE: {
                marketCommentDelete(message.getGroupId(), (MarketCommentDelete) event);
                return "OK";
            }
            case GROUP_LEAVE: {
                groupLeave(message.getGroupId(), (GroupLeave) event);
                return "OK";
            }
            case GROUP_JOIN: {
                groupJoin(message.getGroupId(), (GroupJoin) event);
                return "OK";
            }
            case GROUP_CHANGE_SETTINGS: {
                groupChangeSettings(message.getGroupId(), (GroupChangeSettings) event);
                return "OK";
            }
            case GROUP_CHANGE_PHOTO: {
                groupChangePhoto(message.getGroupId(), (GroupChangePhoto) event);
                return "OK";
            }
            case GROUP_OFFICERS_EDIT: {
                groupOfficersEdit(message.getGroupId(), (GroupOfficersEdit) event);
                return "OK";
            }
            case USER_BLOCK: {
                userBlock(message.getGroupId(), (UserBlock) event);
                return "OK";
            }
            case USER_UNBLOCK: {
                userUnblock(message.getGroupId(), (UserUnblock) event);
                return "OK";
            }
            case POLL_VOTE_NEW: {
                pollVoteNew(message.getGroupId(), (PollVoteNew) event);
                return "OK";
            }
            default: {
                LOG.error("Unexpected callback event type received");
                return null;
            }
        }
    }
}