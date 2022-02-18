/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.store.ui;

import com.pos.store.bao.StoreBAOFactory;
import com.pos.store.bao.category.CategoryBAO;
import com.pos.store.dto.CategoryDTO;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import static com.pos.store.bao.StoreBAOFactory.creatBaoCategoryImpl;
import com.pos.store.dto.WareHouseDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author moata
 */
public class CategoryManage extends javax.swing.JFrame {

    /**
     * Creates new form CategoryS
     */
    public CategoryManage() {
        initComponents();
        initializeDataTable();
        

        //set location (center)...
        //Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        //this.setLocation(dim.width/2 - this.getSize().width/2, dim.height/2 - this.getSize().height/2);
        //set size (full screen)...
        // this.setExtendedState(MAXIMIZED_BOTH);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        name_ArTxt = new javax.swing.JTextField();
        name_EnTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionTxt = new javax.swing.JTextArea();
        discountTxt = new javax.swing.JTextField();
        jButtonSaveCat = new javax.swing.JButton();
        CodeTxt = new javax.swing.JTextField();
        jButtonUpdateCat = new javax.swing.JButton();
        jButtonDeleteCat = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        barCTxt2 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jCategoryTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Category Info", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel1.setText("Bar Code");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setText("Arabic NAme");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel5.setText("English Name");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel7.setText("Discoun %");

        name_ArTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_ArTxtActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setText("description");

        descriptionTxt.setColumns(20);
        descriptionTxt.setRows(5);
        jScrollPane1.setViewportView(descriptionTxt);

        jButtonSaveCat.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButtonSaveCat.setText("Save");
        jButtonSaveCat.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButtonSaveCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveCatActionPerformed(evt);
            }
        });

        jButtonUpdateCat.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonUpdateCat.setText("Update");
        jButtonUpdateCat.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButtonUpdateCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateCatActionPerformed(evt);
            }
        });

        jButtonDeleteCat.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonDeleteCat.setForeground(new java.awt.Color(204, 0, 0));
        jButtonDeleteCat.setText("Delete");
        jButtonDeleteCat.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButtonDeleteCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteCatActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel4.setText("Code");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(barCTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name_EnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(77, 77, 77)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(discountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButtonSaveCat, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(name_ArTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 79, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jButtonDeleteCat, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172)
                .addComponent(jButtonUpdateCat, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(discountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(CodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(name_ArTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(barCTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(name_EnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonDeleteCat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jButtonUpdateCat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSaveCat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Category List", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        jCategoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jCategoryTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSaveCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveCatActionPerformed
        // TODO add your handling code here:

        CategoryDTO theCategiry = new CategoryDTO();
//
//        try {
//            newCateg.setBar_code(CodeTxt.getText());
//            newCateg.setNameAr(name_ArTxt.getText());
//            newCateg.setNameEn(name_EnTxt.getText());
//            newCateg.setDescription(descriptionTxt.getText());
//            newCateg.setDiscount(Float.parseFloat(discountTxt.getText()));
//
//            categoryBuss.save(newCateg);
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(jPanel1, e.getMessage());
//        }


        try {
            boolean isOk = false;


            if (barCTxt2.getText().trim().equals("")) {
                theCategiry.setBar_code(null);                                     // tha's if statement to check if feild null or not
                //JOptionPane.showMessageDialog(this, " Bar_code is Empty");
                erroreMassageList.add("Bar_code");
                isOk = false;
            } else {

                theCategiry.setBar_code(barCTxt2.getText());
                isOk = true;
            }

            if (name_ArTxt.getText().trim().equals("")) {
                theCategiry.setNameAr(null);
                //JOptionPane.showMessageDialog(this, " NameAr is Empty");
                erroreMassageList.add("NameAr");
                isOk = false;                                                     // tha's if statement to check if feild null or not
            } else {
                theCategiry.setNameAr(name_ArTxt.getText());
                isOk = true;
            }

            if (name_EnTxt.getText().trim().equals("")) {            // tha's if statement to check if feild null or not
                theCategiry.setNameEn(null);
               // JOptionPane.showMessageDialog(this, " NameEn is Empty");
                erroreMassageList.add("NameEn");
                isOk = false;
            } else {

                theCategiry.setNameEn(name_EnTxt.getText());
            }

            if (descriptionTxt.getText().trim().equals("")) {                    // tha's if statement to check if feild null or not
                theCategiry.setDescription(null);
                //JOptionPane.showMessageDialog(this, " Description is Empty");
                erroreMassageList.add("Descriptiont");
                //isOk = false;
            } else {

                theCategiry.setDescription(descriptionTxt.getText());
                isOk = true;
            }

            if (discountTxt.getText().trim().equals("")) {                    // tha's if statement to check if feild null or not
                theCategiry.setDiscount(null);
                //JOptionPane.showMessageDialog(this, " Discoun is Empty");
                erroreMassageList.add("Discount");
                isOk = false;
            } else {

                theCategiry.setDiscount(Float.parseFloat(discountTxt.getText()));
                isOk = true;
            }

            
            
            
            
            
            if (isOk == true) {
                categoryBuss.save(theCategiry);
                JOptionPane.showMessageDialog(this, "The category saving Process is Successfully. ");
            }
            else{
                JOptionPane.showMessageDialog(this, "Saving Process Not Complete  ! \n" +erroreMassageList+ " Empty Field(s)\n"+"Try agin." ,"Error", JOptionPane.ERROR_MESSAGE);
            }
            erroreMassageList.removeAll(erroreMassageList);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());

        }

    }//GEN-LAST:event_jButtonSaveCatActionPerformed

    private void name_ArTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_ArTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_ArTxtActionPerformed

    private void jButtonUpdateCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateCatActionPerformed
        // TODO add your handling code here:

        CategoryDTO theCategiry = new CategoryDTO();
        
        erroreMassageList.removeAll(erroreMassageList);
        try {
            boolean isOk = false;

            if (CodeTxt.getText().trim().equals("")) {
                                                                                     // tha's if statement to check if feild null or not
                //JOptionPane.showMessageDialog(this, " Code is Empty");
                erroreMassageList.add("Code:");
                isOk = false;
            } else {

                theCategiry.setId(Integer.parseInt(CodeTxt.getText()));
                isOk = true;
            }

            if (barCTxt2.getText().trim().equals("")) {
                //theCategiry.setBar_code(null);                                     // tha's if statement to check if feild null or not
                //JOptionPane.showMessageDialog(this, " Bar_code is Empty");
                 erroreMassageList.add("Bar_code:");
            } else {

                theCategiry.setBar_code(barCTxt2.getText());
            }

            if (name_ArTxt.getText().trim().equals("")) {
                //theCategiry.setNameAr(null);
                //JOptionPane.showMessageDialog(this, " NameAr is Empty");        // tha's if statement to check if feild null or not
                erroreMassageList.add("NameAr:");
            } else {
                theCategiry.setNameAr(name_ArTxt.getText());
            }

            if (name_EnTxt.getText().trim().equals("")) {            // tha's if statement to check if feild null or not
                //theCategiry.setNameEn(null);
                //JOptionPane.showMessageDialog(this, " NameEn is Empty");
                erroreMassageList.add("NameEn:");
            } else {

                theCategiry.setNameEn(name_EnTxt.getText());
            }

            if (descriptionTxt.getText().trim().equals("")) {                    // tha's if statement to check if feild null or not
                //theCategiry.setDescription(null);
                //JOptionPane.showMessageDialog(this, " Description is Empty");
                erroreMassageList.add("Description:");
            } else {

                theCategiry.setDescription(descriptionTxt.getText());
            }

            if (discountTxt.getText().trim().equals("")) {                    // tha's if statement to check if feild null or not
                //theCategiry.setDiscount(null);
                //JOptionPane.showMessageDialog(this, " Discoun is Empty");
                erroreMassageList.add("Discount:");
            } else {

                theCategiry.setDiscount(Float.parseFloat(discountTxt.getText()));
            }

            if (isOk == true) {
                categoryBuss.save(theCategiry);
                JOptionPane.showMessageDialog(this, "Category Field with Code  " + theCategiry.getId() + " Updated Successfully \n And "+erroreMassageList +" Field(s) Not Updated. ");
            } else {
                JOptionPane.showMessageDialog(this, "Updating Process Not Complete  ! \nPlease Enter The Coe And Try Agin.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
            erroreMassageList.removeAll(erroreMassageList);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());

        }


    }//GEN-LAST:event_jButtonUpdateCatActionPerformed

    private void jButtonDeleteCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteCatActionPerformed
        // TODO add your handling code here:

        try {

            CategoryDTO theCategory = new CategoryDTO();
            boolean isOk = false;

            if (CodeTxt.getText().trim().equals("")) {
                // tha's if statement to check if feild null or not
                JOptionPane.showMessageDialog(this, "specify which you want to delete ! ");
                isOk = false;
            } else {

                theCategory.setId(Integer.parseInt(CodeTxt.getText()));
                isOk = true;
            }

            if (isOk == true) {
                categoryBuss.delete(theCategory.getId());
                JOptionPane.showMessageDialog(this, "The WareHouse Field with the Code  " + theCategory.getId() + "  has been deleted ");
            }
            else{
                JOptionPane.showMessageDialog(this, "Deleting Process Not Complete  ! \nTry Agin." ,"Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getClass() + "\n" + e.getMessage());
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButtonDeleteCatActionPerformed

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
            java.util.logging.Logger.getLogger(CategoryManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CategoryManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CategoryManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CategoryManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CategoryManage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CodeTxt;
    private javax.swing.JTextField barCTxt2;
    private javax.swing.JTextArea descriptionTxt;
    private javax.swing.JTextField discountTxt;
    private javax.swing.JButton jButtonDeleteCat;
    private javax.swing.JButton jButtonSaveCat;
    private javax.swing.JButton jButtonUpdateCat;
    private javax.swing.JTable jCategoryTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField name_ArTxt;
    private javax.swing.JTextField name_EnTxt;
    // End of variables declaration//GEN-END:variables
    List<String> erroreMassageList = new ArrayList<>();
    private CategoryBAO categoryBuss = StoreBAOFactory.creatBaoCategoryImpl();
    private List<CategoryDTO> categoryList = new ArrayList<>();

    static int currntRowIndex;
    static int coltRowIndex;

    private void initializeDataTabloe() {

    }

    private void initializeDataTable() {
        try {
            categoryList = categoryBuss.getAll();
            Object[][] data = null;
            if (categoryList != null && !categoryList.isEmpty()) {
                data = new Object[categoryList.size()][4];
                int row = 0;
                for (CategoryDTO wh : categoryList) {
                    data[row][0] = wh.getId();
                    data[row][1] = wh.getBar_code();
                    data[row][2] = wh.getNameEn();
                    data[row++][3] = wh.getDescription();
                }
            }
            jCategoryTable.setModel(new javax.swing.table.DefaultTableModel(data,
                    new String[]{"Id", "Code", "Name", "Address"}));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
