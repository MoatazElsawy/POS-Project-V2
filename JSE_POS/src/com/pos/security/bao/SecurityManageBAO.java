/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.security.bao;

import com.pos.security.dto.UserInfoDTO;

/**
 *
 * @author moata
 */
public interface SecurityManageBAO {
    
    public UserInfoDTO authanticateUser(String userN , String pass);
    
}
