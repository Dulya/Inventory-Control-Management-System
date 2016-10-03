/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ljse.cmjd31.inventorycontrolsystem.view.supplier;

import com.ijse.cmjd31.inventorycontrolsystem.controller.SupplierController;
import com.ijse.cmjd31.inventorycontrolsystem.model.Supplier;
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
public class ManageSupplierForm extends javax.swing.JPanel {

    /**
     * Creates new form SupplierAdd
     */
    private boolean b;

    public ManageSupplierForm() {
        initComponents();
        fillIdCombo();
        String nextId;
        try {
            nextId = IdGenerator.getNextId("Supplier", "idSupplier", "S");
            idText.setText(nextId);
            idText.requestFocus();
        } catch (SQLException ex) {
            Logger.getLogger(ManageSupplierForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManageSupplierForm.class.getName()).log(Level.SEVERE, null, ex);
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
        emailLabel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        contactText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        contactLabel = new javax.swing.JLabel();
        faxText = new javax.swing.JTextField();
        nameText = new javax.swing.JTextField();
        faxLabel = new javax.swing.JLabel();
        addressLabel1 = new javax.swing.JLabel();
        addressText = new javax.swing.JTextField();
        registerButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        claerButton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        idText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        idComboBox = new javax.swing.JComboBox();

        setPreferredSize(new java.awt.Dimension(830, 505));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        emailLabel.setBackground(new java.awt.Color(255, 255, 255));
        emailLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Supplier Details", 0, 0, new java.awt.Font("Baskerville Old Face", 1, 14))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Supplier Name");

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

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Email");

        emailText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextActionPerformed(evt);
            }
        });
        emailText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailTextKeyReleased(evt);
            }
        });

        contactLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        contactLabel.setText("Contact");

        faxText.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        faxText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faxTextActionPerformed(evt);
            }
        });
        faxText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                faxTextKeyReleased(evt);
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

        faxLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        faxLabel.setText("Fax");

        addressLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        addressLabel1.setText("Address");

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

        javax.swing.GroupLayout emailLabelLayout = new javax.swing.GroupLayout(emailLabel);
        emailLabel.setLayout(emailLabelLayout);
        emailLabelLayout.setHorizontalGroup(
            emailLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emailLabelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(emailLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(emailLabelLayout.createSequentialGroup()
                        .addGroup(emailLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addressLabel1)
                            .addComponent(faxLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(emailLabelLayout.createSequentialGroup()
                        .addGroup(emailLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(emailLabelLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addGroup(emailLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addressText, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(emailLabelLayout.createSequentialGroup()
                                .addComponent(contactLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addGroup(emailLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(faxText, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(contactText, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        emailLabelLayout.setVerticalGroup(
            emailLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emailLabelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(emailLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(emailLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addressText, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(emailLabelLayout.createSequentialGroup()
                        .addComponent(addressLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(emailLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(contactLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contactText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(emailLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(emailLabelLayout.createSequentialGroup()
                        .addComponent(faxText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(emailLabelLayout.createSequentialGroup()
                        .addComponent(faxLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
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

        updateButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        updateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/update-product.png"))); // NOI18N
        updateButton.setText("Update - F2");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/user-delete-2.png"))); // NOI18N
        deleteButton.setText("Delete - F3");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        claerButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        claerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/edit-clear-2.png"))); // NOI18N
        claerButton.setText("Clear - F4");
        claerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                claerButtonActionPerformed(evt);
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

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("New Supplier Id");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
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
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Manage Supplier Form");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 10, 660, 30);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Serach Supplier", 0, 0, new java.awt.Font("Baskerville Old Face", 1, 14))); // NOI18N

        idComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        idComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(idComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(idComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(emailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(58, 58, 58))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(updateButton)
                .addGap(43, 43, 43)
                .addComponent(deleteButton)
                .addGap(48, 48, 48)
                .addComponent(claerButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteButton)
                    .addComponent(claerButton)
                    .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void contactTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactTextActionPerformed
        faxText.requestFocus();
        contactText.setBackground(Color.LIGHT_GRAY);
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

    private void emailTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextActionPerformed
        emailText.setBackground(Color.LIGHT_GRAY);
        emailText.setForeground(Color.WHITE);
        registerButton.setEnabled(true);
        registerButton.doClick();
    }//GEN-LAST:event_emailTextActionPerformed

    private void emailTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailTextKeyReleased
        check();

    }//GEN-LAST:event_emailTextKeyReleased

    private void faxTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faxTextActionPerformed
        emailText.requestFocus();
        faxText.setForeground(Color.WHITE);
        faxText.setBackground(Color.LIGHT_GRAY);

    }//GEN-LAST:event_faxTextActionPerformed

    private void faxTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_faxTextKeyReleased
        check();

    }//GEN-LAST:event_faxTextKeyReleased

    private void nameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextActionPerformed

        nameText.setBackground(Color.LIGHT_GRAY);
        nameText.setForeground(Color.WHITE);
        String name = nameText.getText();
        try {
            boolean b = SupplierController.duplicateSuppliers(name);
            if (b == true) {
                JOptionPane.showMessageDialog(null, "Supplier " + nameText.getText() + " allready exists !");
                nameText.setText("");
            } else {
                addressText.requestFocus();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManageSupplierForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManageSupplierForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_nameTextActionPerformed

    private void nameTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTextKeyReleased
        check();
    }//GEN-LAST:event_nameTextKeyReleased

    private void addressTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTextActionPerformed
        check();
        contactText.requestFocus();
        addressText.setBackground(Color.LIGHT_GRAY);
        addressText.setForeground(Color.WHITE);
    }//GEN-LAST:event_addressTextActionPerformed

    private void addressTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addressTextKeyReleased
        check();
    }//GEN-LAST:event_addressTextKeyReleased

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to add Supplier " + nameText.getText(), "Confirm", JOptionPane.YES_NO_OPTION);
        if (response == 0) {
            Supplier supplier = new Supplier(idText.getText(), nameText.getText(), addressText.getText(), faxText.getText(), emailText.getText(), Integer.parseInt(contactText.getText()));
            int res;
            try {
                res = SupplierController.addSupplier(supplier);
                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "Supplier Added Successfully");
                    idText.setBackground(Color.WHITE);
                    idText.setForeground(Color.BLACK);
                    idText.requestFocus();
                    nameText.setBackground(Color.WHITE);
                    nameText.setForeground(Color.BLACK);
                    addressText.setBackground(Color.WHITE);
                    addressText.setForeground(Color.BLACK);
                    contactText.setBackground(Color.WHITE);
                    contactText.setForeground(Color.BLACK);
                    faxText.setBackground(Color.WHITE);
                    faxText.setForeground(Color.BLACK);
                    emailText.setBackground(Color.WHITE);
                    emailText.setForeground(Color.BLACK);
                    idText.requestFocus();
                    idText.setEnabled(true);
                    nameText.setEnabled(true);
                    addressText.setEnabled(true);
                    contactText.setEnabled(true);
                    faxText.setEnabled(true);
                    emailText.setEnabled(true);
                    String nextId = IdGenerator.getNextId("Supplier", "idSupplier", "S");
                    idText.setText(nextId);
                    claerButton.doClick();
                }
            } catch (SQLException ex) {
                Logger.getLogger(ManageSupplierForm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ManageSupplierForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_registerButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed

        nameText.setEnabled(true);
        addressText.setEnabled(true);
        contactText.setEnabled(true);
        faxText.setEnabled(true);
        emailText.setEnabled(true);
        if (idText.getText().isEmpty() && !nameText.getText().isEmpty()) {
            int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to update Supplier " + nameText.getText() + " ? ", "Confirm", JOptionPane.YES_NO_OPTION);
            if (response == 0) {
                Supplier supplier = (Supplier) idComboBox.getSelectedItem();
                Supplier supplier1 = new Supplier(supplier.getSupplierId(), nameText.getText(), addressText.getText(), faxText.getText(), emailText.getText(), Integer.parseInt(contactText.getText()));
                int res;
                try {
                    res = SupplierController.updateSupplier(supplier1);
                    if (res > 0) {
                        JOptionPane.showMessageDialog(null, "Updated Successfully..");
                        idText.setText("");
                        nameText.setText("");
                        addressText.setText("");
                        contactText.setText("");
                        faxText.setText("");
                        emailText.setText("");
                        idText.setEnabled(true);
                        idText.setEditable(true);
                        nameText.setEnabled(true);
                        addressText.setEnabled(true);
                        contactText.setEnabled(true);
                        faxText.setEnabled(true);
                        emailText.setEnabled(true);
                        idText.setBackground(Color.WHITE);
                        idText.requestFocus();
                        String nextId = IdGenerator.getNextId("Supplier", "idSupplier", "S");
                        idText.setText(nextId);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ManageSupplierForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ManageSupplierForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a Supplier from Supplier Box to Update!");
            idText.setEnabled(true);
            nameText.setEnabled(true);
            addressText.setEnabled(true);
            contactText.setEnabled(true);
            faxText.setEnabled(true);
            emailText.setEnabled(true);
            idText.requestFocus();
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        idText.setEnabled(false);
        nameText.setEnabled(false);
        addressText.setEnabled(false);
        contactText.setEnabled(false);
        faxText.setEnabled(false);
        emailText.setEnabled(false);
        if (idText.getText().isEmpty() && !nameText.getText().isEmpty()) {
            Supplier supplier = (Supplier) idComboBox.getSelectedItem();
            int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete Supplier " + supplier.getSupplierName() + " ? ", "Confirm", JOptionPane.YES_NO_OPTION);
            if (response == 0) {
                int res;
                try {
                    res = SupplierController.deleteSupplier(supplier.getSupplierId());
                    if (res > 0) {
                        JOptionPane.showMessageDialog(null, "Deleted Successfully !");
                        idText.setText("");
                        nameText.setText("");
                        addressText.setText("");
                        contactText.setText("");
                        faxText.setText("");
                        emailText.setText("");
                        idText.setEnabled(true);
                        idText.setEditable(true);
                        nameText.setEnabled(true);
                        addressText.setEnabled(true);
                        contactText.setEnabled(true);
                        faxText.setEnabled(true);
                        emailText.setEnabled(true);
                        String nextId = IdGenerator.getNextId("Supplier", "idSupplier", "S");
                        idText.setText(nextId);
                        idText.setBackground(Color.WHITE);
                        idText.requestFocus();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ManageSupplierForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ManageSupplierForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                idText.setEnabled(true);
                nameText.setEnabled(true);
                addressText.setEnabled(true);
                contactText.setEnabled(true);
                faxText.setEnabled(true);
                emailText.setEnabled(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a Supplier from Supplier box to Delete!");
            idText.setEnabled(true);
            nameText.setEnabled(true);
            addressText.setEnabled(true);
            contactText.setEnabled(true);
            faxText.setEnabled(true);
            emailText.setEnabled(true);
            idText.requestFocus();
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void claerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_claerButtonActionPerformed
        idText.setText("");
        idText.setEditable(true);
        idText.requestFocus();
        nameText.setText("");
        addressText.setText("");
        contactText.setText("");
        faxText.setText("");
        emailText.setText("");
        idText.setEnabled(true);
        idText.setEditable(true);
        idText.requestFocus();
        idText.setBackground(Color.WHITE);
        nameText.setEnabled(true);
        addressText.setEnabled(true);
        contactText.setEnabled(true);
        faxText.setEnabled(true);
        emailText.setEnabled(true);
        registerButton.setEnabled(false);
        try {
            String nextId = IdGenerator.getNextId("Supplier", "idSupplier", "S");
            idText.setText(nextId);
        } catch (SQLException ex) {
            Logger.getLogger(ManageSupplierForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManageSupplierForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_claerButtonActionPerformed

    private void idTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextActionPerformed
        check();
        nameText.requestFocus();
        idText.setBackground(Color.LIGHT_GRAY);
        idText.setForeground(Color.WHITE);
    }//GEN-LAST:event_idTextActionPerformed

    private void idComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idComboBoxActionPerformed
        if (b) {
            registerButton.setEnabled(false);
            Supplier supplier = (Supplier) idComboBox.getSelectedItem();
            idText.setEditable(false);
            idText.setBackground(Color.LIGHT_GRAY);
            nameText.requestFocus();
            idText.setText("");
            nameText.setText(supplier.getSupplierName());
            addressText.setText(supplier.getAddress());
            contactText.setText(Integer.toString(supplier.getContact()));
            faxText.setText(supplier.getFax());
            emailText.setText(supplier.getEmail());
        }
    }//GEN-LAST:event_idComboBoxActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel1;
    private javax.swing.JTextField addressText;
    private javax.swing.JButton claerButton;
    private javax.swing.JLabel contactLabel;
    private javax.swing.JTextField contactText;
    private javax.swing.JButton deleteButton;
    private javax.swing.JPanel emailLabel;
    private javax.swing.JTextField emailText;
    private javax.swing.JLabel faxLabel;
    private javax.swing.JTextField faxText;
    private javax.swing.JComboBox idComboBox;
    private javax.swing.JTextField idText;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    public javax.swing.JTextField nameText;
    private javax.swing.JButton registerButton;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
    public void check() {
        boolean bool = emailText.getText().isEmpty() || nameText.getText().isEmpty() || addressText.getText().isEmpty() || contactText.getText().isEmpty() || faxText.getText().isEmpty();
        if (bool != true) {
            registerButton.setEnabled(true);
        } else {
            registerButton.setEnabled(false);
        }
    }

    private void fillIdCombo() {
        List<Supplier> supplierList;
        try {
            supplierList = SupplierController.getAllSuppliers();
            b = false;
            idComboBox.removeAllItems();
            idComboBox.addItem("<select a Supplier>");
            for (Supplier supplier : supplierList) {
                idComboBox.addItem(supplier);
            }
            b = true;
        } catch (SQLException ex) {
            Logger.getLogger(ManageSupplierForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManageSupplierForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}