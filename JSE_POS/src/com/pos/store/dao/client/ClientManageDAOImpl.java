/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.store.dao.client;

import com.pos.common.Dao.POS_G_DaoInf;
import com.pos.dao.util.ConnectionFactory;
import com.pos.store.dto.ClientDTO;
import com.pos.store.dto.ClientHasOrder;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

/**
 *
 * @author moata
 */
public class ClientManageDAOImpl implements ClientManageDAO{
    
     ResourceBundle bundle = ResourceBundle.getBundle("com.pos.dao.util.jdbc");

    @Override
    public List<ClientDTO> getAll() {
        
        ClientDTO client = new ClientDTO();
        List<ClientDTO> clientList = new ArrayList<>();
        //ClientHasOrder clHasOr = new ClientHasOrder();
        
        String getAllQ = "SELECT * FROM pos.client";
        try(    Connection conn = ConnectionFactory.creatConnection();
                Statement stmt = conn.createStatement();
                ResultSet res = stmt.executeQuery(getAllQ);
                ) {
            
            while(res.next()){
                client.setId(res.getInt("ID"));
                client.setfName(res.getString("F_NAME"));
                client.setlName(res.getString("L_NAME"));
                client.setEmail(res.getString("EMAIL"));
                client.setCompanyaddress("ADDRESS");
                client.setMobilePhone(res.getString("M_PHONE"));
                client.setFax(res.getString("FAX"));
                client.setCompanyName(res.getString("COMPANY_NAME"));
                client.setOfficePhone(res.getString("OFFICE_PHONE"));
                //clHasOr.setClientId(res.getInt("ID"));
                        
                clientList.add(client);
                
                 System.out.println(" client Id : =>" + client .getId() +" client fname : =>" + client.getfName() + " client lname : =>" +client.getlName()
               + " client email : =>" + client.getEmail() +  " Iclient address : =>" + client.getCompanyaddress() +  " client m phone : =>" 
                     + client.getMobilePhone() +  " client fax : =>" + client.getFax() );
            }
            
            
            
            
            
            return clientList;
            
            
        } catch (SQLException ex) {
            while (ex != null) {
                System.out.println("SQLState:  " + ex.getSQLState());
                System.out.println("Error Code:" + ex.getErrorCode());
                System.out.println("Message:   " + ex.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause:" + t);
                    t = t.getCause();
                }
                ex = ex.getNextException();
            }
        }
        
         return null;   
    }

    @Override
    public ClientDTO getByCOude(Integer code) {



 String ByCoudeQuery = "SELECT *\n"
                + "    FROM pos.client\n"
                + "    where client.ID  = ? ";
        ClientDTO client = new ClientDTO();
        try (JdbcRowSet jRows = RowSetProvider.newFactory().createJdbcRowSet();) {

            jRows.setUrl(bundle.getString("url"));
            jRows.setUsername(bundle.getString("username"));
            jRows.setPassword(bundle.getString("password"));

            jRows.setCommand(ByCoudeQuery);
            jRows.setInt(1, code);
            jRows.execute();

            while (jRows.next()) {
                client.setId(jRows.getInt("ID"));
                client.setfName(jRows.getString("F_NAME"));
                client.setlName(jRows.getString("L_NAME"));
                client.setEmail(jRows.getString("EMAIL"));
                client.setCompanyaddress("ADDRESS");
                client.setMobilePhone(jRows.getString("M_PHONE"));
                client.setFax(jRows.getString("FAX"));
                client.setCompanyName(jRows.getString("COMPANY_NAME"));
                client.setOfficePhone(jRows.getString("OFFICE_PHONE"));
                
                
                System.out.println(" client Id : =>" + client .getId() +" client fname : =>" + client.getfName() + " client lname : =>" +client.getlName()
               + " client email : =>" + client.getEmail() +  " Iclient address : =>" + client.getCompanyaddress() +  " client m phone : =>" 
                     + client.getMobilePhone() +  " client fax : =>" + client.getFax() );
            }
            
            return client;

        } catch (SQLException ex) {
            while (ex != null) {
                System.out.println("SQLState:  " + ex.getSQLState());
                System.out.println("Error Code:" + ex.getErrorCode());
                System.out.println("Message:   " + ex.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause:" + t);
                    t = t.getCause();
                }
                ex = ex.getNextException();
            }
        }


        return null;
    }

