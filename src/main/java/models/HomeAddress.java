package models;

import javax.persistence.*;

@Entity
public class HomeAddress {
    @Id
    @GeneratedValue
    private int id;
    private String street;

    @ManyToOne
    private Person person;

    public void setPerson(Person person) {
        this.person = person;
    }

    public HomeAddress(String street) {
        this.street = street;
    }


}
