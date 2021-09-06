package Trivial;

import java.util.Scanner;

public class Greetings {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String input = s.nextLine();
        String e = input.substring(1, input.length() - 1);

        System.out.println("h" + e + e + "y");
    }
}
