package models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Person {
    @Id
    @GeneratedValue
    private int id;
    private String name;

    @ManyToMany(mappedBy = "persons")
    private List<HomeAddress> homeAddresses;

    public Person(){}
    public Person(String name, List<HomeAddress> homeAddresses) {
        this.name = name;
        this.homeAddresses = homeAddresses;
    }
}