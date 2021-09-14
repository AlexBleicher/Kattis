package Trivial;

import java.util.Scanner;

public class JackOLantern {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int eyes = s.nextInt();
        int noses = s.nextInt();
        int mouths = s.nextInt();

        System.out.println(eyes * noses * mouths);
    }
}
