/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.AccountantOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.AccountantRole.Customer.CusAccountantPanel;
import userinterface.AccountantRole.Reseller.ResAccountantPanel;
import userinterface.AccountantRole.Supplier.SupAccountantPanel;


/**
 *
 * @author raunak
 */
public class AccountantRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
      if(enterprise.getEnterpriseType().getValue().equals("Supplier")){
            return new SupAccountantPanel(userProcessContainer, account, (AccountantOrganization)organization, enterprise);
        }
        else if(enterprise.getEnterpriseType().getValue().equals("Reseller")){
            return new ResAccountantPanel(userProcessContainer, account, (AccountantOrganization)organization, enterprise);
        }
//        else if(enterprise.getEnterpriseType().getValue().equals("Customer")){
        else{
            return new CusAccountantPanel(userProcessContainer, account, (AccountantOrganization)organization, enterprise);
        }
//        return new AccountantWorkAreaPanel(userProcessContainer, account, (AccountantOrganization)organization, enterprise);
    }
    
    
}
