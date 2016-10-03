/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorycontrolsystem;

import com.ijse.cmjd31.inventorycontrolsystem.view.login.SplashScreen;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.UIManager;

/**
 *
 * @author 1
 */
public class InventoryControlSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        SplashScreen frame;
        try {
            frame = new SplashScreen();
            frame.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(InventoryControlSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
