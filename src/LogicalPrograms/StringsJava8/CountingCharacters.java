package LogicalPrograms.StringsJava8;

import java.util.Scanner;

public class CountingCharacters {

    public static void countTheCharacters(String countingCharacters) {

        //What chars() do is return equivalent Integer value of the Character
        Long characterCount = countingCharacters.chars().filter(character -> character != ' ').count();
        System.out.println("Number of characters in the string: " + characterCount);
    }

    public static void main(String[] args) {
        System.out.println("Kindly enter the string to count the characters");
        String input = new Scanner(System.in).nextLine();
        CountingCharacters.countTheCharacters(input);
    }
}
