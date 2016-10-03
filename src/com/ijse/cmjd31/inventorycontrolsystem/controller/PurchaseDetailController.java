/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.cmjd31.inventorycontrolsystem.controller;

import com.ijse.cmjd31.inventorycontrolsystem.db.DBConnection;
import com.ijse.cmjd31.inventorycontrolsystem.model.PurchaseOrderDetail;
import com.ijse.cmjd31.inventorycontrolsystem.model.PurchaseReturnDetail;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 1
 */
public class PurchaseDetailController {

    public static List<PurchaseOrderDetail> getOrderDetails(String pOrderId) throws SQLException, ClassNotFoundException {
        String sql = "select * from Item_has_PurchaseOrder where PurchaseOrder_idPurchaseOrder='" + pOrderId + "'";
        ResultSet rst = DBConnection.getInstance().getConnection().createStatement().executeQuery(sql);
        List<PurchaseOrderDetail> orderDetails = new ArrayList<>();
        while (rst.next()) {
            PurchaseOrderDetail detail = new PurchaseOrderDetail(rst.getString(6), rst.getString(4), rst.getInt(1), rst.getDouble(2), rst.getString(5), rst.getDouble(3), rst.getString(7), rst.getInt(8));
            orderDetails.add(detail);
        }
        return orderDetails;
    }

    static int addOrderDetail(List<PurchaseOrderDetail> detail) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        for (PurchaseOrderDetail purchaseOrderDetail : detail) {
            String sql = "insert into Item_has_PurchaseOrder values('" + purchaseOrderDetail.getQty() + "','" + purchaseOrderDetail.getCostPrice() + "','" + purchaseOrderDetail.getPodAmount() + "','" + purchaseOrderDetail.getItemCode() + "','" + purchaseOrderDetail.getSupplierId() + "','" + purchaseOrderDetail.getpOrderId() + "','" + purchaseOrderDetail.getDescription() + "','" + purchaseOrderDetail.getRecievedQty() + "' )";
            stm.addBatch(sql);
        }
        int[] res = stm.executeBatch();
        return 1;
    }

    public static int UpdatePurchaseItemQty(List<PurchaseOrderDetail> list) throws SQLException, ClassNotFoundException {
        for (int i = 0; i < list.size(); i++) {
            int r = ItemController.updateOrderItemQty(list.get(i).getQty(), list.get(i).getItemCode());
            if (r <= 0) {
                return -1;
            }
        }
        return 1;
    }

    public static int markRecievedItemQty(List<PurchaseOrderDetail> list) throws SQLException, ClassNotFoundException {
        String sql = "update Item_has_PurchaseOrder set recievedQty=? where PurchaseOrder_idPurchaseOrder=? and Item_idItem=?";
        int res = -1;
        for (int i = 0; i < list.size(); i++) {
            PreparedStatement preparedStatement = DBConnection.getInstance().getConnection().prepareStatement(sql);
            preparedStatement.setInt(1, list.get(i).getQty());
            preparedStatement.setString(2, list.get(i).getpOrderId());
            preparedStatement.setString(3, list.get(i).getItemCode());
            res = preparedStatement.executeUpdate();
        }
        return res;
    }

    public static int UpdaterRecievedItemQty(List<PurchaseReturnDetail> detail) throws SQLException, ClassNotFoundException {
        int res = -1;
        for (PurchaseReturnDetail returns : detail) {
            String sql = "update Item_has_PurchaseOrder set recievedQty=recievedQty-" + returns.getQty() + " where PurchaseOrder_idPurchaseOrder='" + returns.getOrderId() + "' and Item_idItem='" + returns.getItemCode() + "'";
            res = DBConnection.getInstance().getConnection().createStatement().executeUpdate(sql);
        }
        return res;
    }
}
