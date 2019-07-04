package models;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@MappedSuperclass
public class Car {
    @Id
    @GeneratedValue
    private int id;
    private String number;

    public Car(String number) {
        this.number = number;
    }

    public Car() {
    }
}
