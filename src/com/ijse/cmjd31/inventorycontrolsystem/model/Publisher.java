/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.cmjd31.inventorycontrolsystem.model;

/**
 *
 * @author 1
 */
public class Publisher {

    private String publisherId;
    private String pub_Name;

    public Publisher() {
    }

    public Publisher(String publisherId, String pub_Name) {
        this.publisherId = publisherId;
        this.pub_Name = pub_Name;
    }

    /**
     * @return the publisherId
     */
    public String getPublisherId() {
        return publisherId;
    }

    /**
     * @param publisherId the publisherId to set
     */
    public void setPublisherId(String publisherId) {
        this.publisherId = publisherId;
    }

    /**
     * @return the pub_Name
     */
    public String getPub_Name() {
        return pub_Name;
    }

    /**
     * @param pub_Name the pub_Name to set
     */
    public void setPub_Name(String pub_Name) {
        this.pub_Name = pub_Name;
    }

    public String toString() {
        return publisherId + " - " + pub_Name;
    }
}
