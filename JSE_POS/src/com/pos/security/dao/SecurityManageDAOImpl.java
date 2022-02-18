/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.security.dao;

import com.pos.common.Dao.POS_DAOException;
import com.pos.dao.util.ConnectionFactory;
import com.pos.security.dto.UserInfoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author moata
 */
public class SecurityManageDAOImpl implements SecurityManageDAO /*throws POS_DAOException*/{

    @Override
    public UserInfoDTO authanticateUser(String userN , String pass)/*throws POS_DAOException */{
        
        UserInfoDTO user = new UserInfoDTO();
        String query = "SELECT id , user_name , password , full_name , phone "
                + " FROM user "
                + "WHERE user_name = ? AND password = ? ";

        try ( Connection conn = ConnectionFactory.creatConnection();
                PreparedStatement pstmt = conn.prepareStatement(query);
                ){
            
         
            pstmt.setString(1,userN);
            pstmt.setString(2,pass);
            
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                user.setId(rs.getInt("id"));
                user.setUserName(rs.getString("user_name"));
                user.setPassword(rs.getString("password"));
                user.setFullNmae(rs.getString("full_name"));
                user.setPhone(rs.getString("phone"));
                
                System.out.println(user.getId()+ user.getUserName() + user.getPassword() + user.getFullNmae() + user.getPhone());
            }
            
            
        } catch (Exception e) {
            System.out.println("SQL Execep" + e);
            e.printStackTrace();
        }
        
        return user ;
    }

   
    
}
