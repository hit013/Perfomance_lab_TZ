package Perfomance_lab_TZ.Task_1;

import java.util.ArrayList;

public class Task_1 {

    public ArrayList<Integer> pathArray(int n, int m) {

        ArrayList<Integer> resultArray = new ArrayList<>();


        if (n == 1 & m == 1) {
            resultArray.add(1);
            return resultArray;
        }


        for (int i = 1; i > 0; i = i + m - 1) {


            if (i <= n) {
                resultArray.add(i);
            } else {
                int difIndex = i - n;

                if (difIndex == 1) break;

                else if (difIndex > n) {
                    i = (difIndex - n);
                    if (i == 1) break;
                    resultArray.add(i);

                } else {
                    resultArray.add(difIndex);
                    i = difIndex;
                }
            }
        }


        return resultArray;
    }

    public static void main(String[] args) {
        Task_1 t1 = new Task_1();

        System.out.println(t1.pathArray(5, 3).toString());
    }
}
