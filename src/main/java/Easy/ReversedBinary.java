package Easy;

import java.util.Scanner;

public class ReversedBinary {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int input = s.nextInt();
        String inputBinary = Integer.toBinaryString(input);
        StringBuilder reversedInputBinary = new StringBuilder()
                .append(inputBinary)
                .reverse();
        int output = Integer.parseInt(reversedInputBinary.toString(), 2);
        System.out.println(output);
    }
}
