// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Type;
import java.util.Map;

public class GsonHolder {
    private static final Map TYPE_ADAPTERS = new java.util.HashMap<Class, com.google.gson.JsonDeserializer>() {{
    put(com.vk.api.sdk.objects.base.LinkProductCategory.class, new com.vk.api.sdk.objects.base.LinkProductCategory.Deserializer());
    put(com.vk.api.sdk.objects.messages.KeyboardButtonPropertyAction.class, new com.vk.api.sdk.objects.messages.KeyboardButtonPropertyAction.Deserializer());
    put(com.vk.api.sdk.objects.support.UnblockScreenItem.class, new com.vk.api.sdk.objects.support.UnblockScreenItem.Deserializer());
    put(com.vk.api.sdk.objects.prettycards.ButtonOneOf.class, new com.vk.api.sdk.objects.prettycards.ButtonOneOf.Deserializer());
    put(com.vk.api.sdk.objects.newsfeed.NewsfeedItem.class, new com.vk.api.sdk.objects.newsfeed.NewsfeedItem.Deserializer());
    put(com.vk.api.sdk.objects.prettycards.PrettyCardOrError.class, new com.vk.api.sdk.objects.prettycards.PrettyCardOrError.Deserializer());
    put(com.vk.api.sdk.objects.users.SubscriptionsItem.class, new com.vk.api.sdk.objects.users.SubscriptionsItem.Deserializer());
    put(com.vk.api.sdk.objects.newsfeed.CommentsItem.class, new com.vk.api.sdk.objects.newsfeed.CommentsItem.Deserializer());
    put(com.vk.api.sdk.objects.leadforms.AnswerOneOf.class, new com.vk.api.sdk.objects.leadforms.AnswerOneOf.Deserializer());
    put(com.vk.api.sdk.events.CallbackEvent.class, new com.vk.api.sdk.events.CallbackEvent.Deserializer());
    }};

    private GsonBuilder gsonBuilder;

    private Gson gson;

    public GsonHolder() {
        this.gsonBuilder = new GsonBuilder();
        TYPE_ADAPTERS.keySet().forEach(subtype -> this.gsonBuilder.registerTypeAdapter((Type) subtype, TYPE_ADAPTERS.get(subtype)));
        this.gson = this.gsonBuilder.create();
    }

    public GsonBuilder getGsonBuilder() {
        return this.gsonBuilder;
    }

    public Gson getGson() {
        return this.gson;
    }
}
