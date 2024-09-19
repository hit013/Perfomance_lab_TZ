package Perfomance_lab_TZ.Task_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_2 {

    public void positionOfThePoint() {

        ArrayList<Integer> result = new ArrayList<>();

        int xO;
        int yO;
        int rO;

        int xP;
        int yP;
        int rPoint;

        String str1;
        String[] arr;
        Scanner sc = new Scanner(System.in);

        str1 = sc.nextLine();
        arr = str1.split(" ");
        xO = Integer.parseInt(arr[0].trim());
        yO = Integer.parseInt(arr[1].trim());
        rO = Integer.parseInt(arr[2].trim());


        while (sc.hasNext()) {
            str1 = sc.nextLine();
            if (str1.equals("x"))
                break;
            arr = str1.split(" ");
            xP = Integer.parseInt(arr[0].trim());
            yP = Integer.parseInt(arr[1].trim());

            if (Math.pow((xP - xO), 2) + Math.pow((yP - yO), 2) > Math.pow(rO, 2)) {
                result.add(2);
            } else if (Math.pow((xP - xO), 2) + Math.pow((yP - yO), 2) < Math.pow(rO, 2)) {
                result.add(1);
            } else if (Math.pow((xP - xO), 2) + Math.pow((yP - yO), 2) == Math.pow(rO, 2)) {
                result.add(0);
            }
        }

        for (Integer integer : result) {
            System.out.println(integer);
        }
    }

    public static void main(String[] args) {
        Task_2 t2 = new Task_2();
        t2.positionOfThePoint();
    }
}
