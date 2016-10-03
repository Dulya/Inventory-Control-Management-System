/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.cmjd31.inventorycontrolsystem.controller;

import com.ijse.cmjd31.inventorycontrolsystem.db.DBConnection;
import com.ijse.cmjd31.inventorycontrolsystem.model.Language;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 1
 */
public class LanguageController {

    public static int addLanguage(Language language) throws SQLException, ClassNotFoundException {
        String sql = "insert into Language values(?,?)";
        PreparedStatement preparedStatement = DBConnection.getInstance().getConnection().prepareStatement(sql);
        preparedStatement.setString(1, language.getLangId());
        preparedStatement.setString(2, language.getLang_Name());
        int res = preparedStatement.executeUpdate();
        return res;
    }

    public static int updateLanguage(Language language) throws SQLException, ClassNotFoundException {
        String sql = "update Language set idLanguage=? , languageName=? where idLanguage='" + language.getLangId() + "'";
        PreparedStatement preparedStatement = DBConnection.getInstance().getConnection().prepareStatement(sql);
        preparedStatement.setString(1, language.getLangId());
        preparedStatement.setString(2, language.getLang_Name());
        int res = preparedStatement.executeUpdate();
        return res;
    }

    public static int deleteLanguage(String id) throws SQLException, ClassNotFoundException {
        String sql = "delete from Language where idLanguage='" + id + "'";
        Statement stm = DBConnection.getInstance().getConnection().createStatement();
        int res = stm.executeUpdate(sql);
        return res;
    }

    public static List<Language> getAllLanguages() throws SQLException, ClassNotFoundException {
        String sql = "select * from Language ";
        Statement stm = DBConnection.getInstance().getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        List<Language> languageList = new ArrayList<>();
        while (rst.next()) {
            Language language = new Language(rst.getString(1), rst.getString(2));
            languageList.add(language);
        }
        return languageList;
    }

    public static String getLanguageName(String languageId) throws SQLException, ClassNotFoundException {
        String sql = "select languageName from Language where idLanguage='" + languageId + "'";
        Statement stm = DBConnection.getInstance().getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        String name = null;
        while (rst.next()) {
            name = rst.getString(1);

        }
        return name;
    }

    public static Language getLanguage(String languageId) throws SQLException, ClassNotFoundException {
        String sql = "select * from Language where idLanguage='" + languageId + "'";
        Statement stm = DBConnection.getInstance().getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        Language language = null;
        while (rst.next()) {
            language = new Language(rst.getString(1), rst.getString(2));
        }
        return language;
    }
}
