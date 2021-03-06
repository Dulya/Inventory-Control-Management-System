/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ljse.cmjd31.inventorycontrolsystem.view.book;

import com.ijse.cmjd31.inventorycontrolsystem.controller.AuthorController;
import com.ijse.cmjd31.inventorycontrolsystem.controller.BookController;
import com.ijse.cmjd31.inventorycontrolsystem.controller.CategoryController;
import com.ijse.cmjd31.inventorycontrolsystem.controller.ItemController;
import com.ijse.cmjd31.inventorycontrolsystem.controller.LanguageController;
import com.ijse.cmjd31.inventorycontrolsystem.controller.publisherController;
import com.ijse.cmjd31.inventorycontrolsystem.main.MainFrame;
import com.ijse.cmjd31.inventorycontrolsystem.model.Author;
import com.ijse.cmjd31.inventorycontrolsystem.model.Book;
import com.ijse.cmjd31.inventorycontrolsystem.model.Book_Item;
import com.ijse.cmjd31.inventorycontrolsystem.model.Category;
import com.ijse.cmjd31.inventorycontrolsystem.model.Item;
import com.ijse.cmjd31.inventorycontrolsystem.model.Language;
import com.ijse.cmjd31.inventorycontrolsystem.model.Publisher;
import com.sun.crypto.provider.DESParameters;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 1
 */
public class SearchBookForm extends javax.swing.JPanel {

    /**
     * Creates new form BookSearch
     *
     */
    private boolean b;
    private MainFrame frame;
    private DefaultTableModel dtm;

    public SearchBookForm() {
        try {
            initComponents();
            fillCategoryCombo();
            fillLanguageCombo();
            fillAuthorCombo();
            fillPublisherCombo();
        } catch (SQLException ex) {
            Logger.getLogger(SearchBookForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SearchBookForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        dtm = (DefaultTableModel) bookTable.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        publisherCombo = new javax.swing.JComboBox();
        authorLabel = new javax.swing.JLabel();
        authorCombo = new javax.swing.JComboBox();
        categoryCombo = new javax.swing.JComboBox();
        languageCombo = new javax.swing.JComboBox();
        categoryLabel = new javax.swing.JLabel();
        languageLabel = new javax.swing.JLabel();
        publisherLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookTable = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        qtyLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        priceText = new javax.swing.JTextField();
        costLabel = new javax.swing.JLabel();
        reOrderText = new javax.swing.JTextField();
        qtyText = new javax.swing.JTextField();
        reOrderLavel = new javax.swing.JLabel();
        costText = new javax.swing.JTextField();
        viewButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel2.setPreferredSize(new java.awt.Dimension(833, 560));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Book By", 0, 0, new java.awt.Font("Baskerville Old Face", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        publisherCombo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        publisherCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        publisherCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publisherComboActionPerformed(evt);
            }
        });

        authorLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        authorLabel.setText("Author");

