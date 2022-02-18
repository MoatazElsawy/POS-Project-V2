/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.store.bao;

import com.pos.store.bao.category.CategoryBAO;
import com.pos.store.bao.category.CategoryBAOImpl;
import com.pos.store.bao.client.ClientBAO;
import com.pos.store.bao.client.ClientBAOImpl;
import com.pos.store.bao.invoice.InvoiceBAO;
import com.pos.store.bao.invoice.InvoiceBAOImpl;
import com.pos.store.bao.item.ItemBAO;
import com.pos.store.bao.item.ItemBAOImpl;
import com.pos.store.bao.order.OrderBAO;
import com.pos.store.bao.order.OrderBAOImpl;
import com.pos.store.bao.warehouse.WarehouseBAO;
import com.pos.store.bao.warehouse.WarehouseBAOImpl;
import com.pos.store.dto.WareHouseDTO;

/**
 *
 * @author moata
 */
public class StoreBAOFactory {
    
    public static CategoryBAO creatBaoCategoryImpl(){
        return new CategoryBAOImpl();
    }
    
    public static ItemBAO creatBaoItemImpl(){
        return new ItemBAOImpl();
    }
    
    public static WarehouseBAO creatBaoWarehouseImpl(){
        return new WarehouseBAOImpl();
    }
    public static ClientBAO creatBaoClientImpl(){
        return new ClientBAOImpl();
    }
    public static OrderBAO creatBaoOrderImpl(){
        return new OrderBAOImpl();
    }
    public static InvoiceBAO creatBaoInvoiceImpl(){
        return new InvoiceBAOImpl();
    }
}
