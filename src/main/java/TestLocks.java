import models.Car;
import org.hibernate.LockMode;
import org.hibernate.Session;
import util.HibernateUtil;

public class TestLocks {
    public static void main(String[] args) {

        final Session session = HibernateUtil.getSessionFactory().openSession();
        final Session session2 = HibernateUtil.getSessionFactory().openSession();

        Car car = new Car("123");
        session.beginTransaction();
        session.persist(car);
        session.getTransaction().commit();

        final int carId = car.getId();
        System.out.println("carId: " + carId);

        new Thread(() -> {
            session.beginTransaction();
            Car car1 = session.load(Car.class,carId, LockMode.PESSIMISTIC_WRITE);
            car1.setNumber(car1.getNumber() + "4");
            try {
                System.out.println("before sleep");
                Thread.sleep(10000);
                System.out.println("after sleep");
            } catch (InterruptedException ignored) {}
            session.getTransaction().commit();
            System.out.println("1end");
        }).start();

        new Thread(() -> {
            session2.beginTransaction();
            Car car12 = session2.load(Car.class, carId, LockMode.PESSIMISTIC_WRITE);
            car12.setNumber(car12.getNumber() + "5");
            session2.getTransaction().commit();
            System.out.println("2end");
        }).start();

    }
}