        authorCombo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        authorCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        authorCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorComboActionPerformed(evt);
            }
        });

        categoryCombo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        categoryCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        categoryCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryComboActionPerformed(evt);
            }
        });
        categoryCombo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                categoryComboKeyPressed(evt);
            }
        });

        languageCombo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        languageCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        languageCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                languageComboActionPerformed(evt);
            }
        });

        categoryLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        categoryLabel.setText("Category");

        languageLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        languageLabel.setText("Language");

        publisherLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        publisherLabel.setText("Publisher");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(categoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(authorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(categoryCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(authorCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(languageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(publisherLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(publisherCombo, 0, 241, Short.MAX_VALUE)
                    .addComponent(languageCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 43, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoryCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(languageCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(languageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(authorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(authorCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(publisherCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(publisherLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Select Book from List", 0, 0, new java.awt.Font("Baskerville Old Face", 1, 14))); // NOI18N

        bookTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        bookTable.setGridColor(new java.awt.Color(204, 255, 204));
        bookTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bookTableMousePressed(evt);
            }
        });
        bookTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bookTableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(bookTable);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Book Detail", 0, 0, new java.awt.Font("Baskerville Old Face", 1, 14))); // NOI18N

        qtyLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        qtyLabel.setText("Qty On Hand");

        priceLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        priceLabel.setText("Sales Price");

        priceText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceTextActionPerformed(evt);
            }
        });

        costLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        costLabel.setText("Cost Price");

        qtyText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyTextActionPerformed(evt);
            }
        });

        reOrderLavel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        reOrderLavel.setText("ReOrder Level");

        costText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(qtyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(costLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(costText, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                    .addComponent(qtyText))
                .addGap(57, 57, 57)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(priceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reOrderLavel))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(priceText, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                    .addComponent(reOrderText))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(priceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(costLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(costText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(priceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(qtyText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(qtyLabel)
                            .addComponent(reOrderLavel)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(reOrderText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        viewButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        viewButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/view-list-text.png"))); // NOI18N
        viewButton.setText("View");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Search Book Form");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 994, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(viewButton)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(56, 56, 56)
                .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void publisherComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publisherComboActionPerformed
        if (b) {
            Publisher publisher = (Publisher) publisherCombo.getSelectedItem();
            String publisherId = publisher.getPublisherId();
            costText.setText("");
            priceText.setText("");
            qtyText.setText("");
            reOrderText.setText("");
            List<Book> bookList;
            try {
                bookList = BookController.getBooksByPublisher(publisherId);
                dtm.setRowCount(0);
                for (Book book : bookList) {
                    Object[] row = {book};
                    dtm.addRow(row);

                }
            } catch (SQLException ex) {
                Logger.getLogger(SearchBookForm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(SearchBookForm.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_publisherComboActionPerformed

    private void authorComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorComboActionPerformed
        if (b) {
            Author author = (Author) authorCombo.getSelectedItem();
            String authorId = author.getAuthorId();
            costText.setText("");
            priceText.setText("");
            qtyText.setText("");
            reOrderText.setText("");
            List<Book> bookList;
            try {
                bookList = BookController.getBooksByAuthor(authorId);
                dtm.setRowCount(0);
                for (Book book : bookList) {
                    Object[] row = {book};
                    dtm.addRow(row);
                }
            } catch (SQLException ex) {
                Logger.getLogger(SearchBookForm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(SearchBookForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_authorComboActionPerformed

    private void categoryComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryComboActionPerformed
        try {
            if (b) {
                Category category = (Category) categoryCombo.getSelectedItem();
                String categoryId = category.getCategoryId();
                costText.setText("");
                priceText.setText("");
                qtyText.setText("");
                reOrderText.setText("");
                List<Book> bookList;
                try {
                    bookList = BookController.getBooksByCategory(categoryId);
                    dtm.setRowCount(0);
                    for (Book book : bookList) {
                        Object[] row = {book};
                        dtm.addRow(row);
                    }
                    bookTable.requestFocus();
                } catch (SQLException ex) {
                    Logger.getLogger(SearchBookForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(SearchBookForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_categoryComboActionPerformed

    private void categoryComboKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_categoryComboKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        }
    }//GEN-LAST:event_categoryComboKeyPressed

    private void languageComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_languageComboActionPerformed
        if (b) {
            Language language = (Language) languageCombo.getSelectedItem();
            String languageId = language.getLangId();
            costText.setText("");
            priceText.setText("");
            qtyText.setText("");
            reOrderText.setText("");
            List<Book> bookList;
            try {
                bookList = BookController.getBooksByLanguage(languageId);
                dtm.setRowCount(0);
                for (Book book : bookList) {
                    Object[] row = {book};
                    dtm.addRow(row);
                }
            } catch (SQLException ex) {
                Logger.getLogger(SearchBookForm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(SearchBookForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_languageComboActionPerformed

    private void bookTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bookTableKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_DOWN || evt.getKeyCode() == KeyEvent.VK_UP) {
            viewButton.doClick();
        }
    }//GEN-LAST:event_bookTableKeyReleased

    private void priceTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceTextActionPerformed

    private void qtyTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtyTextActionPerformed

    private void costTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costTextActionPerformed

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        dtm = (DefaultTableModel) bookTable.getModel();
        priceText.setText("");
        costText.setText("");
        reOrderText.setText("");
        qtyText.setText("");
        int rowIndex = bookTable.getSelectedRow();
        boolean bool = bookTable.isRowSelected(rowIndex);
        if (bool == true) {
            Book book = (Book) bookTable.getValueAt(rowIndex, 0);
            Item item;
            try {
                item = ItemController.getBookById(book.getItemId());
                priceText.setText(Double.toString(item.getSalesPrice()));
                costText.setText(Double.toString(item.getCostPrice()));
                reOrderText.setText(Integer.toString(item.getReOrderLevel()));
                qtyText.setText(Integer.toString(item.getQtyOnHand()));
            } catch (SQLException ex) {
                Logger.getLogger(SearchBookForm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(SearchBookForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row");
        }
    }//GEN-LAST:event_viewButtonActionPerformed

    private void bookTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookTableMousePressed
        viewButton.doClick();
    }//GEN-LAST:event_bookTableMousePressed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox authorCombo;
    private javax.swing.JLabel authorLabel;
    private javax.swing.JTable bookTable;
    private javax.swing.JComboBox categoryCombo;
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JLabel costLabel;
    private javax.swing.JTextField costText;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox languageCombo;
    private javax.swing.JLabel languageLabel;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JTextField priceText;
    private javax.swing.JComboBox publisherCombo;
    private javax.swing.JLabel publisherLabel;
    private javax.swing.JLabel qtyLabel;
    private javax.swing.JTextField qtyText;
    private javax.swing.JLabel reOrderLavel;
    private javax.swing.JTextField reOrderText;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables

    private void fillCategoryCombo() throws SQLException, ClassNotFoundException {
        List<Category> categoryList = CategoryController.getAllCategory();
        categoryCombo.removeAllItems();
        for (Category category : categoryList) {
            categoryCombo.addItem(category);
        }
    }

    private void fillLanguageCombo() throws SQLException, ClassNotFoundException {
        List<Language> languageList = LanguageController.getAllLanguages();
        b = false;
        languageCombo.removeAllItems();
        for (Language language : languageList) {
            languageCombo.addItem(language);
        }
        b = true;
    }

    private void fillAuthorCombo() throws ClassNotFoundException, SQLException {
        List<Author> authorList = AuthorController.getAllAuthors();
        b = false;
        authorCombo.removeAllItems();
        for (Author author : authorList) {
            authorCombo.addItem(author);
        }
        b = true;
    }

    private void fillPublisherCombo() throws SQLException, ClassNotFoundException {
        List<Publisher> publisherList = publisherController.getAllPublishers();
        b = false;
        publisherCombo.removeAllItems();
        for (Publisher publisher : publisherList) {
            publisherCombo.addItem(publisher);
        }
        b = true;
    }
}
