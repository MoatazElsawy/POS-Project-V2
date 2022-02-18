/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.store.bao.invoice;

import com.pos.store.bao.StoreBAOFactory;
import com.pos.store.dao.StoreDAOFactory;
import com.pos.store.dao.invoice.InvoiceManageDAO;
import com.pos.store.dto.InvoiceDTO;
import java.util.List;
import java.util.Map;

/**
 *
 * @author moata
 */
public class InvoiceBAOImpl implements InvoiceBAO{
    
    InvoiceManageDAO invoice = StoreDAOFactory.creatInvoiceImpl();

    @Override
    public List<InvoiceDTO> getAll() {

        return invoice.getAll();
    }

    @Override
    public InvoiceDTO getByCOude(Integer code) {

        return invoice.getByCOude(code);
    }

    @Override
    public Integer save(InvoiceDTO t) {

        return invoice.save(t);
    }

    @Override
    public Boolean delete(Integer code) {

        return invoice.delete(code);
    }

    @Override
    public List<InvoiceDTO> searchBy(Integer value, String tpye) {

        return invoice.searchBy(value, tpye);
    }

    @Override
    public List<InvoiceDTO> searchBy(Map<Integer, String> searchType) {

        return invoice.searchBy(searchType);
    }
    
}
