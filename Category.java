package entity;
// Generated Oct 31, 2016 11:51:55 PM by Hibernate Tools 4.3.1



/**
 * Category generated by hbm2java
 */
public class Category  implements java.io.Serializable {


     private int catId;
     private String catName;
     private String catDasc;

    public Category() {
    }

    public Category(int catId, String catName, String catDasc) {
       this.catId = catId;
       this.catName = catName;
       this.catDasc = catDasc;
    }
   
    public int getCatId() {
        return this.catId;
    }
    
    public void setCatId(int catId) {
        this.catId = catId;
    }
    public String getCatName() {
        return this.catName;
    }
    
    public void setCatName(String catName) {
        this.catName = catName;
    }
    public String getCatDasc() {
        return this.catDasc;
    }
    
    public void setCatDasc(String catDasc) {
        this.catDasc = catDasc;
    }




}


