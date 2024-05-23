// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiMethod;
import com.vk.api.sdk.queries.account.*;

/**
 * List of Account methods
 */
public class Account extends AbstractAction {
    /**
     * Constructor
     *
     * @param client vk api client
     */
    public Account(VkApiClient client) {
        super(client);
    }

    /**
     * @param actor vk user actor
     * @return query
     */
    @ApiMethod("account.ban")
    public AccountBanQuery ban(UserActor actor) {
        return new AccountBanQuery(getClient(), actor);
    }

    /**
     * Changes a user password after access is successfully restored with the [vk.com/dev/auth.restore|auth.restore] method.
     *
     * @param actor vk user actor
     * @param newPassword New password that will be set as a current
     * @return query
     */
    @ApiMethod("account.changePassword")
    public AccountChangePasswordQuery changePassword(UserActor actor, String newPassword) {
        return new AccountChangePasswordQuery(getClient(), actor, newPassword);
    }

    /**
     * Changes a user password after access is successfully restored with the [vk.com/dev/auth.restore|auth.restore] method.
     *
     * @param actor vk user actor
     * @return only actor query 
     */
    @ApiMethod("account.changePassword")
    public AccountChangePasswordQuery changePassword(UserActor actor) {
        return new AccountChangePasswordQuery(getClient(), actor);
    }

    /**
     * Returns a list of active ads (offers) which executed by the user will bring him/her respective number of votes to his balance in the application.
     *
     * @param actor vk user actor
     * @return query
     */
    @ApiMethod("account.getActiveOffers")
    public AccountGetActiveOffersQuery getActiveOffers(UserActor actor) {
        return new AccountGetActiveOffersQuery(getClient(), actor);
    }

    /**
     * Gets settings of the user in this application.
     *
     * @param actor vk user actor
     * @return query
     */
    @ApiMethod("account.getAppPermissions")
    public AccountGetAppPermissionsQuery getAppPermissions(UserActor actor) {
        return new AccountGetAppPermissionsQuery(getClient(), actor);
    }

    /**
     * Returns a user's blacklist.
     *
     * @param actor vk user actor
     * @return query
     */
    @ApiMethod("account.getBanned")
    public AccountGetBannedQuery getBanned(UserActor actor) {
        return new AccountGetBannedQuery(getClient(), actor);
    }

    /**
     * Returns non-null values of user counters.
     *
     * @param actor vk user actor
     * @return query
     */
    @ApiMethod("account.getCounters")
    public AccountGetCountersQuery getCounters(UserActor actor) {
        return new AccountGetCountersQuery(getClient(), actor);
    }

    /**
     * Returns current account info.
     *
     * @param actor vk user actor
     * @return query
     */
    @ApiMethod("account.getInfo")
    public AccountGetInfoQuery getInfo(UserActor actor) {
        return new AccountGetInfoQuery(getClient(), actor);
    }

    /**
     * Returns the current account info.
     *
     * @param actor vk user actor
     * @return query
     */
    @ApiMethod("account.getProfileInfo")
    public AccountGetProfileInfoQuery getProfileInfo(UserActor actor) {
        return new AccountGetProfileInfoQuery(getClient(), actor);
    }

    /**
     * Gets settings of push notifications.
     *
     * @param actor vk user actor
     * @return query
     */
    @ApiMethod("account.getPushSettings")
    public AccountGetPushSettingsQuery getPushSettings(UserActor actor) {
        return new AccountGetPushSettingsQuery(getClient(), actor);
    }

    /**
     * Subscribes an iOS/Android/Windows Phone-based device to receive push notifications
     *
     * @param actor vk user actor
     * @param token Device token used to send notifications. (for mpns, the token shall be URL for sending of notifications)
     * @param deviceId Unique device ID.
     * @return query
     */
    @ApiMethod("account.registerDevice")
    public AccountRegisterDeviceQuery registerDevice(UserActor actor, String token,
            String deviceId) {
        return new AccountRegisterDeviceQuery(getClient(), actor, token, deviceId);
    }

    /**
     * Subscribes an iOS/Android/Windows Phone-based device to receive push notifications
     *
     * @param actor vk user actor
     * @return only actor query 
     */
    @ApiMethod("account.registerDevice")
    public AccountRegisterDeviceQuery registerDevice(UserActor actor) {
        return new AccountRegisterDeviceQuery(getClient(), actor);
    }

    /**
     * Edits current profile info.
     *
     * @param actor vk user actor
     * @return query
     */
    @ApiMethod("account.saveProfileInfo")
    public AccountSaveProfileInfoQuery saveProfileInfo(UserActor actor) {
        return new AccountSaveProfileInfoQuery(getClient(), actor);
    }

    /**
     * Allows to edit the current account info.
     *
     * @param actor vk user actor
     * @return query
     */
    @ApiMethod("account.setInfo")
    public AccountSetInfoQuery setInfo(UserActor actor) {
        return new AccountSetInfoQuery(getClient(), actor);
    }

    /**
     * Marks a current user as offline.
     *
     * @param actor vk user actor
     * @return query
     */
    @ApiMethod("account.setOffline")
    public AccountSetOfflineQuery setOffline(UserActor actor) {
        return new AccountSetOfflineQuery(getClient(), actor);
    }

    /**
     * Marks the current user as online for 15 minutes.
     *
     * @param actor vk user actor
     * @return query
     */
    @ApiMethod("account.setOnline")
    public AccountSetOnlineQuery setOnline(UserActor actor) {
        return new AccountSetOnlineQuery(getClient(), actor);
    }

    /**
     * Change push settings.
     *
     * @param actor vk user actor
     * @param deviceId Unique device ID.
     * @return query
     */
    @ApiMethod("account.setPushSettings")
    public AccountSetPushSettingsQuery setPushSettings(UserActor actor, String deviceId) {
        return new AccountSetPushSettingsQuery(getClient(), actor, deviceId);
    }

    /**
     * Change push settings.
     *
     * @param actor vk user actor
     * @return only actor query 
     */
    @ApiMethod("account.setPushSettings")
    public AccountSetPushSettingsQuery setPushSettings(UserActor actor) {
        return new AccountSetPushSettingsQuery(getClient(), actor);
    }

    /**
     * Mutes push notifications for the set period of time.
     *
     * @param actor vk user actor
     * @return query
     */
    @ApiMethod("account.setSilenceMode")
    public AccountSetSilenceModeQuery setSilenceMode(UserActor actor) {
        return new AccountSetSilenceModeQuery(getClient(), actor);
    }

    /**
     * @param actor vk user actor
     * @return query
     */
    @ApiMethod("account.unban")
    public AccountUnbanQuery unban(UserActor actor) {
        return new AccountUnbanQuery(getClient(), actor);
    }

    /**
     * Unsubscribes a device from push notifications.
     *
     * @param actor vk user actor
     * @return query
     */
    @ApiMethod("account.unregisterDevice")
    public AccountUnregisterDeviceQuery unregisterDevice(UserActor actor) {
        return new AccountUnregisterDeviceQuery(getClient(), actor);
    }
}
