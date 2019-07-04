import models.Car;
import models.Opel;
import models.Toyota;
import models.person.Person;
import org.hibernate.Session;
import util.HibernateUtil;

import java.util.LinkedList;
import java.util.List;

public class TestHibernate {

    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Toyota toyota = new Toyota("123","220");
        Opel opel = new Opel("321",499);
        Car car = new Car("400");

        session.persist(toyota);
        session.persist(opel);
        session.persist(car);

        session.getTransaction().commit();
        HibernateUtil.closeSession();
    }
}