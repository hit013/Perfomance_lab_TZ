package Perfomance_lab_TZ.Task_3;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class Task_3 {

    public static void main(String[] args) throws IOException {
        HashMap<Integer, String> valuesMap = JsonParserToPojo.parseTestsFromValues("C:\\Users\\Dimitry\\Documents\\My project\\Zadacha\\values.json");
        ComplexTestsList complexTestsList = JsonParserToPojo.parseComplexTestsFromTests("C:\\Users\\Dimitry\\Documents\\My project\\Zadacha\\tests.json");
        //System.out.println(valuesMap);
        //System.out.println(complexTestsList.getTests());
        PrepareResponseData prepareResponseData = new PrepareResponseData();
        prepareResponseData.fillTestsWithValueData(valuesMap, complexTestsList.getTests());


        File output = new File("C:\\Users\\Dimitry\\Documents\\My project\\Zadacha\\response.json");
        ObjectMapper mapper = new ObjectMapper();              //запись измененного json tests с значениями value  в новый файл response
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.writeValue(output, complexTestsList);

        //System.out.println(complexTestsList.getTests());
    }


}

