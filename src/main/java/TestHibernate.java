import models.Test;
import org.hibernate.Session;
import util.HibernateUtil;

public class TestHibernate {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        String sqlQuery = "SET search_path TO test, public;";
        session.createSQLQuery(sqlQuery).executeUpdate();

        Test test = new Test();
        test.setId(1);
        test.setName("name");
        test.setDescs("desc");

        session.save(test);

        session.getTransaction().commit();
        HibernateUtil.closeSession();
    }
}