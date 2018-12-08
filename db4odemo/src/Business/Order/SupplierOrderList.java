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
public class SupplierOrderList {
    private ArrayList<Order> supplierOrderList;

    public SupplierOrderList() {
        supplierOrderList = new ArrayList();
    }

    public ArrayList<Order> getSupplierOrderList() {
        return supplierOrderList;
    }
    
    public Order addOrder(){
        Order order = new Order();
        supplierOrderList.add(order);
        return order;
    }
    
    public void removeOrder(Order o){
        supplierOrderList.remove(o);
    }
    
    public Order searchSupOrder(String keyword){
        for(Order o : supplierOrderList){
            if (keyword.equalsIgnoreCase(o.getStatus())) {
                return o;
            }
        }
        return null;
    }

    
    
}
