package addhandler;

import dao.AddDao;
import dao.ListDao;
import entity.Category;
import entity.SubCategory;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

@ManagedBean
@SessionScoped
public class SubCategoryMB {

    //Create SubCategory view Page
    SubCategory subcat = new SubCategory();
    Category category = new Category();

    String catname;

    List<Category> listcat;

    public List<Category> getListcat() {
        return listcat;
    }

    public void setListcat(List<Category> listcat) {
        this.listcat = listcat;
    }

    public SubCategory getSubCat() {

        return subcat;
    }

    public void setSubCat(SubCategory subcat) {
        this.subcat = subcat;
    }
    
    public int getSubCatid(){
        return 0;
    }
    public void setSubCatid(SubCategory subcat){
        this.subcat = subcat;
    }
    
    public Category getCategory(){
        return category;
    }
    public void setCategory(Category category){
    
        this.category = category;
    }
    

    public String getCatname() {
        return catname;
    }

    public void setCatname(String catname) {
        this.catname = catname;
    }

    public boolean addSubCategory() {

        listcat = new ListDao().catListByName(catname);

        category.setCatId(listcat.get(0).getCatId());
        subcat.setCategory(category);
        subcat.setSubCatId(subcat.getSubCatId());
        subcat.setSubCatName(subcat.getSubCatName());
        subcat.setSubCatDesc(subcat.getSubCatDesc());
        boolean status = new AddDao().addSubCategory(subcat);
        if (status) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Done", "Data Saved"));
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Not Done", "Data Not Saved"));
        }

        return status;
    }

    public List<SelectItem> getCategoryItemName() {
        
        List <SelectItem> catname = new ListDao().catList();
        
        return catname;

    }
}
