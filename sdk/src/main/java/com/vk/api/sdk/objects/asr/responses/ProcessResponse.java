// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.asr.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;

import java.util.Objects;

/**
 * ProcessResponse object
 */
public class ProcessResponse implements Validable {
    /**
     * ID of created task in UUID format.
     */
    @SerializedName("task_id")
    @Required
    private String taskId;

    public String getTaskId() {
        return taskId;
    }

    public ProcessResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProcessResponse processResponse = (ProcessResponse) o;
        return Objects.equals(taskId, processResponse.taskId);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("ProcessResponse{");
        sb.append("taskId='").append(taskId).append("'");
        sb.append('}');
        return sb.toString();
    }
}
