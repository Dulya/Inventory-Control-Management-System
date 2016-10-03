/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.cmjd31.inventorycontrolsystem.controller;

import com.ijse.cmjd31.inventorycontrolsystem.db.DBConnection;
import com.ijse.cmjd31.inventorycontrolsystem.model.Category;
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
public class CategoryController {

    public static List<Category> getAllCategory() throws SQLException, ClassNotFoundException {
        String sql = "select * from Category ";
        Statement stm = DBConnection.getInstance().getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        List<Category> categoryList = new ArrayList<>();
        while (rst.next()) {
            Category category = new Category(rst.getString(1), rst.getString(2));
            categoryList.add(category);

        }
        return categoryList;
    }

    public static int addCategory(Category category) throws SQLException, ClassNotFoundException {
        String sql = "insert into Category values(?,?)";
        PreparedStatement preparedStatement = DBConnection.getInstance().getConnection().prepareStatement(sql);
        preparedStatement.setString(1, category.getCategoryId());
        preparedStatement.setString(2, category.getCat_Name());
        int res = preparedStatement.executeUpdate();
        return res;
    }

    public static int updateCategory(Category category) throws SQLException, ClassNotFoundException {
        String sql = "update Category set idCategory=? , categoryName=? where idCategory='" + category.getCategoryId() + "'";
        PreparedStatement preparedStatement = DBConnection.getInstance().getConnection().prepareStatement(sql);
        preparedStatement.setString(1, category.getCategoryId());
        preparedStatement.setString(2, category.getCat_Name());
        int res = preparedStatement.executeUpdate();
        return res;
    }

    public static int deleteCategory(String id) throws SQLException, ClassNotFoundException {
        String sql = "delete from Category where idCategory='" + id + "'";
        Statement stm = DBConnection.getInstance().getConnection().createStatement();
        int res = stm.executeUpdate(sql);
        return res;
    }

    public static Category getCategory(String categoryId) throws SQLException, ClassNotFoundException {
        String sql = "select * from Category where idCategory='" + categoryId + "'";
        Statement stm = DBConnection.getInstance().getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        Category category = null;
        while (rst.next()) {
            category = new Category(rst.getString(1), rst.getString(2));
        }
        return category;
    }

    public static String getCategoryName(String categoryId) throws SQLException, ClassNotFoundException {
        String sql = "select categoryName from Category where idCategory='" + categoryId + "'";
        Statement stm = DBConnection.getInstance().getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        String category = null;
        while (rst.next()) {
            category = rst.getString(1);
        }
        return category;
    }
}
