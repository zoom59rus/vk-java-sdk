// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.market;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.LinkProductCategory;

import java.util.Objects;

/**
 * MarketCategoryNested object
 */
public class MarketCategoryNested implements LinkProductCategory, Validable {
    /**
     * Category ID
     */
    @SerializedName("id")
    @Required
    private Integer id;

    @SerializedName("inner_type")
    @Required
    private MarketCategoryNestedInnerType innerType;

    /**
     * Is v2 category
     */
    @SerializedName("is_v2")
    private Boolean isV2;

    /**
     * Category name
     */
    @SerializedName("name")
    @Required
    private String name;

    @SerializedName("parent")
    private MarketCategoryNested parent;

    public Integer getId() {
        return id;
    }

    public MarketCategoryNested setId(Integer id) {
        this.id = id;
        return this;
    }

    public MarketCategoryNestedInnerType getInnerType() {
        return innerType;
    }

    public MarketCategoryNested setInnerType(MarketCategoryNestedInnerType innerType) {
        this.innerType = innerType;
        return this;
    }

    public Boolean getIsV2() {
        return isV2;
    }

    public MarketCategoryNested setIsV2(Boolean isV2) {
        this.isV2 = isV2;
        return this;
    }

    public String getName() {
        return name;
    }

    public MarketCategoryNested setName(String name) {
        this.name = name;
        return this;
    }

    public MarketCategoryNested getParent() {
        return parent;
    }

    public MarketCategoryNested setParent(MarketCategoryNested parent) {
        this.parent = parent;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(parent, isV2, innerType, name, id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MarketCategoryNested marketCategoryNested = (MarketCategoryNested) o;
        return Objects.equals(parent, marketCategoryNested.parent) &&
                Objects.equals(innerType, marketCategoryNested.innerType) &&
                Objects.equals(name, marketCategoryNested.name) &&
                Objects.equals(id, marketCategoryNested.id) &&
                Objects.equals(isV2, marketCategoryNested.isV2);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("MarketCategoryNested{");
        sb.append("parent=").append(parent);
        sb.append(", innerType='").append(innerType).append("'");
        sb.append(", name='").append(name).append("'");
        sb.append(", id=").append(id);
        sb.append(", isV2=").append(isV2);
        sb.append('}');
        return sb.toString();
    }
}
