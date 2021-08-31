package Trivial;

import java.util.Scanner;

public class Sort_Two_Numbers {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        if (a <= b) {
            System.out.println(a + " " + b);
        } else {
            System.out.println(b + " " + a);
        }

    }
}
