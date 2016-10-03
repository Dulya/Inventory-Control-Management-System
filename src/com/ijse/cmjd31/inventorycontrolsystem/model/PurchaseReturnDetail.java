/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.cmjd31.inventorycontrolsystem.model;

/**
 *
 * @author 1
 */
public class PurchaseReturnDetail {

    private String itemCode;
    private int qty;
    private double returnAmount;
    private String returnId;
    private String orderId;

    public PurchaseReturnDetail() {
    }

    public PurchaseReturnDetail(String itemCode, int qty, double returnAmount, String returnId, String orderId) {
        this.itemCode = itemCode;
        this.qty = qty;
        this.returnAmount = returnAmount;
        this.returnId = returnId;
        this.orderId = orderId;
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
     * @return the returnAmount
     */
    public double getReturnAmount() {
        return returnAmount;
    }

    /**
     * @param returnAmount the returnAmount to set
     */
    public void setReturnAmount(double returnAmount) {
        this.returnAmount = returnAmount;
    }

    /**
     * @return the returnId
     */
    public String getReturnId() {
        return returnId;
    }

    /**
     * @param returnId the returnId to set
     */
    public void setReturnId(String returnId) {
        this.returnId = returnId;
    }

    /**
     * @return the orderId
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * @param orderId the orderId to set
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
