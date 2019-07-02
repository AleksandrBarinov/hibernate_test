package models;

import javax.persistence.*;

@Entity
public class Person {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    @OneToOne(cascade = CascadeType.REMOVE)
    public HomeAddress homeAddress;

    public Person(String name, HomeAddress homeAddress) {
        this.name = name;
        this.homeAddress = homeAddress;
    }
}
