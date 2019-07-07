package models.cars;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Car {
    @Id
    @GeneratedValue
    private int id;

    public int getId() {
        return id;
    }

    private String number;

    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }

    public Car(String number) {
        this.number = number;
    }
    public Car() {
    }
}
