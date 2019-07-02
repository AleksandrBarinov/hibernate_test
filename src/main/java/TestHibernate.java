import models.HomeAddress;
import models.Person;
import org.hibernate.Session;
import util.HibernateUtil;

public class TestHibernate {

    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        HomeAddress homeAddress = new HomeAddress("Mira");
        Person person = new Person("Piter",homeAddress);
        homeAddress.setPerson(person);

        session.persist(homeAddress);
        session.persist(person);

        session.getTransaction().commit();
        HibernateUtil.closeSession();
    }
}