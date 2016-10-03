/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.cmjd31.inventorycontrolsystem.model;

/**
 *
 * @author 1
 */
public class Supplier {

    private String supplierId;
    private String supplierName;
    private String address;
    private String fax;
    private String email;
    private int contact;

    public Supplier() {
    }

    public Supplier(String supplierId, String supplierName, String address, String fax, String email, int contact) {
        this.supplierId = supplierId;
        this.supplierName = supplierName;
        this.address = address;
        this.fax = fax;
        this.email = email;
        this.contact = contact;
    }

    /**
     * @return the supplierName
     */
    public String getSupplierName() {
        return supplierName;
    }

    /**
     * @param supp_Name the supplierName to set
     */
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the fax
     */
    public String getFax() {
        return fax;
    }

    /**
     * @param fax the fax to set
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the contact
     */
    public int getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(int contact) {
        this.contact = contact;
    }

    /**
     * @return the supplierId
     */
    public String getSupplierId() {
        return supplierId;
    }

    /**
     * @param supplerId the supplerId to set
     */
    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String toString() {
        return supplierId + " - " + supplierName;
    }
}
