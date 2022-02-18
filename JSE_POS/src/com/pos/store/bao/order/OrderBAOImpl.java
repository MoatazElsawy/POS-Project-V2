/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.store.bao.order;

import com.pos.store.dao.StoreDAOFactory;
import com.pos.store.dao.order.OrderManageDAO;
import com.pos.store.dto.OrderDTO;
import java.util.List;
import java.util.Map;

/**
 *
 * @author moata
 */
public class OrderBAOImpl implements OrderBAO{
    
    OrderManageDAO order = StoreDAOFactory.creatOrderImpl();
    
    

    @Override
    public List<OrderDTO> getAll() {

        return order.getAll();
    }

    @Override
    public OrderDTO getByCOude(Integer code) {
        
        return order.getByCOude(code);
    }

    @Override
    public Integer save(OrderDTO t) {

        if (t.getId() == null) {
            return order.save(t);
        } else {

            if (order.update(t)) {
                return -1;
            }

            return 1;

        }

    }

    @Override
    public Boolean delete(Integer code) {

        return order.delete(code);
    }

    @Override
    public List<OrderDTO> searchBy(Integer value, String tpye) {

        return order.searchBy(value, tpye);
    }

    @Override
    public List<OrderDTO> searchBy(Map<Integer, String> searchType) {

        return order.searchBy(searchType);
    }
    
}
