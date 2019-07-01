package models;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name = "test")
public class Test {

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Basic(optional = false)
    private String name;

    private String descs;
    @CreationTimestamp
    //@UpdateTimestamp
    private Date date;

    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDescs() {
        return descs;
    }
    public Date getDate() {
        return date;
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
}