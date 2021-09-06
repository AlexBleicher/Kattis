package Trivial;

import java.util.Scanner;

public class Jumbo_Javelin {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int iteration = Integer.parseInt(s.nextLine());
        int result = 0;

        for (int i = 0; i < iteration; i++) {
            result += Integer.parseInt(s.nextLine());
        }

        result = result - (iteration - 1);
        System.out.println(result);
    }
}
