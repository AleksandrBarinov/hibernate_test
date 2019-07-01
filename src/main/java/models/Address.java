package models;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

    public Address(){}

    public Address(String city,String street,Integer build){
        this.city = city;
        this.street = street;
        this.build = build;
    }

    private String city;
    private String street;
    private Integer build;
}
