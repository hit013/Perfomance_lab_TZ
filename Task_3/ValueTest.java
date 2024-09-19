package Perfomance_lab_TZ.Task_3;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.io.IOException;

import java.util.ArrayList;


//@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class ValueTest {

    public int id;
    public String value;

    public ValueTest() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", value='" + value + '\'' +
                '}';
    }

}
