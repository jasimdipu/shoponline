
package dao;

import entity.Category;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateUtil;


public class ListDao {

    public List catList() {
        SessionFactory factroy = HibernateUtil.getSessionFactory();
        Session session = factroy.openSession();

        List<Category> cList = session.createQuery("SELECT al.catName FROM Category al.catName").list();
        cList.toString();
        session.close();
        return cList;
    }

    public List<Category> catListByName(String name) {
        SessionFactory factroy = HibernateUtil.getSessionFactory();
        Session session = factroy.openSession();

        List<Category> cList =  (List<Category>) session.createQuery("FROM Category WHERE lower(catName)=':catName'").setString("catName", "%"+ name.toLowerCase()+"%").list();
        cList.toString();
        session.close();
        return cList;
    }

}
