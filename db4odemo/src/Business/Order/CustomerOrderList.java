/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import java.util.ArrayList;

/**
 *
 * @author jononny
 */
public class CustomerOrderList {
    private ArrayList<Order> customerOrderList;

    public CustomerOrderList() {
        customerOrderList = new ArrayList();
    }

    public ArrayList<Order> getCustomerOrderList() {
        return customerOrderList;
    }

    public void setCustomerOrderList(ArrayList<Order> customerOrderList) {
        this.customerOrderList = customerOrderList;
    }
    
   
}
