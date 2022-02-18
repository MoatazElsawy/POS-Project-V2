/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.security.dao;

import com.pos.common.Dao.POS_DAOException;
import com.pos.security.dto.UserInfoDTO;

/**
 *
 * @author moata
 */
public interface SecurityManageDAO {
    
    public UserInfoDTO authanticateUser(String userN , String pass) /*throws POS_DAOException */ ;
    
   
    
    
}
