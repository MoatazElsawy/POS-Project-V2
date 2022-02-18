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
public class ClientDTO {
    
    Integer id;
    String fName;
    String lName;
    String email;
    String mobilePhone;
    String companyaddress;
    String companyName;
    String officePhone;
    String fax;
    
    
    //default constructor
    public ClientDTO() {
    }

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getCompanyaddress() {
        return companyaddress;
    }

    public void setCompanyaddress(String address) {
        this.companyaddress = address;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.id);
        hash = 17 * hash + Objects.hashCode(this.fName);
        hash = 17 * hash + Objects.hashCode(this.lName);
        hash = 17 * hash + Objects.hashCode(this.email);
        hash = 17 * hash + Objects.hashCode(this.mobilePhone);
        hash = 17 * hash + Objects.hashCode(this.companyaddress);
        hash = 17 * hash + Objects.hashCode(this.companyName);
        hash = 17 * hash + Objects.hashCode(this.officePhone);
        hash = 17 * hash + Objects.hashCode(this.fax);
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
        final ClientDTO other = (ClientDTO) obj;
        if (!Objects.equals(this.fName, other.fName)) {
            return false;
        }
        if (!Objects.equals(this.lName, other.lName)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.mobilePhone, other.mobilePhone)) {
            return false;
        }
        if (!Objects.equals(this.companyaddress, other.companyaddress)) {
            return false;
        }
        if (!Objects.equals(this.companyName, other.companyName)) {
            return false;
        }
        if (!Objects.equals(this.officePhone, other.officePhone)) {
            return false;
        }
        if (!Objects.equals(this.fax, other.fax)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Clients{" + "id=" + id + ", fName=" + fName + ", lName=" + lName + ", email=" + email + ", mobilePhone=" + mobilePhone + ", address=" + companyaddress + ", companyName=" + companyName + ", officePhone=" + officePhone + ", fax=" + fax + '}';
    }
    
    
    
    
    
    
}
