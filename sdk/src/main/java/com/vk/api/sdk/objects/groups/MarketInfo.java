// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.groups;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.market.Currency;
import com.vk.api.sdk.objects.market.Price;

import java.util.Objects;

/**
 * MarketInfo object
 */
public class MarketInfo implements Validable {
    /**
     * Contact person ID
     */
    @SerializedName("contact_id")
    private Integer contactId;

    @SerializedName("currency")
    private Currency currency;

    /**
     * Currency name
     */
    @SerializedName("currency_text")
    private String currencyText;

    /**
     * Information whether the market is enabled
     */
    @SerializedName("enabled")
    private BoolInt enabled;

    /**
     * Shop header items link is enabled
     */
    @SerializedName("is_show_header_items_link")
    private BoolInt isShowHeaderItemsLink;

    /**
     * Main market album ID
     */
    @SerializedName("main_album_id")
    private Integer mainAlbumId;

    @SerializedName("min_order_price")
    private Price minOrderPrice;

    /**
     * Maximum price
     */
    @SerializedName("price_max")
    private String priceMax;

    /**
     * Minimum price
     */
    @SerializedName("price_min")
    private String priceMin;

    /**
     * Market type
     */
    @SerializedName("type")
    private String type;

    public Integer getContactId() {
        return contactId;
    }

    public MarketInfo setContactId(Integer contactId) {
        this.contactId = contactId;
        return this;
    }

    public Currency getCurrency() {
        return currency;
    }

    public MarketInfo setCurrency(Currency currency) {
        this.currency = currency;
        return this;
    }

    public String getCurrencyText() {
        return currencyText;
    }

    public MarketInfo setCurrencyText(String currencyText) {
        this.currencyText = currencyText;
        return this;
    }

    public boolean isEnabled() {
        return enabled == BoolInt.YES;
    }

    public BoolInt getEnabled() {
        return enabled;
    }

    public boolean isShowHeaderItemsLink() {
        return isShowHeaderItemsLink == BoolInt.YES;
    }

    public BoolInt getIsShowHeaderItemsLink() {
        return isShowHeaderItemsLink;
    }

    public Integer getMainAlbumId() {
        return mainAlbumId;
    }

    public MarketInfo setMainAlbumId(Integer mainAlbumId) {
        this.mainAlbumId = mainAlbumId;
        return this;
    }

    public Price getMinOrderPrice() {
        return minOrderPrice;
    }

    public MarketInfo setMinOrderPrice(Price minOrderPrice) {
        this.minOrderPrice = minOrderPrice;
        return this;
    }

    public String getPriceMax() {
        return priceMax;
    }

    public MarketInfo setPriceMax(String priceMax) {
        this.priceMax = priceMax;
        return this;
    }

    public String getPriceMin() {
        return priceMin;
    }

    public MarketInfo setPriceMin(String priceMin) {
        this.priceMin = priceMin;
        return this;
    }

    public String getType() {
        return type;
    }

    public MarketInfo setType(String type) {
        this.type = type;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(priceMin, mainAlbumId, priceMax, minOrderPrice, currencyText, contactId, isShowHeaderItemsLink, currency, type, enabled);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MarketInfo marketInfo = (MarketInfo) o;
        return Objects.equals(isShowHeaderItemsLink, marketInfo.isShowHeaderItemsLink) &&
                Objects.equals(minOrderPrice, marketInfo.minOrderPrice) &&
                Objects.equals(currencyText, marketInfo.currencyText) &&
                Objects.equals(currency, marketInfo.currency) &&
                Objects.equals(contactId, marketInfo.contactId) &&
                Objects.equals(priceMin, marketInfo.priceMin) &&
                Objects.equals(type, marketInfo.type) &&
                Objects.equals(mainAlbumId, marketInfo.mainAlbumId) &&
                Objects.equals(enabled, marketInfo.enabled) &&
                Objects.equals(priceMax, marketInfo.priceMax);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("MarketInfo{");
        sb.append("isShowHeaderItemsLink=").append(isShowHeaderItemsLink);
        sb.append(", minOrderPrice=").append(minOrderPrice);
        sb.append(", currencyText='").append(currencyText).append("'");
        sb.append(", currency=").append(currency);
        sb.append(", contactId=").append(contactId);
        sb.append(", priceMin='").append(priceMin).append("'");
        sb.append(", type='").append(type).append("'");
        sb.append(", mainAlbumId=").append(mainAlbumId);
        sb.append(", enabled=").append(enabled);
        sb.append(", priceMax='").append(priceMax).append("'");
        sb.append('}');
        return sb.toString();
    }
}
