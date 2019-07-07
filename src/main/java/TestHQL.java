import models.users.Role;
import models.users.User;
import org.hibernate.Session;
import util.HibernateUtil;

import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class TestHQL {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();

        Query query = session.createQuery("update usr set name = :name where id = 2");
        query.setParameter("name","Richard");
        query.executeUpdate();

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
