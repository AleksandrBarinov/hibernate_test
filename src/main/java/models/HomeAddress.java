package models;

import javax.persistence.*;

@Embeddable
public class HomeAddress {

//    private int id;
    private String street;

    public HomeAddress(){}
    public HomeAddress(String street) {
        this.street = street;
    }
}
