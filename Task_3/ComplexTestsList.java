package Perfomance_lab_TZ.Task_3;

import java.util.ArrayList;

public class ComplexTestsList {
    public ArrayList<ComplexTest> tests;

    public ArrayList<ComplexTest> getTests() {
        return tests;
    }

    public void setTests(ArrayList<ComplexTest> tests) {
        this.tests = tests;
    }

    @Override
    public String toString() {
        return "ComplexTestsList{" +
                "tests=" + tests.toString() +
                '}';
    }
}
