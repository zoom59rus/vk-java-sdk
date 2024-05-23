// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.account;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;

import java.util.Objects;

/**
 * AccountCounters object
 */
public class AccountCounters implements Validable {
    /**
     * New app requests number
     */
    @SerializedName("app_requests")
    private Integer appRequests;

    /**
     * New events number
     */
    @SerializedName("events")
    private Integer events;

    /**
     * New faves number
     */
    @SerializedName("faves")
    private Integer faves;

    /**
     * New friends requests number
     */
    @SerializedName("friends")
    private Integer friends;

    /**
     * New friends recommendations number
     */
    @SerializedName("friends_recommendations")
    private Integer friendsRecommendations;

    /**
     * New gifts number
     */
    @SerializedName("gifts")
    private Integer gifts;

    /**
     * New groups number
     */
    @SerializedName("groups")
    private Integer groups;

    /**
     * New memories number
     */
    @SerializedName("memories")
    private Integer memories;

    /**
     * New messages number. Will be removed when messages.getCounters is released.
     */
    @SerializedName("messages")
    private Integer messages;

    /**
     * New notes number
     */
    @SerializedName("notes")
    private Integer notes;

    /**
     * New notifications number
     */
    @SerializedName("notifications")
    private Integer notifications;

    /**
     * New photo tags number
     */
    @SerializedName("photos")
    private Integer photos;

    public Integer getAppRequests() {
        return appRequests;
    }

    public AccountCounters setAppRequests(Integer appRequests) {
        this.appRequests = appRequests;
        return this;
    }

    public Integer getEvents() {
        return events;
    }

    public AccountCounters setEvents(Integer events) {
        this.events = events;
        return this;
    }

    public Integer getFaves() {
        return faves;
    }

    public AccountCounters setFaves(Integer faves) {
        this.faves = faves;
        return this;
    }

    public Integer getFriends() {
        return friends;
    }

    public AccountCounters setFriends(Integer friends) {
        this.friends = friends;
        return this;
    }

    public Integer getFriendsRecommendations() {
        return friendsRecommendations;
    }

    public AccountCounters setFriendsRecommendations(Integer friendsRecommendations) {
        this.friendsRecommendations = friendsRecommendations;
        return this;
    }

    public Integer getGifts() {
        return gifts;
    }

    public AccountCounters setGifts(Integer gifts) {
        this.gifts = gifts;
        return this;
    }

    public Integer getGroups() {
        return groups;
    }

    public AccountCounters setGroups(Integer groups) {
        this.groups = groups;
        return this;
    }

    public Integer getMemories() {
        return memories;
    }

    public AccountCounters setMemories(Integer memories) {
        this.memories = memories;
        return this;
    }

    public Integer getMessages() {
        return messages;
    }

    public AccountCounters setMessages(Integer messages) {
        this.messages = messages;
        return this;
    }

    public Integer getNotes() {
        return notes;
    }

    public AccountCounters setNotes(Integer notes) {
        this.notes = notes;
        return this;
    }

    public Integer getNotifications() {
        return notifications;
    }

    public AccountCounters setNotifications(Integer notifications) {
        this.notifications = notifications;
        return this;
    }

    public Integer getPhotos() {
        return photos;
    }

    public AccountCounters setPhotos(Integer photos) {
        this.photos = photos;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(faves, notes, appRequests, memories, groups, messages, photos, events, friends, notifications, friendsRecommendations, gifts);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountCounters accountCounters = (AccountCounters) o;
        return Objects.equals(friendsRecommendations, accountCounters.friendsRecommendations) &&
                Objects.equals(appRequests, accountCounters.appRequests) &&
                Objects.equals(faves, accountCounters.faves) &&
                Objects.equals(notes, accountCounters.notes) &&
                Objects.equals(memories, accountCounters.memories) &&
                Objects.equals(groups, accountCounters.groups) &&
                Objects.equals(messages, accountCounters.messages) &&
                Objects.equals(photos, accountCounters.photos) &&
                Objects.equals(events, accountCounters.events) &&
                Objects.equals(friends, accountCounters.friends) &&
                Objects.equals(notifications, accountCounters.notifications) &&
                Objects.equals(gifts, accountCounters.gifts);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("AccountCounters{");
        sb.append("friendsRecommendations=").append(friendsRecommendations);
        sb.append(", appRequests=").append(appRequests);
        sb.append(", faves=").append(faves);
        sb.append(", notes=").append(notes);
        sb.append(", memories=").append(memories);
        sb.append(", groups=").append(groups);
        sb.append(", messages=").append(messages);
        sb.append(", photos=").append(photos);
        sb.append(", events=").append(events);
        sb.append(", friends=").append(friends);
        sb.append(", notifications=").append(notifications);
        sb.append(", gifts=").append(gifts);
        sb.append('}');
        return sb.toString();
    }
}
