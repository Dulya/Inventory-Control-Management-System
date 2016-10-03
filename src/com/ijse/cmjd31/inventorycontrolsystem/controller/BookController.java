/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.cmjd31.inventorycontrolsystem.controller;

import com.ijse.cmjd31.inventorycontrolsystem.db.DBConnection;
import com.ijse.cmjd31.inventorycontrolsystem.model.Book;
import com.ijse.cmjd31.inventorycontrolsystem.model.Book_Item;
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
public class BookController {

    public static int addBook(Book book) throws SQLException, ClassNotFoundException {
        String sql = "insert into Book values(?,?,?,?,?,?,?);";
        PreparedStatement preparedStatement1 = DBConnection.getInstance().getConnection().prepareStatement(sql);
        preparedStatement1.setString(1, book.getBookTitle());
        preparedStatement1.setString(2, book.getPublisherId());
        preparedStatement1.setString(3, book.getAuthorId());
        preparedStatement1.setString(4, book.getLanguageId());
        preparedStatement1.setString(5, book.getBookID());
        preparedStatement1.setString(6, book.getItemId());
        preparedStatement1.setString(7, book.getCategoryId());
        int res = preparedStatement1.executeUpdate();
        return res;
    }

    public static List<Book> getAllBooks() throws SQLException, ClassNotFoundException {
        String sql = "select * from Book";
        Statement stm = DBConnection.getInstance().getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        List<Book> bookList = new ArrayList<>();
        while (rst.next()) {
            Book book = new Book(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7));
            bookList.add(book);
        }
        return bookList;
    }

    public static List<String> getAllBookTitles() throws SQLException, ClassNotFoundException {
        String sql = "select bookTitle from Book";
        Statement stm = DBConnection.getInstance().getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        List<String> titleList = new ArrayList<>();
        while (rst.next()) {
            String title = rst.getString(1);
            titleList.add(title);
        }
        return titleList;
    }

    public static List<String> getAllBookIds() throws SQLException, ClassNotFoundException {
        String sql = "select bookId from Book";
        Statement stm = DBConnection.getInstance().getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        List<String> idList = new ArrayList<>();
        while (rst.next()) {
            String id = rst.getString(5);
            idList.add(id);
        }
        return idList;
    }

    /**
     *
     * @param book1
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public static List<Book> getbooksByTitle(Book book1) throws SQLException, ClassNotFoundException {
        String sql = "select * from Book where bookId='" + book1.getBookID() + "'";
        Statement stm = DBConnection.getInstance().getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        List<Book> bookList = new ArrayList<>();
        while (rst.next()) {
            Book book = new Book(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7));
            bookList.add(book);
        }
        return bookList;
    }

    /**
     * List all Books for selected category
     *
     * @param categoryId
     * @return List of books
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public static List<Book> getBooksByCategory(String category) throws SQLException, ClassNotFoundException {
        String sql = "select * from Book where Category_idCategory  in ('" + category + "') ";
        Statement stm = DBConnection.getInstance().getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        List<Book> bookList = new ArrayList<>();
        while (rst.next()) {
            Book book = new Book(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7));
            bookList.add(book);
        }
        return bookList;
    }

    /**
     *
     * @param language
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public static List<Book> getBooksByLanguage(String language) throws SQLException, ClassNotFoundException {
        String sql = "select * from Book where Language_idLanguage in ('" + language + "') ";
        Statement stm = DBConnection.getInstance().getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        List<Book> bookList = new ArrayList<>();
        while (rst.next()) {
            Book book = new Book(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7));
            bookList.add(book);
        }
        return bookList;
    }

    public static List<Book> getBooksByPublisher(String publisherId) throws SQLException, ClassNotFoundException {
        String sql = "select * from Book where Publisher_idPublisher in ('" + publisherId + "') ";
        Statement stm = DBConnection.getInstance().getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        List<Book> bookList = new ArrayList<>();
        while (rst.next()) {
            Book book = new Book(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7));
            bookList.add(book);
        }
        return bookList;
    }

    public static List<Book> getBooksByAuthor(String authorId) throws SQLException, ClassNotFoundException {
        String sql = "select * from Book where Author_idAuthor in ('" + authorId + "') ";
        Statement stm = DBConnection.getInstance().getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        List<Book> bookList = new ArrayList<>();
        while (rst.next()) {
            Book book = new Book(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7));
            bookList.add(book);
        }
        return bookList;
    }

    public static Book getBookByItemCode(String id) throws SQLException, ClassNotFoundException {
        String sql = "select  * from Book where Item_idItem='" + id + "'";
        Statement stm = DBConnection.getInstance().getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        Book book = null;
        while (rst.next()) {
            book = new Book(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7));

        }
        return book;
    }

    public static List<Book_Item> getAllItems() throws SQLException, ClassNotFoundException {
        String sql = "select Item_idItem,bookId,bookTitle,Category_idCategory,Publisher_idPublisher,Author_idAuthor,Language_idLanguage from Book";
        Statement stm = DBConnection.getInstance().getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        List<Book_Item> bookItemList = new ArrayList<>();
        while (rst.next()) {
            Book_Item bookItem = new Book_Item(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7));
            bookItemList.add(bookItem);
        }
        return bookItemList;
    }

    public static int updateBook(Book book) throws SQLException, ClassNotFoundException {
        String sql = "update Book set bookTitle=? , Publisher_idPublisher=? ,Author_idAuthor=? ,Language_idLanguage=?,bookId=? ,item_idItem=?, Category_idCategory=?  where bookId='" + book.getBookID() + "'";
        PreparedStatement preparedStatement = DBConnection.getInstance().getConnection().prepareStatement(sql);
        preparedStatement.setString(1, book.getBookTitle());
        preparedStatement.setString(2, book.getPublisherId());
        preparedStatement.setString(3, book.getAuthorId());
        preparedStatement.setString(4, book.getLanguageId());
        preparedStatement.setString(5, book.getBookID());
        preparedStatement.setString(6, book.getItemId());
        preparedStatement.setString(7, book.getCategoryId());
        int res = preparedStatement.executeUpdate();
        return res;
    }

    public static int deleteBook(String itemCode) throws SQLException, ClassNotFoundException {
        String sql = "delete From Book where Item_idItem='" + itemCode + "'";
        int res = DBConnection.getInstance().getConnection().createStatement().executeUpdate(sql);
        return res;
    }
}
