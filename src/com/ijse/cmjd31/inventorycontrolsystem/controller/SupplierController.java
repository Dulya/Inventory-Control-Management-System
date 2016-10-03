/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.cmjd31.inventorycontrolsystem.controller;

import com.ijse.cmjd31.inventorycontrolsystem.db.DBConnection;
import com.ijse.cmjd31.inventorycontrolsystem.model.Supplier;
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
public class SupplierController {

    public static int addSupplier(Supplier supplier) throws SQLException, ClassNotFoundException {
        String sql = "insert into Supplier values ('" + supplier.getSupplierId() + "','" + supplier.getSupplierName() + "','" + supplier.getAddress() + "','" + supplier.getContact() + "','" + supplier.getFax() + "','" + supplier.getEmail() + "')";
        System.out.println(sql);
        int res = DBConnection.getInstance().getConnection().createStatement().executeUpdate(sql);
        return res;
    }

    public static boolean duplicateSuppliers(String name) throws SQLException, ClassNotFoundException {
        String sql = "select * from Supplier  where  supplierName=('" + name + "') ";
        Statement stm = DBConnection.getInstance().getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        return rst.next();
    }

    public static List<Supplier> getAllSuppliers() throws SQLException, ClassNotFoundException {
        String sql = "select * from Supplier";
        Statement stm = DBConnection.getInstance().getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        List<Supplier> supplierList = new ArrayList<>();
        while (rst.next()) {
            Supplier supplier = new Supplier(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(5), rst.getString(6), rst.getInt(4));
            supplierList.add(supplier);
        }
        return supplierList;
    }

    public static int deleteSupplier(String supplierId) throws SQLException, ClassNotFoundException {
        String sql = "delete from Supplier where idSupplier='" + supplierId + "'";
        Statement stm = DBConnection.getInstance().getConnection().createStatement();
        int res = stm.executeUpdate(sql);
        return res;
    }

    public static int updateSupplier(Supplier supplier) throws SQLException, ClassNotFoundException {
        String sql = "update Supplier set idSupplier= ? ,supplierName= ?, supAddress=? ,supContact=? , supFax=? ,supEmail=? where idSupplier='" + supplier.getSupplierId() + "'";
        PreparedStatement prepareStatement = DBConnection.getInstance().getConnection().prepareStatement(sql);
        prepareStatement.setString(1, supplier.getSupplierId());
        prepareStatement.setString(2, supplier.getSupplierName());
        prepareStatement.setString(3, supplier.getAddress());
        prepareStatement.setInt(4, supplier.getContact());
        prepareStatement.setString(5, supplier.getFax());
        prepareStatement.setString(6, supplier.getEmail());
        int res = prepareStatement.executeUpdate();
        return res;
    }

    public static Supplier getSupplierByItemCode(String supplierId) throws SQLException, ClassNotFoundException {
        String sql = "select  * from Supplier where idSupplier='" + supplierId + "'";
        Statement stm = DBConnection.getInstance().getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        Supplier supplier = null;
        while (rst.next()) {
            supplier = new Supplier(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(5), rst.getString(6), rst.getInt(4));
        }
        return supplier;
    }

    public static Supplier getsupplierNameById(String supplierId) throws SQLException, ClassNotFoundException {
        String sql = "select * from Supplier where idSupplier='" + supplierId + "'";
        ResultSet rst = DBConnection.getInstance().getConnection().createStatement().executeQuery(sql);
        Supplier supplier = null;
        while (rst.next()) {
            supplier = new Supplier(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(5), rst.getString(6), rst.getInt(4));
        }
        return supplier;
    }
}
