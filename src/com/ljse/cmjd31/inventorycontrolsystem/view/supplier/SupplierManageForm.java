/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ljse.cmjd31.inventorycontrolsystem.view.supplier;

import com.ijse.cmjd31.inventorycontrolsystem.other.ChangeColor;
import com.ijse.cmjd31.inventorycontrolsystem.view.customer.*;
import com.ljse.cmjd31.inventorycontrolsystem.view.book.*;
import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author 1
 */
public class SupplierManageForm extends javax.swing.JPanel {

    /**
     * Creates new form BookForm
     */
    public SupplierManageForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dPane1 = new javax.swing.JDesktopPane();
        managePanel = new javax.swing.JPanel();
        manageLabel = new javax.swing.JLabel();
        viewPanel = new javax.swing.JPanel();
        viewLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        dPane1.setBackground(new java.awt.Color(255, 255, 255));
        add(dPane1);
        dPane1.setBounds(0, 43, 1210, 600);

        managePanel.setBackground(new java.awt.Color(0, 51, 102));
        managePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        manageLabel.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        manageLabel.setForeground(new java.awt.Color(255, 255, 255));
        manageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manageLabel.setText("Manage Supplier");
        manageLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                manageLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                manageLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout managePanelLayout = new javax.swing.GroupLayout(managePanel);
        managePanel.setLayout(managePanelLayout);
        managePanelLayout.setHorizontalGroup(
            managePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(managePanelLayout.createSequentialGroup()
                .addComponent(manageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        managePanelLayout.setVerticalGroup(
            managePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(manageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        add(managePanel);
        managePanel.setBounds(300, 0, 250, 40);

        viewPanel.setBackground(new java.awt.Color(0, 51, 102));
        viewPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        viewLabel.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        viewLabel.setForeground(new java.awt.Color(255, 255, 255));
        viewLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewLabel.setText("View All Suppliers");
        viewLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                viewLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout viewPanelLayout = new javax.swing.GroupLayout(viewPanel);
        viewPanel.setLayout(viewPanelLayout);
        viewPanelLayout.setHorizontalGroup(
            viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewPanelLayout.createSequentialGroup()
                .addComponent(viewLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );
        viewPanelLayout.setVerticalGroup(
            viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(viewLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        add(viewPanel);
        viewPanel.setBounds(550, 0, 290, 40);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        add(jPanel1);
        jPanel1.setBounds(0, 0, 300, 40);

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        add(jPanel2);
        jPanel2.setBounds(840, 0, 370, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void manageLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageLabelMousePressed
        dPane1.removeAll();
        dPane1.repaint();
        ManageSupplierForm frame = new ManageSupplierForm();
        dPane1.add(frame);
        frame.setVisible(true);
        frame.setBounds(200, 5, 740, 525);
        frame.nameText.requestFocus();
        sameColor();
        ChangeColor changeColor = new ChangeColor(managePanel);
    }//GEN-LAST:event_manageLabelMousePressed

    private void viewLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewLabelMousePressed
        dPane1.removeAll();
        dPane1.repaint();
        ViewAllSuppliersForm frame = new ViewAllSuppliersForm();
        dPane1.add(frame);
        frame.setVisible(true);
        frame.setBounds(200, 5, 815, 513);
        sameColor();
        ChangeColor changeColor = new ChangeColor(viewPanel);
    }//GEN-LAST:event_viewLabelMousePressed

    private void manageLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageLabelMouseEntered
        manageLabel.setFont(new Font("Andalus", 4, 22));
    }//GEN-LAST:event_manageLabelMouseEntered

    private void manageLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageLabelMouseExited
        manageLabel.setFont(new Font("Andalus", 4, 18));
    }//GEN-LAST:event_manageLabelMouseExited

    private void viewLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewLabelMouseEntered
        viewLabel.setFont(new Font("Andalus", 4, 22));
    }//GEN-LAST:event_viewLabelMouseEntered

    private void viewLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewLabelMouseExited
        viewLabel.setFont(new Font("Andalus", 4, 18));
    }//GEN-LAST:event_viewLabelMouseExited
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel manageLabel;
    private javax.swing.JPanel managePanel;
    private javax.swing.JLabel viewLabel;
    private javax.swing.JPanel viewPanel;
    // End of variables declaration//GEN-END:variables
    public void sameColor() {
        managePanel.setBackground(new Color(0, 51, 102));
        viewPanel.setBackground(new Color(0, 51, 102));
    }
}
