package models.test;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Address implements Serializable {

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
