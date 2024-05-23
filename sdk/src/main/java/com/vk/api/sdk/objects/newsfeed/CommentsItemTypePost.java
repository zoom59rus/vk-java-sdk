// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.base.CommentsInfo;
import com.vk.api.sdk.objects.base.LikesInfo;
import com.vk.api.sdk.objects.base.RepostsInfo;
import com.vk.api.sdk.objects.wall.*;

import java.net.URI;
import java.util.List;
import java.util.Objects;

/**
 * CommentsItemTypePost object
 */
public class CommentsItemTypePost extends CommentsItemBase implements CommentsItem, Validable {
    /**
     * Access key to private object
     */
    @SerializedName("access_key")
    private String accessKey;

    @SerializedName("attachments")
    private List<WallpostAttachment> attachments;

    /**
     * Information whether current user can delete the post
     */
    @SerializedName("can_delete")
    private BoolInt canDelete;

    /**
     * Information whether current user can edit the post
     */
    @SerializedName("can_edit")
    private BoolInt canEdit;

    /**
     * Information whether current user can pin the post
     */
    @SerializedName("can_pin")
    private BoolInt canPin;

    /**
     * Index of current carousel element
     */
    @SerializedName("carousel_offset")
    private Integer carouselOffset;

    @SerializedName("comments")
    private CommentsInfo comments;

    @SerializedName("copy_history")
    private List<WallpostFull> copyHistory;

    /**
     * Information about the source of the post
     */
    @SerializedName("copyright")
    private PostCopyright copyright;

    /**
     * Post creator ID (if post still can be edited)
     * Entity: owner
     */
    @SerializedName("created_by")
    private Long createdBy;

    @SerializedName("deleted_details")
    private String deletedDetails;

    @SerializedName("deleted_reason")
    private String deletedReason;

    @SerializedName("donut")
    private WallpostDonut donut;

    @SerializedName("donut_miniapp_url")
    private URI donutMiniappUrl;

    /**
     * Date of editing in Unixtime
     */
    @SerializedName("edited")
    private Integer edited;

    @SerializedName("feedback")
    private ItemWallpostFeedback feedback;

    /**
     * Post author ID
     * Entity: owner
     */
    @SerializedName("from_id")
    private Long fromId;

    @SerializedName("geo")
    private Geo geo;

    /**
     * Hash for sharing
     */
    @SerializedName("hash")
    private String hash;

    /**
     * Post ID
     */
    @SerializedName("id")
    private Integer id;

    @SerializedName("inner_type")
    @Required
    private CommentsItemTypePostInnerType innerType;

    /**
     * Is post archived, only for post owners
     */
    @SerializedName("is_archived")
    private Boolean isArchived;

    @SerializedName("is_deleted")
    private Boolean isDeleted;

    /**
     * Information whether the post in favorites list
     */
    @SerializedName("is_favorite")
    private Boolean isFavorite;

    /**
     * Information whether the post is pinned
     */
    @SerializedName("is_pinned")
    private BoolInt isPinned;

    /**
     * Count of likes
     */
    @SerializedName("likes")
    private LikesInfo likes;

    /**
     * Information whether the post is marked as ads
     */
    @SerializedName("marked_as_ads")
    private BoolInt markedAsAds;

    /**
     * Wall owner's ID
     * Entity: owner
     */
    @SerializedName("owner_id")
    private Long ownerId;

    /**
     * If post type 'reply', contains original parent IDs stack
     */
    @SerializedName("parents_stack")
    private List<Integer> parentsStack;

    @SerializedName("post_source")
    private PostSource postSource;

    @SerializedName("post_type")
    private PostType postType;

    @SerializedName("reposts")
    private RepostsInfo reposts;

    /**
     * Preview length control parameter
     */
    @SerializedName("short_text_rate")
    private Number shortTextRate;

    /**
     * Post signer ID
     * Entity: owner
     */
    @SerializedName("signer_id")
    private Long signerId;

    /**
     * Post text
     */
    @SerializedName("text")
    private String text;

