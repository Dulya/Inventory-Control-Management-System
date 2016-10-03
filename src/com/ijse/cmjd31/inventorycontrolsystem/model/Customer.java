/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.cmjd31.inventorycontrolsystem.model;

/**
 *
 * @author 1
 */
public class Customer {

    private String custId;
    private String custName;
    private String address;
    private String nicNo;
    private int contact;
    private double creditLimit;

    public Customer() {
    }

    public Customer(String custId, String custName, String address, String nicNo, int contact, double creditLimit) {
        this.custId = custId;
        this.custName = custName;
        this.address = address;
        this.nicNo = nicNo;
        this.contact = contact;
        this.creditLimit = creditLimit;
    }

    public String toString() {
        return custId + " - " + custName;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNicNo() {
        return nicNo;
    }

    public void setNicNo(String nicNo) {
        this.nicNo = nicNo;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }
}
