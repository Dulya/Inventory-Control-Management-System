/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.cmjd31.inventorycontrolsystem.view.customer;

import com.ijse.cmjd31.inventorycontrolsystem.controller.CustomerController;
import com.ijse.cmjd31.inventorycontrolsystem.model.Customer;
import com.ijse.cmjd31.inventorycontrolsystem.other.IdGenerator;
import java.awt.Color;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 1
 */
public class AddCustomerForm extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    private boolean b;

    public AddCustomerForm() {
        initComponents();
        String nextId;
        try {
            nextId = IdGenerator.getNextId("Customer", "idCustomer", "C");
            idText.setText(nextId);
            nameText.requestFocus();
        } catch (SQLException ex) {
            Logger.getLogger(AddCustomerForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddCustomerForm.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        addressText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        limitText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        contactText = new javax.swing.JTextField();
        nameText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        nicLabel = new javax.swing.JLabel();
        nicText = new javax.swing.JTextField();
        registerButton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        idText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        setPreferredSize(new java.awt.Dimension(820, 560));
        setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel3.setPreferredSize(new java.awt.Dimension(820, 560));
        jPanel3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPanel3KeyReleased(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Customer Details", 0, 0, new java.awt.Font("Baskerville Old Face", 1, 14))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Customer Name");

        addressText.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        addressText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTextActionPerformed(evt);
            }
        });
        addressText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                addressTextKeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Credit Limit");

        limitText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limitTextActionPerformed(evt);
            }
        });
        limitText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                limitTextKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Address");

        contactText.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        contactText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactTextActionPerformed(evt);
            }
        });
        contactText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                contactTextKeyReleased(evt);
            }
        });

        nameText.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextActionPerformed(evt);
            }
        });
        nameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameTextKeyReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Contact");

        nicLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nicLabel.setText("Nic Number");

        nicText.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nicText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nicTextActionPerformed(evt);
            }
        });
        nicText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nicTextKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nicLabel)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nicText, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(contactText, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addressText, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(limitText, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(179, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nicText, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(nicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(contactText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(limitText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        registerButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        registerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/contact-new-3.png"))); // NOI18N
        registerButton.setText("Register - F1");
        registerButton.setEnabled(false);
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        idText.setEditable(false);
        idText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextActionPerformed(evt);
            }
        });
        idText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idTextKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("New Customer Id");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Add Customer Form");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(registerButton)
                            .addGap(648, 648, 648))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(95, 95, 95)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        add(jPanel3);
        jPanel3.setBounds(0, 0, 820, 560);
    }// </editor-fold>//GEN-END:initComponents

    private void addressTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTextActionPerformed
        contactText.requestFocus();
        addressText.setBackground(Color.LIGHT_GRAY);
        addressText.setForeground(Color.WHITE);
    }//GEN-LAST:event_addressTextActionPerformed

    private void addressTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addressTextKeyReleased
        check();
    }//GEN-LAST:event_addressTextKeyReleased

    private void limitTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limitTextActionPerformed
        limitText.setBackground(Color.LIGHT_GRAY);
        limitText.setForeground(Color.WHITE);
        registerButton.setEnabled(true);
        registerButton.doClick();
    }//GEN-LAST:event_limitTextActionPerformed

    private void limitTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_limitTextKeyReleased
        check();
        String credit = limitText.getText();
        if (!credit.isEmpty()) {
            boolean res = credit.matches("[0-9]+[.]?[0-10]{0,2}");
            if (!res) {
                limitText.setText(credit.substring(0, credit.length() - 1));
            }
        }
    }//GEN-LAST:event_limitTextKeyReleased

    private void contactTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactTextActionPerformed
        limitText.requestFocus();
        contactText.setForeground(Color.WHITE);

    }//GEN-LAST:event_contactTextActionPerformed

    private void contactTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contactTextKeyReleased
        check();
        String contact = contactText.getText();
        if (!contact.matches("[0-9]{0,10}")) {
            contact = contact.substring(0, contact.length() - 1);
            contactText.setText(contact);
        }
        boolean res = contact.matches("0[0,9][0,8][0,9]{7}");
        if (!res) {
            contactText.setBackground(Color.LIGHT_GRAY);
        } else {
            contactText.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_contactTextKeyReleased

    private void nameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextActionPerformed

        nameText.setBackground(Color.LIGHT_GRAY);
        nameText.setForeground(Color.WHITE);
        String name = nameText.getText();
        try {
            boolean b = CustomerController.duplicateCustomer(name);
            if (b == true) {
                JOptionPane.showMessageDialog(null, "Customer " + nameText.getText() + " allready exists !");
                nameText.setText("");
            } else {
                nicText.requestFocus();
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddCustomerForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddCustomerForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_nameTextActionPerformed

    private void nameTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTextKeyReleased
        check();
    }//GEN-LAST:event_nameTextKeyReleased

    private void nicTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nicTextActionPerformed
        check();
        addressText.requestFocus();
        nicText.setBackground(Color.LIGHT_GRAY);
        nicText.setForeground(Color.WHITE);
    }//GEN-LAST:event_nicTextActionPerformed

    private void nicTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nicTextKeyReleased
        check();
        String text = nicText.getText();
        if (text.length() > 0) {
            int caretPosition = nicText.getCaretPosition();
            if (!text.matches("^[0-9]{0,9}[vVxX]?$")) {
                text = text.substring(0, caretPosition - 1) + text.substring(caretPosition);
                nicText.setText(text);
                nicText.setCaretPosition(caretPosition - 1);
            }
        }
    }//GEN-LAST:event_nicTextKeyReleased

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to add Customer " + nameText.getText(), "Confirm", JOptionPane.YES_NO_OPTION);
        if (response == 0) {
            Customer customer = new Customer(idText.getText(), nameText.getText(), addressText.getText(), nicText.getText(), Integer.parseInt(contactText.getText()), Double.parseDouble(limitText.getText()));
            int res;
            try {
                res = CustomerController.addCustomer(customer);
                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "Customer Added Successfully");
                    idText.setBackground(Color.WHITE);
                    idText.setForeground(Color.BLACK);
                    idText.requestFocus();
                    idText.setText("");
                    nameText.setBackground(Color.WHITE);
                    nameText.setForeground(Color.BLACK);
                    nameText.setText("");
                    nicText.setBackground(Color.WHITE);
                    nicText.setForeground(Color.BLACK);
                    nicText.setText("");
                    addressText.setBackground(Color.WHITE);
                    addressText.setForeground(Color.BLACK);
                    addressText.setText("");
                    contactText.setBackground(Color.WHITE);
                    contactText.setForeground(Color.BLACK);
                    contactText.setText("");
                    limitText.setBackground(Color.WHITE);
                    limitText.setForeground(Color.BLACK);
                    limitText.setText("");
                    idText.requestFocus();
                    idText.setEnabled(true);
                    nameText.setEnabled(true);
                    nicText.setEnabled(true);
                    addressText.setEnabled(true);
                    contactText.setEnabled(true);
                    limitText.setEnabled(true);
                    String nextId = IdGenerator.getNextId("Customer", "idCustomer", "C");
                    idText.setText(nextId);
                }
            } catch (SQLException ex) {
                Logger.getLogger(AddCustomerForm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AddCustomerForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_registerButtonActionPerformed

    private void idTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextActionPerformed
        check();
        nameText.requestFocus();
        idText.setBackground(Color.LIGHT_GRAY);
        idText.setForeground(Color.WHITE);
    }//GEN-LAST:event_idTextActionPerformed

    private void idTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idTextKeyReleased
        check();
    }//GEN-LAST:event_idTextKeyReleased

    private void jPanel3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel3KeyReleased
    }//GEN-LAST:event_jPanel3KeyReleased
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressText;
    private javax.swing.JTextField contactText;
    private javax.swing.JTextField idText;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField limitText;
    private javax.swing.JTextField nameText;
    private javax.swing.JLabel nicLabel;
    private javax.swing.JTextField nicText;
    private javax.swing.JButton registerButton;
    // End of variables declaration//GEN-END:variables

    public void check() {
        boolean bool = idText.getText().isEmpty() || limitText.getText().isEmpty() || nameText.getText().isEmpty() || nicText.getText().isEmpty() || addressText.getText().isEmpty() || contactText.getText().isEmpty();
        if (bool != true) {
            registerButton.setEnabled(true);
        } else {
            registerButton.setEnabled(false);
        }
    }
}
