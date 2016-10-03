/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.cmjd31.inventorycontrolsystem.controller;

import com.ijse.cmjd31.inventorycontrolsystem.db.DBConnection;
import com.ijse.cmjd31.inventorycontrolsystem.model.DiscardItem;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author 1
 */
public class DiscardController {

    public static int addDiscardDetail(DiscardItem discard) throws SQLException, ClassNotFoundException {
        String sql = "insert into DiscardDetail values(?,?,?,?)";
        PreparedStatement preparedStatement = DBConnection.getInstance().getConnection().prepareStatement(sql);
        preparedStatement.setString(1, discard.getSrId());
        preparedStatement.setString(3, discard.getItemCode());
        preparedStatement.setInt(2, discard.getDiscardQty());
        preparedStatement.setString(4, discard.getDiscardDate());
        int res = preparedStatement.executeUpdate();
        return res;
    }
}
