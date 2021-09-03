package Easy;

import java.util.Scanner;

public class Nasty_Hacks {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int iterations = Integer.parseInt(s.nextLine());
        String result = "";
        for (int i = 0; i < iterations; i++) {
            String[] lineValues = s.nextLine().split(" ");
            int r = Integer.parseInt(lineValues[0]);
            int e = Integer.parseInt(lineValues[1]);
            int c = Integer.parseInt(lineValues[2]);

            if ((e - c) > r) {
                result += "advertise" + "\n";
            } else if ((e - c) == r) {
                result += "does not matter" + "\n";
            } else {
                result += "do not advertise" + "\n";
            }

        }
        System.out.println(result);
    }
}
