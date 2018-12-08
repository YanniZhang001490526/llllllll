/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Product;

import java.util.ArrayList;

/**
 *
 * @author cuihuilin
 */
public class ProductDir {
    private ArrayList<Product> productList;
    
    public ProductDir(){
        this.productList = new ArrayList();
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }
    
    public Product addProduct(){
        Product product = new Product();      
        productList.add(product);
        return product;
    }
    
    public void removeProduct(Product p) {
        productList.remove(p);
    }
    
    public Product searchProduct(String keyWord) {
        for(Product p : productList) {
            if(keyWord.equals(p.getProdName())) {
                return p;
            }
        }
        return null;
    }
        


}
