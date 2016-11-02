package entity;
// Generated Oct 31, 2016 11:51:55 PM by Hibernate Tools 4.3.1



/**
 * Product generated by hbm2java
 */
public class Product  implements java.io.Serializable {


     private int proId;
     private int subCatId;
     private String proName;
     private int proQty;
     private double proPrice;
     private String proUrl;
     private String proDesc;

    public Product() {
    }

    public Product(int proId, int subCatId, String proName, int proQty, double proPrice, String proUrl, String proDesc) {
       this.proId = proId;
       this.subCatId = subCatId;
       this.proName = proName;
       this.proQty = proQty;
       this.proPrice = proPrice;
       this.proUrl = proUrl;
       this.proDesc = proDesc;
    }
   
    public int getProId() {
        return this.proId;
    }
    
    public void setProId(int proId) {
        this.proId = proId;
    }
    public int getSubCatId() {
        return this.subCatId;
    }
    
    public void setSubCatId(int subCatId) {
        this.subCatId = subCatId;
    }
    public String getProName() {
        return this.proName;
    }
    
    public void setProName(String proName) {
        this.proName = proName;
    }
    public int getProQty() {
        return this.proQty;
    }
    
    public void setProQty(int proQty) {
        this.proQty = proQty;
    }
    public double getProPrice() {
        return this.proPrice;
    }
    
    public void setProPrice(double proPrice) {
        this.proPrice = proPrice;
    }
    public String getProUrl() {
        return this.proUrl;
    }
    
    public void setProUrl(String proUrl) {
        this.proUrl = proUrl;
    }
    public String getProDesc() {
        return this.proDesc;
    }
    
    public void setProDesc(String proDesc) {
        this.proDesc = proDesc;
    }




}


