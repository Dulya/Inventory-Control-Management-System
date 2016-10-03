/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.cmjd31.inventorycontrolsystem.model;

/**
 *
 * @author 1
 */
public class Category {

    private String categoryId;
    private String cat_Name;

    public Category() {
    }

    public Category(String categoryId, String cat_Name) {
        this.categoryId = categoryId;
        this.cat_Name = cat_Name;
    }

    /**
     * @return the categoryId
     */
    public String getCategoryId() {
        return categoryId;
    }

    /**
     * @param categoryId the categoryId to set
     */
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * @return the cat_Name
     */
    public String getCat_Name() {
        return cat_Name;
    }

    /**
     * @param cat_Name the cat_Name to set
     */
    public void setCat_Name(String cat_Name) {
        this.cat_Name = cat_Name;
    }

    public String toString() {
        return categoryId + " - " + cat_Name;
    }
}
