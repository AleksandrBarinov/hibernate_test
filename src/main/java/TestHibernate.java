import models.HomeAddress;
import models.Person;
import org.hibernate.Session;
import util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

public class TestHibernate {

    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        HomeAddress homeAddress = new HomeAddress("Mira");
        HomeAddress homeAddress1 = new HomeAddress("Mira1");
        List<HomeAddress> homeAddresses = new ArrayList<HomeAddress>();
        homeAddresses.add(homeAddress);
        homeAddresses.add(homeAddress1);

        List<Person> people = new ArrayList<Person>();
        Person person = new Person("Piter",homeAddresses);
        people.add(person);
        homeAddress.setPerson(people);

        session.persist(homeAddress);
        session.persist(homeAddress1);
        session.persist(person);

        session.getTransaction().commit();
        HibernateUtil.closeSession();
    }
}