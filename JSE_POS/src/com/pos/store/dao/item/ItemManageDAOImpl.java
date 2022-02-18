/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.store.dao.item;

import com.pos.dao.util.ConnectionFactory;
import com.pos.store.dto.CategoryDTO;
import com.pos.store.dto.ItemDTO;
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
public class ItemManageDAOImpl implements ItemManageDAO{
    
    //initializ resource bundel for connect to database with propertis file
    ResourceBundle bundle = ResourceBundle.getBundle("com.pos.dao.util.jdbc");

    
    @Override
    public List<ItemDTO> getItemsByCategNmae(String categName) {
        
        //creat query
        String query = "SELECT  i.ID , i.NAME_AR , i.NAME_EN ,  i.BAR_CODE , c.NAME_AR , c.NAME_EN\n" +
                       "    FROM pos.item i\n" +
                       "    inner join pos.category c on i.CATEGORY_ID= c.ID\n" +
                       "    where c.NAME_EN  = ? ";
        ItemDTO item = new ItemDTO();                    // new object from ItemDTO
        List<ItemDTO> itemLest = new ArrayList<>();      //array list of Item object to store data
        CategoryDTO c1 = new CategoryDTO();
        //try with resource with JdbcRowSet
        try(JdbcRowSet gRowSit = RowSetProvider.newFactory().createJdbcRowSet();
                ) {
            //set prameters to resource bundel
            gRowSit.setUrl(bundle.getString("url"));
            gRowSit.setUsername(bundle.getString("username"));
            gRowSit.setPassword(bundle.getString("password"));
            gRowSit.setCommand(query);
            gRowSit.setString(1,categName);
            gRowSit.execute();
            //add fields to array list
            itemLest.add(item);
            
//            
//           " BAR_CODE, NAME_ER, NAME_EN, DESCRIPTION, QTY, BUY_BRICE, SELL_PRICE,"
//                + " DISCOUNT, COST, LOGO, MIN_QTY, VENDOR, COLOR, SCAL, SIZE, MANUF_DATE, EXPER_DATE, CATEGORY_ID)
//            
//            while(jRowSet.next()){
//                item.setCode(jRowSet.getInt("ID"));
//                item.setBarCode(jRowSet.getString("BAR_CODE"));
//                item.setNameAr(jRowSet.getString("NAME_AR"));
//                item.setNameEn(jRowSet.getString("NAME_EN"));
//                item.setDescription(jRowSet.getString("DESCRIPTION"));
//                item.setQty(jRowSet.getFloat("QTY"));
//                item.setBuyPrice(jRowSet.getFloat("BUY_BRICE"));
//                item.setSellPrice(jRowSet.getFloat("SELL_PRICE"));
//                item.setDiscount(jRowSet.getFloat("DISCOUNT"));
//                item.setCost(jRowSet.getFloat("COST"));
//                item.setLogo(jRowSet.getString("LOGO"));
//                item.setMinQty(jRowSet.getFloat("MIN_QTY"));
//                item.setVendor(jRowSet.getInt("VENDOR"));
//                //item.setColor(jRowSet.getString(""));
//                item.setScale(jRowSet.getBoolean("SCAL"));
//                item.setSize(jRowSet.getInt("SIZE"));
//                item.setManufDate(jRowSet.getDate("MANUF_DATE"));
//                item.setExpireDate(jRowSet.getDate("EXPER_DATE"));
//                item.setCategoryCode(jRowSet.getInt("CATEGORY_ID"));
//                
//                System.out.println(item.getBarCode() + item.getDescription() + item.getLogo() + item.getNameAr()
//                + item.getNameEn() + item.getBuyPrice() + item.getCategoryCode() + item.getCode() + item.getCost()+ item.getColor()
//                + item.getCost() + item.getDiscount() + item.getExpireDate() + item.getManufDate() + item.getMinQty() + item.getQty()
//                + item.getQty() + item.getScale());
//                
//                
//            }


            //while loop to fetch data
            while(gRowSit.next()){
                item.setCode(gRowSit.getInt("i.ID"));
                item.setBarCode(gRowSit.getString("i.BAR_CODE"));
                item.setNameAr(gRowSit.getString("i.NAME_AR"));
                item.setNameEn(gRowSit.getString("i.NAME_EN"));
                
                c1.setNameAr(gRowSit.getString("c.NAME_AR"));
                c1.setNameEn(gRowSit.getString("c.NAME_EN"));
 
                itemLest.add(item);
            }

            //return result
             return itemLest;
            
        } catch (Exception e) {
            System.out.println("sql excep ! " + e);
            e.printStackTrace();
        }

            return null;
    }

