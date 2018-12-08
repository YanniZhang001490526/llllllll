/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AccountantRole.Customer;

import Business.Enterprise.CustomerEnterprise;
import Business.Organization.AccountantOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import userinterface.SalesRole.Customer.ViewSalepersonal;

/**
 *
 * @author jononny
 */
public class CusAccountantPanel extends javax.swing.JPanel {

    /**
     * Creates new form CusAccountantPanel
     */
    private JPanel userProcessContainer;
    private AccountantOrganization organization;
    private CustomerEnterprise enterprise;
    private UserAccount userAccount;
    public CusAccountantPanel(JPanel userProcessContainer, UserAccount account, AccountantOrganization organization, CustomerEnterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PIMbtn = new javax.swing.JButton();
        WMbtn = new javax.swing.JButton();

        PIMbtn.setText("Personal Information Management");
        PIMbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PIMbtnActionPerformed(evt);
            }
        });

        WMbtn.setText("Work Management");
        WMbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WMbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(PIMbtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(WMbtn)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(PIMbtn)
                .addGap(47, 47, 47)
                .addComponent(WMbtn)
                .addContainerGap(119, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void PIMbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PIMbtnActionPerformed
        // TODO add your handling code here:
         CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ViewAccountInfo", new ViewCusAccountInfo(userProcessContainer, userAccount, enterprise));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_PIMbtnActionPerformed

    private void WMbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WMbtnActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ManageSaleOrder", new CusAccProcReqPanel(userProcessContainer, userAccount, organization,enterprise));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_WMbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PIMbtn;
    private javax.swing.JButton WMbtn;
    // End of variables declaration//GEN-END:variables
}