/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.store.ui;

import com.pos.store.bao.StoreBAOFactory;
import com.pos.store.bao.item.ItemBAO;
import com.pos.store.dto.ItemDTO;
import java.sql.SQLException;
import java.text.DateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Formatter;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author moata
 */
public class ItemManage extends javax.swing.JFrame {

    /**
     * Creates new form ItemManage
     */
    public ItemManage() {
        initComponents();

        initializeDataTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldBarCode = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNamAr = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNameEn = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldQTY = new javax.swing.JTextField();
        jTextFieldDescription = new javax.swing.JTextField();
        jTextFieldBuyPrice = new javax.swing.JTextField();
        jTextFieldSellPrice = new javax.swing.JTextField();
        jTextFieldDescount = new javax.swing.JTextField();
        jTextFieldCoast = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldMinQ = new javax.swing.JTextField();
        jTextFieldVendor = new javax.swing.JTextField();
        jTextFieldScal = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldMaunfDate = new javax.swing.JTextField();
        jTextFieldCategoryId = new javax.swing.JTextField();
        jTextFieldExperDate = new javax.swing.JTextField();
        jButtonSaveItem = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableItem = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("BAR_CODE");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 5, 0, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        jTextFieldBarCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBarCodeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 130;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 18, 0, 0);
        jPanel1.add(jTextFieldBarCode, gridBagConstraints);

