/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.cmjd31.inventorycontrolsystem.model;

/**
 *
 * @author 1
 */
public class Language {

    private String langId;
    private String lang_Name;

    public Language() {
    }

    public Language(String langId, String lang_Name) {
        this.langId = langId;
        this.lang_Name = lang_Name;
    }

    /**
     * @return the langId
     */
    public String getLangId() {
        return langId;
    }

    /**
     * @param lang_Id the langId to set
     */
    public void setLang_Id(String langId) {
        this.langId = langId;
    }

    /**
     * @return the lang_Name
     */
    public String getLang_Name() {
        return lang_Name;
    }

    /**
     * @param lang_Name the lang_Name to set
     */
    public void setLang_Name(String lang_Name) {
        this.lang_Name = lang_Name;
    }

    public String toString() {
        return langId + " - " + lang_Name;
    }
}
