/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.cmjd31.inventorycontrolsyatem.view.reportform;

import com.ijse.cmjd31.inventorycontrolsystem.controller.CustomerController;
import com.ijse.cmjd31.inventorycontrolsystem.controller.InvoiceController;
import com.ijse.cmjd31.inventorycontrolsystem.db.DBConnection;
import com.ijse.cmjd31.inventorycontrolsystem.model.Customer;
import com.ijse.cmjd31.inventorycontrolsystem.model.Invoice;
import java.awt.Color;
import java.awt.event.KeyEvent;
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
public class CreditReportForm extends javax.swing.JPanel {

    /**
     * Creates new form SalesReportForm
     */
    SimpleDateFormat sdf;
    private boolean b;

    public CreditReportForm() {
        initComponents();
        sdf = new SimpleDateFormat("yyyy-MM-dd");
        fillCustomerCombo();
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
        buttonGroup4 = new javax.swing.ButtonGroup();
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
        customerButton = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        customerStertDateCombo = new org.jdesktop.swingx.JXDatePicker();
        customerEndDateCombo = new org.jdesktop.swingx.JXDatePicker();
        customerCombo = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        jTextField1.setText("jTextField1");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        endDateCombo.setEnabled(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Generate Credit Report");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
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
        annualButton.setText("Generate Annual Credit Report");
        annualButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annualButtonActionPerformed(evt);
            }
        });

        monthlyButton.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(monthlyButton);
        monthlyButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        monthlyButton.setText("Generate Monthly Credit   Report");
        monthlyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthlyButtonActionPerformed(evt);
            }
        });

        rangeButton.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rangeButton);
        rangeButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rangeButton.setText("Generate Credit Report for given Date Range");
        rangeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rangeButtonActionPerformed(evt);
            }
        });
        rangeButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rangeButtonKeyReleased(evt);
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

        customerButton.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(customerButton);
        customerButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        customerButton.setText("Generate Customer Wise Credit Report for Given Date Range");
        customerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("From");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("To");

        customerStertDateCombo.setEnabled(false);

        customerEndDateCombo.setEnabled(false);

        customerCombo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        customerCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        customerCombo.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Customer");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rangeButton)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(62, 62, 62)
                                            .addComponent(endDateCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addGap(13, 13, 13)
                                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(startDateCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(monthlyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(annualButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(yearText, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(yearText1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(monthCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addComponent(customerButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 99, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(generateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(customerCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(customerStertDateCombo, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(customerEndDateCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rangeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(startDateCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(endDateCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(monthlyButton)
                    .addComponent(yearText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(annualButton)
                    .addComponent(yearText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(customerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(customerCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(customerStertDateCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(customerEndDateCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(generateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
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
        customerCombo.setEnabled(false);
        customerStertDateCombo.setEnabled(false);
        customerEndDateCombo.setEnabled(false);
    }//GEN-LAST:event_monthlyButtonActionPerformed

    private void annualButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annualButtonActionPerformed
        yearText.setEnabled(true);
        yearText.setText("");
        yearText1.setEnabled(false);
        yearText1.setText("");
        startDateCombo.setEnabled(false);
        endDateCombo.setEnabled(false);
        monthCombo.setEnabled(false);
        customerCombo.setEnabled(false);
        customerStertDateCombo.setEnabled(false);
        customerEndDateCombo.setEnabled(false);
    }//GEN-LAST:event_annualButtonActionPerformed

    private void generateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateButtonActionPerformed
        try {
            if (monthlyButton.isSelected()) {
                yearText1.requestFocus();
                monthlyButton.setForeground(Color.BLUE);
                if (yearText1.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(new CreditReportForm(), "Please mention the year to generate Report! ");
                } else {
                    int year = Integer.parseInt(yearText1.getText());
                    int i = monthCombo.getSelectedIndex();
                    List<Invoice> invoiceList = InvoiceController.checkCreditMonth(year, i + 1);
                    if (invoiceList.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Credit Transactions are not found for given month!");
                    } else {
                        String date = year + "-" + (i + 1) + "-" + "01";
                        JasperReport jr = JasperCompileManager.compileReport("./jasperreport/MonthlyCreditReport.jrxml");
                        Map<String, Object> params = new HashMap<>();
                        params.put("YEAR", year);
                        params.put("MONTH", i + 1);
                        params.put("DATE", date);
                        JasperPrint jp = JasperFillManager.fillReport(jr, params, DBConnection.getInstance().getConnection());
                        JasperViewer.viewReport(jp, false);
                    }
                }

            } else if (rangeButton.isSelected()) {
                rangeButton.setForeground(Color.BLUE);
                if (startDateCombo.getDate() == null || endDateCombo.getDate() == null) {
                    JOptionPane.showMessageDialog(new CreditReportForm(), "Please select a date range to generate report!");
                } else {
                    Date date1 = startDateCombo.getDate();
                    Date date2 = endDateCombo.getDate();
                    String startDate = sdf.format(date1);
                    String endDate = sdf.format(date2);
                    JasperReport jr = JasperCompileManager.compileReport("./jasperreport/DateRangeCreditReport.jrxml");
                    Map<String, Object> params = new HashMap<>();
                    params.put("START_DATE", startDate);
                    params.put("END_DATE", endDate);
                    System.out.println(startDate + " " + endDate);
                    JasperPrint jp = JasperFillManager.fillReport(jr, params, DBConnection.getInstance().getConnection());
                    JasperViewer.viewReport(jp, false);
                }

            } else if (annualButton.isSelected()) {
                yearText.requestFocus();
                annualButton.setForeground(Color.BLUE);
                if (yearText.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please mention the year to generate Report! ");
                } else {
                    int year = Integer.parseInt(yearText.getText());
                    List<Invoice> invoiceList = InvoiceController.checkCreditYear(year);
                    if (invoiceList.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Credit Transactions are not found for given year!");
                    } else {
                        JasperReport jr = JasperCompileManager.compileReport("./jasperreport/AnnualCreditReport.jrxml");
                        Map<String, Object> params = new HashMap<>();
                        params.put("YEAR", year);
                        JasperPrint jp = JasperFillManager.fillReport(jr, params, DBConnection.getInstance().getConnection());
                        JasperViewer.viewReport(jp, false);
                    }
                }
            } else if (customerButton.isSelected()) {
                customerButton.setForeground(Color.BLUE);
                if ((customerStertDateCombo.getDate() == null || customerEndDateCombo.getDate() == null) && customerCombo.getSelectedIndex() > 0) {
                    JOptionPane.showMessageDialog(new CreditReportForm(), "Please select a date range to generate report!");
                } else if (!(customerStertDateCombo.getDate() == null || customerEndDateCombo.getDate() == null) && customerCombo.getSelectedIndex() == 0) {
                    JOptionPane.showMessageDialog(new CreditReportForm(), "Please select a Customer to generate report!");
                } else if ((customerStertDateCombo.getDate() == null || customerEndDateCombo.getDate() == null) && customerCombo.getSelectedIndex() == 0) {
                    JOptionPane.showMessageDialog(new CreditReportForm(), "Please fill details to generate report!");
                } else {
                    Customer customer = (Customer) customerCombo.getSelectedItem();
                    Date date1 = customerStertDateCombo.getDate();
                    Date date2 = customerEndDateCombo.getDate();
                    String startDate = sdf.format(date1);
                    String endDate = sdf.format(date2);
                    JasperReport jr = JasperCompileManager.compileReport("./jasperreport/CustomerCreditReport.jrxml");
                    Map<String, Object> params = new HashMap<>();
                    params.put("CUSTOMER_NAME", customer.getCustName());
                    params.put("CUSTOMER_ID", customer.getCustId());
                    params.put("CUSTOMER_START_DATE", startDate);
                    params.put("CUSTOMER_END_DATE", endDate);
                    JasperPrint jp = JasperFillManager.fillReport(jr, params, DBConnection.getInstance().getConnection());
                    JasperViewer.viewReport(jp, false);
                }
            }
        } catch (JRException ex) {
            Logger.getLogger(CreditReportForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CreditReportForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CreditReportForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_generateButtonActionPerformed

    private void yearText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearText1ActionPerformed

    private void customerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerButtonActionPerformed
        yearText.setEnabled(false);
        yearText1.setEnabled(false);
        yearText.setText("");
        yearText1.setText("");
        startDateCombo.setEnabled(false);
        endDateCombo.setEnabled(false);
        monthCombo.setEnabled(false);
        customerCombo.setEnabled(true);
        customerStertDateCombo.setEnabled(true);
        customerEndDateCombo.setEnabled(true);
    }//GEN-LAST:event_customerButtonActionPerformed

    private void rangeButtonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rangeButtonKeyReleased
        if (rangeButton.isSelected()) {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                generateButton.doClick();
                generateButton.doClick();
            }
        }
    }//GEN-LAST:event_rangeButtonKeyReleased

    private void rangeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rangeButtonActionPerformed
        yearText.setEnabled(false);
        yearText1.setEnabled(false);
        yearText.setText("");
        yearText1.setText("");
        startDateCombo.setEnabled(true);
        endDateCombo.setEnabled(true);
        monthCombo.setEnabled(false);
        customerCombo.setEnabled(false);
        customerStertDateCombo.setEnabled(false);
        customerEndDateCombo.setEnabled(false);

    }//GEN-LAST:event_rangeButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton annualButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JRadioButton customerButton;
    private javax.swing.JComboBox customerCombo;
    private org.jdesktop.swingx.JXDatePicker customerEndDateCombo;
    private org.jdesktop.swingx.JXDatePicker customerStertDateCombo;
    private org.jdesktop.swingx.JXDatePicker endDateCombo;
    private javax.swing.JButton generateButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
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

    private void fillCustomerCombo() {
        List<Customer> customerList;
        try {
            customerList = CustomerController.getAllCustomers();
            b = false;
            customerCombo.removeAllItems();
            customerCombo.addItem("<select a Customer>");
            for (Customer customer : customerList) {
                customerCombo.addItem(customer);

            }
            b = true;
        } catch (SQLException ex) {
            Logger.getLogger(CreditReportForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CreditReportForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
