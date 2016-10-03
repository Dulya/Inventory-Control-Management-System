/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.cmjd31.inventorycontrolsystem.model;

/**
 *
 * @author 1
 */
public class PurchaseOrderDetail {

    private String pOrderId;
    private String itemCode;
    private int qty;
    private double costPrice;
    private String supplierId;
    private double podAmount;
    private String description;
    private int recievedQty;

    public PurchaseOrderDetail() {
    }

    public PurchaseOrderDetail(String pOrderId, String itemCode, int qty) {
        this.pOrderId = pOrderId;
        this.itemCode = itemCode;
        this.qty = qty;
    }

    public PurchaseOrderDetail(String pOrderId, String itemCode, int qty, double costPrice, String supplierId, double podAmount, String description) {
        this.pOrderId = pOrderId;
        this.itemCode = itemCode;
        this.qty = qty;
        this.costPrice = costPrice;
        this.supplierId = supplierId;
        this.podAmount = podAmount;
        this.description = description;
    }

    public PurchaseOrderDetail(String pOrderId, String itemCode, int qty, double costPrice, String supplierId, double podAmount, String description, int recievedQty) {
        this.pOrderId = pOrderId;
        this.itemCode = itemCode;
        this.qty = qty;
        this.costPrice = costPrice;
        this.supplierId = supplierId;
        this.podAmount = podAmount;
        this.description = description;
        this.recievedQty = recievedQty;
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
     * @return the costPrice
     */
    public double getCostPrice() {
        return costPrice;
    }

    /**
     * @param costPrice the costPrice to set
     */
    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
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
     * @return the podAmount
     */
    public double getPodAmount() {
        return podAmount;
    }

    /**
     * @param podAmount the podAmount to set
     */
    public void setPodAmount(double podAmount) {
        this.podAmount = podAmount;
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

    public int getRecievedQty() {
        return recievedQty;
    }

    public void setRecievedQty(String description) {
        this.recievedQty = recievedQty;
    }
}
