/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.cmjd31.inventorycontrolsystem.controller;

import com.ijse.cmjd31.inventorycontrolsystem.db.DBConnection;
import com.ijse.cmjd31.inventorycontrolsystem.model.User;
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
public class UserController {

    public static User getUser(String name, String password) throws SQLException, ClassNotFoundException {
        String sql = "select * From Users where userName=? and password=?";
        PreparedStatement preparedStatement = DBConnection.getInstance().getConnection().prepareStatement(sql);
        preparedStatement.setString(1, name);
        preparedStatement.setString(2, password);
        ResultSet rst = preparedStatement.executeQuery();
        if (rst.next()) {
            return new User(rst.getString(1), rst.getString(2), rst.getInt(3));
        }
        return null;
    }

    public static int setUser(String name, String password, int priviledge) throws SQLException, ClassNotFoundException {
        String sql = "insert into Users values(?,?,?)";
        PreparedStatement preparedStatement = DBConnection.getInstance().getConnection().prepareStatement(sql);
        preparedStatement.setString(1, name);
        preparedStatement.setString(2, password);
        preparedStatement.setInt(3, priviledge);
        int res = preparedStatement.executeUpdate();
        return res;
    }

    public static int updatePassword(String userName, String password) throws SQLException, ClassNotFoundException {

        String sql = "Update Users set password = password(?) where userName = ?";
        PreparedStatement prepareStatement = DBConnection.getInstance().getConnection().prepareStatement(sql);
        prepareStatement.setString(1, password);
        prepareStatement.setString(2, userName);
        return prepareStatement.executeUpdate();
    }

    public static int updateUserName(String oldName, String newName, String password) throws SQLException, ClassNotFoundException {

        String sql = "Update Users set name = ? where userName = ? and password=password(?)";
        PreparedStatement prepareStatement = DBConnection.getInstance().getConnection().prepareStatement(sql);
        prepareStatement.setString(1, newName);
        prepareStatement.setString(2, oldName);
        prepareStatement.setString(3, password);
        return prepareStatement.executeUpdate();
    }

    public static List<User> getAllUser() throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("Select * from Users");
        ResultSet resultSet = preparedStatement.executeQuery();

        List<User> userList = new ArrayList<>();
        while (resultSet.next()) {
            String name = resultSet.getString("userName");
            int priviledge = resultSet.getInt("priviledge");
            User user = new User(name, priviledge);
            userList.add(user);
        }
        return userList;
    }

    public static int getUserCount() throws SQLException, ClassNotFoundException {
        String sql = "SELECT count(username) FROM Users";
        Connection conn = DBConnection.getInstance().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        int userCount = -1;
        if (rst.next()) {
            userCount = rst.getInt("count(userName)");
        }
        return userCount;
    }
    
    

//    public static int setBackground(User user) throws SQLException, ClassNotFoundException {
//        String sql = "Update Users set background = '" + user.getBackground()+ "' where userName = '" + user.getUserName() + "'";
//        Connection conn = DBConnection.getInstance().getConnection();
//        Statement stm = conn.createStatement();
//        return stm.executeUpdate(sql);
//    }

}
