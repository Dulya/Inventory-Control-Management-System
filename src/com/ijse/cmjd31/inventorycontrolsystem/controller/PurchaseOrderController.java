/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.cmjd31.inventorycontrolsystem.controller;

import com.ijse.cmjd31.inventorycontrolsystem.db.DBConnection;
import com.ijse.cmjd31.inventorycontrolsystem.model.PurchaseOrder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 1
 */
public class PurchaseOrderController {

    public static int addPurchaseOrder(PurchaseOrder order) throws SQLException, ClassNotFoundException {
        String sql = "insert into PurchaseOrder values(?,?,?,?,?,?,?)";
        Connection conn = DBConnection.getInstance().getConnection();
        conn.setAutoCommit(false);
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, order.getpOrderId());
            preparedStatement.setString(2, order.getPo_date());
            preparedStatement.setString(3, order.getPo_time());
            preparedStatement.setDouble(4, order.getTot_amount());
            preparedStatement.setString(5, order.getSupplierId());
            preparedStatement.setDouble(6, order.getBalance());
            preparedStatement.setString(7, order.getRecievedDate());
            int res1 = preparedStatement.executeUpdate();
            if (res1 > 0) {
                int res2 = PurchaseDetailController.addOrderDetail(order.getDetail());
                if (res2 > 0) {
                    conn.commit();
                    return 1;
                }
            }
            conn.rollback();
            return -1;
        } catch (SQLException ex) {
            conn.rollback();
            throw ex;
        } finally {
            conn.setAutoCommit(true);
        }
    }

    public static List<PurchaseOrder> getOrderByStartDate(String d) throws SQLException, ClassNotFoundException {
        String sql = "select * from PurchaseOrder where purchaseDate='" + d + "'";
        ResultSet rst = DBConnection.getInstance().getConnection().createStatement().executeQuery(sql);
        List<PurchaseOrder> orderList = new ArrayList<>();
        while (rst.next()) {
            PurchaseOrder order = new PurchaseOrder(rst.getString(1), rst.getString(5), rst.getString(2), rst.getString(3), rst.getDouble(4), rst.getDouble(6));
            orderList.add(order);
        }
        return orderList;
    }

    public static List<PurchaseOrder> getOrderByDateRange(String startDate, String endDate) throws SQLException, ClassNotFoundException {
        String sql = "select * from PurchaseOrder where purchaseDate between ? and ?";
        PreparedStatement preparedStatement = DBConnection.getInstance().getConnection().prepareStatement(sql);
        preparedStatement.setString(1, startDate);
        preparedStatement.setString(2, endDate);
        ResultSet rst = preparedStatement.executeQuery();
        List<PurchaseOrder> orderList = new ArrayList<>();
        while (rst.next()) {
            PurchaseOrder order = new PurchaseOrder(rst.getString(1), rst.getString(5), rst.getString(2), rst.getString(3), rst.getDouble(4), rst.getDouble(6));
            orderList.add(order);
        }
        return orderList;
    }

    public static List<PurchaseOrder> getOrderBySupplier(String supplierId) throws SQLException, ClassNotFoundException {
        String sql = "select * from PurchaseOrder where  Supplier_idSupplier='" + supplierId + "' and balance > 0";
        ResultSet rst = DBConnection.getInstance().getConnection().createStatement().executeQuery(sql);
        List<PurchaseOrder> orderList = new ArrayList<>();
        while (rst.next()) {
            PurchaseOrder order = new PurchaseOrder(rst.getString(1), rst.getString(5), rst.getString(2), rst.getString(3), rst.getDouble(4), rst.getDouble(6), rst.getString(7));
            orderList.add(order);
        }
        return orderList;
    }

    public static int updateBalance(double balance, String pOrderId) throws SQLException, ClassNotFoundException {
        String sql = "update PurchaseOrder set balance=? where idPurchaseOrder=?";
        PreparedStatement preparedStatement = DBConnection.getInstance().getConnection().prepareStatement(sql);
        preparedStatement.setDouble(1, balance);
        preparedStatement.setString(2, pOrderId);
        int res = preparedStatement.executeUpdate();
        return res;
    }

    public static int markRecievedDate(String date, String pOrderId) throws SQLException, ClassNotFoundException {
        String sql = "update PurchaseOrder set recievedDate=? where idPurchaseOrder=?";
        PreparedStatement preparedStatement = DBConnection.getInstance().getConnection().prepareStatement(sql);
        preparedStatement.setString(1, date);
        preparedStatement.setString(2, pOrderId);
        int res = preparedStatement.executeUpdate();
        return res;


    }

    public static List<PurchaseOrder> getMarkedOrderBySupplier(String supplierId) throws SQLException, ClassNotFoundException {
        String sql = "select * from PurchaseOrder where recievedDate!='" + null + "' and Supplier_idSupplier='" + supplierId + "'";
        ResultSet rst = DBConnection.getInstance().getConnection().createStatement().executeQuery(sql);
        List<PurchaseOrder> list = new ArrayList<>();
        while (rst.next()) {
            PurchaseOrder order = new PurchaseOrder(rst.getString(1), rst.getString(5), rst.getString(2), rst.getString(3), rst.getDouble(4), rst.getDouble(6), rst.getString(7));
            list.add(order);
        }
        return list;
    }

    public static boolean checkRecievedOrder(String id) throws SQLException, ClassNotFoundException {
        String sql = "select recievedDate from PurchaseOrder where idPurchaseOrder='" + id + "'";
        ResultSet rst = DBConnection.getInstance().getConnection().createStatement().executeQuery(sql);
        String date = null;
        while (rst.next()) {
            date = rst.getString(1);
        }
        if (date != null) {
            return true;
        } else {
            return false;
        }
    }

    public static List<PurchaseOrder> checkDebitMonth(int year, int i) {
        String sql = "select * from PurchaseOrder where balance>0 and year(recievedDate)='" + year + "' and month(recievedDate)='" + i + "'";
        ResultSet rst;
        List<PurchaseOrder> orderList = new ArrayList<>();
        try {
            rst = DBConnection.getInstance().getConnection().createStatement().executeQuery(sql);
            while (rst.next()) {
                PurchaseOrder order = new PurchaseOrder(rst.getString(1), rst.getString(5), rst.getString(2), rst.getString(3), rst.getDouble(4), rst.getDouble(6), rst.getString(7));
                orderList.add(order);
            }
        } catch (SQLException ex) {
            Logger.getLogger(InvoiceController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InvoiceController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return orderList;
    }

    public static List<PurchaseOrder> checkDebitYear(int year) {
        String sql = "select * from PurchaseOrder where balance>0 and year(recievedDate)='" + year + "' ";
        ResultSet rst;
        List<PurchaseOrder> orderList = new ArrayList<>();
        try {
            rst = DBConnection.getInstance().getConnection().createStatement().executeQuery(sql);
            while (rst.next()) {
                PurchaseOrder order = new PurchaseOrder(rst.getString(1), rst.getString(5), rst.getString(2), rst.getString(3), rst.getDouble(4), rst.getDouble(6), rst.getString(7));
                orderList.add(order);
            }
        } catch (SQLException ex) {
            Logger.getLogger(InvoiceController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InvoiceController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return orderList;
    }

    public static List<PurchaseOrder> checkPurchaseMonth(int year, int i) {
        String sql = "select * from PurchaseOrder where month(recievedDate)='" + i + "'  and year(recievedDate)='" + year + "'";
        ResultSet rst;
        List<PurchaseOrder> orderList = new ArrayList<>();
        try {
            rst = DBConnection.getInstance().getConnection().createStatement().executeQuery(sql);
            while (rst.next()) {
                PurchaseOrder order = new PurchaseOrder(rst.getString(1), rst.getString(5), rst.getString(2), rst.getString(3), rst.getDouble(4), rst.getDouble(6), rst.getString(7));
                orderList.add(order);
            }
        } catch (SQLException ex) {
            Logger.getLogger(InvoiceController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InvoiceController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return orderList;
    }

    public static List<PurchaseOrder> checkPurchaseYear(int year) {
        String sql = "select * from PurchaseOrder where  year(recievedDate)='" + year + "'";
        ResultSet rst;
        List<PurchaseOrder> orderList = new ArrayList<>();
        try {
            rst = DBConnection.getInstance().getConnection().createStatement().executeQuery(sql);
            while (rst.next()) {
                PurchaseOrder order = new PurchaseOrder(rst.getString(1), rst.getString(5), rst.getString(2), rst.getString(3), rst.getDouble(4), rst.getDouble(6), rst.getString(7));
                orderList.add(order);
            }
        } catch (SQLException ex) {
            Logger.getLogger(InvoiceController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InvoiceController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return orderList;
    }
}
