/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.store.dto;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author moata
 */
public class ItemDTO {
    
    private Integer code; //id
    private String barCode;
    private String nameAr, nameEn, description;
    private Float qty, buyPrice, sellPrice, discount, cost;
    private Integer categoryCode;
    private String logo; //path
    private Float minQty;
    private Integer vendor;
    private String   color;
    private Boolean scale;
    private Integer size; 
    private Date manufDate, expireDate; 

    
    
    //default constructor
    public ItemDTO() {
    }

    
    
    
    
    
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getNameAr() {
        return nameAr;
    }

    public void setNameAr(String nameAr) {
        this.nameAr = nameAr;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getQty() {
        return qty;
    }

    public void setQty(Float qty) {
        this.qty = qty;
    }

    public Float getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(Float buyPrice) {
        this.buyPrice = buyPrice;
    }

    public Float getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(Float sellPrice) {
        this.sellPrice = sellPrice;
    }

    public Float getDiscount() {
        return discount;
    }

    public void setDiscount(Float discount) {
        this.discount = discount;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    public Integer getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(Integer categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Float getMinQty() {
        return minQty;
    }

    public void setMinQty(Float minQty) {
        this.minQty = minQty;
    }

    public Integer getVendor() {
        return vendor;
    }

    public void setVendor(Integer vendor) {
        this.vendor = vendor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getScale() {
        return scale;
    }

    public void setScale(Boolean scale) {
        this.scale = scale;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Date getManufDate() {
        return manufDate;
    }

    public void setManufDate(Date manufDate) {
        this.manufDate = manufDate;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.code);
        hash = 59 * hash + Objects.hashCode(this.barCode);
        hash = 59 * hash + Objects.hashCode(this.nameAr);
        hash = 59 * hash + Objects.hashCode(this.nameEn);
        hash = 59 * hash + Objects.hashCode(this.description);
        hash = 59 * hash + Objects.hashCode(this.qty);
        hash = 59 * hash + Objects.hashCode(this.buyPrice);
        hash = 59 * hash + Objects.hashCode(this.sellPrice);
        hash = 59 * hash + Objects.hashCode(this.discount);
        hash = 59 * hash + Objects.hashCode(this.cost);
        hash = 59 * hash + Objects.hashCode(this.categoryCode);
        hash = 59 * hash + Objects.hashCode(this.logo);
        hash = 59 * hash + Objects.hashCode(this.minQty);
        hash = 59 * hash + Objects.hashCode(this.vendor);
        hash = 59 * hash + Objects.hashCode(this.color);
        hash = 59 * hash + Objects.hashCode(this.scale);
        hash = 59 * hash + Objects.hashCode(this.size);
        hash = 59 * hash + Objects.hashCode(this.manufDate);
        hash = 59 * hash + Objects.hashCode(this.expireDate);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ItemDTO other = (ItemDTO) obj;
        if (!Objects.equals(this.nameAr, other.nameAr)) {
            return false;
        }
        if (!Objects.equals(this.nameEn, other.nameEn)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.logo, other.logo)) {
            return false;
        }
        if (!Objects.equals(this.code, other.code)) {
            return false;
        }
        if (!Objects.equals(this.barCode, other.barCode)) {
            return false;
        }
        if (!Objects.equals(this.qty, other.qty)) {
            return false;
        }
        if (!Objects.equals(this.buyPrice, other.buyPrice)) {
            return false;
        }
        if (!Objects.equals(this.sellPrice, other.sellPrice)) {
            return false;
        }
        if (!Objects.equals(this.discount, other.discount)) {
            return false;
        }
        if (!Objects.equals(this.cost, other.cost)) {
            return false;
        }
        if (!Objects.equals(this.categoryCode, other.categoryCode)) {
            return false;
        }
        if (!Objects.equals(this.minQty, other.minQty)) {
            return false;
        }
        if (!Objects.equals(this.vendor, other.vendor)) {
            return false;
        }
        if (this.color != other.color) {
            return false;
        }
        if (!Objects.equals(this.scale, other.scale)) {
            return false;
        }
        if (!Objects.equals(this.size, other.size)) {
            return false;
        }
        if (!Objects.equals(this.manufDate, other.manufDate)) {
            return false;
        }
        if (!Objects.equals(this.expireDate, other.expireDate)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ItemDTO{" + "code=" + code + ", barCode=" + barCode + ", nameAr=" + nameAr + ", nameEn=" + nameEn + ", description=" + description + ", qty=" + qty + ", buyPrice=" + buyPrice + ", sellPrice=" + sellPrice + ", discount=" + discount + ", cost=" + cost + ", categoryCode=" + categoryCode + ", logo=" + logo + ", minQty=" + minQty + ", vendor=" + vendor + ", color=" + color + ", scale=" + scale + ", size=" + size + ", manufDate=" + manufDate + ", expireDate=" + expireDate + '}';
    }
    
    
    
    
    
    
    
    
    
    
}
