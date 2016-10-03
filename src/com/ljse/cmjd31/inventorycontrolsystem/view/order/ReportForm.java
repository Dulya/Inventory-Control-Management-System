/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ljse.cmjd31.inventorycontrolsystem.view.order;

import com.ijse.cmjd31.inventorycontrolsyatem.view.reportform.CreditReportForm;
import com.ijse.cmjd31.inventorycontrolsyatem.view.reportform.DebitReportForm;
import com.ijse.cmjd31.inventorycontrolsyatem.view.reportform.OtherForm;
import com.ijse.cmjd31.inventorycontrolsyatem.view.reportform.QuatationForm;
import com.ijse.cmjd31.inventorycontrolsyatem.view.reportform.PurchaseReportForm;
import com.ijse.cmjd31.inventorycontrolsyatem.view.reportform.PurchaseReturnForm;
import com.ijse.cmjd31.inventorycontrolsyatem.view.reportform.SalesReportForm;
import com.ijse.cmjd31.inventorycontrolsyatem.view.reportform.StockStatusForm;
import com.ijse.cmjd31.inventorycontrolsystem.other.ChangeReportColor;
import java.awt.Color;
import java.awt.Font;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 1
 */
public class ReportForm extends javax.swing.JPanel {

    private Font bigFont;
    private Font sFont;

