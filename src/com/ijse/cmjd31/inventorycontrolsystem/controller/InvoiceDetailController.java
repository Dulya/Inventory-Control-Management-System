/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.cmjd31.inventorycontrolsystem.controller;

import com.ijse.cmjd31.inventorycontrolsystem.db.DBConnection;
import com.ijse.cmjd31.inventorycontrolsystem.model.InvoiceDetails;
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
public class InvoiceDetailController {

    public static int addInvoiceDetail(List<InvoiceDetails> list) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        for (InvoiceDetails invoiceDetail : list) {
            String sql = "insert into Item_has_Invoice values('" + invoiceDetail.getItemCode() + "','" + invoiceDetail.getInvoiceId() + "','" + invoiceDetail.getQty() + "','" + invoiceDetail.getSalesPrice() + "','" + invoiceDetail.getItemAmount() + "','" + invoiceDetail.getDescription() + "')";
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

    public static List<InvoiceDetails> getInvoiceDetails(String invoiceId) throws SQLException, ClassNotFoundException {
        String sql = "select * from Item_has_Invoice where Invoice_idInvoice='" + invoiceId + "'";
        ResultSet rst = DBConnection.getInstance().getConnection().createStatement().executeQuery(sql);
        List<InvoiceDetails> invoiceDetails = new ArrayList<>();
        while (rst.next()) {
            InvoiceDetails detail = new InvoiceDetails(rst.getString(2), rst.getString(1), rst.getString(6), rst.getDouble(4), rst.getInt(3), rst.getDouble(5));
            invoiceDetails.add(detail);

        }
        return invoiceDetails;
    }

    public static int DeleteInvoiceDetail(String invoiceId) throws SQLException, ClassNotFoundException {
        String sql = "Delete from Item_has_Invoice where invoice_idInvoice=?";
        PreparedStatement preparedStatement = DBConnection.getInstance().getConnection().prepareStatement(sql);
        preparedStatement.setString(1, invoiceId);
        int res = preparedStatement.executeUpdate();
        return res;
    }
}
