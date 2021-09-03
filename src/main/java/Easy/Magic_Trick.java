package Easy;

import java.util.HashSet;
import java.util.Scanner;

public class Magic_Trick {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String line = s.nextLine();
        HashSet<Character> allCharacters = new HashSet<>();
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (allCharacters.contains(c)) {
                System.out.println(0);
                return;
            } else {
                allCharacters.add(c);
            }
        }
        System.out.println(1);
    }
}
