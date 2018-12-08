/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.CustomerEnterprise;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.SalesOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.SalesRole.Customer.CusSaleFuncPanel;
import userinterface.SalesRole.Reseller.ResSalePanel;
import userinterface.SalesRole.Supplier.SupSalePanel;

/**
 *
 * @author raunak
 */
public class SalesRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        
        if(enterprise.getEnterpriseType().getValue().equals("Supplier")){
            return new SupSalePanel(userProcessContainer, account, (SalesOrganization)organization, enterprise);
        }
        else if(enterprise.getEnterpriseType().getValue().equals("Reseller")){
            return new ResSalePanel(userProcessContainer, account, (SalesOrganization)organization, enterprise);
        }
//        else if(enterprise.getEnterpriseType().getValue().equals("Customer")){
        else{
            return new CusSaleFuncPanel(userProcessContainer, account, (SalesOrganization)organization, (CustomerEnterprise)enterprise);
        }
//        return new SalesWorkAreaPanel(userProcessContainer, account, (SalesOrganization)organization, enterprise);
    }
    
    
}
