package Perfomance_lab_TZ.Task_3;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class JsonParserToPojo {

    public static HashMap<Integer, String> parseTestsFromValues(String path) throws IOException {
        HashMap<Integer, String> valuesCollection = new HashMap<>();

        File file = new File(path);

        ValuesTestList valuesTestList = new ObjectMapper().readValue(file, ValuesTestList.class);

        for (ValueTest valueTest : valuesTestList.values) {
            valuesCollection.put(valueTest.getId(), valueTest.getValue());
        }
        return valuesCollection;
    }

    public static ComplexTestsList parseComplexTestsFromTests(String path) throws IOException {

        File file = new File(path);

        ComplexTestsList complexTestsList = new ObjectMapper().readValue(file, ComplexTestsList.class);

        return complexTestsList;
    }

}
