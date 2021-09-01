package Trivial;

import java.util.Scanner;

public class Quality_of_Life {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        double result = 0.0;

        int length = Integer.parseInt(s.nextLine());
        for (int i = 0; i < length; i++) {
            String line = s.nextLine();
            double q = Double.parseDouble(line.split(" ")[0]);
            double p = Double.parseDouble(line.split(" ")[1]);
            result += q * p;
        }

        System.out.println(result);
    }
}