    /**
     * Entity: owner
     */
    @SerializedName("to_id")
    private Long toId;

    /**
     * Topic ID. Allowed values can be obtained from newsfeed.getPostTopics method
     */
    @SerializedName("topic_id")
    private CommentsItemTypePostTopicId topicId;

    /**
     * Count of views
     */
    @SerializedName("views")
    private Views views;

    public String getAccessKey() {
        return accessKey;
    }

    public CommentsItemTypePost setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    public List<WallpostAttachment> getAttachments() {
        return attachments;
    }

    public CommentsItemTypePost setAttachments(List<WallpostAttachment> attachments) {
        this.attachments = attachments;
        return this;
    }

    public boolean canDelete() {
        return canDelete == BoolInt.YES;
    }

    public BoolInt getCanDelete() {
        return canDelete;
    }

    public boolean canEdit() {
        return canEdit == BoolInt.YES;
    }

    public BoolInt getCanEdit() {
        return canEdit;
    }

    public boolean canPin() {
        return canPin == BoolInt.YES;
    }

    public BoolInt getCanPin() {
        return canPin;
    }

    public Integer getCarouselOffset() {
        return carouselOffset;
    }

    public CommentsItemTypePost setCarouselOffset(Integer carouselOffset) {
        this.carouselOffset = carouselOffset;
        return this;
    }

    public CommentsInfo getComments() {
        return comments;
    }

    public CommentsItemTypePost setComments(CommentsInfo comments) {
        this.comments = comments;
        return this;
    }

    public List<WallpostFull> getCopyHistory() {
        return copyHistory;
    }

    public CommentsItemTypePost setCopyHistory(List<WallpostFull> copyHistory) {
        this.copyHistory = copyHistory;
        return this;
    }

    public PostCopyright getCopyright() {
        return copyright;
    }

