 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Order.SupplierOrderList;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Product.ProductDir;

/**
 *
 * @author MyPC1
 */
public abstract class Enterprise extends Organization{
    
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
   
    private ProductDir productDir;
    private SupplierOrderList supplierOrderList;

    
    public ProductDir getProductDir() {
        return productDir;
    }

    public void setProductDir(ProductDir productDir) {
        this.productDir = productDir;
    }

    public SupplierOrderList getSupplierOrderList() {
        return supplierOrderList;
    }

    public void setSupplierOrderList(SupplierOrderList supplierOrderList) {
        this.supplierOrderList = supplierOrderList;
    }
    
    
    
    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

      public Enterprise(String name,EnterpriseType type){
        super(name);
        this.enterpriseType=type;
        organizationDirectory=new OrganizationDirectory();
        productDir = new ProductDir();
        supplierOrderList =new SupplierOrderList();
        
    }
      
    public enum EnterpriseType{
        Supplier("Supplier"),
        Reseller("Reseller"),
        Customer("Customer");
        
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    

}