    @Override
    public Integer save(ClientDTO theClient) {

        int res = -1;

        String sQuey = "INSERT INTO client(F_NAME, L_NAME, EMAIL, M_PHONE, OFFICE_PHONE, FAX,"+
                       " COMPANY_NAME, COMPANY_ADDRESS) "+
                       "VALUE (?,?,?,?,?,?,?,?) ";

        try (Connection conn = ConnectionFactory.creatConnection();
                PreparedStatement pstmt = conn.prepareStatement(sQuey);) {

            //pstmt.setInt(1, theClient.getId());
            pstmt.setString(1, theClient.getfName());
            pstmt.setString(2, theClient.getlName());
            pstmt.setString(3, theClient.getEmail());
            pstmt.setString(4, theClient.getMobilePhone());
            pstmt.setString(5, theClient.getOfficePhone());
            pstmt.setString(6, theClient.getFax());
            pstmt.setString(7, theClient.getCompanyName());
            pstmt.setString(8, theClient.getCompanyaddress());
           
            

            res = pstmt.executeUpdate();

        } catch (SQLException ex) {
            while (ex != null) {
                System.out.println("SQLState:  " + ex.getSQLState());
                System.out.println("Error Code:" + ex.getErrorCode());
                System.out.println("Message:   " + ex.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause:" + t);
                    t = t.getCause();
                }
                ex = ex.getNextException();
            }
        }

        return res;

    }

    @Override
    public Boolean update(ClientDTO theClient) {

        boolean result = false;
        String updClientQ = "UPDATE pos.client\n" +
                        "SET\n" +
                        "F_NAME = ?,\n" +
                        "L_NAME = ?,\n" +
                        "EMAIL = ? ,\n" +
                        "M_PHONE = ?,\n" +
                        "OFFICE_PHONE = ?,\n" +
                        "FAX = ?,\n" +
                        "COMPANY_NAME = ?,\n" +
                        "COMPANY_ADDRESS = ?\n" +
                        "WHERE client.ID = ?";
  
        try (Connection conn = ConnectionFactory.creatConnection();
                PreparedStatement pstmt = conn.prepareStatement(updClientQ);) {
   
            
            
            pstmt.setString(1, theClient.getfName());
            pstmt.setString(2, theClient.getlName());
            pstmt.setString(3, theClient.getEmail());
            pstmt.setString(4, theClient.getMobilePhone());
            pstmt.setString(5, theClient.getOfficePhone());
            pstmt.setString(6, theClient.getFax());
            pstmt.setString(7, theClient.getCompanyName());
            pstmt.setString(8, theClient.getCompanyaddress());
            pstmt.setInt(9, theClient.getId());

            

            return pstmt.execute();
            
        } catch (SQLException ex) {
             while (ex != null) {
                System.out.println("SQLState:  " + ex.getSQLState());
                System.out.println("Error Code:" + ex.getErrorCode());
                System.out.println("Message:   " + ex.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause:" + t);
                    t = t.getCause();
                }
                ex = ex.getNextException();
            }
        }

        return result;

    }

    @Override
    public Boolean delete(Integer code) {

        String delClient = "DELETE FROM pos.client WHERE ID = ?";

        try (Connection conn = ConnectionFactory.creatConnection();
                PreparedStatement pstmt = conn.prepareStatement(delClient);) {

            pstmt.setInt(1, code);
            return pstmt.execute();
        } catch (SQLException ex) {
            while (ex != null) {
                System.out.println("SQLState:  " + ex.getSQLState());
                System.out.println("Error Code:" + ex.getErrorCode());
                System.out.println("Message:   " + ex.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause:" + t);
                    t = t.getCause();
                }
                ex = ex.getNextException();
            }
        }

        return false;

    }

    @Override
    public List<ClientDTO> searchBy(Integer type, String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ClientDTO> searchBy(Map<Integer, String> searchType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
