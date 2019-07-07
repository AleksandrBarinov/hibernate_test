package models.users;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;

@Entity
public class Role {
    public Role(){}
    public Role(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    private int id;
    private String name;

    public String getName() {
        return name;
    }
}
