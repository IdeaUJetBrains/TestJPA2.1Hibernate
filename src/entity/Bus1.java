package entity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Olga Pavlova on 9/16/2016.
 */
@Entity
@Table
public class Bus1 {
    private int id;
    private String number;

    @Id
    //@Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int eid) {
        this.id = eid;
    }

    @Basic
    //@Column(name = "NUMBER", nullable = true, length = 255)
    public String getNumber() {
        return number;
    }

    public void setNumber(String enumber) {
        this.number = enumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bus1 entitybus = (Bus1) o;

        if (id != entitybus.id) return false;
        if (number != null ? !number.equals(entitybus.number) : entitybus.number != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (number != null ? number.hashCode() : 0);
        return result;
    }
}
