// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.objects.annotations.ApiMethod;
import com.vk.api.sdk.queries.secure.*;

import java.util.List;

/**
 * List of Secure methods
 */
public class Secure extends AbstractAction {
    /**
     * Constructor
     *
     * @param client vk api client
     */
    public Secure(VkApiClient client) {
        super(client);
    }

    /**
     * Adds user activity information to an application
     *
     * @param actor vk service actor
     * @param activityId there are 2 default activities: , * 1 - level. Works similar to ,, * 2 - points, saves points amount, Any other value is for saving completed missions
     * @return query
     */
    @ApiMethod("secure.addAppEvent")
    public SecureAddAppEventQuery addAppEvent(ServiceActor actor, Integer activityId) {
        return new SecureAddAppEventQuery(getClient(), actor, activityId);
    }

    /**
     * Adds user activity information to an application
     *
     * @param actor vk service actor
     * @return only actor query 
     */
    @ApiMethod("secure.addAppEvent")
    public SecureAddAppEventQuery addAppEvent(ServiceActor actor) {
        return new SecureAddAppEventQuery(getClient(), actor);
    }

    /**
     * Checks the user authentication in 'IFrame' and 'Flash' apps using the 'access_token' parameter.
     *
     * @param actor vk service actor
     * @return query
     */
    @ApiMethod("secure.checkToken")
    public SecureCheckTokenQuery checkToken(ServiceActor actor) {
        return new SecureCheckTokenQuery(getClient(), actor);
    }

    /**
     * Returns payment balance of the application in hundredth of a vote.
     *
     * @param actor vk service actor
     * @return query
     */
    @ApiMethod("secure.getAppBalance")
    public SecureGetAppBalanceQuery getAppBalance(ServiceActor actor) {
        return new SecureGetAppBalanceQuery(getClient(), actor);
    }

    /**
     * Shows a list of SMS notifications sent by the application using [vk.com/dev/secure.sendSMSNotification|secure.sendSMSNotification] method.
     *
     * @param actor vk service actor
     * @return query
     */
    @ApiMethod("secure.getSMSHistory")
    public SecureGetSMSHistoryQuery getSMSHistory(ServiceActor actor) {
        return new SecureGetSMSHistoryQuery(getClient(), actor);
    }

    /**
     * Shows history of votes transaction between users and the application.
     *
     * @param actor vk service actor
     * @return query
     */
    @ApiMethod("secure.getTransactionsHistory")
    public SecureGetTransactionsHistoryQuery getTransactionsHistory(ServiceActor actor) {
        return new SecureGetTransactionsHistoryQuery(getClient(), actor);
    }

    /**
     * Returns one of the previously set game levels of one or more users in the application.
     *
     * @param actor vk service actor
     * @param userIds
     * @return query
     */
    @ApiMethod("secure.getUserLevel")
    public SecureGetUserLevelQuery getUserLevel(ServiceActor actor, Long... userIds) {
        return new SecureGetUserLevelQuery(getClient(), actor, userIds);
    }

    /**
     * Returns one of the previously set game levels of one or more users in the application.
     *
     * @param actor vk service actor
     * @param userIds
     * @return query
     */
    @ApiMethod("secure.getUserLevel")
    public SecureGetUserLevelQuery getUserLevel(ServiceActor actor, List<Long> userIds) {
        return new SecureGetUserLevelQuery(getClient(), actor, userIds);
    }

    /**
     * Returns one of the previously set game levels of one or more users in the application.
     *
     * @param actor vk service actor
     * @return only actor query 
     */
    @ApiMethod("secure.getUserLevel")
    public SecureGetUserLevelQuery getUserLevel(ServiceActor actor) {
        return new SecureGetUserLevelQuery(getClient(), actor);
    }

    /**
     * Opens the game achievement and gives the user a sticker
     *
     * @param actor vk service actor
     * @param achievementId
     * @param userIds
     * @return query
     */
    @ApiMethod("secure.giveEventSticker")
    public SecureGiveEventStickerQuery giveEventSticker(ServiceActor actor, Integer achievementId,
            Long... userIds) {
        return new SecureGiveEventStickerQuery(getClient(), actor, achievementId, userIds);
    }

    /**
     * Opens the game achievement and gives the user a sticker
     *
     * @param actor vk service actor
     * @param achievementId
     * @param userIds
     * @return query
     */
    @ApiMethod("secure.giveEventSticker")
    public SecureGiveEventStickerQuery giveEventSticker(ServiceActor actor, Integer achievementId,
            List<Long> userIds) {
        return new SecureGiveEventStickerQuery(getClient(), actor, achievementId, userIds);
    }

    /**
     * Opens the game achievement and gives the user a sticker
     *
     * @param actor vk service actor
     * @return only actor query 
     */
    @ApiMethod("secure.giveEventSticker")
    public SecureGiveEventStickerQuery giveEventSticker(ServiceActor actor) {
        return new SecureGiveEventStickerQuery(getClient(), actor);
    }

    /**
     * Sends notification to the user.
     *
     * @param actor vk service actor
     * @param message notification text which should be sent in 'UTF-8' encoding ('254' characters maximum).
     * @return query
     */
    @ApiMethod("secure.sendNotification")
    public SecureSendNotificationQuery sendNotification(ServiceActor actor, String message) {
        return new SecureSendNotificationQuery(getClient(), actor, message);
    }

    /**
     * Sends notification to the user.
     *
     * @param actor vk service actor
     * @return only actor query 
     */
    @ApiMethod("secure.sendNotification")
    public SecureSendNotificationQuery sendNotification(ServiceActor actor) {
        return new SecureSendNotificationQuery(getClient(), actor);
    }

    /**
     * Sends 'SMS' notification to a user's mobile device.
     *
     * @param actor vk service actor
     * @param userId ID of the user to whom SMS notification is sent. The user shall allow the application to send him/her notifications (, +1).
     * @param message 'SMS' text to be sent in 'UTF-8' encoding. Only Latin letters and numbers are allowed. Maximum size is '160' characters.
     * @return query
     */
    @ApiMethod("secure.sendSMSNotification")
    public SecureSendSMSNotificationQuery sendSMSNotification(ServiceActor actor, Long userId,
            String message) {
        return new SecureSendSMSNotificationQuery(getClient(), actor, userId, message);
    }

    /**
     * Sends 'SMS' notification to a user's mobile device.
     *
     * @param actor vk service actor
     * @return only actor query 
     */
    @ApiMethod("secure.sendSMSNotification")
    public SecureSendSMSNotificationQuery sendSMSNotification(ServiceActor actor) {
        return new SecureSendSMSNotificationQuery(getClient(), actor);
    }

    /**
     * Sets a counter which is shown to the user in bold in the left menu.
     *
     * @param actor vk service actor
     * @return query
     */
    @ApiMethod("secure.setCounter")
    public SecureSetCounterQueryWithArray setCounterArray(ServiceActor actor) {
        return new SecureSetCounterQueryWithArray(getClient(), actor);
    }

    /**
     * Sets a counter which is shown to the user in bold in the left menu.
     *
     * @param actor vk service actor
     * @return query
     */
    @ApiMethod("secure.setCounter")
    public SecureSetCounterQuery setCounter(ServiceActor actor) {
        return new SecureSetCounterQuery(getClient(), actor);
    }
}
