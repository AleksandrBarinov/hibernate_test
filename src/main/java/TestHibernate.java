import models.Cars;
import models.Test;
import org.hibernate.Session;
import util.HibernateUtil;

public class TestHibernate {

    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        //String sqlQuery = "SET search_path TO test, public;";
        //session.createSQLQuery(sqlQuery).executeUpdate();

        Test test = new Test();
        test.setId(9);
        test.setName("aaa");
        test.setDescs("desc");

        Cars cars = new Cars();
        cars.setId(6);
        cars.setMarka("toyota");
        cars.setModel("rav4");
        session.save(test);
        session.save(cars);
        session.getTransaction().commit();
        HibernateUtil.closeSession();
    }
}