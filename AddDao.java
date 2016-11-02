package dao;

import entity.Category;
import entity.SubCategory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateUtil;

public class AddDao {

    public boolean addCategory(Category cat) {
        try {
            SessionFactory factroy = HibernateUtil.getSessionFactory();
            Session session = factroy.openSession();
            session.beginTransaction();
            session.save(cat);
            session.getTransaction().commit();

            session.close();

            return true;
        } catch (Exception e) {

            return false;
        }
    }
    
     public boolean addSubCategory(SubCategory subcat) {
        try {
            SessionFactory factroy = HibernateUtil.getSessionFactory();
            Session session = factroy.openSession();
            session.beginTransaction();
            session.save(subcat);
            session.getTransaction().commit();

            session.close();

            return true;
        } catch (Exception e) {

            return false;
        }
    }

}
