package Trivial;

import java.util.Scanner;

public class Planina {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int iteration = s.nextInt();
        int result = (int) Math.pow(2, iteration) + 1;
        result = (int) Math.pow(result, 2);

        System.out.println(result);
    }
}