        jLabel2.setText("NAME_AR");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 5, 0, 0);
        jPanel1.add(jLabel2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 130;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 18, 0, 0);
        jPanel1.add(jTextFieldNamAr, gridBagConstraints);

        jLabel3.setText("NAME_EN");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 5, 0, 0);
        jPanel1.add(jLabel3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 130;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 18, 0, 0);
        jPanel1.add(jTextFieldNameEn, gridBagConstraints);

        jLabel4.setText("DESCRIPTION");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 43, 0, 0);
        jPanel1.add(jLabel4, gridBagConstraints);

        jLabel5.setText("QTY");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 43, 0, 0);
        jPanel1.add(jLabel5, gridBagConstraints);

        jLabel6.setText("BUY_BRICE");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 41, 0, 0);
        jPanel1.add(jLabel6, gridBagConstraints);

        jLabel7.setText("SELL_PRICE");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 89, 0, 0);
        jPanel1.add(jLabel7, gridBagConstraints);

        jLabel8.setText("DISCOUNT");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 89, 0, 0);
        jPanel1.add(jLabel8, gridBagConstraints);

        jLabel9.setText("COST");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 89, 0, 0);
        jPanel1.add(jLabel9, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 11;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 157;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 10, 0, 0);
        jPanel1.add(jTextFieldQTY, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 11;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 157;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 10, 0, 0);
        jPanel1.add(jTextFieldDescription, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 11;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 157;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 10, 0, 0);
        jPanel1.add(jTextFieldBuyPrice, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 17;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 157;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 14, 0, 22);
        jPanel1.add(jTextFieldSellPrice, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 17;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 157;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 14, 0, 22);
        jPanel1.add(jTextFieldDescount, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 17;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 157;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 14, 0, 22);
        jPanel1.add(jTextFieldCoast, gridBagConstraints);

        jLabel10.setText("MIN_QTY");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 5, 0, 0);
        jPanel1.add(jLabel10, gridBagConstraints);

        jLabel11.setText("VENDOR");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 41, 0, 0);
        jPanel1.add(jLabel11, gridBagConstraints);

        jLabel12.setText("SCAL");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 89, 0, 0);
        jPanel1.add(jLabel12, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 130;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 18, 0, 0);
        jPanel1.add(jTextFieldMinQ, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 11;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 157;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 10, 0, 0);
        jPanel1.add(jTextFieldVendor, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 17;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.ipadx = 157;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 14, 0, 22);
        jPanel1.add(jTextFieldScal, gridBagConstraints);

        jLabel13.setText("MANUF_DATE");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 5, 0, 0);
        jPanel1.add(jLabel13, gridBagConstraints);

        jLabel14.setText("EXPER_DATE");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 40, 0, 0);
        jPanel1.add(jLabel14, gridBagConstraints);

        jLabel15.setText("CATEGORY_ID");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 89, 0, 0);
        jPanel1.add(jLabel15, gridBagConstraints);

        jTextFieldMaunfDate.setToolTipText("Date Format Must be  YYYY-MM-DD");
        jTextFieldMaunfDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMaunfDateActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.ipadx = 130;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 18, 0, 0);
        jPanel1.add(jTextFieldMaunfDate, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 17;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 157;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 14, 0, 22);
        jPanel1.add(jTextFieldCategoryId, gridBagConstraints);

        jTextFieldExperDate.setToolTipText("Date Format Must be  YYYY-MM-DD");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 11;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 157;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 10, 0, 0);
        jPanel1.add(jTextFieldExperDate, gridBagConstraints);

        jButtonSaveItem.setText("SAVE");
        jButtonSaveItem.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButtonSaveItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveItemActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 17;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(22, 83, 0, 22);
        jPanel1.add(jButtonSaveItem, gridBagConstraints);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Item List", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jTableItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11", "Title 12", "Title 13", "Title 14", "Title 15", "Title 16", "Title 17", "Title 18"
            }
        ));
        jScrollPane1.setViewportView(jTableItem);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1053, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldBarCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBarCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBarCodeActionPerformed

    private void jButtonSaveItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveItemActionPerformed
        // TODO add your handling code here:

        ItemDTO theItem = new ItemDTO();
        boolean itemIsOk = false;

        try {

            if (jTextFieldBarCode.getText().trim().equals("")) {
                theItem.setBarCode(null);                                       // tha's if statement to check if feild null or not
                //JOptionPane.showMessageDialog(this, " Barcode is Empty");
                erroreMassageList.add("Barcode");
                itemIsOk = false;

            } else {
                theItem.setBarCode(jTextFieldBarCode.getText());
                itemIsOk = true;
            }

            if (jTextFieldNamAr.getText().trim().equals("")) {
                theItem.setNameAr(null);                                     // tha's if statement to check if feild null or not
                //JOptionPane.showMessageDialog(this, " nameAr is Empty");
                erroreMassageList.add("FnameAr");
                itemIsOk = false;
            } else {

                theItem.setNameAr(jTextFieldNamAr.getText());
                itemIsOk = true;
            }

            if (jTextFieldNameEn.getText().trim().equals("")) {
                theItem.setNameEn(null);
                //JOptionPane.showMessageDialog(this, " nameEn is Empty");
                erroreMassageList.add("nameEn");
                itemIsOk = false;                                                                // tha's if statement to check if feild null or not
            } else {
                theItem.setNameEn(jTextFieldNameEn.getText());
                itemIsOk = true;
            }

            if (jTextFieldDescription.getText().trim().equals("")) {            // tha's if statement to check if feild null or not
                theItem.setDescription(null);
                //JOptionPane.showMessageDialog(this, " Description is Empty");
                erroreMassageList.add("FDescription");
                itemIsOk = false;
            } else {

                theItem.setDescription(jTextFieldDescription.getText());
                itemIsOk = true;
            }

            if (jTextFieldQTY.getText().trim().equals("")) {                    // tha's if statement to check if feild null or not
                theItem.setQty(null);
                //JOptionPane.showMessageDialog(this, " QTY is Empty");
                erroreMassageList.add("QTY");
                itemIsOk = false;
            } else {

                theItem.setQty(Float.parseFloat(jTextFieldQTY.getText()));
                itemIsOk = true;
            }

            if (jTextFieldBuyPrice.getText().trim().equals("")) {               // tha's if statement to check if feild null or not
                theItem.setBuyPrice(null);
                //JOptionPane.showMessageDialog(this, " BuyPrice is Empty");
                erroreMassageList.add("BuyPrice");
                itemIsOk = false;
            } else {

                theItem.setBuyPrice(Float.parseFloat(jTextFieldBuyPrice.getText()));
                itemIsOk = true;
            }

            if (jTextFieldSellPrice.getText().trim().equals("")) {              // tha's if statement to check if feild null or not
                theItem.setBuyPrice(null);
                //JOptionPane.showMessageDialog(this, " SellPrice is Empty");
                erroreMassageList.add("SellPrice");
                itemIsOk = false;
            } else {

                theItem.setSellPrice(Float.parseFloat(jTextFieldSellPrice.getText()));
                itemIsOk = true;
            }

            if (jTextFieldDescount.getText().trim().equals("")) {               // tha's if statement to check if feild null or not
                theItem.setDiscount(null);
                //JOptionPane.showMessageDialog(this, " Descount is Empty");
                erroreMassageList.add("Descount");
                itemIsOk = false;
            } else {

                theItem.setDiscount(Float.parseFloat(jTextFieldDescount.getText()));
                itemIsOk = true;
            }

            if (jTextFieldCoast.getText().trim().equals("")) {                  // tha's if statement to check if feild null or not
                theItem.setCost(null);
                //JOptionPane.showMessageDialog(this, " Coast is Empty");
                erroreMassageList.add("Coast");
                itemIsOk = false;
            } else {

                theItem.setCost(Float.parseFloat(jTextFieldCoast.getText()));
                itemIsOk = true;
            }

            if (jTextFieldMinQ.getText().trim().equals("")) {                   // tha's if statement to check if feild null or not
                theItem.setMinQty(null);
                //JOptionPane.showMessageDialog(this, " MinQ is Empty");
                erroreMassageList.add("MinQ");
                itemIsOk = false;

            } else {

                theItem.setMinQty(Float.parseFloat(jTextFieldMinQ.getText()));
                itemIsOk = true;
            }

            if (jTextFieldVendor.getText().trim().equals("")) {                  // tha's if statement to check if feild null or not
                theItem.setVendor(null);
                //JOptionPane.showMessageDialog(this, " Vendor is Empty");
                erroreMassageList.add("Vendor");
                itemIsOk = false;
            } else {

                theItem.setVendor(Integer.parseInt(jTextFieldVendor.getText()));
                itemIsOk = true;
            }

            if (jTextFieldScal.getText().trim().equals("")) {                   // tha's if statement to check if feild null or not
                theItem.setScale(null);
                //JOptionPane.showMessageDialog(this, " Scal is Empty");
                erroreMassageList.add("Scal");
                itemIsOk = false;
            } else {

                theItem.setScale(Boolean.parseBoolean(jTextFieldScal.getText()));
                itemIsOk = true;
            }

            if (jTextFieldMaunfDate.getText().trim().equals("")) {               // tha's if statement to check if feild null or not
                theItem.setManufDate(null);
                //JOptionPane.showMessageDialog(this, " MaunfDate is Empty");
                erroreMassageList.add("MaunfDate");
                itemIsOk = false;
            } else {

                theItem.setManufDate(java.sql.Date.valueOf(jTextFieldMaunfDate.getText()));
                itemIsOk = true;
            }

            if (jTextFieldExperDate.getText().trim().equals("")) {               // tha's if statement to check if feild null or not
                theItem.setExpireDate(null);
                //JOptionPane.showMessageDialog(this, " ExperDate is Empty");
                erroreMassageList.add("ExperDate");
                itemIsOk = false;

            } else {

                theItem.setExpireDate(java.sql.Date.valueOf(jTextFieldExperDate.getText()));
                itemIsOk = true;
            }

            if (jTextFieldCategoryId.getText().trim().equals("")) {              // tha's if statement to check if feild null or not
                theItem.setCategoryCode(null);
                //JOptionPane.showMessageDialog(this, " CategoryId is Empty");
                erroreMassageList.add("CategoryId");
                itemIsOk = false;
            } else {

                theItem.setCategoryCode(Integer.parseInt(jTextFieldCategoryId.getText()));
                itemIsOk = true;
            }

            if (itemIsOk == true) {
                itemBuss.save(theItem);
                JOptionPane.showMessageDialog(this, "Category Saving Successfully.");
            } else {
                JOptionPane.showMessageDialog(this, "Saving Process Not Complete  ! \n" + erroreMassageList + " Empty Field(s)\n" + "Try agin.", "Error", JOptionPane.ERROR_MESSAGE);

            }

            erroreMassageList.removeAll(erroreMassageList);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(jPanel1, ex.getMessage());

        }


    }//GEN-LAST:event_jButtonSaveItemActionPerformed

    private void jTextFieldMaunfDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMaunfDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMaunfDateActionPerformed

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
            java.util.logging.Logger.getLogger(ItemManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ItemManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ItemManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ItemManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ItemManage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSaveItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableItem;
    private javax.swing.JTextField jTextFieldBarCode;
    private javax.swing.JTextField jTextFieldBuyPrice;
    private javax.swing.JTextField jTextFieldCategoryId;
    private javax.swing.JTextField jTextFieldCoast;
    private javax.swing.JTextField jTextFieldDescount;
    private javax.swing.JTextField jTextFieldDescription;
    private javax.swing.JTextField jTextFieldExperDate;
    private javax.swing.JTextField jTextFieldMaunfDate;
    private javax.swing.JTextField jTextFieldMinQ;
    private javax.swing.JTextField jTextFieldNamAr;
    private javax.swing.JTextField jTextFieldNameEn;
    private javax.swing.JTextField jTextFieldQTY;
    private javax.swing.JTextField jTextFieldScal;
    private javax.swing.JTextField jTextFieldSellPrice;
    private javax.swing.JTextField jTextFieldVendor;
    // End of variables declaration//GEN-END:variables
    List<String> erroreMassageList = new ArrayList<>();
    private ItemBAO itemBuss = StoreBAOFactory.creatBaoItemImpl();

    private List<ItemDTO> itemList = new ArrayList<>();

    private void initializeDataTable() {
        try {
            itemList = itemBuss.getAll();
            Object[][] data = null;
            if (itemList != null && !itemList.isEmpty()) {
                data = new Object[itemList.size()][18];
                int row = 0;
                for (ItemDTO wh : itemList) {
                    data[row][0] = wh.getCode();
                    data[row][1] = wh.getBarCode();
                    data[row][2] = wh.getNameEn();
                    data[row][3] = wh.getNameAr();
                    data[row][4] = wh.getDescription();
                    data[row][5] = wh.getQty();
                    data[row][6] = wh.getBuyPrice();
                    data[row][7] = wh.getSellPrice();
                    data[row][8] = wh.getDiscount();
                    data[row][9] = wh.getCost();
                    data[row][10] = wh.getLogo();
                    data[row][11] = wh.getMinQty();
                    data[row][12] = wh.getVendor();
                    data[row][13] = wh.getScale();
                    data[row][14] = wh.getColor();
                    data[row][15] = wh.getManufDate();
                    data[row][16] = wh.getExpireDate();
                    data[row++][17] = wh.getCategoryCode();
                }
            }
            jTableItem.setModel(new javax.swing.table.DefaultTableModel(data,
                    new String[]{"ID", "BAR_CODE", "NAME_EN", "NAME_AR", "DESCRIPTION", "QTY", "BUY_BRICE",
                        "SELL_PRICE", "DISCOUNT", "COST", "COST", "MIN_QTY", "VENDOR", "SCAL", "COLOR", "MANUF_DATE", "EXPER_DATE", "CATEGORY_ID"}));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
