package Easy;

import java.util.ArrayList;
import java.util.Scanner;

public class Man_Ive_Been_Everywhere {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int testCases = Integer.parseInt(s.nextLine());
        String output = "";
        ArrayList<String> cities = new ArrayList<>();

        for (int i = 0; i < testCases; i++) {
            int amountOfCities = 0;
            int testCaseLoop = Integer.parseInt(s.nextLine());
            for (int j = 0; j < testCaseLoop; j++) {
                String city = s.nextLine();
                if (!cities.contains(city)) {
                    amountOfCities++;
                    cities.add(city);
                }
            }
            output += amountOfCities + "\n";
        }
        System.out.println(output);
    }
}
