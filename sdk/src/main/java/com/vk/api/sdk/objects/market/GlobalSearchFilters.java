// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.market;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.base.City;
import com.vk.api.sdk.objects.base.Country;

import java.util.Objects;

/**
 * GlobalSearchFilters object
 */
public class GlobalSearchFilters implements Validable {
    @SerializedName("city")
    private City city;

    @SerializedName("country")
    private Country country;

    public City getCity() {
        return city;
    }

    public GlobalSearchFilters setCity(City city) {
        this.city = city;
        return this;
    }

    public Country getCountry() {
        return country;
    }

    public GlobalSearchFilters setCountry(Country country) {
        this.country = country;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, city);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GlobalSearchFilters globalSearchFilters = (GlobalSearchFilters) o;
        return Objects.equals(country, globalSearchFilters.country) &&
                Objects.equals(city, globalSearchFilters.city);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GlobalSearchFilters{");
        sb.append("country=").append(country);
        sb.append(", city=").append(city);
        sb.append('}');
        return sb.toString();
    }
}
