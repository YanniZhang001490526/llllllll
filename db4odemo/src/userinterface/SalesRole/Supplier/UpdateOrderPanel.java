/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SalesRole.Supplier;

import Business.Enterprise.Enterprise;
import Business.Order.Order;
import Business.Order.SupplierOrderList;
import Business.Organization.SalesOrganization;
import Business.Product.Product;
import Business.Product.ProductDir;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author cuihuilin
 */
public class UpdateOrderPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateOrderPanel
     */
    private JPanel userProcessContainer;
    private SalesOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    //private SupplierOrderList supplierOrderList; //////
    private ProductDir productDir;
    private Order order;
    
    public UpdateOrderPanel(JPanel userProcessContainer, UserAccount userAccount, SalesOrganization organization, Enterprise enterprise, Order order) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.productDir = productDir;
        this.order = order;
        
        prodPriceTF.setText(String.valueOf(order.getPrice()));
        prodQuantityTF.setText(String.valueOf(order.getQuantity()));
        populateProdComboBox();
    }
    public void populateProdComboBox(){
        prodComboBox.removeAllItems();
        for(Product product : enterprise.getProductDir().getProductList()){
            prodComboBox.addItem(product);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        prodComboBox = new javax.swing.JComboBox();
        prodQuantityTF = new javax.swing.JTextField();
        prodPriceTF = new javax.swing.JTextField();
        updateBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        jLabel1.setText("Update Order");

        jLabel4.setText("Quantity");

        jLabel2.setText("Choose Product");

        jLabel3.setText("Price");

        prodComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        prodComboBox.setEnabled(false);

        prodQuantityTF.setEnabled(false);

        prodPriceTF.setEnabled(false);

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        saveBtn.setText("Save");
        saveBtn.setEnabled(false);
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        backBtn.setText("< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(updateBtn))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(prodQuantityTF)
                                .addComponent(prodPriceTF)
                                .addComponent(prodComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(saveBtn)
                            .addComponent(backBtn))))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(prodComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(prodPriceTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(prodQuantityTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateBtn)
                    .addComponent(saveBtn))
                .addGap(18, 18, 18)
                .addComponent(backBtn)
                .addGap(34, 34, 34))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed

        Product product =(Product) prodComboBox.getSelectedItem();       
        order.setProduct(product.getProdName());
        order.setPrice(Double.parseDouble(prodPriceTF.getText()));
        order.setQuantity(Integer.parseInt(prodQuantityTF.getText()));
        
        prodComboBox.setEnabled(false);
        prodPriceTF.setEnabled(false);
        prodQuantityTF.setEnabled(false);
        saveBtn.setEnabled(false);
     
    }//GEN-LAST:event_saveBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SupSalePanel ssp = (SupSalePanel) component;
        ssp.populateOrderTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        prodComboBox.setEnabled(true);
        prodPriceTF.setEnabled(true);
        prodQuantityTF.setEnabled(true);
        saveBtn.setEnabled(true);
    }//GEN-LAST:event_updateBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox prodComboBox;
    private javax.swing.JTextField prodPriceTF;
    private javax.swing.JTextField prodQuantityTF;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
