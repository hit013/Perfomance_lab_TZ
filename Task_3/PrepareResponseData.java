package Perfomance_lab_TZ.Task_3;

import java.util.ArrayList;
import java.util.HashMap;

public class PrepareResponseData {

    public void fillTestsWithValueData(HashMap<Integer, String> valuesMap, ArrayList<ComplexTest> tests) {

        for (ComplexTest complexTest : tests) {
            int complexTestId = complexTest.getId();
            ArrayList<ComplexTest> complexTestValues = complexTest.getValues();

            if (valuesMap.containsKey(complexTestId))
                complexTest.setValue(valuesMap.get(complexTestId));

            if (complexTestValues != null) {
                fillTestsWithValueData(valuesMap, complexTestValues);
            }
        }
    }
}




