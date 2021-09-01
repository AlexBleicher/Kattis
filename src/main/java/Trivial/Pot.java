package Trivial;

import java.util.Scanner;

public class Pot {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int length = Integer.parseInt(s.nextLine());
        long result = 0;

        for (int i = 0; i < length; i++) {
            String line = s.nextLine();
            int power = Integer.parseInt(String.valueOf(line.charAt(line.length() - 1)));
            int value = Integer.parseInt(line.substring(0, line.length() - 1));

            result += Math.pow(value, power);
        }

        System.out.println(result);
    }
}
