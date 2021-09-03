package Easy;

import java.util.HashSet;
import java.util.Scanner;

public class No_Duplicates {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        if (allWordsUnique(s)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    public static boolean allWordsUnique(Scanner s) {
        String[] words = s.nextLine().split(" ");
        HashSet<String> usedWords = new HashSet<>();

        for (String word : words) {
            if (usedWords.contains(word)) {
                return false;
            } else {
                usedWords.add(word);
            }
        }
        return true;
    }
}

