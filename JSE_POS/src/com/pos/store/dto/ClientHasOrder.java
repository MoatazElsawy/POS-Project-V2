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
public class ClientHasOrder {
    
    Integer clientId;
    Integer orderId;

    //default constructor
    public ClientHasOrder() {
    }
    
    

    public ClientHasOrder(Integer clientId, Integer orderId) {
        this.clientId = clientId;
        this.orderId = orderId;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.clientId);
        hash = 47 * hash + Objects.hashCode(this.orderId);
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
        final ClientHasOrder other = (ClientHasOrder) obj;
        if (!Objects.equals(this.clientId, other.clientId)) {
            return false;
        }
        if (!Objects.equals(this.orderId, other.orderId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClientHasOrder{" + "clientId=" + clientId + ", orderId=" + orderId + '}';
    }
    
    
    
}
