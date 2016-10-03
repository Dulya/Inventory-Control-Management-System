/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.cmjd31.inventorycontrolsystem.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 1
 */
public class BackUp {

    public static boolean newBackupDB(String path) throws IOException, InterruptedException {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date curDate = new Date();
        String date = dateFormat.format(curDate);
        Runtime runTime = Runtime.getRuntime();
        Process runtimeProcess = runTime.exec("mysqldump bookshop -h localhost -u root -pmysql -r " + path  +""+date+".sql");
        int waitFor = runtimeProcess.waitFor();
        if (waitFor == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean restoreDB(String dbUserName, String dbPassword, String source) throws IOException, InterruptedException {

        String[] executeCmd = new String[]{"mysql", "bookshop", "--user=" + dbUserName, "--password=" + dbPassword, "-e", "source " + source};
        Process runtimeProcess;
        int processComplete = -1;
        try {
            runtimeProcess = Runtime.getRuntime().exec(executeCmd);
            processComplete = runtimeProcess.waitFor();
        } catch (IOException | InterruptedException ex) {
            Logger.getLogger(BackUp.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (processComplete == 0) {
            return true;
        } else {
            return false;
        }
    }
}
