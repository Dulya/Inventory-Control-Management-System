/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.cmjd31.inventorycontrolsystem.view.login;

import com.ijse.cmjd31.inventorycontrolsystem.controller.UserController;
import com.ijse.cmjd31.inventorycontrolsystem.db.DBConnection;
import com.ijse.cmjd31.inventorycontrolsystem.main.MainFrame;
import com.ijse.cmjd31.inventorycontrolsystem.other.AutoCreateDatabase;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author 1
 */
public class SplashScreen extends javax.swing.JFrame {

    /**
     * Creates new form SplashScreen
     */
    /**
     * Creates new form SplashScreen
     */
    Random r = new Random();
    Timer timer;

    public SplashScreen() throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
        new Thread() {
            public void run() {
                int delay = r.nextInt(200) + 50;
                while (true) {
                    try {
                        Thread.sleep(delay);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(SplashScreen.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    pBar.setValue(pBar.getValue() + 1);
                    int value = pBar.getValue();
                    switch (value) {
                        case 5:
                            label.setText("Loading...");
                            pBar.setValue(15);
                            break;
                        case 20:
                            label.setText("Connecting Database...");
                            pBar.setValue(40);
                            break;
                        case 30:
                            label.setText("Crate Database....");
                            boolean bool = AutoCreateDatabase.createDatabase();

                            if (bool) {
                                JOptionPane.showMessageDialog(null, "Database has Created Successfully !");
                            }
                            break;
                        case 60:
                            label.setText("Checking Database...");
                            checkdatabase();
                    }
                    if (value == 100) {
                        dispose();
                        int count;
                        try {
                            count = UserController.getUserCount();
                            if (count == 0) {
                                NewProfileForm form = new NewProfileForm(null, true);
                                form.setVisible(true);
                                if (form.createNewUser) {
                                    int res = JOptionPane.showConfirmDialog(null, "Do you want to log in to System?", "Confirm", JOptionPane.YES_NO_OPTION);
                                    if (res == 0) {
                                        LoginForm logForm = new LoginForm();
                                        logForm.setVisible(true);
                                        logForm.imageLabel.setVisible(false);
                                        logForm.quoteLabel.setVisible(false);
                                        logForm.nameLabel.setVisible(false);
                                        logForm.passwordLabel.setVisible(false);
                                        logForm.nameField.setVisible(false);
                                        logForm.passwordField.setVisible(false);
                                        logForm.logPanel.setVisible(false);
                                        logForm.logLabel.setVisible(false);
                                        logForm.animatedLabel.setVisible(true);
                                        jPanel1.setBackground(new Color(0, 0, 0));

                                        timer = new Timer(3500, new ActionListener() {
                                            boolean b = false;

                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                if (!b) {
                                                    dispose();
                                                    MainFrame frame = new MainFrame(false);
                                                    frame.setVisible(true);
                                                    b = true;
                                                    timer.stop();
                                                }
                                            }
                                        });
                                        timer.start();
                                    } else {
                                        System.exit(0);
                                    }
                                }
                            } else {
                                LoginForm form = new LoginForm();
                                form.setVisible(true);

                            }

                        } catch (SQLException ex) {
                            Logger.getLogger(SplashScreen.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(SplashScreen.class.getName()).log(Level.SEVERE, null, ex);
                        }

                        break;
                    }

                }
            }
        }.start();
    }

//        panel=new JPanel(){
//    
//          @Override
//          protected void paintComponent( Graphics g) {
//               Graphics2D gd = (Graphics2D) g;
//              super.paintComponent(g);
//               image = Toolkit.getDefaultToolkit().createImage("./src/image/299.GIF");  
//    if (image != null) {  
//      g.drawImage(image, 0, 0, this);  
//    }   
//    
//           }
//        };
//    panel.add(imagePanel);
    //  timer = new Timer(250, new ActionListener() {
    //    @Override
    //  public void actionPerformed(ActionEvent arg0) {
//                pBar.setValue(pBar.getValue() + 2);
//                int value = pBar.getValue();
//                switch (value) {
//                    case 10:
//                        label.setText("plugin - textfields");
//                        break;
//                    case 30:
//                        label.setText("plugin - buttons");
//                        break;
//                    case 50:
//                        label.setText("Check database.....");
//                        checkdatabase();
//                        break;
//                }
//                if (value == 100) {
//                    timer.stop();
//                    dispose();
//                    LoginForm loginForm = new LoginForm();
//                    loginForm.nameField.requestFocus();
//                    loginForm.setVisible(true);
//                }
//            
    private static void checkdatabase() {
        try {

            Connection connection = DBConnection.getInstance().getConnection();
        } catch (SQLException ex) {
            if (ex.getMessage().contains("Unknown database")) {
                String databaseName = JOptionPane.showInputDialog("<html><p><font><font color=#DC143C><font size=4><b>Please Enter the Database name...</font></p></html>\n" + ex.getMessage());
                if (databaseName == null) {
                    System.exit(0);
                }
                try {
                    File file = new File("dbconfig.properties");
                    Properties prop = new Properties();
                    FileInputStream fileInputStream = new FileInputStream(file);
                    prop.load(fileInputStream);
                    prop.setProperty("jdbc_dbName", databaseName);
                    prop.store(new FileOutputStream(file), "");
                    checkdatabase();  //check again entered name is correct
                } catch (IOException ex1) {
                    Logger.getLogger(java.awt.SplashScreen.class.getName()).log(Level.SEVERE, null, ex1);
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(java.awt.SplashScreen.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        pBar = new javax.swing.JProgressBar();
        label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/dd5.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 360));

        panel.setBackground(new java.awt.Color(102, 102, 102));

        pBar.setBackground(new java.awt.Color(153, 255, 204));

        label.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        label.setForeground(new java.awt.Color(255, 255, 255));
        label.setText("Loading......");
        label.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pBar, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel1.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 630, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new SplashScreen().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(SplashScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label;
    private javax.swing.JProgressBar pBar;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
