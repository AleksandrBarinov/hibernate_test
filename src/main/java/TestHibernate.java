import models.cars.Car;
import org.hibernate.Session;
import util.HibernateUtil;

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

        session.beginTransaction();
        car.setNumber("789");
        session.refresh(car);
        System.out.println(car.getNumber());
        session.getTransaction().commit();
        HibernateUtil.closeSession();
    }
}