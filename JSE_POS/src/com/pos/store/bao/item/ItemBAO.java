/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.store.bao.item;

import com.pos.store.dto.ItemDTO;
import com.pos.common.Bao.POS_G_BaoInf;
import java.util.List;


/**
 *
 * @author moata
 */
public interface ItemBAO extends POS_G_BaoInf<ItemDTO>{
    public List<ItemDTO> getItemsByCategNmae(String categName);
    
    
}
