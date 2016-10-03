/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.cmjd31.inventorycontrolsystem.model;

/**
 *
 * @author 1
 */
public class Book {

    private String bookID;
    private String publisherId;
    private String authorId;
    private String bookTitle;
    private String languageId;
    private String itemId;
    private String categoryId;

    public Book() {
    }

    public Book(String bookTitle, String publisherId, String authorId, String languageId, String bookID, String itemId, String categoryId) {
        this.bookTitle = bookTitle;
        this.publisherId = publisherId;
        this.authorId = authorId;
        this.languageId = languageId;
        this.bookID = bookID;
        this.itemId = itemId;
        this.categoryId = categoryId;
    }

    public Book(String bookID, String bookTitle) {
        this.bookID = bookID;
        this.bookTitle = bookTitle;
    }

    /**
     * @return the bookID
     */
    public String getBookID() {
        return bookID;
    }

    /**
     * @param bookID the bookID to set
     */
    public void setBookID(String bookID) {
        this.bookID = bookID;
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
     * @return the authorId
     */
    public String getAuthorId() {
        return authorId;
    }

    /**
     * @param authorId the authorId to set
     */
    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    /**
     * @return the bookTitle
     */
    public String getBookTitle() {
        return bookTitle;
    }

    /**
     * @param bookTitle the bookTitle to set
     */
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    /**
     * @return the languageId
     */
    public String getLanguageId() {
        return languageId;
    }

    /**
     * @param languageId the languageId to set
     */
    public void setLanguageId(String languageId) {
        this.languageId = languageId;
    }

    /**
     * @return the itemId
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * @param itemId the itemId to set
     */
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /**
     * @return the pOrderId
     */
    /**
     * @param pOrderId the pOrderId to set
     */
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

    public String toString() {
        return bookID + " - " + bookTitle;
    }
}
