/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.security.bao;

/**
 *
 * @author moata
 */
public class SecurityBAOFactory {
    
    public static SecurityManageBAO creatBAOSucurety(){
        return new SecurityManageBAOImpl();
    }
    
}
