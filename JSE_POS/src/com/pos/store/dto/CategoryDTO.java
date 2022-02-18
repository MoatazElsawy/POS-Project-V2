/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.store.dto;

import java.util.Objects;

/**
 *
 * @author moata
 */
public class CategoryDTO {
    
    private Integer id;
    private String bar_code ;
    private String nameAr ;
    private String nameEn ;
    private String description ;
    private Float discount ;
    private String printerAddress ;

    
    
    
    //default constructor
    public Integer getId() {
        return id;
    }
    
    
    //getter ang setter
    public void setId(Integer id) {
        this.id = id;
    }

    
    public String getBar_code() {
        return bar_code;
    }

    public void setBar_code(String bar_code) {
        this.bar_code = bar_code;
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

    public Float getDiscount() {
        return discount;
    }

    public void setDiscount(Float discount) {
        this.discount = discount;
    }

    public String getPrinterAddress() {
        return printerAddress;
    }

    public void setPrinterAddress(String printerAddress) {
        this.printerAddress = printerAddress;
    }

   

    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.id);
        hash = 59 * hash + Objects.hashCode(this.bar_code);
        hash = 59 * hash + Objects.hashCode(this.nameAr);
        hash = 59 * hash + Objects.hashCode(this.nameEn);
        hash = 59 * hash + Objects.hashCode(this.description);
        hash = 59 * hash + Objects.hashCode(this.discount);
        hash = 59 * hash + Objects.hashCode(this.printerAddress);
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
        final CategoryDTO other = (CategoryDTO) obj;
//        if (this.parentCategortCode != other.parentCategortCode) {
//            return false;
//        }
        if (!Objects.equals(this.nameAr, other.nameAr)) {
            return false;
        }
        if (!Objects.equals(this.nameEn, other.nameEn)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.printerAddress, other.printerAddress)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.bar_code, other.bar_code)) {
            return false;
        }
        if (!Objects.equals(this.discount, other.discount)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CategoryDTO{" + "id=" + id + ", bar_code=" + bar_code + ", nameAr=" + nameAr + ", nameEn=" + nameEn + ", description=" + description + ", discount=" + discount + ", printerAddress=" + printerAddress + ", parentCategortCode=" +'}';
    }

    
    
    
    
    
    
    
    
}
