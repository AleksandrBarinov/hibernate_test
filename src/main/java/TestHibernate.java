import javassist.tools.rmi.ObjectNotFoundException;
import models.Address;
import models.Cars;
import models.Test;
import org.hibernate.Session;
import util.HibernateUtil;

import java.util.Date;

public class TestHibernate {

    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        //String sqlQuery = "SET search_path TO test, public;";
        //session.createSQLQuery(sqlQuery).executeUpdate();

        Test test = new Test();
        test.setId(8);
        test.setName("aaa");
        test.setDescs("desc");
//        test.setDate(new Date());
        test.setAddress(new Address("Moscow","Mira",1));
//        Cars cars = new Cars();
//        cars.setId(6);
//        cars.setMarka("toyota");
//        cars.setModel("rav4");
        session.save(test);
//        session.save(cars);

        //Test testLoad = session.load(Test.class,8);
        //Test testGet = session.get(Test.class,8);

        //System.out.println("load " + testLoad.getAddress());
        //System.out.println("get " + testGet.getAddress());

        session.getTransaction().commit();
        HibernateUtil.closeSession();
    }
}