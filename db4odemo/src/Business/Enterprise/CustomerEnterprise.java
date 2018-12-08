/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;
import Business.Order.CustomerOrderList;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author cuihuilin
 */
public class CustomerEnterprise extends Enterprise {
    
    CustomerOrderList col;
    public CustomerEnterprise(String name){
        super(name,Enterprise.EnterpriseType.Customer);
        col = new CustomerOrderList();
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    public CustomerOrderList getCol() {
        return col;
    }

    public void setCol(CustomerOrderList col) {
        this.col = col;
    }
    
    
    
}
