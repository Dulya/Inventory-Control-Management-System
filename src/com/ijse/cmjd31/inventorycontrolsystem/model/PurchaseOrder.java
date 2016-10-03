/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.cmjd31.inventorycontrolsystem.model;

import java.util.List;

/**
 *
 * @author 1
 */
public class PurchaseOrder {

    private String pOrderId;
    private String supplierId;
    private String po_date;
    private String po_time;
    private double tot_amount;
    private double balance;
    private List<PurchaseOrderDetail> detail;
    private String recievedDate;

    public PurchaseOrder() {
    }

    public PurchaseOrder(String pOrderId, String supplierId, String po_date, String po_time, double tot_amount, double balance, List<PurchaseOrderDetail> detail) {
        this.pOrderId = pOrderId;
        this.supplierId = supplierId;
        this.po_date = po_date;
        this.po_time = po_time;
        this.tot_amount = tot_amount;
        this.balance = balance;
        this.detail = detail;
    }

    public PurchaseOrder(String pOrderId, String supplierId, String po_date, String po_time, double tot_amount, double balance) {
        this.pOrderId = pOrderId;
        this.supplierId = supplierId;
        this.po_date = po_date;
        this.po_time = po_time;
        this.tot_amount = tot_amount;
        this.balance = balance;
    }

    public PurchaseOrder(String pOrderId, String supplierId, String po_date, String po_time, double tot_amount, double balance, String recievedDate) {
        this.pOrderId = pOrderId;
        this.supplierId = supplierId;
        this.po_date = po_date;
        this.po_time = po_time;
        this.tot_amount = tot_amount;
        this.balance = balance;
        this.recievedDate = recievedDate;
    }

    /**
     * @return the pOrderId
     */
    public String getpOrderId() {
        return pOrderId;
    }

    /**
     * @param pOrderId the pOrderId to set
     */
    public void setpOrderId(String pOrderId) {
        this.pOrderId = pOrderId;
    }

    /**
     * @return the supplierId
     */
    public String getSupplierId() {
        return supplierId;
    }

    /**
     * @param supplierId the supplierId to set
     */
    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    /**
     * @return the po_date
     */
    public String getPo_date() {
        return po_date;
    }

    /**
     * @param po_date the po_date to set
     */
    public void setPo_date(String po_date) {
        this.po_date = po_date;
    }

    /**
     * @return the po_time
     */
    public String getPo_time() {
        return po_time;
    }

    /**
     * @param po_time the po_time to set
     */
    public void setPo_time(String po_time) {
        this.po_time = po_time;
    }

    /**
     * @return the tot_amount
     */
    public double getTot_amount() {
        return tot_amount;
    }

    /**
     * @param tot_amount the tot_amount to set
     */
    public void setTot_amount(double tot_amount) {
        this.tot_amount = tot_amount;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * @return the detail
     */
    public List<PurchaseOrderDetail> getDetail() {
        return detail;
    }

    /**
     * @param detail the detail to set
     */
    public void setDetail(List<PurchaseOrderDetail> detail) {
        this.detail = detail;
    }

    /**
     * @return the recievedDate
     */
    public String getRecievedDate() {
        return recievedDate;
    }

    /**
     * @param recievedDate the recievedDate to set
     */
    public void setRecievedDate(String recievedDate) {
        this.recievedDate = recievedDate;
    }

    public String toString() {
        return pOrderId;
    }
}
