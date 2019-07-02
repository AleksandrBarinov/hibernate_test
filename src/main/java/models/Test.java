package models;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name = "test")
public class Test {


    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Access(AccessType.FIELD)
    private String name;
    private String descs;
    @CreationTimestamp
    private Date date;

    private Address address;

    @Id
    public Integer getId() {
        return id;
    }
    public String getName() {
        return "mr. " + name;
    }
    public String getDescs() {
        return descs;
    }
    public Date getDate() {
        return date;
    }
    public Address getAddress() {
        return address;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDescs(String descs) {
        this.descs = descs;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
}