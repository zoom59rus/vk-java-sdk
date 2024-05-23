// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.ads;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;

import java.util.List;
import java.util.Objects;

/**
 * UserSpecification object
 */
public class UserSpecification implements Validable {
    @SerializedName("client_ids")
    private List<Integer> clientIds;

    @SerializedName("grant_access_to_all_clients")
    private Boolean grantAccessToAllClients;

    @SerializedName("role")
    @Required
    private AccessRolePublic role;

    /**
     * Entity: owner
     */
    @SerializedName("user_id")
    @Required
    private Long userId;

    @SerializedName("view_budget")
    private Boolean viewBudget;

    public List<Integer> getClientIds() {
        return clientIds;
    }

    public UserSpecification setClientIds(List<Integer> clientIds) {
        this.clientIds = clientIds;
        return this;
    }

    public Boolean getGrantAccessToAllClients() {
        return grantAccessToAllClients;
    }

    public UserSpecification setGrantAccessToAllClients(Boolean grantAccessToAllClients) {
        this.grantAccessToAllClients = grantAccessToAllClients;
        return this;
    }

    public AccessRolePublic getRole() {
        return role;
    }

    public UserSpecification setRole(AccessRolePublic role) {
        this.role = role;
        return this;
    }

    public Long getUserId() {
        return userId;
    }

    public UserSpecification setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public Boolean getViewBudget() {
        return viewBudget;
    }

    public UserSpecification setViewBudget(Boolean viewBudget) {
        this.viewBudget = viewBudget;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(grantAccessToAllClients, role, clientIds, userId, viewBudget);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserSpecification userSpecification = (UserSpecification) o;
        return Objects.equals(grantAccessToAllClients, userSpecification.grantAccessToAllClients) &&
                Objects.equals(role, userSpecification.role) &&
                Objects.equals(userId, userSpecification.userId) &&
                Objects.equals(clientIds, userSpecification.clientIds) &&
                Objects.equals(viewBudget, userSpecification.viewBudget);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("UserSpecification{");
        sb.append("grantAccessToAllClients=").append(grantAccessToAllClients);
        sb.append(", role=").append(role);
        sb.append(", userId=").append(userId);
        sb.append(", clientIds=").append(clientIds);
        sb.append(", viewBudget=").append(viewBudget);
        sb.append('}');
        return sb.toString();
    }
}
