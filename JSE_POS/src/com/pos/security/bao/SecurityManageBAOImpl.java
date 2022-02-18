/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.security.bao;

import com.pos.common.Dao.POS_DAOException;
import com.pos.security.dao.SecurityDAOFactory;
import com.pos.security.dao.SecurityManageDAO;
import com.pos.security.dto.UserInfoDTO;

/**
 *
 * @author moata
 */
public class SecurityManageBAOImpl implements SecurityManageBAO{

    SecurityManageDAO securirtDAO =  SecurityDAOFactory.creatDAOsecurity();
    
    @Override
    public UserInfoDTO authanticateUser(String userN, String pass) {
       return  securirtDAO.authanticateUser(userN, pass);
       
    }
    
}
