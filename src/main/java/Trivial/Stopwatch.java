package Trivial;

import java.util.Scanner;

public class Stopwatch {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int timesPressed = Integer.parseInt(s.nextLine());
        if (timesPressed % 2 == 0) {
            int index = 0;
            int result = 0;
            while (index < timesPressed) {
                int timeBefore = Integer.parseInt(s.nextLine());
                int timeAfter = Integer.parseInt(s.nextLine());
                result += timeAfter - timeBefore;
                index += 2;
            }
            System.out.println(result);
        } else {
            System.out.println("still running");
        }
    }
}