    @Override
    public List<ItemDTO> getAll() {

        List<ItemDTO> itemList = new ArrayList<>();

        String query = " SELECT * FROM pos.item ";

        try (Connection conn = ConnectionFactory.creatConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                ItemDTO item = new ItemDTO();
                item.setCode(rs.getInt("ID"));
                item.setBarCode(rs.getString("BAR_CODE"));
                item.setNameAr(rs.getString("NAME_AR"));
                item.setNameEn(rs.getString("NAME_EN"));
                item.setDescription(rs.getString("DESCRIPTION"));
                item.setQty(rs.getFloat("QTY"));
                item.setBuyPrice(rs.getFloat("BUY_BRICE"));
                item.setSellPrice(rs.getFloat("SELL_PRICE"));
                item.setDiscount(rs.getFloat("DISCOUNT"));
                item.setCost(rs.getFloat("COST"));
                item.setLogo(rs.getString("LOGO"));
                item.setMinQty(rs.getFloat("MIN_QTY"));
                item.setVendor(rs.getInt("VENDOR"));
                item.setColor(rs.getString("COLOR"));
                item.setScale(rs.getBoolean("SCAL"));
                item.setSize(rs.getInt("SIZE"));
                item.setManufDate(rs.getDate("MANUF_DATE"));
                item.setExpireDate(rs.getDate("EXPER_DATE"));
                item.setCategoryCode(rs.getInt("CATEGORY_ID"));

                itemList.add(item);

//                System.out.println(" Item Id : =>" + item.getCode() + " Item Barcode : =>" + item.getBarCode() + " Item name_Ar : =>" + item.getNameAr()
//                        + " Item name_EN : =>" + item.getNameEn() + " Item Price : =>" + item.getBuyPrice() + " Item CategoryCode : =>" + item.getCategoryCode() + " Item Code : =>" + item.getCode()
//                        + " Item Cost : =>" + item.getCost() + " Item Color : =>" + item.getColor() + " Item name_EN : =>" + item.getCost()
//                        + " Item Discount : =>" + item.getDiscount() + " Item ExpireDate : =>" + item.getExpireDate() + " Item ManufDate : =>" + item.getManufDate()
//                        + " Item MinQty : =>" + item.getMinQty() + " Item Qty : =>" + item.getQty() + " Item Scale : =>" + item.getScale());

            }

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

        return itemList;
    }

 
    @Override
    public Integer save(ItemDTO theItem) {

        int res = -1;

        String sQuey = "INSERT INTO item  (BAR_CODE, NAME_AR, NAME_EN, DESCRIPTION, QTY, BUY_BRICE, SELL_PRICE,"
                + " DISCOUNT, COST, LOGO, MIN_QTY, VENDOR, COLOR, SCAL, SIZE, MANUF_DATE, EXPER_DATE, CATEGORY_ID) "
                + "VALUE (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ";

        try (Connection conn = ConnectionFactory.creatConnection();
                PreparedStatement pstmt = conn.prepareStatement(sQuey);) {

            // pstmt.setInt(1, theItem.getCode());
            if (theItem.getBarCode() != null) {
                pstmt.setString(1, theItem.getBarCode());   // tha's if statement to check if feild null or not
            } else {
                pstmt.setNull(1, java.sql.Types.NUMERIC);
            }
            
            if (theItem.getNameAr() != null) {
                pstmt.setString(2, theItem.getNameAr());   // tha's if statement to check if feild null or not
            } else {
                pstmt.setNull(2, java.sql.Types.NUMERIC);
            }
            
             if (theItem.getNameEn() != null) {
                pstmt.setString(3, theItem.getNameEn());   // tha's if statement to check if feild null or not
            } else {
                pstmt.setNull(3, java.sql.Types.NUMERIC);
            }
             
            if (theItem.getDescription() != null) {
                pstmt.setString(4, theItem.getDescription());   // tha's if statement to check if feild null or not
            } else {
                pstmt.setNull(4, java.sql.Types.NUMERIC);
            } 
            
            if (theItem.getQty() != null) {
                pstmt.setFloat(5, theItem.getQty());   // tha's if statement to check if feild null or not
            } else {
                pstmt.setNull(5, java.sql.Types.NUMERIC);
            } 
            
            if (theItem.getBuyPrice() != null) {
                pstmt.setFloat(6, theItem.getBuyPrice());   // tha's if statement to check if feild null or not
            } else {
                pstmt.setNull(6, java.sql.Types.NUMERIC);
            }
            
            if (theItem.getSellPrice() != null) {
                pstmt.setFloat(7, theItem.getSellPrice());   // tha's if statement to check if feild null or not
            } else {
                pstmt.setNull(7, java.sql.Types.NUMERIC);
            }
            
            if (theItem.getDiscount() != null) {
                pstmt.setFloat(8, theItem.getDiscount());   // tha's if statement to check if feild null or not
            } else {
                pstmt.setNull(8, java.sql.Types.NUMERIC);
            }
            
            if (theItem.getCost() != null) {
                pstmt.setFloat(9, theItem.getCost());   // tha's if statement to check if feild null or not
            } else {
                pstmt.setNull(9, java.sql.Types.NUMERIC);
            }
            
            if (theItem.getLogo() != null) {
                pstmt.setString(10, theItem.getLogo());   // tha's if statement to check if feild null or not
            } else {
                pstmt.setNull(10, java.sql.Types.NUMERIC);
            }
            
            if (theItem.getMinQty() != null) {
                pstmt.setFloat(11, theItem.getMinQty());   // tha's if statement to check if feild null or not
            } else {
                pstmt.setNull(11, java.sql.Types.NUMERIC);
            }
            
            if (theItem.getVendor() != null) {
                pstmt.setInt(12, theItem.getVendor());   // tha's if statement to check if feild null or not
            } else {
                pstmt.setNull(12, java.sql.Types.NUMERIC);
            }
            
            if (theItem.getColor() != null) {
                pstmt.setString(13, theItem.getColor());   // tha's if statement to check if feild null or not
            } else {
                pstmt.setNull(13, java.sql.Types.NUMERIC);
            }
            
            if (theItem.getScale() != null) {
                pstmt.setBoolean(14, theItem.getScale());   // tha's if statement to check if feild null or not
            } else {
                pstmt.setNull(14, java.sql.Types.NUMERIC);
            }
            
            if (theItem.getSize() != null) {
                pstmt.setInt(15, theItem.getSize());   // tha's if statement to check if feild null or not
            } else {
                pstmt.setNull(15, java.sql.Types.NUMERIC);
            }
            if (theItem.getManufDate() != null) {
                pstmt.setDate(16, (Date) theItem.getManufDate());   // tha's if statement to check if feild null or not
            } else {
                pstmt.setNull(16, java.sql.Types.NUMERIC);
            }
            if (theItem.getExpireDate() != null) {
                pstmt.setDate(17, (Date) theItem.getExpireDate());   // tha's if statement to check if feild null or not
            } else {
                pstmt.setNull(17, java.sql.Types.NUMERIC);
            }
            
            if (theItem.getCategoryCode() != null) {
                pstmt.setFloat(18, theItem.getCategoryCode());   // tha's if statement to check if feild null or not
            } else {
                pstmt.setNull(18, java.sql.Types.NUMERIC);
            }
            
           
            
            
//            pstmt.setString(2, theItem.getNameAr());
//            pstmt.setString(3, theItem.getNameEn());
//            pstmt.setString(4, theItem.getDescription());
//            pstmt.setFloat(5, theItem.getQty());
//            pstmt.setFloat(6, theItem.getBuyPrice());
//            pstmt.setFloat(7, theItem.getSellPrice());
//            pstmt.setFloat(8, theItem.getDiscount());
//            pstmt.setFloat(9, theItem.getCost());
//            pstmt.setString(10, theItem.getLogo());
//            pstmt.setFloat(11, theItem.getMinQty());
//            pstmt.setInt(12, theItem.getVendor());
//            pstmt.setObject(13, theItem.getColor());
//            pstmt.setBoolean(14, theItem.getScale());
//            pstmt.setInt(15, theItem.getSize());
//            pstmt.setDate(16, (Date) theItem.getManufDate());
//            pstmt.setDate(17, (Date) theItem.getExpireDate());
//            pstmt.setInt(18, theItem.getCategoryCode());

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
    public Boolean update(ItemDTO theItem) {
        boolean result = false;
        String updItemQ = "UPDATE pos.item\n" +
                        "SET\n" +
                        "BAR_CODE = ?,\n" +
                        "NAME_AR = ?,\n" +
                        "NAME_EN = ?,\n" +
                        "DESCRIPTION = ? ,\n" +
                        "QTY = ?,\n" +
                        "BUY_BRICE = ?,\n" +
                        "SELL_PRICE = ?,\n" +
                        "DISCOUNT = ?,\n" +
                        "COST = ? ,\n" +
                        "LOGO = ?,\n" +
                        "MIN_QTY = ? ,\n" +
                        "VENDOR = ? ,\n" +
                        //"COLOR = ?,\n" +
                        "SCAL = ?,\n" +
                        "SIZE = ?,\n" +
                        "MANUF_DATE = ? ,\n" +
                        "EXPER_DATE = ?,\n" +
                        "CATEGORY_ID = ?\n" +
                        "WHERE ID = ?";
        
//        try (JdbcRowSet jRowSet = RowSetProvider.newFactory().createJdbcRowSet();) {
//            jRowSet.setUrl(bundle.getString("url"));
//            jRowSet.setUsername(bundle.getString("username"));
//            jRowSet.setPassword(bundle.getString("password"));
//
//            jRowSet.setCommand(updItemQ);
//
//            jRowSet.setString(1, theItem.getBarCode());
//            jRowSet.setString(2, theItem.getNameAr());
//            jRowSet.setString(3, theItem.getNameEn());
//            jRowSet.setString(4, theItem.getDescription());
//            jRowSet.setFloat(5, theItem.getQty());
//            jRowSet.setFloat(6, theItem.getBuyPrice());
//            jRowSet.setFloat(7, theItem.getSellPrice());
//            jRowSet.setFloat(8, theItem.getDiscount());
//            jRowSet.setFloat(9, theItem.getCost());
//            jRowSet.setString(10, theItem.getLogo());
//            jRowSet.setFloat(11, theItem.getMinQty());
//            jRowSet.setInt(12, theItem.getVendor());
//            //jRowSet.setObject(13, theItem.getColor());
//            jRowSet.setBoolean(13, theItem.getScale());
//            jRowSet.setInt(14, theItem.getSize());
//            jRowSet.setDate(15, (Date) theItem.getManufDate());
//            jRowSet.setDate(16, (Date) theItem.getExpireDate());
//            jRowSet.setInt(17, theItem.getCategoryCode());
//            jRowSet.setInt(18, theItem.getCode());
//
//            jRowSet.execute();
//            result = true;
//            
//        } catch (SQLException ex) {
//             while (ex != null) {
//                System.out.println("SQLState:  " + ex.getSQLState());
//                System.out.println("Error Code:" + ex.getErrorCode());
//                System.out.println("Message:   " + ex.getMessage());
//                Throwable t = ex.getCause();
//                while (t != null) {
//                    System.out.println("Cause:" + t);
//                    t = t.getCause();
//                }
//                ex = ex.getNextException();
//            }
//        }



        try (Connection conn = ConnectionFactory.creatConnection();
                PreparedStatement pstmt = conn.prepareStatement(updItemQ);) {
    

            pstmt.setString(1, theItem.getBarCode());
            pstmt.setString(2, theItem.getNameAr());
            pstmt.setString(3, theItem.getNameEn());
            pstmt.setString(4, theItem.getDescription());
            pstmt.setFloat(5, theItem.getQty());
            pstmt.setFloat(6, theItem.getBuyPrice());
            pstmt.setFloat(7, theItem.getSellPrice());
            pstmt.setFloat(8, theItem.getDiscount());
            pstmt.setFloat(9, theItem.getCost());
            pstmt.setString(10, theItem.getLogo());
            pstmt.setFloat(11, theItem.getMinQty());
            pstmt.setInt(12, theItem.getVendor());
            //pstmt.setObject(13, theItem.getColor());
            pstmt.setBoolean(13, theItem.getScale());
            pstmt.setInt(14, theItem.getSize());
            pstmt.setDate(15, (Date) theItem.getManufDate());
            pstmt.setDate(16, (Date) theItem.getExpireDate());
            pstmt.setInt(17, theItem.getCategoryCode());
            pstmt.setInt(18, theItem.getCode());

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

        String delItemQ = "DELETE FROM pos.item WHERE ID = ?";
        
        try(Connection conn = ConnectionFactory.creatConnection();
                PreparedStatement pstmt = conn.prepareStatement(delItemQ);
                ) {
            
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
        
        
        return false ;
    }

    @Override
    public List<ItemDTO> searchBy(Integer type, String value) {
        
        List<ItemDTO> itemList = new ArrayList<>();
        ItemDTO item = new ItemDTO();
        
        String ByIdQuery = "SELECT *\n" +
                       "    FROM pos.item\n" +
                       "    where item.ID  = ? ";
        
        String ByNameQuery = "SELECT *\n" +
                       "    FROM pos.item\n" +
                       "    where item.NAME_EN = ? ";
        
        String ByBarCoudeQuery = "SELECT *\n" +
                       "    FROM pos.item\n" +
                       "    where item.BAR_CODE = ? ";
        

        
        try (JdbcRowSet jRowSet = RowSetProvider.newFactory().createJdbcRowSet();
                ){
            jRowSet.setUrl(bundle.getString("url"));
            jRowSet.setUsername(bundle.getString("username"));
            jRowSet.setPassword(bundle.getString("password"));
            
           switch (type) {
                case 1:
                    jRowSet.setCommand(ByIdQuery);
                    jRowSet.setInt(1, Integer.parseInt(value));
                    break;
                case 2:
                    jRowSet.setCommand(ByNameQuery);
                    jRowSet.setString(1, value);
                    break;
                case 3:
                    jRowSet.setCommand(ByBarCoudeQuery);
                    jRowSet.setString(1, value);
                    break;
                default:
                    System.out.println("invalid input");
                    break;
                    
            }
            
            jRowSet.execute();
            
            
                while (jRowSet.next()) {
                item.setCode(jRowSet.getInt("ID"));
                item.setBarCode(jRowSet.getString("BAR_CODE"));
                item.setNameAr(jRowSet.getString("NAME_AR"));
                item.setNameEn(jRowSet.getString("NAME_EN"));
                item.setDescription(jRowSet.getString("DESCRIPTION"));
                item.setQty(jRowSet.getFloat("QTY"));
                item.setBuyPrice(jRowSet.getFloat("BUY_BRICE"));
                item.setSellPrice(jRowSet.getFloat("SELL_PRICE"));
                item.setDiscount(jRowSet.getFloat("DISCOUNT"));
                item.setCost(jRowSet.getFloat("COST"));
                item.setLogo(jRowSet.getString("LOGO"));
                item.setMinQty(jRowSet.getFloat("MIN_QTY"));
                item.setVendor(jRowSet.getInt("VENDOR"));
                //item.setColor(jRows.getObject("VENDOR",Class.forName()));
                item.setScale(jRowSet.getBoolean("SCAL"));
                item.setSize(jRowSet.getInt("SIZE"));
                item.setManufDate(jRowSet.getDate("MANUF_DATE"));
                item.setExpireDate(jRowSet.getDate("EXPER_DATE"));
                item.setCategoryCode(jRowSet.getInt("CATEGORY_ID"));

                itemList.add(item);
                
                
//                System.out.println(" Item Id : =>" + item .getCode() +" Item Barcode : =>" + item.getBarCode() + " Item name_Ar : =>" +item.getNameAr()
//               + " Item name_EN : =>" + item.getNameEn() +  " Item Price : =>" + item.getBuyPrice() +  " Item CategoryCode : =>" + item.getCategoryCode() +  " Item Code : =>" + item.getCode()
//                        +  " Item Cost : =>" + item.getCost() +  " Item Color : =>" + item.getColor() +  " Item name_EN : =>" + item.getCost() 
//                        +  " Item Discount : =>" + item.getDiscount() + " Item ExpireDate : =>" + item.getExpireDate() +  " Item ManufDate : =>" + item.getManufDate() 
//                        +  " Item MinQty : =>" + item.getMinQty() +  " Item Qty : =>"  + item.getQty() + " Item Scale : =>" + item.getScale());

              
           }
            
            return itemList;
            
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
    public List<ItemDTO> searchBy(Map searchType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ItemDTO getByCOude(Integer code) {

        String ByCoudeQuery = "SELECT *\n" +
                       "    FROM pos.item\n" +
                       "    where item.ID  = ? ";
        ItemDTO item = new ItemDTO();
        try (JdbcRowSet jRows = RowSetProvider.newFactory().createJdbcRowSet();){
            
            jRows.setUrl(bundle.getString("url"));
            jRows.setUsername(bundle.getString("username"));
            jRows.setPassword(bundle.getString("password"));

            jRows.setCommand(ByCoudeQuery);
            jRows.setInt(1, code);
            jRows.execute();

           while (jRows.next()) {
                item.setCode(jRows.getInt("ID"));
                item.setBarCode(jRows.getString("BAR_CODE"));
                item.setNameAr(jRows.getString("NAME_AR"));
                item.setNameEn(jRows.getString("NAME_EN"));
                item.setDescription(jRows.getString("DESCRIPTION"));
                item.setQty(jRows.getFloat("QTY"));
                item.setBuyPrice(jRows.getFloat("BUY_BRICE"));
                item.setSellPrice(jRows.getFloat("SELL_PRICE"));
                item.setDiscount(jRows.getFloat("DISCOUNT"));
                item.setCost(jRows.getFloat("COST"));
                item.setLogo(jRows.getString("LOGO"));
                item.setMinQty(jRows.getFloat("MIN_QTY"));
                item.setVendor(jRows.getInt("VENDOR"));
                //item.setColor(jRows.getObject("VENDOR",Class.forName()));
                item.setScale(jRows.getBoolean("SCAL"));
                item.setSize(jRows.getInt("SIZE"));
                item.setManufDate(jRows.getDate("MANUF_DATE"));
                item.setExpireDate(jRows.getDate("EXPER_DATE"));
                item.setCategoryCode(jRows.getInt("CATEGORY_ID"));

                
                
//                System.out.println(" Item Id : =>" + item .getCode() +" Item Barcode : =>" + item.getBarCode() + " Item name_Ar : =>" +item.getNameAr()
//               + " Item name_EN : =>" + item.getNameEn() +  " Item Price : =>" + item.getBuyPrice() +  " Item CategoryCode : =>" + item.getCategoryCode() +  " Item Code : =>" + item.getCode()
//                        +  " Item Cost : =>" + item.getCost() +  " Item Color : =>" + item.getColor() +  " Item name_EN : =>" + item.getCost() 
//                        +  " Item Discount : =>" + item.getDiscount() + " Item ExpireDate : =>" + item.getExpireDate() +  " Item ManufDate : =>" + item.getManufDate() 
//                        +  " Item MinQty : =>" + item.getMinQty() +  " Item Qty : =>"  + item.getQty() + " Item Scale : =>" + item.getScale());

              
           }

        }  catch (SQLException ex) {
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
               
        return item ;
    }

    
    
}
