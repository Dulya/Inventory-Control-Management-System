/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.cmjd31.inventorycontrolsystem.controller;

import com.ijse.cmjd31.inventorycontrolsystem.db.DBConnection;
import com.ijse.cmjd31.inventorycontrolsystem.model.SalesReturnDetail;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author 1
 */
public class SalesReturnController {

    public static int addReturnDetail(SalesReturnDetail detail) throws SQLException, ClassNotFoundException {
        String sql = "insert into SalesReturnDetail values(?,?,?,?,?,?)";
        PreparedStatement preparedStatement = DBConnection.getInstance().getConnection().prepareStatement(sql);
        preparedStatement.setString(1, detail.getSrId());
        preparedStatement.setString(2, detail.getSrDate());
        preparedStatement.setString(3, detail.getInvoiceId());
        preparedStatement.setString(4, detail.getItemCode());
        preparedStatement.setInt(5, detail.getReturnQty());
        preparedStatement.setDouble(6, detail.getSrTot_Amount());
        int res = preparedStatement.executeUpdate();
        return res;
    }
}
