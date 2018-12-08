/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class MasterOrder {
    
    private ArrayList<Order> masterOrderList;

    public MasterOrder() {
        masterOrderList = new ArrayList();
    }

    public ArrayList<Order> getMasterOrderList() {
        return masterOrderList;
    }
}