/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.store.dto;

import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author moata
 */
public class OrderDTO {
    
    Integer id;
    String name;
    String Status;
    String comment;
    //DateTime orderDate;
    Timestamp orderDate = new Timestamp(System.currentTimeMillis());
    Date requeredDate;
    Date shippedDate;
    Integer clientId;
    Integer paymentId;
    Integer cleintId;

    
    
    
    //default constructor
    public OrderDTO() {
    }

    
    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Timestamp getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }

    public Date getRequeredDate() {
        return requeredDate;
    }

    public void setRequeredDate(Date requeredDate) {
        this.requeredDate = requeredDate;
    }

    public Date getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(Date shippedDate) {
        this.shippedDate = shippedDate;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public Integer getCleintId() {
        return cleintId;
    }

    public void setCleintId(Integer cleintId) {
        this.cleintId = cleintId;
    }
    
    
    
    
    
    
    
}
