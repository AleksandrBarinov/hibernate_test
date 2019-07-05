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

        Car car = new Car("400");

        System.out.println(car.getId());
        session.persist(car);
//        session.flush();
        System.out.println(car.getId());
//        car.setNumber("321");
//        session.detach(car);
//        car.setNumber("456");
//        session.merge(car);
//        session.update(car);
//        session.remove(car);
//        System.out.println(car.getId());
//        System.out.println(car.getNumber());
//        System.out.println(car.getNumber());

        session.getTransaction().commit();

        car.setNumber("789");
        session.refresh(car);
        System.out.println(car.getNumber());

        session.getTransaction().commit();
        HibernateUtil.closeSession();
    }
}