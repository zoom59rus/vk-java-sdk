// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.leadforms;

import com.google.gson.*;

import java.lang.reflect.Type;

public interface AnswerOneOf {
    default AnswerItem getLeadformsAnswerOneOfAsAnswerItem() {
        return (AnswerItem) this;
    }

    class Deserializer implements JsonDeserializer<AnswerOneOf> {
        @Override
        public AnswerOneOf deserialize(JsonElement json, Type typeOfT,
                JsonDeserializationContext context) throws JsonParseException {
            String errorTrace = "";
            try {
                JsonObject data = json.getAsJsonObject();
                return context.deserialize(data, AnswerItem.class);
            } catch (Exception e) {
                // Failed to deserialize AnswerItem object from JSON
                errorTrace = e.getLocalizedMessage();
            }
            throw new JsonParseException("Failed to deserialize AnswerOneOf object from JSON" + errorTrace);
        }
    }
}
