import models.Car;
import org.hibernate.Session;
import org.hibernate.query.Query;
import util.HibernateUtil;

import java.util.List;

public class TestHQL {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();


        Query query = session.createQuery("select c.number from Car as c where id = 11 or number = :n group by c.number having c.number = :n");
        query.setParameter("n","400");

//        query.setMaxResults(2);
//        query.setFirstResult(1);

        List<String> groupedNums = query.list();
        for (String s: groupedNums){
            System.out.println(s);
        }

//        Car car = (Car) query.uniqueResult();
//        System.out.println(car.getNumber());

//        List<Car> list = query.list();
//        for (Car car: list){
//            System.out.println(car.getNumber());
//        }

        session.getTransaction().commit();
    }
}
