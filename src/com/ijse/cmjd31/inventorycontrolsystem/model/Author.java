/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.cmjd31.inventorycontrolsystem.model;

/**
 *
 * @author 1
 */
public class Author {

    private String authorId;
    private String author_Name;

    public Author() {
    }

    public Author(String authorId, String author_Name) {
        this.authorId = authorId;
        this.author_Name = author_Name;
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
     * @return the author_Name
     */
    public String getAuthor_Name() {
        return author_Name;
    }

    /**
     * @param author_Name the author_Name to set
     */
    public void setAuthor_Name(String author_Name) {
        this.author_Name = author_Name;
    }

    public String toString() {
        return authorId + " - " + author_Name;
    }
}
