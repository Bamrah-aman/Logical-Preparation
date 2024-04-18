package LogicalPrograms.StringsJava8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SmallestAndLargestWord {

    public static void findIt(String input) {
        String[] array = input.split("\\s+");

        String smallestWord = Arrays.stream(array)
                .min(Comparator.comparing(String::length))
                .orElse(null);

        String largestWord = Arrays.stream(array)
                .max(Comparator.comparingInt(String::length))
                .orElse(null);

        System.out.println("Smallest word: "+smallestWord+" "+"Largest word: "+largestWord);
    }

    public static void main(String[] args) {
        System.out.println("Kindly enter the string");
        String input = new Scanner(System.in).nextLine();
        SmallestAndLargestWord.findIt(input);
    }
}
