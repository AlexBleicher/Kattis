package Trivial;

import java.util.Scanner;

public class ColdputerScience {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        s.nextLine();

        String[] splitInput = s.nextLine().split(" ");
        int counter = 0;
        for (String s1 : splitInput) {
            if (Integer.parseInt(s1) < 0) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
