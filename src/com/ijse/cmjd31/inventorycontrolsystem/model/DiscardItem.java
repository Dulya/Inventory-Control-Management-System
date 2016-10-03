/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.cmjd31.inventorycontrolsystem.model;

/**
 *
 * @author 1
 */
public class DiscardItem {

    private String srId;
    private String itemCode;
    private int discardQty;
    private String discardDate;

    public DiscardItem() {
    }

    public DiscardItem(String srId, String itemCode, int discardQty, String discardDate) {
        this.srId = srId;
        this.itemCode = itemCode;
        this.discardQty = discardQty;
        this.discardDate = discardDate;
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
     * @return the discardQty
     */
    public int getDiscardQty() {
        return discardQty;
    }

    /**
     * @param discardQty the discardQty to set
     */
    public void setDiscardQty(int discardQty) {
        this.discardQty = discardQty;
    }

    /**
     * @return the discardDate
     */
    public String getDiscardDate() {
        return discardDate;
    }

    /**
     * @param discardDate the discardDate to set
     */
    public void setDiscardDate(String discardDate) {
        this.discardDate = discardDate;
    }
}
