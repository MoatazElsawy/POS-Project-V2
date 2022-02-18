/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.store.bao.client;

import com.pos.store.dao.StoreDAOFactory;
import com.pos.store.dao.client.ClientManageDAO;
import com.pos.store.dto.ClientDTO;
import java.util.List;
import java.util.Map;

/**
 *
 * @author moata
 */
public class ClientBAOImpl implements ClientBAO{

    ClientManageDAO client = StoreDAOFactory.creatClientImpl();
    
    
    @Override
    public List<ClientDTO> getAll() {

        return client.getAll();
    }

    @Override
    public ClientDTO getByCOude(Integer code) {

         return client.getByCOude(code);
    }

    @Override
    public Integer save(ClientDTO t) {

        if (t.getId() == null) {
            return client.save(t);
        } else {

            if (client.update(t)) {
                return -1;
            }

            return 1;

        }

    }

    @Override
    public Boolean delete(Integer code) {

         return client.delete(code);
    }

    @Override
    public List<ClientDTO> searchBy(Integer value, String tpye) {

         return client.searchBy(value, tpye);
    }

    @Override
    public List<ClientDTO> searchBy(Map<Integer, String> searchType) {

         return client.searchBy(searchType);
    }
    
}
