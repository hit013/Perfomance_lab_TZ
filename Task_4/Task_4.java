package Perfomance_lab_TZ.Task_4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task_4 {

    public void countStep(String path) throws IOException {

        BufferedReader buf = new BufferedReader(new FileReader(path));

        List<Integer> list = new ArrayList<>();

        while (buf.ready()) {
            Integer num = Integer.parseInt(buf.readLine());
            list.add(num);
        }

        Collections.sort(list);

        int mediana;
        int step;
        int sum = 0;

        if (list.size() % 2 == 0) {
            mediana = (list.get(list.size() / 2 - 1) + list.get(list.size() / 2)) / 2;
        } else {
            mediana = list.get((int) Math.floor(list.size() / 2));
        }

        // System.out.println(mediana);

        for (Integer i : list) {
            sum = sum + Math.abs(i);
        }

        step = sum - mediana;
        System.out.println(step);
    }

    public static void main(String[] args) throws IOException {
        Path path = Path.of("C:\\Users\\Dimitry\\Documents\\My project\\Zadacha\\Task_4.txt"); //C:\Users\Dimitry\Documents\My project\Zadacha
        Task_4 t1 = new Task_4();

        t1.countStep(path.toString());
    }
}
