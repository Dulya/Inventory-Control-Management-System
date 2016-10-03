/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.cmjd31.inventorycontrolsystem.model;

/**
 *
 * @author 1
 */
public class Item {

    private String itemCode;
    private String description;
    private double costPrice;
    private double salesPrice;
    private double discount;
    private int qtyOnHand;
    private int reOrderLevel;
    private String supplierId;

    public Item() {
    }

    public Item(String itemCode, String description, double costPrice, double salesPrice, double discount, int qtyOnHand, int reOrderLevel, String supplierId) {
        this.itemCode = itemCode;
        this.description = description;
        this.costPrice = costPrice;
        this.salesPrice = salesPrice;
        this.discount = discount;
        this.qtyOnHand = qtyOnHand;
        this.reOrderLevel = reOrderLevel;
        this.supplierId = supplierId;
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
     * @return the qtyOnHand
     */
    public int getQtyOnHand() {
        return qtyOnHand;
    }

    /**
     * @param qtyOnHand the qtyOnHand to set
     */
    public void setQtyOnHand(int qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
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
     * @return the reOrderLevel
     */
    public int getReOrderLevel() {
        return reOrderLevel;
    }

    /**
     * @param reOrderLevel the reOrderLevel to set
     */
    public void setReOrderLevel(int reOrderLevel) {
        this.reOrderLevel = reOrderLevel;
    }

    /**
     * @return the discount
     */
    public double getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(double discount) {
        this.discount = discount;
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

    public String toString() {
        return itemCode + " - " + description;
    }
}
