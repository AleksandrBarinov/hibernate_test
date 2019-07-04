package models.person;

import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.util.List;

@Entity
public class Person {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    @ElementCollection
    private List<HomeAddress> homeAddresses;
    @ElementCollection

    @org.hibernate.annotations.OrderBy(clause = "marks DESC")
    private List<Integer> marks;

    @NaturalId
    private String iCode;

    public void setiCode(String iCode) {
        this.iCode = iCode;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public Person(){}
    public Person(String name, List<HomeAddress> homeAddresses, List<Integer> marks) {
        this.name = name;
        this.homeAddresses = homeAddresses;
        this.marks = marks;
    }
}