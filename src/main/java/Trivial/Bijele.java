package Trivial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Bijele {

    public static ArrayList<Integer> zahlen = new ArrayList(Arrays.asList(1, 1, 2, 2, 2, 8));

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(solve(splitInput(s.nextLine())));
    }

    public static ArrayList<Integer> splitInput(String input) {
        String[] inputSplit = input.split(" ");
        ArrayList<Integer> resultList = new ArrayList<Integer>();
        for (String s : inputSplit) {
            resultList.add(Integer.parseInt(s));
        }
        return resultList;
    }

    public static String solve(ArrayList<Integer> input) {
        String result = "";
        int index = 0;
        for (Integer integer : input) {
            result += (zahlen.get(index) - integer) + " ";
            index++;
        }
        return result;
    }
}
