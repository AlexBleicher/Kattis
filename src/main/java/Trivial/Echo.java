package Trivial;

import java.util.Scanner;

public class Echo {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String word = s.nextLine();

        System.out.println(word + " " + word + " " + word);
    }
}
