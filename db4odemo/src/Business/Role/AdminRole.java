/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.SupplierEnterprise;
//import Business.Order.MasterOrder;
//import Business.Order.SupplierOrderList;
import  Business.Order.*;
import Business.Organization.AdminOrganization;
import Business.Organization.Organization;
import Business.Product.ProductDir;
import Business.UserAccount.UserAccount;
import userinterface.AdministrativeRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;
import userinterface.AdministrativeRole.Supplier.SupAdminPanel;

/**
 *
 * @author raunak
 */
public class AdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        if(enterprise.getEnterpriseType().getValue().equals("Supplier")){
            return new SupAdminPanel(userProcessContainer, account, (AdminOrganization)organization, (SupplierEnterprise)enterprise);
        }
        else{
            return new AdminWorkAreaJPanel(userProcessContainer, enterprise);
        }
    }
}
    
//For supplier use    
//    public JPanel CreateSupWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, ProductDir productDir, SupplierOrderList supplierOrderList) {
//        
//         if(enterprise.getEnterpriseType().getValue().equals("Supplier")){
//            return new SupAdminPanel(userProcessContainer, account, (AdminOrganization)organization, enterprise, productDir, supplierOrderList);
//        }
//        else{
//            return new AdminWorkAreaJPanel(userProcessContainer, enterprise);
//        }
//    }
    
    

