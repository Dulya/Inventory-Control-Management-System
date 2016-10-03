/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.cmjd31.inventorycontrolsyatem.view.reportform;

import com.ijse.cmjd31.inventorycontrolsystem.controller.PurchaseOrderController;
import com.ijse.cmjd31.inventorycontrolsystem.db.DBConnection;
import com.ijse.cmjd31.inventorycontrolsystem.model.PurchaseOrder;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author 1
 */
public class PurchaseReportForm extends javax.swing.JPanel {

    /**
     * Creates new form SalesReportForm
     */
    SimpleDateFormat sdf;

    public PurchaseReportForm() {
        initComponents();
        sdf = new SimpleDateFormat("yyyy-MM-dd");
        rangeButton.setSelected(true);
        startDateCombo.setEnabled(true);
        endDateCombo.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        endDateCombo = new org.jdesktop.swingx.JXDatePicker();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        generateButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        startDateCombo = new org.jdesktop.swingx.JXDatePicker();
        annualButton = new javax.swing.JRadioButton();
        monthlyButton = new javax.swing.JRadioButton();
        rangeButton = new javax.swing.JRadioButton();
        yearText1 = new javax.swing.JTextField();
        monthCombo = new javax.swing.JComboBox();
        yearText = new javax.swing.JTextField();

        jLabel5.setText("jLabel5");

        jTextField1.setText("jTextField1");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        endDateCombo.setEnabled(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Generate Purchase Transaction Report");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("To");

        generateButton.setText("Generate");
        generateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("From");

        startDateCombo.setEnabled(false);

        annualButton.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(annualButton);
        annualButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        annualButton.setText("Generate Annual Purchase Order Report");
        annualButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annualButtonActionPerformed(evt);
            }
        });

        monthlyButton.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(monthlyButton);
        monthlyButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        monthlyButton.setText("Generate Monthly Purchase Order  Report");
        monthlyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthlyButtonActionPerformed(evt);
            }
        });

        rangeButton.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rangeButton);
        rangeButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rangeButton.setText("Generate Purchase Order Report for given Date Range");
        rangeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rangeButtonActionPerformed(evt);
            }
        });

        yearText1.setEnabled(false);
        yearText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearText1ActionPerformed(evt);
            }
        });

        monthCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        monthCombo.setEnabled(false);

        yearText.setEnabled(false);
        yearText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(generateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(13, 13, 13)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(startDateCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(monthlyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(annualButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(54, 54, 54)
                                                .addComponent(endDateCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(yearText, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                                    .addComponent(yearText1))
                                                .addGap(18, 18, 18)
                                                .addComponent(monthCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(rangeButton))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(rangeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(endDateCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(startDateCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(generateButton))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(monthlyButton)
                            .addComponent(yearText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(monthCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(annualButton)
                            .addComponent(yearText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void monthlyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthlyButtonActionPerformed
        yearText.setEnabled(false);
        yearText1.setEnabled(true);
        yearText.setText("");
        yearText1.setText("");
        startDateCombo.setEnabled(false);
        endDateCombo.setEnabled(false);
        monthCombo.setEnabled(true);
    }//GEN-LAST:event_monthlyButtonActionPerformed

    private void annualButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annualButtonActionPerformed
        yearText.setEnabled(true);
        yearText1.setEnabled(false);
        yearText.setText("");
        yearText1.setText("");
        startDateCombo.setEnabled(false);
        endDateCombo.setEnabled(false);
        monthCombo.setEnabled(false);
    }//GEN-LAST:event_annualButtonActionPerformed

    private void generateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateButtonActionPerformed
        try {
            if (monthlyButton.isSelected()) {
                yearText1.requestFocus();
                if (yearText1.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please mention the year to generate Report! ");
                } else {
                    int year = Integer.parseInt(yearText1.getText());
                    int i = monthCombo.getSelectedIndex();
                    List<PurchaseOrder> invoiceList = PurchaseOrderController.checkPurchaseMonth(year, i + 1);
                    if (invoiceList.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Purchase Transactions are not found for given month!");
                    } else {
                        JasperReport jr = JasperCompileManager.compileReport("./jasperreport/MonthlyPurchaseReport.jrxml");
                        Map<String, Object> params = new HashMap<>();
                        params.put("YEAR", year);
                        params.put("MONTH", i + 1);
                        JasperPrint jp = JasperFillManager.fillReport(jr, params, DBConnection.getInstance().getConnection());
                        JasperViewer.viewReport(jp, false);
                    }
                }
            } else if (rangeButton.isSelected()) {
                if (startDateCombo.getDate() == null || endDateCombo.getDate() == null) {
                    JOptionPane.showMessageDialog(new CreditReportForm(), "Please select a date range to generate report!");
                } else {
                    Date date1 = startDateCombo.getDate();
                    Date date2 = endDateCombo.getDate();
                    String startDate = sdf.format(date1);
                    String endDate = sdf.format(date2);
                    JasperReport jr = JasperCompileManager.compileReport("./jasperreport/DateRangePurchaseReport.jrxml");
                    Map<String, Object> params = new HashMap<>();
                    params.put("START_DATE", startDate);
                    params.put("END_DATE", endDate);
                    JasperPrint jp = JasperFillManager.fillReport(jr, params, DBConnection.getInstance().getConnection());
                    JasperViewer.viewReport(jp, false);
                }
            } else if (annualButton.isSelected()) {
                yearText.requestFocus();
                if (yearText.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please mention the year to generate Report! ");
                } else {
                    int year = Integer.parseInt(yearText.getText());
                    List<PurchaseOrder> orderList = PurchaseOrderController.checkPurchaseYear(year);
                    if (orderList.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Purchase Transactions are not found for given Year!");
                    } else {
                        JasperReport jr = JasperCompileManager.compileReport("./jasperreport/AnnualPurchaseReport.jrxml");
                        Map<String, Object> params = new HashMap<>();
                        params.put("YEAR", year);
                        JasperPrint jp = JasperFillManager.fillReport(jr, params, DBConnection.getInstance().getConnection());
                        JasperViewer.viewReport(jp, false);
                    }
                }
            }
        } catch (JRException ex) {
            Logger.getLogger(SalesReportForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SalesReportForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SalesReportForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_generateButtonActionPerformed

    private void yearText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearText1ActionPerformed

    private void rangeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rangeButtonActionPerformed
        yearText.setEnabled(false);
        yearText1.setEnabled(false);
        startDateCombo.setEnabled(true);
        endDateCombo.setEnabled(true);
        monthCombo.setEnabled(false);
        yearText.setText("");
        yearText1.setText("");

    }//GEN-LAST:event_rangeButtonActionPerformed

    private void yearTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearTextActionPerformed
    }//GEN-LAST:event_yearTextActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton annualButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private org.jdesktop.swingx.JXDatePicker endDateCombo;
    private javax.swing.JButton generateButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    private javax.swing.JComboBox monthCombo;
    private javax.swing.JRadioButton monthlyButton;
    private javax.swing.JRadioButton rangeButton;
    private org.jdesktop.swingx.JXDatePicker startDateCombo;
    private javax.swing.JTextField yearText;
    private javax.swing.JTextField yearText1;
    // End of variables declaration//GEN-END:variables
}
