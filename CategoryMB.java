package addhandler;


import dao.AddDao;
import entity.Category;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import static javax.ws.rs.core.Response.status;

@ManagedBean
@SessionScoped
public class CategoryMB {

    Category category = new Category();

    public Category getCategory() {

        return category;
    }

    public void setCategory(Category category) {

        this.category = category;

    }

    public String addCategory() {

        category.setCatId(category.getCatId());
        category.setCatName(category.getCatName());
        category.setCatDasc(category.getCatDasc());
        boolean status = new AddDao().addCategory(category);
        if(status){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Ok", "Data Saved"));
        }else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Not Ok", "Data not Saved"));
        }

        new AddDao().addCategory(category);

        return null;
    }
}
