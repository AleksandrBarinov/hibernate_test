package models;

import javax.persistence.*;
import java.util.List;

@Entity
public class HomeAddress {
    @Id
    @GeneratedValue
    private int id;
    private String street;

    @ManyToMany
    private List<Person> persons;

    public HomeAddress(){}
    public HomeAddress(String street) {
        this.street = street;
    }

    public void setPerson(List<Person> persons) {
        this.persons = persons;
    }
}
