package models;

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
//    @OrderBy("marks")
//    @OrderColumn
    @org.hibernate.annotations.OrderBy(clause = "marks DESC")
    private List<Integer> marks;

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