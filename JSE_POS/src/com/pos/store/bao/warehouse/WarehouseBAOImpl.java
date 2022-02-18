/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.store.bao.warehouse;

import com.pos.store.dao.StoreDAOFactory;
import com.pos.store.dto.WareHouseDTO;
import java.util.List;
import java.util.Map;
import com.pos.store.dao.warehouse.WarehousManageDAO;

/**
 *
 * @author moata
 */
public class WarehouseBAOImpl implements WarehouseBAO{
    
    
    private WarehousManageDAO Warehousedao = StoreDAOFactory.creatWarehouseImpl();
    
   

    @Override
    public Integer save(WareHouseDTO w) {
        
        try {
            if (w.getCode() == null) {
                return Warehousedao.save(w);
            } else {
                if (Warehousedao.update(w)) {
                    return 1;
                } else {
                    return -1;
                }
            }

        }catch(Exception e){
            e.printStackTrace();
        
        }
        
        

        return -1;

    }

    @Override
    public List<WareHouseDTO> getAll() {

        return Warehousedao.getAll();
    }

    @Override
    public WareHouseDTO getByCOude(Integer code) {

        return Warehousedao.getByCOude(code);
    }

    @Override
    public Boolean delete(Integer cdes) {

        return Warehousedao.delete(cdes);
    }

    @Override
    public List<WareHouseDTO> searchBy(Integer searchType ,String kye ) {

        return Warehousedao.searchBy(searchType, kye);
    }

    @Override
    public List<WareHouseDTO> searchBy(Map<Integer, String> searchType) {

        return Warehousedao.searchBy(searchType);
    }


     
    
    
    
}
