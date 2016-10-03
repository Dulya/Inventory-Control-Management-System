/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.cmjd31.inventorycontrolsystem.other;

import com.ijse.cmjd31.inventorycontrolsystem.db.DBConnection;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 1
 */
public class AutoCreateDatabase {
       private static int result;

    public static boolean createDatabase() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost", "root", "mysql");
            String sql = "create database bookshop";
            Statement stm = con.createStatement();
            int res = stm.executeUpdate(sql);
            if (res > 0) {
                File file = new File("./src/documents/db.txt");
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                Connection conn = DBConnection.getInstance().getConnection();
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    Statement statement = conn.createStatement();
                    result += statement.executeUpdate(line);
                }
            }
        } catch (ClassNotFoundException | SQLException | IOException ex) {
            Logger.getLogger(AutoCreateDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 21 <= result;
    }

    }
    

