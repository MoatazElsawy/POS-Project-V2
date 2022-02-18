/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.store.dao;

import com.pos.store.dao.category.CategoryManageDAO;
import com.pos.store.dao.category.CategoryManageDAOImpl;
import com.pos.store.dao.client.ClientManageDAO;
import com.pos.store.dao.client.ClientManageDAOImpl;
import com.pos.store.dao.invoice.InvoiceManageDAO;
import com.pos.store.dao.invoice.InvoiceManageDAOImpl;
import com.pos.store.dao.item.ItemManageDAO;
import com.pos.store.dao.item.ItemManageDAOImpl;
import com.pos.store.dao.order.OrderManageDAO;
import com.pos.store.dao.order.OrderManageDAOImpl;
import com.pos.store.dao.warehouse.WarehousManageDAOImpl;
import com.pos.store.dao.warehouse.WarehousManageDAO;

/**
 *
 * @author moata
 */
public class StoreDAOFactory {
    
    //static WarehousManagementDAO  warehousboject = new WarehousDAOImpl();
    public static WarehousManageDAO creatWarehouseImpl(){
        return new WarehousManageDAOImpl();
    }  
    
    
    public static ItemManageDAO creatItemImpl(){
    
        return new ItemManageDAOImpl();
    }
    
    
    public static CategoryManageDAO creatCategoryImpl(){
    
        return new CategoryManageDAOImpl();
    }
    
    public static ClientManageDAO creatClientImpl(){
    
        return new ClientManageDAOImpl();
    }
    
    public static OrderManageDAO creatOrderImpl(){
    
        return new OrderManageDAOImpl();
    }
    
    public static InvoiceManageDAO creatInvoiceImpl(){
    
        return new InvoiceManageDAOImpl();
    }
    

    
}
