/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.cmjd31.inventorycontrolsystem.controller;

import com.ijse.cmjd31.inventorycontrolsystem.db.DBConnection;
import com.ijse.cmjd31.inventorycontrolsystem.model.Invoice;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 1
 */
public class InvoiceController {

    public static int addInvoice(Invoice invoice) throws SQLException, ClassNotFoundException {
        String sql = "insert into Invoice values(?,?,?,?,?,?)";
        Connection conn = DBConnection.getInstance().getConnection();
        conn.setAutoCommit(false);
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, invoice.getInvoiceId());
            preparedStatement.setString(2, invoice.getInv_date());
            preparedStatement.setString(3, invoice.getInv_time());
            preparedStatement.setDouble(4, invoice.getTot_amount());
            preparedStatement.setDouble(5, invoice.getBalance());
            preparedStatement.setString(6, invoice.getCustId());
            int res1 = preparedStatement.executeUpdate();
            if (res1 > 0) {
                int res2 = InvoiceDetailController.addInvoiceDetail(invoice.getList());
                if (res2 > 0) {
                    conn.commit();
                    return 1;
                }
            }
            conn.rollback();
            return -1;
        } catch (SQLException ex) {
            conn.rollback();
            throw ex;
        } finally {
            conn.setAutoCommit(true);
        }
    }

    public static List<Invoice> getInvoiceByCustomer(String customerId) throws SQLException, ClassNotFoundException {
        String sql = "select * from Invoice where  Customer_idCustomer='" + customerId + "' and balance > 0";
        ResultSet rst = DBConnection.getInstance().getConnection().createStatement().executeQuery(sql);
        List<Invoice> invoiceList = new ArrayList<>();
        while (rst.next()) {
            Invoice invoice = new Invoice(rst.getString(1), rst.getString(2), rst.getString(3), rst.getDouble(4), rst.getString(6), rst.getDouble(5));
            invoiceList.add(invoice);
        }
        return invoiceList;
    }

    public static List<Invoice> getInvoiceByStartDate(String d) throws SQLException, ClassNotFoundException {
        String sql = "select * from Invoice where invDate='" + d + "'";
        ResultSet rst = DBConnection.getInstance().getConnection().createStatement().executeQuery(sql);
        List<Invoice> invoiceList = new ArrayList<>();
        while (rst.next()) {
            Invoice invoice = new Invoice(rst.getString(1), rst.getString(2), rst.getString(3), rst.getDouble(4), rst.getString(6), rst.getDouble(5));
            invoiceList.add(invoice);
        }
        return invoiceList;
    }

    public static List<Invoice> getInvoiceByDateRange(String startDate, String endDate) throws SQLException, ClassNotFoundException {
        String sql = "select * from Invoice where invDate between ? and ?";
        PreparedStatement preparedStatement = DBConnection.getInstance().getConnection().prepareStatement(sql);
        preparedStatement.setString(1, startDate);
        preparedStatement.setString(2, endDate);
        ResultSet rst = preparedStatement.executeQuery();
        List<Invoice> invoiceList = new ArrayList<>();
        while (rst.next()) {
            Invoice invoice = new Invoice(rst.getString(1), rst.getString(2), rst.getString(3), rst.getDouble(4), rst.getString(6), rst.getDouble(5));
            invoiceList.add(invoice);

        }
        return invoiceList;
    }

    public static int updateBalance(double dueAmount, String invoiceId) throws SQLException, ClassNotFoundException {
        String sql = "update Invoice set balance='" + dueAmount + "' where idInvoice='" + invoiceId + "'";
        int res = DBConnection.getInstance().getConnection().createStatement().executeUpdate(sql);
        return res;

    }

    public static int updateInvoice(String invoiceId, double newAmount, double dueAmount) throws SQLException, ClassNotFoundException {
        String sql = "update Invoice set totalAmount=? ,balance=? where idInvoice=? ";
        PreparedStatement preparedStatement = DBConnection.getInstance().getConnection().prepareStatement(sql);
        preparedStatement.setDouble(1, newAmount);
        preparedStatement.setDouble(2, dueAmount);
        preparedStatement.setString(3, invoiceId);
        int res = preparedStatement.executeUpdate();
        return res;
    }

    public static List<Invoice> checkInvoiceDate(int year, int i) {
        String sql = "select * from Invoice where month(invDate)='" + i + "'  and year(invDate)='" + year + "'";
        ResultSet rst;
        List<Invoice> invoiceList = new ArrayList<>();
        try {
            rst = DBConnection.getInstance().getConnection().createStatement().executeQuery(sql);
            while (rst.next()) {
                Invoice invoice = new Invoice(rst.getString(1), rst.getString(2), rst.getString(3), rst.getDouble(4), rst.getString(6), rst.getDouble(5));
                invoiceList.add(invoice);
            }
        } catch (SQLException ex) {
            Logger.getLogger(InvoiceController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InvoiceController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return invoiceList;
    }

    public static List<Invoice> checkInvoiceYear(int year) {
        String sql = "select * from Invoice where year(invDate)='" + year + "' ";
        ResultSet rst;
        List<Invoice> invoiceList = new ArrayList<>();
        try {
            rst = DBConnection.getInstance().getConnection().createStatement().executeQuery(sql);
            while (rst.next()) {
                Invoice invoice = new Invoice(rst.getString(1), rst.getString(2), rst.getString(3), rst.getDouble(4), rst.getString(6), rst.getDouble(5));
                invoiceList.add(invoice);
            }
        } catch (SQLException ex) {
            Logger.getLogger(InvoiceController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InvoiceController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return invoiceList;
    }

    public static List<Invoice> checkInvoiceDateRange(Date date1, Date date2) {
//       String sql = select * from Invoice where invDate between 'date1' and 'date2';
//        ResultSet rst;
//        List<Invoice> invoiceList = new ArrayList<>();
//        try {
//            rst = DBConnection.getInstance().getConnection().createStatement().executeQuery(sql);
//            while (rst.next()) {
//                Invoice invoice = new Invoice(rst.getString(1), rst.getString(2), rst.getString(3), rst.getDouble(4), rst.getString(6), rst.getDouble(5));
//                invoiceList.add(invoice);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(InvoiceController.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(InvoiceController.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return invoiceList;
        return null;
    }

    public static List<Invoice> checkCreditMonth(int year, int i) {
        String sql = "select * from Invoice where balance>0 and year(invDate)='" + year + "' and month(invDate)='" + i + "'";
        ResultSet rst;
        List<Invoice> invoiceList = new ArrayList<>();
        try {
            rst = DBConnection.getInstance().getConnection().createStatement().executeQuery(sql);
            while (rst.next()) {
                Invoice invoice = new Invoice(rst.getString(1), rst.getString(2), rst.getString(3), rst.getDouble(4), rst.getString(6), rst.getDouble(5));
                invoiceList.add(invoice);
            }
        } catch (SQLException ex) {
            Logger.getLogger(InvoiceController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InvoiceController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return invoiceList;
    }

    public static List<Invoice> checkCreditYear(int year) {
        String sql = "select * from Invoice where balance>0 and year(invDate)='" + year + "'";
        ResultSet rst;
        List<Invoice> invoiceList = new ArrayList<>();
        try {
            rst = DBConnection.getInstance().getConnection().createStatement().executeQuery(sql);
            while (rst.next()) {
                Invoice invoice = new Invoice(rst.getString(1), rst.getString(2), rst.getString(3), rst.getDouble(4), rst.getString(6), rst.getDouble(5));
                invoiceList.add(invoice);
            }
        } catch (SQLException ex) {
            Logger.getLogger(InvoiceController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InvoiceController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return invoiceList;
    }
}
