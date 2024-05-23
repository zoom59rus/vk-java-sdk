// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.groups;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum Fields implements EnumParam<String> {
    @SerializedName("id")
    ID("id"),

    @SerializedName("name")
    NAME("name"),

    @SerializedName("screen_name")
    SCREEN_NAME("screen_name"),

    @SerializedName("is_closed")
    IS_CLOSED("is_closed"),

    @SerializedName("type")
    TYPE("type"),

    @SerializedName("is_admin")
    IS_ADMIN("is_admin"),

    @SerializedName("admin_level")
    ADMIN_LEVEL("admin_level"),

    @SerializedName("is_member")
    IS_MEMBER("is_member"),

    @SerializedName("is_advertiser")
    IS_ADVERTISER("is_advertiser"),

    @SerializedName("start_date")
    START_DATE("start_date"),

    @SerializedName("finish_date")
    FINISH_DATE("finish_date"),

    @SerializedName("deactivated")
    DEACTIVATED("deactivated"),

    @SerializedName("photo_50")
    PHOTO_50("photo_50"),

    @SerializedName("photo_100")
    PHOTO_100("photo_100"),

    @SerializedName("photo_200")
    PHOTO_200("photo_200"),

    @SerializedName("photo_200_orig")
    PHOTO_200_ORIG("photo_200_orig"),

    @SerializedName("photo_400")
    PHOTO_400("photo_400"),

    @SerializedName("photo_400_orig")
    PHOTO_400_ORIG("photo_400_orig"),

    @SerializedName("photo_max")
    PHOTO_MAX("photo_max"),

    @SerializedName("photo_max_orig")
    PHOTO_MAX_ORIG("photo_max_orig"),

    @SerializedName("est_date")
    EST_DATE("est_date"),

    @SerializedName("public_date_label")
    PUBLIC_DATE_LABEL("public_date_label"),

    @SerializedName("photo_max_size")
    PHOTO_MAX_SIZE("photo_max_size"),

    @SerializedName("is_video_live_notifications_blocked")
    IS_VIDEO_LIVE_NOTIFICATIONS_BLOCKED("is_video_live_notifications_blocked"),

    @SerializedName("video_live")
    VIDEO_LIVE("video_live"),

    @SerializedName("market")
    MARKET("market"),

    @SerializedName("member_status")
    MEMBER_STATUS("member_status"),

    @SerializedName("is_adult")
    IS_ADULT("is_adult"),

    @SerializedName("is_hidden_from_feed")
    IS_HIDDEN_FROM_FEED("is_hidden_from_feed"),

    @SerializedName("is_favorite")
    IS_FAVORITE("is_favorite"),

    @SerializedName("is_subscribed")
    IS_SUBSCRIBED("is_subscribed"),

    @SerializedName("city")
    CITY("city"),

    @SerializedName("verified")
    VERIFIED("verified"),

    @SerializedName("description")
    DESCRIPTION("description"),

    @SerializedName("wiki_page")
    WIKI_PAGE("wiki_page"),

    @SerializedName("members_count")
    MEMBERS_COUNT("members_count"),

    @SerializedName("members_count_text")
    MEMBERS_COUNT_TEXT("members_count_text"),

    @SerializedName("requests_count")
    REQUESTS_COUNT("requests_count"),

    @SerializedName("video_live_level")
    VIDEO_LIVE_LEVEL("video_live_level"),

    @SerializedName("video_live_count")
    VIDEO_LIVE_COUNT("video_live_count"),

    @SerializedName("clips_count")
    CLIPS_COUNT("clips_count"),

    @SerializedName("textlives_count")
    TEXTLIVES_COUNT("textlives_count"),

    @SerializedName("counters")
    COUNTERS("counters"),

    @SerializedName("cover")
    COVER("cover"),

    @SerializedName("can_post")
    CAN_POST("can_post"),

    @SerializedName("can_suggest")
    CAN_SUGGEST("can_suggest"),

    @SerializedName("can_upload_story")
    CAN_UPLOAD_STORY("can_upload_story"),

    @SerializedName("can_upload_doc")
    CAN_UPLOAD_DOC("can_upload_doc"),

    @SerializedName("can_upload_video")
    CAN_UPLOAD_VIDEO("can_upload_video"),

    @SerializedName("can_upload_clip")
    CAN_UPLOAD_CLIP("can_upload_clip"),

    @SerializedName("can_see_all_posts")
    CAN_SEE_ALL_POSTS("can_see_all_posts"),

    @SerializedName("can_create_topic")
    CAN_CREATE_TOPIC("can_create_topic"),

    @SerializedName("activity")
    ACTIVITY("activity"),

    @SerializedName("fixed_post")
    FIXED_POST("fixed_post"),

    @SerializedName("has_photo")
    HAS_PHOTO("has_photo"),

    @SerializedName("crop_photo")
    CROP_PHOTO("crop_photo"),

    @SerializedName("status")
    STATUS("status"),

    @SerializedName("status_audio")
    STATUS_AUDIO("status_audio"),

    @SerializedName("main_album_id")
    MAIN_ALBUM_ID("main_album_id"),

    @SerializedName("links")
    LINKS("links"),

    @SerializedName("contacts")
    CONTACTS("contacts"),

    @SerializedName("wall")
    WALL("wall"),

    @SerializedName("site")
    SITE("site"),

    @SerializedName("main_section")
    MAIN_SECTION("main_section"),

    @SerializedName("secondary_section")
    SECONDARY_SECTION("secondary_section"),

    @SerializedName("trending")
    TRENDING("trending"),

    @SerializedName("can_message")
    CAN_MESSAGE("can_message"),

    @SerializedName("is_messages_blocked")
    IS_MESSAGES_BLOCKED("is_messages_blocked"),

    @SerializedName("can_send_notify")
    CAN_SEND_NOTIFY("can_send_notify"),

    @SerializedName("online_status")
    ONLINE_STATUS("online_status"),

    @SerializedName("invited_by")
    INVITED_BY("invited_by"),

    @SerializedName("age_limits")
    AGE_LIMITS("age_limits"),

    @SerializedName("ban_info")
    BAN_INFO("ban_info"),

    @SerializedName("has_market_app")
    HAS_MARKET_APP("has_market_app"),

    @SerializedName("using_vkpay_market_app")
    USING_VKPAY_MARKET_APP("using_vkpay_market_app"),

    @SerializedName("has_group_channel")
    HAS_GROUP_CHANNEL("has_group_channel"),

    @SerializedName("addresses")
    ADDRESSES("addresses"),

    @SerializedName("is_subscribed_podcasts")
    IS_SUBSCRIBED_PODCASTS("is_subscribed_podcasts"),

    @SerializedName("can_subscribe_podcasts")
    CAN_SUBSCRIBE_PODCASTS("can_subscribe_podcasts"),

    @SerializedName("can_subscribe_posts")
    CAN_SUBSCRIBE_POSTS("can_subscribe_posts"),

    @SerializedName("live_covers")
    LIVE_COVERS("live_covers"),

    @SerializedName("stories_archive_count")
    STORIES_ARCHIVE_COUNT("stories_archive_count"),

    @SerializedName("has_unseen_stories")
    HAS_UNSEEN_STORIES("has_unseen_stories"),

    @SerializedName("rating")
    RATING("rating");

    private final String value;

    Fields(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toLowerCase();
    }
}
