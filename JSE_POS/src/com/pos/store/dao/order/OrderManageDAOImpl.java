/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.store.dao.order;

import com.pos.dao.util.ConnectionFactory;
import com.pos.store.dto.OrderDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author moata
 */
public class OrderManageDAOImpl implements OrderManageDAO {

    @Override
    public List<OrderDTO> getAll() {
        //object of array list to store data
        List<OrderDTO> wareHouseList = new ArrayList<>();
        //creat query
        String query = " SELECT * FROM pos.order";
        //try with resource , creat and execute statement
        try (Connection conn = ConnectionFactory.creatConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query)) {
            //while loop to fitch data
            while (rs.next()) {
                OrderDTO order = new OrderDTO();

                order.setId(rs.getInt("ID"));
                order.setName(rs.getString("NAME"));
                order.setStatus(rs.getString("Status"));
                order.setComment(rs.getString("comment"));
                order.setOrderDate(rs.getTimestamp("ORDER_DATE"));
                order.setRequeredDate(rs.getDate("REQUERED_DATE"));
                order.setShippedDate(rs.getDate("SHIPPERED_DATE"));
                order.setPaymentId(rs.getInt("PAYMENT_ID"));
                order.setCleintId(rs.getInt("CLIENT_ID"));
                //add fields to array list
                wareHouseList.add(order);

            }
            //regurn result
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
    public OrderDTO getByCOude(Integer code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer save(OrderDTO t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean update(OrderDTO t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean delete(Integer code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<OrderDTO> searchBy(Integer type, String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<OrderDTO> searchBy(Map<Integer, String> searchType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