    /**
     * Creates new form BookForm
     */
    public ReportForm() {

        sFont = new Font("Andalus", Font.BOLD, 18);
        bigFont = new Font("Andalus", Font.BOLD, 22);
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

        reportPane = new javax.swing.JDesktopPane();
        salePanel = new javax.swing.JPanel();
        saleLabel = new javax.swing.JLabel();
        creditPanel = new javax.swing.JPanel();
        creditLabel = new javax.swing.JLabel();
        debitPanel = new javax.swing.JPanel();
        debitLabel = new javax.swing.JLabel();
        stockPanel = new javax.swing.JPanel();
        stockLabel = new javax.swing.JLabel();
        returnPanel = new javax.swing.JPanel();
        returnLabel = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        purchasePanel = new javax.swing.JPanel();
        purchaseLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        otherPanel = new javax.swing.JPanel();
        otherLabel = new javax.swing.JLabel();
        quatationPanel = new javax.swing.JPanel();
        quatationLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        reportPane.setBackground(new java.awt.Color(255, 255, 255));
        add(reportPane);
        reportPane.setBounds(350, 53, 860, 590);

        salePanel.setBackground(new java.awt.Color(255, 255, 255));
        salePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        saleLabel.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        saleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saleLabel.setText("Sales Transactions");
        saleLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                saleLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                saleLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                saleLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout salePanelLayout = new javax.swing.GroupLayout(salePanel);
        salePanel.setLayout(salePanelLayout);
        salePanelLayout.setHorizontalGroup(
            salePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salePanelLayout.createSequentialGroup()
                .addComponent(saleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                .addContainerGap())
        );
        salePanelLayout.setVerticalGroup(
            salePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salePanelLayout.createSequentialGroup()
                .addComponent(saleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        add(salePanel);
        salePanel.setBounds(10, 70, 310, 40);

        creditPanel.setBackground(new java.awt.Color(255, 255, 255));
        creditPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        creditLabel.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        creditLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        creditLabel.setText("Crdit Reports");
        creditLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                creditLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                creditLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                creditLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout creditPanelLayout = new javax.swing.GroupLayout(creditPanel);
        creditPanel.setLayout(creditPanelLayout);
        creditPanelLayout.setHorizontalGroup(
            creditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(creditLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
        );
        creditPanelLayout.setVerticalGroup(
            creditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(creditLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        add(creditPanel);
        creditPanel.setBounds(10, 240, 310, 40);

        debitPanel.setBackground(new java.awt.Color(255, 255, 255));
        debitPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        debitLabel.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        debitLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        debitLabel.setText("Debit Reports");
        debitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                debitLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                debitLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                debitLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout debitPanelLayout = new javax.swing.GroupLayout(debitPanel);
        debitPanel.setLayout(debitPanelLayout);
        debitPanelLayout.setHorizontalGroup(
            debitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(debitLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
        );
        debitPanelLayout.setVerticalGroup(
            debitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(debitLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        add(debitPanel);
        debitPanel.setBounds(10, 290, 310, 40);

        stockPanel.setBackground(new java.awt.Color(255, 255, 255));
        stockPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        stockLabel.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        stockLabel.setForeground(new java.awt.Color(51, 51, 51));
        stockLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stockLabel.setText("Stock Status Reports");
        stockLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                stockLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                stockLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                stockLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout stockPanelLayout = new javax.swing.GroupLayout(stockPanel);
        stockPanel.setLayout(stockPanelLayout);
        stockPanelLayout.setHorizontalGroup(
            stockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(stockLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
        );
        stockPanelLayout.setVerticalGroup(
            stockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(stockLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        add(stockPanel);
        stockPanel.setBounds(10, 350, 310, 40);

        returnPanel.setBackground(new java.awt.Color(255, 255, 255));
        returnPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        returnLabel.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        returnLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        returnLabel.setText("Purchase Return Transactions");
        returnLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                returnLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                returnLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                returnLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout returnPanelLayout = new javax.swing.GroupLayout(returnPanel);
        returnPanel.setLayout(returnPanelLayout);
        returnPanelLayout.setHorizontalGroup(
            returnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(returnLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
        );
        returnPanelLayout.setVerticalGroup(
            returnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(returnLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        add(returnPanel);
        returnPanel.setBounds(10, 180, 310, 40);

        jPanel7.setBackground(new java.awt.Color(0, 51, 102));

        jLabel7.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Generate Reports");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 1052, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 158, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        add(jPanel7);
        jPanel7.setBounds(0, 0, 1210, 50);

        purchasePanel.setBackground(new java.awt.Color(255, 255, 255));
        purchasePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        purchaseLabel.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        purchaseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        purchaseLabel.setText("Purchase Order Transactions");
        purchaseLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                purchaseLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                purchaseLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                purchaseLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout purchasePanelLayout = new javax.swing.GroupLayout(purchasePanel);
        purchasePanel.setLayout(purchasePanelLayout);
        purchasePanelLayout.setHorizontalGroup(
            purchasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(purchasePanelLayout.createSequentialGroup()
                .addComponent(purchaseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                .addContainerGap())
        );
        purchasePanelLayout.setVerticalGroup(
            purchasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(purchaseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        add(purchasePanel);
        purchasePanel.setBounds(10, 120, 310, 40);

        jLabel9.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Stock Status Reports");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });
        add(jLabel9);
        jLabel9.setBounds(0, 0, 166, 28);

        otherPanel.setBackground(new java.awt.Color(255, 255, 255));
        otherPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        otherLabel.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        otherLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        otherLabel.setText("Other");
        otherLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                otherLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                otherLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                otherLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout otherPanelLayout = new javax.swing.GroupLayout(otherPanel);
        otherPanel.setLayout(otherPanelLayout);
        otherPanelLayout.setHorizontalGroup(
            otherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(otherLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
        );
        otherPanelLayout.setVerticalGroup(
            otherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(otherLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        add(otherPanel);
        otherPanel.setBounds(10, 470, 310, 50);

        quatationPanel.setBackground(new java.awt.Color(255, 255, 255));
        quatationPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        quatationLabel.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        quatationLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quatationLabel.setText("Quatation");
        quatationLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                quatationLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                quatationLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                quatationLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout quatationPanelLayout = new javax.swing.GroupLayout(quatationPanel);
        quatationPanel.setLayout(quatationPanelLayout);
        quatationPanelLayout.setHorizontalGroup(
            quatationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(quatationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
        );
        quatationPanelLayout.setVerticalGroup(
            quatationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(quatationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        add(quatationPanel);
        quatationPanel.setBounds(10, 410, 310, 50);
    }// </editor-fold>//GEN-END:initComponents

    private void saleLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saleLabelMousePressed
        reportPane.removeAll();
        reportPane.repaint();
        SalesReportForm frame = new SalesReportForm();
        reportPane.add(frame);
        frame.setVisible(true);
        frame.setBounds(120, 100, 515, 305);
        sameColor();
        ChangeReportColor changeReportColor = new ChangeReportColor(salePanel);
    }//GEN-LAST:event_saleLabelMousePressed

    private void returnLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnLabelMousePressed
        reportPane.removeAll();
        reportPane.repaint();
        PurchaseReturnForm frame = new PurchaseReturnForm();
        reportPane.add(frame);
        frame.setVisible(true);
        frame.setBounds(90, 100, 575, 285);
        sameColor();
        ChangeReportColor changeReportColor = new ChangeReportColor(returnPanel);
    }//GEN-LAST:event_returnLabelMousePressed

    private void creditLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creditLabelMousePressed
        reportPane.removeAll();
        reportPane.repaint();
        CreditReportForm frame = new CreditReportForm();
        reportPane.add(frame);
        frame.setVisible(true);
        frame.setBounds(120, 70, 540, 450);
        sameColor();
        ChangeReportColor changeReportColor = new ChangeReportColor(creditPanel);
    }//GEN-LAST:event_creditLabelMousePressed

    private void debitLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_debitLabelMousePressed
        reportPane.removeAll();
        reportPane.repaint();
        DebitReportForm frame = new DebitReportForm();
        reportPane.add(frame);
        frame.setVisible(true);
        frame.setBounds(120, 70, 540, 457);
        sameColor();
        ChangeReportColor changeReportColor = new ChangeReportColor(debitPanel);
    }//GEN-LAST:event_debitLabelMousePressed

    private void saleLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saleLabelMouseEntered
        saleLabel.setFont(bigFont);
    }//GEN-LAST:event_saleLabelMouseEntered

    private void saleLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saleLabelMouseExited
        saleLabel.setFont(sFont);
    }//GEN-LAST:event_saleLabelMouseExited

    private void returnLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnLabelMouseEntered
        returnLabel.setFont(bigFont);
    }//GEN-LAST:event_returnLabelMouseEntered

    private void returnLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnLabelMouseExited
        returnLabel.setFont(sFont);
    }//GEN-LAST:event_returnLabelMouseExited

    private void creditLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creditLabelMouseEntered
        creditLabel.setFont(new Font("Andalus", 4, 22));
    }//GEN-LAST:event_creditLabelMouseEntered

    private void creditLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creditLabelMouseExited
        creditLabel.setFont(sFont);
    }//GEN-LAST:event_creditLabelMouseExited

    private void debitLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_debitLabelMouseEntered
        debitLabel.setFont(new Font("Andalus", 4, 22));
    }//GEN-LAST:event_debitLabelMouseEntered

    private void debitLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_debitLabelMouseExited
        debitLabel.setFont(sFont);
    }//GEN-LAST:event_debitLabelMouseExited

    private void purchaseLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_purchaseLabelMouseEntered
        purchaseLabel.setFont(new Font("Andalus", 4, 22));
    }//GEN-LAST:event_purchaseLabelMouseEntered

    private void purchaseLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_purchaseLabelMouseExited
        purchaseLabel.setFont(sFont);
    }//GEN-LAST:event_purchaseLabelMouseExited

    private void stockLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stockLabelMouseEntered
        stockLabel.setFont(new Font("Andalus", 4, 22));
    }//GEN-LAST:event_stockLabelMouseEntered

    private void stockLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stockLabelMouseExited
        stockLabel.setFont(sFont);
    }//GEN-LAST:event_stockLabelMouseExited

    private void purchaseLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_purchaseLabelMousePressed
        reportPane.removeAll();
        reportPane.repaint();
        PurchaseReportForm frame = new PurchaseReportForm();
        reportPane.add(frame);
        frame.setVisible(true);
        frame.setBounds(120, 100, 570, 305);
        sameColor();
        ChangeReportColor changeReportColor = new ChangeReportColor(purchasePanel);
    }//GEN-LAST:event_purchaseLabelMousePressed

    private void stockLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stockLabelMousePressed
        reportPane.removeAll();
        reportPane.repaint();
        StockStatusForm frame = new StockStatusForm();
        reportPane.add(frame);
        frame.setVisible(true);
        frame.setBounds(120, 100, 515, 280);
        sameColor();
        ChangeReportColor changeReportColor = new ChangeReportColor(stockPanel);
    }//GEN-LAST:event_stockLabelMousePressed

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseExited

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MousePressed

    private void otherLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_otherLabelMousePressed
        reportPane.removeAll();
        reportPane.repaint();
        OtherForm frame;
        sameColor();
        ChangeReportColor changeReportColor = new ChangeReportColor(otherPanel);
        try {
            frame = new OtherForm();
            frame.setVisible(true);
            frame.setBounds(120, 40, 480, 333);
            reportPane.add(frame);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReportForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_otherLabelMousePressed

    private void otherLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_otherLabelMouseEntered
        otherLabel.setFont(new Font("Andalus", 4, 22));
    }//GEN-LAST:event_otherLabelMouseEntered

    private void otherLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_otherLabelMouseExited
        otherLabel.setFont(sFont);
    }//GEN-LAST:event_otherLabelMouseExited

    private void quatationLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quatationLabelMouseEntered
        quatationLabel.setFont(new Font("Andalus", 4, 22));
    }//GEN-LAST:event_quatationLabelMouseEntered

    private void quatationLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quatationLabelMouseExited
        quatationLabel.setFont(sFont);
    }//GEN-LAST:event_quatationLabelMouseExited

    private void quatationLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quatationLabelMousePressed
        reportPane.removeAll();
        reportPane.repaint();
        QuatationForm frame;
        try {
            frame = new QuatationForm();
            frame.setVisible(true);
            frame.setBounds(120, 40, 455, 333);
            reportPane.add(frame);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReportForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        sameColor();
        ChangeReportColor changeReportColor = new ChangeReportColor(quatationPanel);

    }//GEN-LAST:event_quatationLabelMousePressed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel creditLabel;
    private javax.swing.JPanel creditPanel;
    private javax.swing.JLabel debitLabel;
    private javax.swing.JPanel debitPanel;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel otherLabel;
    private javax.swing.JPanel otherPanel;
    private javax.swing.JLabel purchaseLabel;
    private javax.swing.JPanel purchasePanel;
    private javax.swing.JLabel quatationLabel;
    private javax.swing.JPanel quatationPanel;
    private javax.swing.JDesktopPane reportPane;
    private javax.swing.JLabel returnLabel;
    private javax.swing.JPanel returnPanel;
    private javax.swing.JLabel saleLabel;
    private javax.swing.JPanel salePanel;
    private javax.swing.JLabel stockLabel;
    private javax.swing.JPanel stockPanel;
    // End of variables declaration//GEN-END:variables

    public void sameColor() {
        salePanel.setBackground(Color.WHITE);
        purchasePanel.setBackground(Color.WHITE);
        returnPanel.setBackground(Color.WHITE);
        creditPanel.setBackground(Color.WHITE);
        debitPanel.setBackground(Color.WHITE);
        stockPanel.setBackground(Color.WHITE);
        quatationPanel.setBackground(Color.WHITE);
        otherPanel.setBackground(Color.WHITE);
    }
}