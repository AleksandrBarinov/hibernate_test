import models.Car;
import org.hibernate.Session;
import org.hibernate.query.Query;
import util.HibernateUtil;

import java.util.List;

public class TestHQL {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Query query = session.createQuery("select new Car(c.number) from Car as c where id = 11");

        Car car = (Car) query.uniqueResult();
        System.out.println(car.getNumber());

//        List<Car> list = query.list();
//        for (Car car: list){
//            System.out.println(car.getNumber());
//        }

        session.getTransaction().commit();
    }
}
