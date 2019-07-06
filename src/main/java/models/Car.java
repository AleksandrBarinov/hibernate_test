package models;

import org.hibernate.annotations.OptimisticLockType;
import org.hibernate.annotations.OptimisticLocking;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@MappedSuperclass
//@OptimisticLocking(type = OptimisticLockType.VERSION)
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

//    @Version
//    private int versionId;

    public Car(String number) {
        this.number = number;
    }

    public Car() {
    }
}
