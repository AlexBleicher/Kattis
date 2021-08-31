package Trivial;

import java.util.Scanner;

public class Take_Two_Stones {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        if ((Integer.parseInt(s.nextLine()) % 2) == 0) {
            System.out.println("Bob");
        } else {
            System.out.println("Alice");
        }
    }
}
