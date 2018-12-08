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
public class ResellerOrderList {
    private ArrayList<Order> resellerOrderList;
    
     public ResellerOrderList() {
        resellerOrderList = new ArrayList();
    }

    public ArrayList<Order> getResellerOrderList() {
        return resellerOrderList;
    }
    
}
