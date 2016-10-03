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
public class PurchaseReturns {

    private String returnId;
    private String returnedDate;
    private String supplierId;
    private double returnAmount;
    private double refundAmount;
    private String orderId;
    private List<PurchaseReturnDetail> list;

    public PurchaseReturns() {
    }

    public PurchaseReturns(String returnId, String returnedDate, String supplierId, double returnAmount, double refundAmount, String orderId, List<PurchaseReturnDetail> list) {
        this.returnId = returnId;
        this.returnedDate = returnedDate;
        this.supplierId = supplierId;
        this.returnAmount = returnAmount;
        this.refundAmount = refundAmount;
        this.orderId = orderId;
        this.list = list;
    }

    public PurchaseReturns(String returnId, String returnedDate, String supplierId, double returnAmount, double refundAmount, String orderId) {
        this.returnId = returnId;
        this.returnedDate = returnedDate;
        this.supplierId = supplierId;
        this.returnAmount = returnAmount;
        this.refundAmount = refundAmount;
        this.orderId = orderId;
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
     * @return the returnedDate
     */
    public String getReturnedDate() {
        return returnedDate;
    }

    /**
     * @param returnedDate the returnedDate to set
     */
    public void setReturnedDate(String returnedDate) {
        this.returnedDate = returnedDate;
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
     * @return the refundAmount
     */
    public double getRefundAmount() {
        return refundAmount;
    }

    /**
     * @param refundAmount the refundAmount to set
     */
    public void setRefundAmount(double refundAmount) {
        this.refundAmount = refundAmount;
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

    /**
     * @return the list
     */
    public List<PurchaseReturnDetail> getList() {
        return list;
    }

    /**
     * @param list the list to set
     */
    public void setList(List<PurchaseReturnDetail> list) {
        this.list = list;
    }
}
