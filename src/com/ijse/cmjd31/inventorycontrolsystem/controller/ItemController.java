/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.cmjd31.inventorycontrolsystem.controller;

import com.ijse.cmjd31.inventorycontrolsystem.db.DBConnection;
import com.ijse.cmjd31.inventorycontrolsystem.model.Book;
import com.ijse.cmjd31.inventorycontrolsystem.model.Item;
import com.ijse.cmjd31.inventorycontrolsystem.model.Supplier;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import org.pushingpixels.substance.internal.colorscheme.SaturatedColorScheme;

/**
 *
 * @author 1
 */
public class ItemController {

    public static int addItem(Item item) throws SQLException, ClassNotFoundException {
        String sql = "insert into Item values(?,?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement = DBConnection.getInstance().getConnection().prepareStatement(sql);
        preparedStatement.setString(1, item.getItemCode());
        preparedStatement.setString(2, item.getDescription());
        preparedStatement.setDouble(3, item.getCostPrice());
        preparedStatement.setDouble(4, item.getSalesPrice());
        preparedStatement.setDouble(5, item.getDiscount());
        preparedStatement.setInt(6, item.getQtyOnHand());
        preparedStatement.setInt(7, item.getReOrderLevel());
        preparedStatement.setString(8, item.getSupplierId());
        int res = preparedStatement.executeUpdate();
        return res;

    }

    public static int updateItem(Item item) throws SQLException, ClassNotFoundException {
        String sql = "update Item set idItem=? , description=? ,costPrice=? ,salesPrice=?, discount=? ,qtyOnHand=? ,reOrderLevel=?,Supplier_idSupplier=?  where idItem='" + item.getItemCode() + "'";
        PreparedStatement preparedStatement = DBConnection.getInstance().getConnection().prepareStatement(sql);
        preparedStatement.setString(1, item.getItemCode());
        preparedStatement.setString(2, item.getDescription());
        preparedStatement.setString(3, Double.toString(item.getCostPrice()));
        preparedStatement.setString(4, Double.toString(item.getSalesPrice()));
        preparedStatement.setString(5, Double.toString(item.getDiscount()));
        preparedStatement.setString(6, Integer.toString(item.getQtyOnHand()));
        preparedStatement.setString(7, Integer.toString(item.getReOrderLevel()));
        preparedStatement.setString(8, item.getSupplierId());
        int res = preparedStatement.executeUpdate();
        return res;
    }

    public static int deleteItem(String id) throws SQLException, ClassNotFoundException {
        String sql = "delete from Item where idItem='" + id + "'";
        Statement stm = DBConnection.getInstance().getConnection().createStatement();
        int res = stm.executeUpdate(sql);
        return res;
    }

    public static List<Item> getAllItems() throws SQLException, ClassNotFoundException {
        String sql = "select * from Item ";
        Statement stm = DBConnection.getInstance().getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        List<Item> itemList = new ArrayList<>();
        while (rst.next()) {
            Item item = new Item(rst.getString(1), rst.getString(2), rst.getDouble(3), rst.getDouble(4), rst.getDouble(5), rst.getInt(6), rst.getInt(7), rst.getString(8));
            itemList.add(item);

        }
        return itemList;
    }

    /**
     *
     * @param itemId
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public static Item getBookById(String itemId) throws SQLException, ClassNotFoundException {
        String sql = "select * from Item where idItem='" + itemId + "' ";
        Statement stm = DBConnection.getInstance().getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        Item item = null;;
        while (rst.next()) {
            item = new Item(rst.getString(1), rst.getString(2), rst.getDouble(3), rst.getDouble(4), rst.getDouble(5), rst.getInt(6), rst.getInt(7), rst.getString(8));
        }
        return item;
    }

    public static String getSupplierById(String id) throws SQLException, ClassNotFoundException {
        String sql = "select Supplier_idSupplier from Item where idItem='" + id + "'";
        Statement stm = DBConnection.getInstance().getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        String name = null;
        while (rst.next()) {
            name = rst.getString(1);
        }
        return name;
    }

    public static Item getItemByItemCode(String id) throws SQLException, ClassNotFoundException {
        String sql = "select * from Item where idItem='" + id + "'";
        Statement stm = DBConnection.getInstance().getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        Item item = null;
        while (rst.next()) {
            item = new Item(rst.getString(1), rst.getString(2), rst.getDouble(3), rst.getDouble(4), rst.getDouble(5), rst.getInt(6), rst.getInt(7), rst.getString(8));
        }
        return item;
    }

    static int updateItemQty(int qty, String itemCode) throws SQLException, ClassNotFoundException {
        String sql = "update Item set qtyOnHand=qtyOnHand-" + qty + " where idItem='" + itemCode + "'";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        return stm.executeUpdate(sql);
    }

    public static List<Item> getAllItemsNotBooks() throws SQLException, ClassNotFoundException {
        String sql = "select * from Item where idItem not in(select Item_idItem from Book)";
        ResultSet rst = DBConnection.getInstance().getConnection().createStatement().executeQuery(sql);
        List<Item> itemList = new ArrayList<>();
        while (rst.next()) {
            Item item = new Item(rst.getString(1), rst.getString(2), rst.getDouble(3), rst.getDouble(4), rst.getDouble(5), rst.getInt(6), rst.getInt(7), rst.getString(8));
            itemList.add(item);
        }
        return itemList;
    }

    public static List<Item> getItemBySupplierCode(String supplierId) throws SQLException, ClassNotFoundException {
        String sql = "select * from Item where Supplier_idSupplier='" + supplierId + "'";
        ResultSet rst = DBConnection.getInstance().getConnection().createStatement().executeQuery(sql);
        List<Item> itemList = new ArrayList<>();
        while (rst.next()) {
            Item item = new Item(rst.getString(1), rst.getString(2), rst.getDouble(3), rst.getDouble(4), rst.getDouble(5), rst.getInt(6), rst.getInt(7), rst.getString(8));
            itemList.add(item);
        }
        return itemList;
    }

    static int updateOrderItemQty(int qty, String itemCode) throws SQLException, ClassNotFoundException {
        String sql = "update Item set qtyOnHand=qtyOnHand+" + qty + " where idItem='" + itemCode + "'";
        System.out.println(sql);
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        return stm.executeUpdate(sql);
    }

    public static JRResultSetDataSource getItemDetails(List<Item> itemList) throws SQLException, ClassNotFoundException {
        String sql = "select * from Item where idItem in (";
        for (Item item : itemList) {
            sql += "'" + item.getItemCode() + "',";
        }
        sql = sql.substring(0, sql.length() - 1) + ")";
        ResultSet rst = DBConnection.getInstance().getConnection().createStatement().executeQuery(sql);
        return new JRResultSetDataSource(rst);
    }
}
