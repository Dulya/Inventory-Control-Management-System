/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.cmjd31.inventorycontrolsystem.model;

/**
 *
 * @author 1
 */
public class InvoiceDetails {

    private String invoiceId;
    private String itemCode;
    private String description;
    private double salesPrice;
    private int qty;
    private double itemAmount;

    public InvoiceDetails() {
    }

    public InvoiceDetails(String invoiceId, String itemCode, String description, double salesPrice, int qty, double itemAmount) {
        this.invoiceId = invoiceId;
        this.itemCode = itemCode;
        this.description = description;
        this.salesPrice = salesPrice;
        this.qty = qty;
        this.itemAmount = itemAmount;
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
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the salesPrice
     */
    public double getSalesPrice() {
        return salesPrice;
    }

    /**
     * @param salesPrice the salesPrice to set
     */
    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice;
    }

    /**
     * @return the qty
     */
    public int getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(int qty) {
        this.qty = qty;
    }

    /**
     * @return the itemAmount
     */
    public double getItemAmount() {
        return itemAmount;
    }

    /**
     * @param itemAmount the itemAmount to set
     */
    public void setItemAmount(double itemAmount) {
        this.itemAmount = itemAmount;
    }
}