    public CommentsItemTypePost setCopyright(PostCopyright copyright) {
        this.copyright = copyright;
        return this;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public CommentsItemTypePost setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public String getDeletedDetails() {
        return deletedDetails;
    }

    public CommentsItemTypePost setDeletedDetails(String deletedDetails) {
        this.deletedDetails = deletedDetails;
        return this;
    }

    public String getDeletedReason() {
        return deletedReason;
    }

    public CommentsItemTypePost setDeletedReason(String deletedReason) {
        this.deletedReason = deletedReason;
        return this;
    }

    public WallpostDonut getDonut() {
        return donut;
    }

    public CommentsItemTypePost setDonut(WallpostDonut donut) {
        this.donut = donut;
        return this;
    }

    public URI getDonutMiniappUrl() {
        return donutMiniappUrl;
    }

    public CommentsItemTypePost setDonutMiniappUrl(URI donutMiniappUrl) {
        this.donutMiniappUrl = donutMiniappUrl;
        return this;
    }

    public Integer getEdited() {
        return edited;
    }

    public CommentsItemTypePost setEdited(Integer edited) {
        this.edited = edited;
        return this;
    }

    public ItemWallpostFeedback getFeedback() {
        return feedback;
    }

    public CommentsItemTypePost setFeedback(ItemWallpostFeedback feedback) {
        this.feedback = feedback;
        return this;
    }

    public Long getFromId() {
        return fromId;
    }

    public CommentsItemTypePost setFromId(Long fromId) {
        this.fromId = fromId;
        return this;
    }

    public Geo getGeo() {
        return geo;
    }

    public CommentsItemTypePost setGeo(Geo geo) {
        this.geo = geo;
        return this;
    }

    public String getHash() {
        return hash;
    }

    public CommentsItemTypePost setHash(String hash) {
        this.hash = hash;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public CommentsItemTypePost setId(Integer id) {
        this.id = id;
        return this;
    }

    public CommentsItemTypePostInnerType getInnerType() {
        return innerType;
    }

    public CommentsItemTypePost setInnerType(CommentsItemTypePostInnerType innerType) {
        this.innerType = innerType;
        return this;
    }

    public Boolean getIsArchived() {
        return isArchived;
    }

    public CommentsItemTypePost setIsArchived(Boolean isArchived) {
        this.isArchived = isArchived;
        return this;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public CommentsItemTypePost setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
        return this;
    }

    public Boolean getIsFavorite() {
        return isFavorite;
    }

    public CommentsItemTypePost setIsFavorite(Boolean isFavorite) {
        this.isFavorite = isFavorite;
        return this;
    }

    public boolean isPinned() {
        return isPinned == BoolInt.YES;
    }

    public BoolInt getIsPinned() {
        return isPinned;
    }

    public LikesInfo getLikes() {
        return likes;
    }

    public CommentsItemTypePost setLikes(LikesInfo likes) {
        this.likes = likes;
        return this;
    }

    public boolean isMarkedAsAds() {
        return markedAsAds == BoolInt.YES;
    }

    public BoolInt getMarkedAsAds() {
        return markedAsAds;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public CommentsItemTypePost setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public List<Integer> getParentsStack() {
        return parentsStack;
    }

    public CommentsItemTypePost setParentsStack(List<Integer> parentsStack) {
        this.parentsStack = parentsStack;
        return this;
    }

    public PostSource getPostSource() {
        return postSource;
    }

    public CommentsItemTypePost setPostSource(PostSource postSource) {
        this.postSource = postSource;
        return this;
    }

    public PostType getPostType() {
        return postType;
    }

    public CommentsItemTypePost setPostType(PostType postType) {
        this.postType = postType;
        return this;
    }

    public RepostsInfo getReposts() {
        return reposts;
    }

    public CommentsItemTypePost setReposts(RepostsInfo reposts) {
        this.reposts = reposts;
        return this;
    }

    public Number getShortTextRate() {
        return shortTextRate;
    }

    public CommentsItemTypePost setShortTextRate(Number shortTextRate) {
        this.shortTextRate = shortTextRate;
        return this;
    }

    public Long getSignerId() {
        return signerId;
    }

    public CommentsItemTypePost setSignerId(Long signerId) {
        this.signerId = signerId;
        return this;
    }

    public String getText() {
        return text;
    }

    public CommentsItemTypePost setText(String text) {
        this.text = text;
        return this;
    }

    public Long getToId() {
        return toId;
    }

    public CommentsItemTypePost setToId(Long toId) {
        this.toId = toId;
        return this;
    }

    public CommentsItemTypePostTopicId getTopicId() {
        return topicId;
    }

    public CommentsItemTypePost setTopicId(CommentsItemTypePostTopicId topicId) {
        this.topicId = topicId;
        return this;
    }

    public Views getViews() {
        return views;
    }

    public CommentsItemTypePost setViews(Views views) {
        this.views = views;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(toId, carouselOffset, copyright, attachments, isArchived, canEdit, ownerId, feedback, geo, deletedReason, parentsStack, isDeleted, donut, canDelete, id, text, donutMiniappUrl, markedAsAds, canPin, views, likes, comments, isPinned, postType, edited, deletedDetails, shortTextRate, postSource, fromId, topicId, signerId, createdBy, accessKey, innerType, hash, reposts, isFavorite, copyHistory);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommentsItemTypePost commentsItemTypePost = (CommentsItemTypePost) o;
        return Objects.equals(copyright, commentsItemTypePost.copyright) &&
                Objects.equals(donutMiniappUrl, commentsItemTypePost.donutMiniappUrl) &&
                Objects.equals(attachments, commentsItemTypePost.attachments) &&
                Objects.equals(fromId, commentsItemTypePost.fromId) &&
                Objects.equals(isFavorite, commentsItemTypePost.isFavorite) &&
                Objects.equals(ownerId, commentsItemTypePost.ownerId) &&
                Objects.equals(toId, commentsItemTypePost.toId) &&
                Objects.equals(deletedDetails, commentsItemTypePost.deletedDetails) &&
                Objects.equals(isPinned, commentsItemTypePost.isPinned) &&
                Objects.equals(feedback, commentsItemTypePost.feedback) &&
                Objects.equals(geo, commentsItemTypePost.geo) &&
                Objects.equals(isDeleted, commentsItemTypePost.isDeleted) &&
                Objects.equals(innerType, commentsItemTypePost.innerType) &&
                Objects.equals(canDelete, commentsItemTypePost.canDelete) &&
                Objects.equals(donut, commentsItemTypePost.donut) &&
                Objects.equals(deletedReason, commentsItemTypePost.deletedReason) &&
                Objects.equals(markedAsAds, commentsItemTypePost.markedAsAds) &&
                Objects.equals(postType, commentsItemTypePost.postType) &&
                Objects.equals(id, commentsItemTypePost.id) &&
                Objects.equals(text, commentsItemTypePost.text) &&
                Objects.equals(topicId, commentsItemTypePost.topicId) &&
                Objects.equals(views, commentsItemTypePost.views) &&
                Objects.equals(likes, commentsItemTypePost.likes) &&
                Objects.equals(comments, commentsItemTypePost.comments) &&
                Objects.equals(signerId, commentsItemTypePost.signerId) &&
                Objects.equals(edited, commentsItemTypePost.edited) &&
                Objects.equals(parentsStack, commentsItemTypePost.parentsStack) &&
                Objects.equals(canEdit, commentsItemTypePost.canEdit) &&
                Objects.equals(createdBy, commentsItemTypePost.createdBy) &&
                Objects.equals(canPin, commentsItemTypePost.canPin) &&
                Objects.equals(copyHistory, commentsItemTypePost.copyHistory) &&
                Objects.equals(shortTextRate, commentsItemTypePost.shortTextRate) &&
                Objects.equals(isArchived, commentsItemTypePost.isArchived) &&
                Objects.equals(postSource, commentsItemTypePost.postSource) &&
                Objects.equals(accessKey, commentsItemTypePost.accessKey) &&
                Objects.equals(carouselOffset, commentsItemTypePost.carouselOffset) &&
                Objects.equals(hash, commentsItemTypePost.hash) &&
                Objects.equals(reposts, commentsItemTypePost.reposts);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("CommentsItemTypePost{");
        sb.append("copyright=").append(copyright);
        sb.append(", donutMiniappUrl=").append(donutMiniappUrl);
        sb.append(", attachments=").append(attachments);
        sb.append(", fromId=").append(fromId);
        sb.append(", isFavorite=").append(isFavorite);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", toId=").append(toId);
        sb.append(", deletedDetails='").append(deletedDetails).append("'");
        sb.append(", isPinned=").append(isPinned);
        sb.append(", feedback=").append(feedback);
        sb.append(", geo=").append(geo);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", innerType='").append(innerType).append("'");
        sb.append(", canDelete=").append(canDelete);
        sb.append(", donut=").append(donut);
        sb.append(", deletedReason='").append(deletedReason).append("'");
        sb.append(", markedAsAds=").append(markedAsAds);
        sb.append(", postType=").append(postType);
        sb.append(", id=").append(id);
        sb.append(", text='").append(text).append("'");
        sb.append(", topicId=").append(topicId);
        sb.append(", views=").append(views);
        sb.append(", likes=").append(likes);
        sb.append(", comments=").append(comments);
        sb.append(", signerId=").append(signerId);
        sb.append(", edited=").append(edited);
        sb.append(", parentsStack=").append(parentsStack);
        sb.append(", canEdit=").append(canEdit);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", canPin=").append(canPin);
        sb.append(", copyHistory=").append(copyHistory);
        sb.append(", shortTextRate=").append(shortTextRate);
        sb.append(", isArchived=").append(isArchived);
        sb.append(", postSource=").append(postSource);
        sb.append(", accessKey='").append(accessKey).append("'");
        sb.append(", carouselOffset=").append(carouselOffset);
        sb.append(", hash='").append(hash).append("'");
        sb.append(", reposts=").append(reposts);
        sb.append('}');
        return sb.toString();
    }
}
