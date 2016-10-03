/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.cmjd31.inventorycontrolsystem.controller;

import com.ijse.cmjd31.inventorycontrolsystem.db.DBConnection;
import com.ijse.cmjd31.inventorycontrolsystem.model.InvoiceDetails;
import com.ijse.cmjd31.inventorycontrolsystem.model.PurchaseReturnDetail;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author 1
 */
public class PurchaseReturnDetailController {

    public static int addReturnDetail(List<PurchaseReturnDetail> list) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        for (PurchaseReturnDetail purchaseReturnDetail : list) {
            String sql = "insert into PurchaseReturnDetail values('" + purchaseReturnDetail.getItemCode() + "','" + purchaseReturnDetail.getQty() + "','" + purchaseReturnDetail.getReturnAmount() + "','" + purchaseReturnDetail.getReturnId() + "','" + purchaseReturnDetail.getOrderId() + "')";
            stm.addBatch(sql);
            System.out.println(sql);
        }
        int[] res = stm.executeBatch();
        for (int i = 0; i < list.size(); i++) {
            if (res[i] > 0) {
                int r = ItemController.updateItemQty(list.get(i).getQty(), list.get(i).getItemCode());
                if (r <= 0) {
                    return -1;
                }
            }
        }
        return 1;
    }
}
