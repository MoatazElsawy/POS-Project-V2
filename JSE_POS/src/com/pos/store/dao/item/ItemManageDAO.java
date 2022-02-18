/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.store.dao.item;

import com.pos.common.Dao.POS_G_DaoInf;
import com.pos.store.dto.ItemDTO;
import java.util.List;

/**
 *
 * @author moata
 */
public interface ItemManageDAO extends POS_G_DaoInf<ItemDTO>{
    public List<ItemDTO> getItemsByCategNmae(String categName);
            
}
