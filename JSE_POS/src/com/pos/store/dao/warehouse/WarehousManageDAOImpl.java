/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.store.dao.warehouse;

import com.pos.dao.util.ConnectionFactory;
import com.pos.store.dto.WareHouseDTO;
import java.sql.Connection;
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
 */
public class WarehousManageDAOImpl implements WarehousManageDAO {

    ResourceBundle bundle = ResourceBundle.getBundle("com.pos.dao.util.jdbc");

    @Override
    public List<WareHouseDTO> getAll() {

//        String allWareHouseQuery = "SELECT * FROM pos.warehouse";
//        WareHouseDTO wareHous = new WareHouseDTO();
//        List<WareHouseDTO> wareHousList = new ArrayList<>();
//
//        try (JdbcRowSet jRowSet = RowSetProvider.newFactory().createJdbcRowSet();) {
//
//            jRowSet.setUrl(bundle.getString("url"));
//            jRowSet.setUsername(bundle.getString("username"));
//            jRowSet.setPassword(bundle.getString("password"));
//
//            jRowSet.setCommand(allWareHouseQuery);
//            jRowSet.execute();
//            while (jRowSet.next()) {
//                wareHous.setCode(jRowSet.getInt("ID"));
//                wareHous.setName(jRowSet.getString("NAME"));
//                wareHous.setAddress(jRowSet.getString("ADDRESS"));
//                wareHous.setPhone(jRowSet.getString("PHONE"));
//                wareHous.setFax(jRowSet.getString("FAX"));
//                wareHous.setImge(jRowSet.getInt("IMAGE"));
//
//                wareHousList.add(wareHous);
//
//                System.out.println(" wareHous Id : =>" + wareHous.getCode() + " Item name : =>" + wareHous.getName() + " Item addree : =>" + wareHous.getAddress()
//                        + " wareHouse phone : =>" + wareHous.getPhone() + " wareHouse fax : =>" + wareHous.getFax() + " wareHouse image : =>" + wareHous.getImge());
//
//            }
//
//            return wareHousList;
        //creat List of DTO to store data
        List<WareHouseDTO> wareHouseList = new ArrayList<>();
        //craet select Query
        String query = " SELECT * FROM pos.warehouse";
        //try with resouece
        try (Connection conn = ConnectionFactory.creatConnection();
                Statement stmt = conn.createStatement(); //creat staement 
                ResultSet rs = stmt.executeQuery(query)) {    //executeQuery statement and store in result set

            // while looop fetch data from database 
            while (rs.next()) {
                WareHouseDTO wareHous = new WareHouseDTO();

                wareHous.setCode(rs.getInt("ID"));
                wareHous.setName(rs.getString("NAME"));
                wareHous.setAddress(rs.getString("ADDRESS"));
                wareHous.setPhone(rs.getString("PHONE"));
                wareHous.setFax(rs.getString("FAX"));
                wareHous.setImge(rs.getInt("IMAGE"));
                //add fiekds into array list
                wareHouseList.add(wareHous);

            }
            //return results
            return wareHouseList;

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
    public WareHouseDTO getByCOude(Integer code) {
        //creat query with where calculus
        String ByCoudeQuery = "SELECT *\n"
                + "    FROM pos.warehouse\n"
                + "    where warehouse.ID  = ? ";
        WareHouseDTO wareHouse = new WareHouseDTO();
        //try with resource
        try (JdbcRowSet jRows = RowSetProvider.newFactory().createJdbcRowSet();) {
            //set resourceBundle requerment 
            jRows.setUrl(bundle.getString("url"));
            jRows.setUsername(bundle.getString("username"));
            jRows.setPassword(bundle.getString("password"));

            jRows.setCommand(ByCoudeQuery);     //set quert
            jRows.setInt(1, code);              //set prameter
            jRows.execute();                    //executeQuery 

            // while looop fetch data from database 
            while (jRows.next()) {
                wareHouse.setCode(jRows.getInt("ID"));
                wareHouse.setName(jRows.getString("NAME"));
                wareHouse.setAddress(jRows.getString("ADDRESS"));
                wareHouse.setPhone(jRows.getString("PHONE"));
                wareHouse.setFax(jRows.getString("FAX"));
                wareHouse.setImge(jRows.getInt("IMAGE"));
            }
            //return result
            return wareHouse;

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
    public Integer save(WareHouseDTO theWarehouse) {

        int res = -1;
        //creat query
        String sQuey = "INSERT INTO pos.warehouse\n"
                + "( NAME , ADDRESS , PHONE , FAX , IMAGE)\n"
                + "VALUES\n"
                + "(?,?,?,?,?);";
        //tryy with resource and executeQuery 
        try (Connection conn = ConnectionFactory.creatConnection();
                PreparedStatement pstmt = conn.prepareStatement(sQuey);) {

            //if statement to check if feild null or not and save value into database
            if (theWarehouse.getName() != null) {
                pstmt.setString(1, theWarehouse.getName());  // tha's if statement to check if feild null or not
            } else {
                pstmt.setNull(1, java.sql.Types.NUMERIC);
            }

            if (theWarehouse.getAddress() != null) {
                pstmt.setString(2, theWarehouse.getAddress());  // tha's if statement to check if feild null or not
            } else {
                pstmt.setNull(2, java.sql.Types.NUMERIC);
            }

            if (theWarehouse.getPhone() != null) {
                pstmt.setString(3, theWarehouse.getPhone());  // tha's if statement to check if feild null or not
            } else {
                pstmt.setNull(3, java.sql.Types.NUMERIC);
            }

            if (theWarehouse.getFax() != null) {
                pstmt.setString(4, theWarehouse.getFax());  // tha's if statement to check if feild null or not
            } else {
                pstmt.setNull(4, java.sql.Types.NUMERIC);
            }

            if (theWarehouse.getImge() != null) {
                pstmt.setInt(5, theWarehouse.getImge());  // tha's if statement to check if feild null or not
            } else {
                pstmt.setNull(5, java.sql.Types.NUMERIC);
            }

            res = pstmt.executeUpdate();
            if (theWarehouse.getCode() == null) {
                System.out.println("nullll");
            }
        //return result    
        return res;    

        } catch (SQLException ex) {
            while (ex != null) {
                System.out.println("SQLState:  " + ex.getSQLState());
                System.out.println("Error Code:" + ex.getErrorCode());
                System.out.println("Message:   " + ex.getMessage());
                Throwable th = ex.getCause();
                while (th != null) {
                    System.out.println("Cause:" + th);
                    th = th.getCause();
                }
                ex = ex.getNextException();
            }
        }

        return null;

    }

    @Override
    public Boolean update(WareHouseDTO theWarehouse) {
        //crest query
        String updWereHouseQ = "UPDATE pos.warehouse\n"
                + "SET\n"
                + "NAME = ?,\n"
                + "ADDRESS = ?,\n"
                + "PHONE = ?,\n"
                + "FAX = ? ,\n"
                + "IMAGE = ?\n"
                + "WHERE ID = ?";
        //try with resource and executeQuery 
        try (Connection conn = ConnectionFactory.creatConnection();
                PreparedStatement pstmt = conn.prepareStatement(updWereHouseQ);) {
            //set prameters into variables
            pstmt.setString(1, theWarehouse.getName());
            pstmt.setString(2, theWarehouse.getAddress());
            pstmt.setString(3, theWarehouse.getPhone());
            pstmt.setString(4, theWarehouse.getFax());
            // pstmt.setInt(5, theWarehouse.getImge());

            if (theWarehouse.getImge() != null) {
                pstmt.setInt(5, theWarehouse.getImge());  // tha's if statement to check if feild null or not
            } else {
                pstmt.setNull(5, java.sql.Types.NUMERIC);
            }

            pstmt.setInt(6, theWarehouse.getCode());

            return pstmt.execute();

        } catch (SQLException ex) {
            while (ex != null) {
                System.out.println("SQLState:  " + ex.getSQLState());
                System.out.println("Error Code:" + ex.getErrorCode());
                System.out.println("Message:   " + ex.getMessage());
                Throwable th = ex.getCause();
                while (th != null) {
                    System.out.println("Cause:" + th);
                    th = th.getCause();
                }
                ex = ex.getNextException();
            }
        }

        return false;
    }

    @Override
    public Boolean delete(Integer code) {
        //craet query
        String deleteWareHouseQ = "DELETE FROM pos.warehouse WHERE ID = ?";
        //try with resource and executeQuery 
        try (Connection conn = ConnectionFactory.creatConnection();
                PreparedStatement pstmt = conn.prepareStatement(deleteWareHouseQ);) {
            //set prameters
            pstmt.setInt(1, code);
            //return result
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
    public List<WareHouseDTO> searchBy(Integer type, String value) {
        String dmlStat;

        WareHouseDTO c1 = new WareHouseDTO();
        List<WareHouseDTO> cats = new ArrayList<>();
        //switch case to check witch value is?
        switch (type) {
            case 1:
                dmlStat = "SELECT * FROM pos.warehouse WHERE ID = ?";
                break;
            case 2:
                dmlStat = "SELECT * FROM pos.warehouse WHERE NAME = ?";
                break;
            default:
                dmlStat = "SELECT * FROM pos.warehouse WHERE ADDRESS = ?";
                break;
        }
        //try with resouce and execute Query  
        try (Connection con = ConnectionFactory.creatConnection();
                PreparedStatement stmt = con.prepareStatement(dmlStat)) {
            stmt.setString(1, value);
            ResultSet rset = stmt.executeQuery();
            //while loop to fetch data
            while (rset.next()) {

                c1.setCode(rset.getInt("ID"));
                c1.setName(rset.getString("NAME"));
                c1.setAddress(rset.getString("ADDRESS"));
                c1.setPhone(rset.getString("PHONE"));
                c1.setFax(rset.getString("FAX"));
                c1.setImge(rset.getInt("IMAGE"));
                cats.add(c1);
            }
            //return result
            return cats;
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
    public List<WareHouseDTO> searchBy(Map<Integer, String> searchType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
