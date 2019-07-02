package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class HomeAddress {
    @Id
    @GeneratedValue
    private int id;
    String street;

    @OneToOne(mappedBy = "homeAddress")
    Person person;

    public HomeAddress() {
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public HomeAddress(String street) {
        this.street = street;
    }


}