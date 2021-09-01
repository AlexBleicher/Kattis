package Trivial;

import java.util.Scanner;

public class Rating_Problems {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int amountOfJudges = s.nextInt();
        int allreadyRated = s.nextInt();
        int amountPending = amountOfJudges - allreadyRated;
        int ratingsAlreadyReceived = 0;

        for (int i = 0; i < allreadyRated; i++) {
            ratingsAlreadyReceived += s.nextInt();
        }

        float minPossible = ((float) (ratingsAlreadyReceived + amountPending * -3)) / amountOfJudges;
        float maxPossible = ((float) (ratingsAlreadyReceived + amountPending * 3)) / amountOfJudges;

        System.out.println(minPossible + " " + maxPossible);
    }
}
