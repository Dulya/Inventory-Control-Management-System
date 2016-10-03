/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.cmjd31.inventorycontrolsystem.model;

/**
 *
 * @author 1
 */
public class SalesReturnDetail {

    private String srId;
    private String srDate;
    private String invoiceId;
    private String itemCode;
    private int returnQty;
    private double srTot_Amount;

    public SalesReturnDetail() {
    }

    public SalesReturnDetail(String srId, String srDate, String invoiceId, String itemCode, int returnQty, double srTot_Amount) {
        this.srId = srId;
        this.srDate = srDate;
        this.invoiceId = invoiceId;
        this.itemCode = itemCode;
        this.returnQty = returnQty;
        this.srTot_Amount = srTot_Amount;
    }

    /**
     * @return the srId
     */
    public String getSrId() {
        return srId;
    }

    /**
     * @param srId the srId to set
     */
    public void setSrId(String srId) {
        this.srId = srId;
    }

    /**
     * @return the srDate
     */
    public String getSrDate() {
        return srDate;
    }

    /**
     * @param srDate the srDate to set
     */
    public void setSrDate(String srDate) {
        this.srDate = srDate;
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
     * @return the itemCode
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * @param itemCode the itemCode to set
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    /**
     * @return the returnQty
     */
    public int getReturnQty() {
        return returnQty;
    }

    /**
     * @param returnQty the returnQty to set
     */
    public void setReturnQty(int returnQty) {
        this.returnQty = returnQty;
    }

    /**
     * @return the srTot_Amount
     */
    public double getSrTot_Amount() {
        return srTot_Amount;
    }

    /**
     * @param srTot_Amount the srTot_Amount to set
     */
    public void setSrTot_Amount(double srTot_Amount) {
        this.srTot_Amount = srTot_Amount;
    }
}
