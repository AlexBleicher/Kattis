package Trivial;

import java.util.Scanner;

public class Tarifa {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int mbPerMonth = Integer.parseInt(s.nextLine());
        int numberOfMonths = Integer.parseInt(s.nextLine());
        int result = mbPerMonth;
        int index = 0;

        while (index < numberOfMonths) {
            result += (mbPerMonth - Integer.parseInt(s.nextLine()));
            index++;
        }

        System.out.println(result);
    }
}
