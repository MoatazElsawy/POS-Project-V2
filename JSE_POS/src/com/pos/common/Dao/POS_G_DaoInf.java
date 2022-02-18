/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.common.Dao;

import java.util.List;
import java.util.Map;

/**
 *
 * @author moata
 * @param <T>
 */
public interface POS_G_DaoInf <T>{
    
    public List<T> getAll();
    public T getByCOude(Integer code);
    public Integer save(T t);
    public Boolean update(T t);
    public Boolean delete(Integer code);
    public List<T> searchBy(Integer type , String value);
    public List<T> searchBy(Map<Integer , String> searchType);
}
