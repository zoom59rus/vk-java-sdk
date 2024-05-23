// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.messages;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.Geo;

import java.util.List;
import java.util.Objects;

/**
 * PinnedMessage object
 */
public class PinnedMessage implements Validable {
    @SerializedName("attachments")
    private List<MessageAttachment> attachments;

    /**
     * Unique auto-incremented number for all messages with this peer
     */
    @SerializedName("conversation_message_id")
    @Required
    private Integer conversationMessageId;

    /**
     * Date when the message has been sent in Unixtime
     */
    @SerializedName("date")
    @Required
    private Integer date;

    /**
     * Message author's ID
     * Entity: owner
     */
    @SerializedName("from_id")
    @Required
    private Long fromId;

    /**
     * Forwarded messages
     */
    @SerializedName("fwd_messages")
    private List<ForeignMessage> fwdMessages;

    @SerializedName("geo")
    private Geo geo;

    /**
     * Message ID
     */
    @SerializedName("id")
    @Required
    private Integer id;

    /**
     * Is it an important message
     */
    @SerializedName("important")
    private Boolean important;

    @SerializedName("keyboard")
    private Keyboard keyboard;

    /**
     * Information whether the message is outcoming
     */
    @SerializedName("out")
    private Boolean out;

    /**
     * Peer ID
     * Entity: peer
     */
    @SerializedName("peer_id")
    @Required
    private Long peerId;

    @SerializedName("reply_message")
    private ForeignMessage replyMessage;

    /**
     * Message text
     */
    @SerializedName("text")
    @Required
    private String text;

    public List<MessageAttachment> getAttachments() {
        return attachments;
    }

    public PinnedMessage setAttachments(List<MessageAttachment> attachments) {
        this.attachments = attachments;
        return this;
    }

    public Integer getConversationMessageId() {
        return conversationMessageId;
    }

    public PinnedMessage setConversationMessageId(Integer conversationMessageId) {
        this.conversationMessageId = conversationMessageId;
        return this;
    }

    public Integer getDate() {
        return date;
    }

    public PinnedMessage setDate(Integer date) {
        this.date = date;
        return this;
    }

    public Long getFromId() {
        return fromId;
    }

    public PinnedMessage setFromId(Long fromId) {
        this.fromId = fromId;
        return this;
    }

    public List<ForeignMessage> getFwdMessages() {
        return fwdMessages;
    }

    public PinnedMessage setFwdMessages(List<ForeignMessage> fwdMessages) {
        this.fwdMessages = fwdMessages;
        return this;
    }

    public Geo getGeo() {
        return geo;
    }

    public PinnedMessage setGeo(Geo geo) {
        this.geo = geo;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public PinnedMessage setId(Integer id) {
        this.id = id;
        return this;
    }

    public Boolean getImportant() {
        return important;
    }

    public PinnedMessage setImportant(Boolean important) {
        this.important = important;
        return this;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public PinnedMessage setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
        return this;
    }

    public Boolean getOut() {
        return out;
    }

    public PinnedMessage setOut(Boolean out) {
        this.out = out;
        return this;
    }

    public Long getPeerId() {
        return peerId;
    }

    public PinnedMessage setPeerId(Long peerId) {
        this.peerId = peerId;
        return this;
    }

    public ForeignMessage getReplyMessage() {
        return replyMessage;
    }

    public PinnedMessage setReplyMessage(ForeignMessage replyMessage) {
        this.replyMessage = replyMessage;
        return this;
    }

    public String getText() {
        return text;
    }

    public PinnedMessage setText(String text) {
        this.text = text;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, peerId, keyboard, attachments, fromId, out, geo, important, fwdMessages, conversationMessageId, replyMessage, id, text);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PinnedMessage pinnedMessage = (PinnedMessage) o;
        return Objects.equals(date, pinnedMessage.date) &&
                Objects.equals(keyboard, pinnedMessage.keyboard) &&
                Objects.equals(attachments, pinnedMessage.attachments) &&
                Objects.equals(fromId, pinnedMessage.fromId) &&
                Objects.equals(conversationMessageId, pinnedMessage.conversationMessageId) &&
                Objects.equals(out, pinnedMessage.out) &&
                Objects.equals(peerId, pinnedMessage.peerId) &&
                Objects.equals(geo, pinnedMessage.geo) &&
                Objects.equals(important, pinnedMessage.important) &&
                Objects.equals(fwdMessages, pinnedMessage.fwdMessages) &&
                Objects.equals(id, pinnedMessage.id) &&
                Objects.equals(text, pinnedMessage.text) &&
                Objects.equals(replyMessage, pinnedMessage.replyMessage);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("PinnedMessage{");
        sb.append("date=").append(date);
        sb.append(", keyboard=").append(keyboard);
        sb.append(", attachments=").append(attachments);
        sb.append(", fromId=").append(fromId);
        sb.append(", conversationMessageId=").append(conversationMessageId);
        sb.append(", out=").append(out);
        sb.append(", peerId=").append(peerId);
        sb.append(", geo=").append(geo);
        sb.append(", important=").append(important);
        sb.append(", fwdMessages=").append(fwdMessages);
        sb.append(", id=").append(id);
        sb.append(", text='").append(text).append("'");
        sb.append(", replyMessage=").append(replyMessage);
        sb.append('}');
        return sb.toString();
    }
}
