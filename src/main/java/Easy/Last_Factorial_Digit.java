package Easy;

import java.util.Scanner;

public class Last_Factorial_Digit {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String result = "";
        int iteration = Integer.parseInt(s.nextLine());
        for (int j = 0; j < iteration; j++) {
            int currentResult = 1;
            for (int i = Integer.parseInt(s.nextLine()); i >= 1; i--) {
                currentResult = currentResult * i;
            }
            String currentResultString = "" + currentResult;
            result += currentResultString.charAt(currentResultString.length() - 1) + "\n";
        }
        System.out.println(result);
    }
}
