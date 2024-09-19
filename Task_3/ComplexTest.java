package Perfomance_lab_TZ.Task_3;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.IOException;
import java.util.ArrayList;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class ComplexTest {
    public int id;
    public String title;
    public String value;
    public ArrayList<ComplexTest> values;

    public ComplexTest() throws IOException {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ArrayList<ComplexTest> getValues() {
        return values;
    }

    public void setValues(ArrayList<ComplexTest> values) {
        this.values = values;
    }

    @Override
    public String toString() {
        return "ComplexTest{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", value='" + value + '\'' +
                ", values=" + values +
                '}';
    }
}
