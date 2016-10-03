/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.cmjd31.inventorycontrolsystem.other;

import com.ijse.cmjd31.inventorycontrolsystem.db.DBConnection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 1
 */
public class IdGenerator {

    public static String getNextId(String tableName, String columnName, String prefix) throws SQLException, ClassNotFoundException {
        String sql = "select " + columnName + " from " + tableName + " order by 1 desc limit 1 ";
        ResultSet rst = DBConnection.getInstance().getConnection().createStatement().executeQuery(sql);
        rst.next();
        String lastId = rst.getString(1);
        String nextId = "";
        int num = Integer.parseInt(lastId.split(prefix)[1]);
        num++;
        if (num >= 1000) {
            nextId = prefix + num;
        } else if (num >= 100) {
            nextId = prefix + "0" + num;
        } else if (num >= 10) {
            nextId = prefix + "00" + num;
        } else {
            nextId = prefix + "000" + num;
        }
        return nextId;
    }
}
