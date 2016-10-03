/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.cmjd31.inventorycontrolsystem.controller;

import com.ijse.cmjd31.inventorycontrolsystem.db.DBConnection;
import com.ijse.cmjd31.inventorycontrolsystem.model.Publisher;
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
public class publisherController {

    public static List<Publisher> getAllPublishers() throws SQLException, ClassNotFoundException {
        String sql = "select * from Publisher ";
        Statement stm = DBConnection.getInstance().getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        List<Publisher> publisherList = new ArrayList<>();
        while (rst.next()) {
            Publisher publisher = new Publisher(rst.getString(1), rst.getString(2));
            publisherList.add(publisher);
        }
        return publisherList;
    }

    public static int addPublisher(Publisher publisher) throws SQLException, ClassNotFoundException {
        String sql = "insert into Publisher values(?,?)";
        PreparedStatement preparedStatement = DBConnection.getInstance().getConnection().prepareStatement(sql);
        preparedStatement.setString(1, publisher.getPublisherId());
        preparedStatement.setString(2, publisher.getPub_Name());
        int res = preparedStatement.executeUpdate();
        return res;
    }

    public static int updatePublisher(Publisher publisher) throws SQLException, ClassNotFoundException {
        String sql = "update Publisher set idPublisher=? , publisherName=? where idPublisher='" + publisher.getPublisherId() + "'";
        PreparedStatement preparedStatement = DBConnection.getInstance().getConnection().prepareStatement(sql);
        preparedStatement.setString(1, publisher.getPublisherId());
        preparedStatement.setString(2, publisher.getPub_Name());
        int res = preparedStatement.executeUpdate();
        return res;
    }

    public static int deletePublisher(String id) throws SQLException, ClassNotFoundException {
        String sql = "delete from Publisher where idPublisher='" + id + "'";
        Statement stm = DBConnection.getInstance().getConnection().createStatement();
        int res = stm.executeUpdate(sql);
        return res;
    }

    public static String getPublisherName(String publisherId) throws SQLException, ClassNotFoundException {
        String sql = "select publisherName from Publisher where idPublisher='" + publisherId + "'";
        Statement stm = DBConnection.getInstance().getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        String name = null;
        while (rst.next()) {
            name = rst.getString(1);
        }
        return name;
    }

    public static Publisher getPublisher(String publisherId) throws SQLException, ClassNotFoundException {
        String sql = "select * from Publisher where idPublisher='" + publisherId + "'";
        Statement stm = DBConnection.getInstance().getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        Publisher publisher = null;
        while (rst.next()) {
            publisher = new Publisher(rst.getString(1), rst.getString(2));
        }
        return publisher;
    }
}
