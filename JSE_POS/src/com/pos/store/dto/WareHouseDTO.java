/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.store.dto;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author moata
 */
public class WareHouseDTO {
    
    private Integer code;
    private String address;
    private String name;
    private String phone;
    private String fax;

    private Integer imge;
    private List<Integer> operationUser;

    
    //default constructor
    public WareHouseDTO() {
    }
    
    
    
    

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public Integer getImge() {
        return imge;
    }

    public void setImge(Integer imge) {
        this.imge = imge;
    }

    public List<Integer> getOperationUser() {
        return operationUser;
    }

    public void setOperationUser(List<Integer> operationUser) {
        this.operationUser = operationUser;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.code);
        hash = 67 * hash + Objects.hashCode(this.address);
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + Objects.hashCode(this.phone);
        hash = 67 * hash + Objects.hashCode(this.fax);
        hash = 67 * hash + Objects.hashCode(this.imge);
        hash = 67 * hash + Objects.hashCode(this.operationUser);
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
        final WareHouseDTO other = (WareHouseDTO) obj;
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.phone, other.phone)) {
            return false;
        }
        if (!Objects.equals(this.fax, other.fax)) {
            return false;
        }
        if (!Objects.equals(this.code, other.code)) {
            return false;
        }
        if (!Objects.equals(this.imge, other.imge)) {
            return false;
        }
        if (!Objects.equals(this.operationUser, other.operationUser)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
    
    
}
