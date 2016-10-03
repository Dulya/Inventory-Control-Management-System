/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.cmjd31.inventorycontrolsystem.controller;

import com.ijse.cmjd31.inventorycontrolsystem.db.DBConnection;
import com.ijse.cmjd31.inventorycontrolsystem.model.Invoice;
import com.ijse.cmjd31.inventorycontrolsystem.model.PurchaseReturns;
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
public class PurchaseReturnController {

    public static int addPurchaseReturn(PurchaseReturns purchaseReturns) throws SQLException, ClassNotFoundException {
        String sql = "insert into PurchaseReturn values(?,?,?,?,?,?)";
        Connection conn = DBConnection.getInstance().getConnection();
        conn.setAutoCommit(false);
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, purchaseReturns.getReturnId());
            preparedStatement.setString(2, purchaseReturns.getReturnedDate());
            preparedStatement.setString(3, purchaseReturns.getSupplierId());
            preparedStatement.setDouble(4, purchaseReturns.getReturnAmount());
            preparedStatement.setDouble(4, purchaseReturns.getReturnAmount());
            preparedStatement.setDouble(5, purchaseReturns.getRefundAmount());
            preparedStatement.setString(6, purchaseReturns.getOrderId());
            int res = preparedStatement.executeUpdate();
            if (res > 0) {
                int res2 = PurchaseReturnDetailController.addReturnDetail(purchaseReturns.getList());
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

    public static double getRefundAmount(String id) throws SQLException, ClassNotFoundException {
        String sql = "select refundAmount from PurchaseReturn where orderId='" + id + "'";
        ResultSet rst = DBConnection.getInstance().getConnection().createStatement().executeQuery(sql);
        double refundAmount = 0;
        while (rst.next()) {
            refundAmount = rst.getDouble(1);
        }
        return refundAmount;
    }

    public static int updateRefundAmount(double refundAmount, String id) throws SQLException, ClassNotFoundException {
        String sql = "Update PurchaseReturn set refundAmount=? where orderId=?";
        PreparedStatement preparedStatement = DBConnection.getInstance().getConnection().prepareStatement(sql);
        preparedStatement.setDouble(1, refundAmount);
        preparedStatement.setString(2, id);
        int res = preparedStatement.executeUpdate();
        return res;
    }

    public static List<PurchaseReturns> checkPurchaseReturnMonth(int year, int i) {

        String sql = "select * from PurchaseReturn where month(returnDate)='" + i + "' and year(returnDate)='" + year + "'";
        ResultSet rst;
        List<PurchaseReturns> returnList = new ArrayList<>();
        try {
            rst = DBConnection.getInstance().getConnection().createStatement().executeQuery(sql);
            while (rst.next()) {
                PurchaseReturns purchaseReturns = new PurchaseReturns(rst.getString(1), rst.getString(2), rst.getString(3), rst.getDouble(4), rst.getDouble(5), rst.getString(6));
                returnList.add(purchaseReturns);
            }
        } catch (SQLException ex) {
            Logger.getLogger(InvoiceController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InvoiceController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return returnList;
    }
}
