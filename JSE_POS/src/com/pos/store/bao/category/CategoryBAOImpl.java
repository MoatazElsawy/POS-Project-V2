/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.store.bao.category;

import com.pos.store.dao.StoreDAOFactory;
import com.pos.store.dao.category.CategoryManageDAO;
import com.pos.store.dao.category.CategoryManageDAOImpl;
import com.pos.store.dto.CategoryDTO;
import java.util.List;
import java.util.Map;

/**
 *
 * @author moata
 */
public class CategoryBAOImpl implements CategoryBAO{
    
    
    /*private CategoryManageDAO categoryDAO = new CategoryManageDAOImpl();   //calling directly without factory design pattern*/
    
    private CategoryManageDAO categoryDAO = StoreDAOFactory.creatCategoryImpl();   //calling undirectly with factory design pattern

    
    
    
    
//    @Override
//    public List<CategoryDTO> getAll() {
//
//        return categoryDAO.getAll();
//    }
//
//    @Override
//    public Integer save(CategoryDTO theCategoryDTO) {
//
//        if(theCategoryDTO.getCode() == null){
//            return categoryDAO.save(theCategoryDTO);
//        }
//        else{
//            
//            if(categoryDAO.update(theCategoryDTO)){
//                return -1;
//        }
//        
//            return 1;
//        
//        }
//       
//    }
//
//    @Override
//    public Boolean update(CategoryDTO theCategoryDTO) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public Boolean delete(Integer code) {
//
//        return categoryDAO.delete(code);
//    }
//
//    @Override
//    public List<CategoryDTO> searchBy(Integer type, String value) {
//
//        return categoryDAO.searchBy(type, value);
//    }
//
//    @Override
//    public List<CategoryDTO> searchBy(Map<Integer, String> searchType) {
//
//        return categoryDAO.searchBy(searchType);
//    }

    
    @Override
    public List<CategoryDTO> getAll() {

        return categoryDAO.getAll();
    }

    @Override
    public Integer save(CategoryDTO t) {

        if(t.getId() == null){
        return categoryDAO.save(t);
        }
        else{
            
            if(categoryDAO.update(t)){
                return -1;
        }
        
            return 1;
        
        }
    }

    @Override
    public Boolean delete(Integer code) {

        return categoryDAO.delete(code);
    }

    @Override
    public CategoryDTO getByCOude(Integer code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CategoryDTO> searchBy( Integer value , String tpye) {

        return categoryDAO.searchBy(value, tpye);

    }

    @Override
    public List<CategoryDTO> searchBy(Map<Integer, String> searchType) {

        return categoryDAO.searchBy(searchType);
    }
    
}
