/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.cmjd31.inventorycontrolsystem.model;

/**
 *
 * @author 1
 */
public class Book_Item {

    private String itemCode;
    private String bookId;
    private String bookTitle;
    private String categoryId;
    private String publisherId;
    private String authorId;
    private String languageId;

    public Book_Item() {
    }

    public Book_Item(String itemCode, String bookId, String bookTitle, String categoryId, String publisherId, String authorId, String languageId) {
        this.itemCode = itemCode;
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.categoryId = categoryId;
        this.publisherId = publisherId;
        this.authorId = authorId;
        this.languageId = languageId;
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
     * @return the bookId
     */
    public String getBookId() {
        return bookId;
    }

    /**
     * @param bookId the bookId to set
     */
    public void setBookId(String bookId) {
        this.bookId = bookId;
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

    public String toString() {
        return itemCode + " - " + bookTitle;
    }
}
