/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.store.bao.item;

import com.pos.store.dao.StoreDAOFactory;
import com.pos.store.dao.item.ItemManageDAO;
import com.pos.store.dto.ItemDTO;
import java.util.List;
import java.util.Map;

/**
 *
 * @author moata
 */
public class ItemBAOImpl implements ItemBAO{

    private ItemManageDAO itemDAO = StoreDAOFactory.creatItemImpl();
    
    @Override
    public List<ItemDTO> getAll() {

        return itemDAO.getAll();
    }

    @Override
    public Integer save(ItemDTO theItemDTO) {
        
        if(theItemDTO.getCode() == null){
            return itemDAO.save(theItemDTO);
        }
        else{
            if(itemDAO.update(theItemDTO)){
                return -1;
        }
        
            return 1;
        }
    }

    @Override
    public Boolean delete(Integer code) {

        return itemDAO.delete(code);
    }

    @Override
    public List<ItemDTO> searchBy(Integer value , String tpye) {

        return itemDAO.searchBy(value , tpye);
    }

    @Override
    public List<ItemDTO> searchBy(Map<Integer, String> searchType) {

        return itemDAO.searchBy(searchType);
    }

    @Override
    public ItemDTO getByCOude(Integer code) {

        return itemDAO.getByCOude(code);
    }

    @Override
    public List<ItemDTO> getItemsByCategNmae(String categName) {
        return itemDAO.getItemsByCategNmae(categName);
    }

   
    
}
