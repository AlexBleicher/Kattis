package Trivial;

import java.util.HashMap;
import java.util.Scanner;

public class Pet {

    private static HashMap<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int currentWinner = 0;
        int highestScore = 0;
        for (int i = 1; i <= 5; i++) {
            int score = 0;
            String line = s.nextLine();
            String[] splitLine = line.split(" ");
            for (String numberString : splitLine) {
                score += Integer.parseInt(numberString);
            }
            if (score >= highestScore) {
                highestScore = score;
                currentWinner = i;
            }
        }
        System.out.println(currentWinner + " " + highestScore);
    }
}
