package models.users;

import javax.persistence.*;
import java.util.List;

@Entity(name = "usr")
@NamedQuery(name = "getUserByName", query = "from usr where name = :name")
public class User {
    public User(){}
    public User(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    private int id;

    public int getId() {
        return id;
    }

    private String name;

    public String getName() {
        return name;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Role> roleList;

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }
}
