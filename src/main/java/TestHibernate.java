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
//
//        HomeAddress homeAddress = new HomeAddress("Mira");
//        HomeAddress homeAddress1 = new HomeAddress("Mira1");
//        List<HomeAddress> homeAddresses = new ArrayList<HomeAddress>();
//        homeAddresses.add(homeAddress);
//        homeAddresses.add(homeAddress1);
//
//        List<Person> people = new ArrayList<Person>();
//        List<Integer> marks = new ArrayList<Integer>();
//        marks.add(1);
//        marks.add(3);
//        marks.add(2);
//        Person person = new Person("Piter",homeAddresses,marks);
//        people.add(person);
//
//        session.persist(person);

        Person load = session.load(Person.class,1);
        System.out.println(load.getMarks());

        session.getTransaction().commit();
        HibernateUtil.closeSession();
    }
}