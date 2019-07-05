package models;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@MappedSuperclass
public class Car {
    @Id
    @GeneratedValue
    private int id;

    public int getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    private String number;

    public Car(String number) {
        this.number = number;
    }

    public Car() {
    }
}
