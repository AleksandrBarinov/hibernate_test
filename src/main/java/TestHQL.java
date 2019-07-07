import models.users.Role;
import models.users.User;
import org.hibernate.Session;
import util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.query.Query;

public class TestHQL {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        Query query = session.createQuery("select u from usr u join fetch u.roleList");

        List<User> users = query.list();

        for (User user: users){
            System.out.println(user.getName());
            System.out.println(user.getRoleList().size());
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
