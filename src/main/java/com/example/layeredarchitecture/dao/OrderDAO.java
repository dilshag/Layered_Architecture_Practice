package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.OrderDTO;

import java.sql.*;
import java.time.LocalDate;

public interface OrderDAO {
    public String generateNewOrderId() throws SQLException, ClassNotFoundException ;


    public boolean existOrderId(String orderId) throws SQLException, ClassNotFoundException;


    public int saveOrder(String orderId, LocalDate orderDate, String customerId) throws SQLException, ClassNotFoundException ;

}
