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
public class Invoice {

    private String invoiceId;
    private String inv_date;
    private String inv_time;
    private double tot_amount;
    private String custId;
    private double balance;
    private List<InvoiceDetails> list;

    public Invoice() {
    }

    public Invoice(String invoiceId, String inv_date, String inv_time, double tot_amount, String custId, double balance) {
        this.invoiceId = invoiceId;
        this.inv_date = inv_date;
        this.inv_time = inv_time;
        this.tot_amount = tot_amount;
        this.custId = custId;
        this.balance = balance;
    }

    public Invoice(String invoiceId, String inv_date, String inv_time, double tot_amount, String custId, List<InvoiceDetails> list, double balance) {
        this.invoiceId = invoiceId;
        this.inv_date = inv_date;
        this.inv_time = inv_time;
        this.tot_amount = tot_amount;
        this.custId = custId;
        this.list = list;
        this.balance = balance;
    }

    /**
     * @return the invoiceId
     */
    public String getInvoiceId() {
        return invoiceId;
    }

    /**
     * @param invoiceId the invoiceId to set
     */
    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    /**
     * @return the inv_date
     */
    public String getInv_date() {
        return inv_date;
    }

    /**
     * @param inv_date the inv_date to set
     */
    public void setInv_date(String inv_date) {
        this.inv_date = inv_date;
    }

    /**
     * @return the inv_time
     */
    public String getInv_time() {
        return inv_time;
    }

    /**
     * @param inv_time the inv_time to set
     */
    public void setInv_time(String inv_time) {
        this.inv_time = inv_time;
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
     * @return the custId
     */
    public String getCustId() {
        return custId;
    }

    /**
     * @param custId the custId to set
     */
    public void setCustId(String custId) {
        this.custId = custId;
    }

    public void setList(List<InvoiceDetails> list) {
        this.list = list;
    }

    public List<InvoiceDetails> getList() {
        return list;
    }

    public String toString() {
        return invoiceId;
    }
}
