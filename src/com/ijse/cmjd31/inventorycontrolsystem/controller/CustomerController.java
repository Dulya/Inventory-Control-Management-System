/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.cmjd31.inventorycontrolsystem.controller;

import com.ijse.cmjd31.inventorycontrolsystem.db.DBConnection;
import com.ijse.cmjd31.inventorycontrolsystem.model.Customer;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 14
 */
/**
 *
 * @author 14
 */
/**
 *
 * @author 14
 */
public class CustomerController {

    public static int addCustomer(Customer customer) throws SQLException, ClassNotFoundException {
        String sql = "insert into Customer values(?,?,?,?,?,?)";
        PreparedStatement prepareStatement = DBConnection.getInstance().getConnection().prepareStatement(sql);
        prepareStatement.setString(1, customer.getCustId());
        prepareStatement.setString(2, customer.getCustName());
        prepareStatement.setString(3, customer.getAddress());
        prepareStatement.setInt(4, customer.getContact());
        prepareStatement.setString(5, customer.getNicNo());
        prepareStatement.setDouble(6, customer.getCreditLimit());
        int res = prepareStatement.executeUpdate();
        return res;
    }

    public static boolean duplicateCustomer(String name) throws SQLException, ClassNotFoundException {
        String sql = "select * from Customer where custName=('" + name + "') ";
        Statement stm = DBConnection.getInstance().getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        return rst.next();
    }

    public static Customer searchCustomer(String id) throws SQLException, ClassNotFoundException {
        String sql = "select * from Customer where idCustomer='" + id + "'";
        Statement stm = DBConnection.getInstance().getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        Customer customer = null;
        if (rst.next()) {
            customer = new Customer(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(5), rst.getInt(4), rst.getDouble(6));
        }
        return customer;
    }

    public static List<Customer> getAllCustomers() throws SQLException, ClassNotFoundException {
        String sql = "select * from Customer";
        Statement stm = DBConnection.getInstance().getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        List<Customer> customerList = new ArrayList<>();
        while (rst.next()) {
            String string = rst.getString(5);
            System.out.println(string);
            Customer customer = new Customer(rst.getString(1), rst.getString(2), rst.getString("custAddress"), rst.getString("nicNo"), rst.getInt(4), rst.getDouble(6));
            customerList.add(customer);
        }
        return customerList;
    }

    public static int updateCustomer(Customer customer) throws SQLException, ClassNotFoundException {
        String sql = "update Customer set idCustomer=? ,custName= ? ,custAddress= ?,contact=?,nicNo=? ,creditLimit=? where idCustomer='" + customer.getCustId() + "'  ";
        PreparedStatement prepareStatement = DBConnection.getInstance().getConnection().prepareStatement(sql);
        prepareStatement.setString(1, customer.getCustId());
        prepareStatement.setString(2, customer.getCustName());
        prepareStatement.setString(3, customer.getAddress());
        prepareStatement.setInt(4, customer.getContact());
        prepareStatement.setString(5, customer.getNicNo());
        prepareStatement.setDouble(6, customer.getCreditLimit());
        int res = prepareStatement.executeUpdate();
        return res;
    }

    public static int deleteCustomer(String id) throws SQLException, ClassNotFoundException {
        String sql = "delete from Customer where idCustomer='" + id + "'";
        Statement stm = DBConnection.getInstance().getConnection().createStatement();
        int res = stm.executeUpdate(sql);
        return res;
    }

    public static Customer getCustomerByCustId(String custId) throws SQLException, ClassNotFoundException {
        String sql = "select * from Customer where idCustomer='" + custId + "'";
        ResultSet rst = DBConnection.getInstance().getConnection().createStatement().executeQuery(sql);
        Customer customer = null;
        while (rst.next()) {
            customer = new Customer(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(5), rst.getInt(4), rst.getDouble(6));
        }
        return customer;
    }
}
