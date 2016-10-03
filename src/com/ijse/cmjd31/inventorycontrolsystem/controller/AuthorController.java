/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.cmjd31.inventorycontrolsystem.controller;

import com.ijse.cmjd31.inventorycontrolsystem.db.DBConnection;
import com.ijse.cmjd31.inventorycontrolsystem.model.Author;
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
public class AuthorController {

    public static List<Author> getAllAuthors() throws SQLException, ClassNotFoundException {
        String sql = "select * from Author ";
        Statement stm = DBConnection.getInstance().getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        List<Author> authorList = new ArrayList<>();
        while (rst.next()) {
            Author author = new Author(rst.getString(1), rst.getString(2));
            authorList.add(author);
        }
        return authorList;
    }

    public static int addAuthor(Author author) throws SQLException, ClassNotFoundException {
        String sql = "insert into Author values(?,?)";
        PreparedStatement preparedStatement = DBConnection.getInstance().getConnection().prepareStatement(sql);
        preparedStatement.setString(1, author.getAuthorId());
        preparedStatement.setString(2, author.getAuthor_Name());
        int res = preparedStatement.executeUpdate();
        return res;
    }

    public static int updateAuthor(Author author) throws SQLException, ClassNotFoundException {
        String sql = "update Author set idAuthor=? , authorName=? where idAuthor='" + author.getAuthorId() + "'";
        PreparedStatement preparedStatement = DBConnection.getInstance().getConnection().prepareStatement(sql);
        preparedStatement.setString(1, author.getAuthorId());
        preparedStatement.setString(2, author.getAuthor_Name());
        int res = preparedStatement.executeUpdate();
        return res;
    }

    public static int deleteAuthor(String id) throws SQLException, ClassNotFoundException {
        String sql = "delete from Author where idAuthor='" + id + "'";
        Statement stm = DBConnection.getInstance().getConnection().createStatement();
        int res = stm.executeUpdate(sql);
        return res;
    }

    public static String getAuthorName(String authorId) throws SQLException, ClassNotFoundException {
        String sql = "select authorName from Author where idAuthor='" + authorId + "'";
        Statement stm = DBConnection.getInstance().getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        String name = null;
        while (rst.next()) {
            name = rst.getString(1);
        }
        return name;
    }

    public static Author getAuthor(String authorId) throws SQLException, ClassNotFoundException {
        String sql = "select * from Author where idAuthor='" + authorId + "'";
        Statement stm = DBConnection.getInstance().getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        Author author = null;
        while (rst.next()) {
            author = new Author(rst.getString(1), rst.getString(2));

        }
        return author;
    }
}
