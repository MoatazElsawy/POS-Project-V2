/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.store.dao.category;

import com.pos.dao.util.ConnectionFactory;
import com.pos.store.dto.CategoryDTO;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
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
 * @author moataz
 *  
 * I'm use Java Database Connectivity (JDBC) for connecting to relational
   databases from Java.
   1. Register JDBC driver.
   2. Obtain a connection.
   3. Create statement object.
   4. Execute SQL statement.
   *****
   The Statement interface provides three methods to
   execute SQL statements:
   executeQuery(String q)for SELECT statements and returns a ResultSet object for processing rows
   executeUpdate(String q) for DML or DDL and returns an integer
   execute(String) for any SQL statement and returns a boolean value
   *****
   Handling Exceptions(Use standard Java error handling methods).
   ****
   PreparedStatement is a subclass of Statement that allows you 
   to pass arguments to a precompiled SQL statement.  
   *****
   CallableStatement allows non-SQL statements (such as stored procedures) to be executed against the database.
   
   * 
 */
public class CategoryManageDAOImpl implements CategoryManageDAO{
    
 
    
    
    @Override
    public List<CategoryDTO> getAll() {
        
        
        List<CategoryDTO> categoryList = new ArrayList<>();
        
        String query = " SELECT * FROM pos.category " ;
        
        try ( Connection conn = ConnectionFactory.creatConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query)
                ){
            
            while(rs.next()){
                CategoryDTO categoryObj = new CategoryDTO();
                categoryObj.setId(rs.getInt("ID")); 
                categoryObj.setNameAr(rs.getString("NAME_AR"));
                categoryObj.setNameEn(rs.getString("NAME_EN"));
                categoryObj.setDescription(rs.getString("DISCRIPTION"));
                categoryObj.setDiscount(rs.getFloat("DISCOUNT"));
                categoryObj.setPrinterAddress(rs.getString("PRINTER_ADDRESS"));
                categoryObj.setBar_code(rs.getString("BAR_CODE"));
                //categoryObj.setParentCategortCode(rs.getInt("PARENT_CATEGORY"));
                
                categoryList.add(categoryObj);
                
            
            }
            
            
        return categoryList;
            
        } catch (SQLException ex) {
            
            ex.printStackTrace();
            
        }
  
     
        return null;
        
    }
    
    
    @Override
    public CategoryDTO getByCOude(Integer code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer save(CategoryDTO theCategoryDTO) {

        /*
        int result = -1;
          
        String query =  "INSERT INTO CATEGORY (NAME_AR , NAME_EN , DISCRIPTION ,"+
                         "DISCOUNT , PRINTER_ADDRESS , BAR_CODE, PARENT_CATEGORY) " +
                         "VALUES (?, ? ,?, ?, ?, ?, ?)" ;
         
        try (Connection conn = DriverManager.getConnection(url, username, password);
                PreparedStatement prstmt = conn.prepareStatement(query);
        ){
          
            prstmt.setString(1, theCategoryDTO.getNameAr());
            prstmt.setString(2, theCategoryDTO.getNameEn());
            prstmt.setString(3, theCategoryDTO.getDescription());
            prstmt.setFloat(4, theCategoryDTO.getDiscount());
            prstmt.setString(5, theCategoryDTO.getPrinterAddress());
            prstmt.setInt(6, theCategoryDTO.getBar_code());
            prstmt.setInt(1, theCategoryDTO.getParentCategortCode());

            result = prstmt.executeUpdate(query);
            
        } catch (SQLException ex) {
            while(ex != null){
                System.out.println("SQL state " + ex.getSQLState());
                System.out.println("Error Code " + ex.getErrorCode());
                System.out.println("Massage " + ex.getMessage());
                
                Throwable t = ex.getCause();
                while(t != null){
                    System.out.println("Case : "  + t);
                    t = t.getCause();
                }
            
            }

        }
        
        
        
        
        
        
        return result;
                
*/
        Integer result = -1;
        //query
        String dmlStat = "INSERT INTO CATEGORY (BAR_CODE,NAME_AR, NAME_EN,DISCRIPTION" +
                         ",DISCOUNT, PRINTER_ADDRESS) "
                         + "VALUES(?,?,?,?,?,?)";
        //try with resouce to close
        try (  Connection con = ConnectionFactory.creatConnection();
                PreparedStatement stmt = con.prepareStatement(dmlStat);
                ){
            
            //set avlues from modle to database
            if(theCategoryDTO.getBar_code() != null){
            stmt.setString(1, theCategoryDTO.getBar_code());   // tha's if statement to check if feild null or not
            }else{
                stmt.setNull(1, java.sql.Types.NUMERIC);
            }
            
            stmt.setString(2, theCategoryDTO.getNameAr());
            stmt.setString(3, theCategoryDTO.getNameEn());
            stmt.setString(4, theCategoryDTO.getDescription());
            //stmt.setInt(5, theCategoryDTO.getParentCategortCode());
            stmt.setFloat(5, theCategoryDTO.getDiscount());
            stmt.setString(6, theCategoryDTO.getPrinterAddress());
           
            result = stmt.executeUpdate();
            
           
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
    public Boolean update(CategoryDTO theCategoryDTO) {
        
        String updQuery = "UPDATE CATEGORY SET NAME_AR = ? , NAME_EN = ? , DISCRIPTION = ? , DISCOUNT = ? , PRINTER_ADDRESS = ? ,"
                        + " BAR_CODE = ?  WHERE ID = ?" ;
        
        try ( Connection con = ConnectionFactory.creatConnection();
              PreparedStatement dmlstmt = con.prepareStatement(updQuery)
                ){
            dmlstmt.setString(1, theCategoryDTO.getNameAr());
            dmlstmt.setString(2, theCategoryDTO.getNameEn());
            dmlstmt.setString(3, theCategoryDTO.getDescription());
            dmlstmt.setFloat(4, theCategoryDTO.getDiscount());
            dmlstmt.setString(5, theCategoryDTO.getPrinterAddress());
            dmlstmt.setString(6, theCategoryDTO.getBar_code());
            dmlstmt.setInt(7, theCategoryDTO.getId());
            
            
//            
//            if(theCategoryDTO.getNameAr().equals("")){
//                dmlstmt.setString(1,updQuery);
//                
//            }else{
//                    dmlstmt.setString(1, theCategoryDTO.getNameAr());
//                }
//            if(theCategoryDTO.getNameEn().equals("")){
//            }else{
//                dmlstmt.setString(2, theCategoryDTO.getNameEn());
//            }
//            if(theCategoryDTO.getDescription().equals("")){
//            }else{
//                dmlstmt.setString(3, theCategoryDTO.getDescription());
//            }
//            if(theCategoryDTO.getDiscount().equals("")){
//            }else{
//                dmlstmt.setFloat(4, theCategoryDTO.getDiscount());
//            }
//            if(theCategoryDTO.getPrinterAddress().equals("")){
//            }else{
//                dmlstmt.setString(5, theCategoryDTO.getPrinterAddress());
//            }
//            if(theCategoryDTO.getBar_code().equals("")){
//            }else{
//                dmlstmt.setString(6, theCategoryDTO.getBar_code());
//            }
//            
//            dmlstmt.setInt(7, theCategoryDTO.getId());
//            
//            
            
            
            return dmlstmt.execute();
            
        } catch (SQLException ex) {
            System.out.println("SQL Exception : " + ex);
            ex.printStackTrace();
        }

        return false;
    }

    @Override
    public Boolean delete(Integer code) {


 String deleteWareHouseQ = "DELETE FROM pos.category WHERE ID = ?";

        try (Connection conn = ConnectionFactory.creatConnection();
                PreparedStatement pstmt = conn.prepareStatement(deleteWareHouseQ);) {

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
    public List<CategoryDTO> searchBy(Integer type, String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CategoryDTO> searchBy(Map<Integer, String> searchType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
