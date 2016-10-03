/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.cmjd31.inventorycontrolsystem.model;

/**
 *
 * @author 1
 */
public class User {

    private String userName;
    private String password;
    private int privilege;
    // String background;

    public User() {
    }

    public User(String userName, String password, int privilege) {
        this.userName = userName;
        this.password = password;
        this.privilege = privilege;
        // this.background=background;
    }

    public User(String userName, int privilege) {
        this.userName = userName;
        this.privilege = privilege;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the privilege
     */
    public int getPrivilege() {
        return privilege;
    }

    /**
     * @param privilege the privilege to set
     */
    public void setPrivilege(int privilege) {
        this.privilege = privilege;
    }

//    public String getBackground() {
//        return background;
//    }
//    public  void setBackground(){
//        this.background=background;
//    }
    public String toString() {
        return userName;
    }
}
