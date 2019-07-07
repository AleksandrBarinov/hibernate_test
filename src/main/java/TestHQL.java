import models.users.Role;
import models.users.User;
import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

public class TestHQL {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();

//        Query query = session.createQuery("update usr set name = :name where id = 2");
//        query.setParameter("name","Richard");
//        query.executeUpdate();

//        Query query = session.createQuery("insert into usr (name) select name from Role where id = 7");
//        query.executeUpdate();

//        Query query = session.createQuery("delete from usr where id = 38");
//        query.executeUpdate();

//        Query query = session.createNamedQuery("getUserByName");
//        query.setParameter("name","Bob");
//        User user = (User) query.uniqueResult();
//        System.out.println(user.getName());

        NativeQuery query = session.createNativeQuery("select * from usr", User.class);
        List<User> users = query.getResultList();

        for (User user: users){
            System.out.println("id " + user.getId() + " name " + user.getName());
        }

//        //add user
//        List<Role> roleList = new ArrayList<>();
//        Role driver = new Role("driver");
//        roleList.add(driver);
//        User user = new User("Bob");
//        user.setRoleList(roleList);
//        session.persist(user);

        session.getTransaction().commit();
    }
}
