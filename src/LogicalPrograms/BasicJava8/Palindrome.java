package LogicalPrograms.BasicJava8;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Palindrome {

    public static boolean checkPalindrome(Integer number) {
        int length = String.valueOf(number).toLowerCase().length() / 2;
        return IntStream.range(0, length)
                .allMatch(character -> String.valueOf(number).charAt(character )
                        == String.valueOf(number).charAt(length - character -1));
    }
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        if(checkPalindrome(number)) {
            System.out.println("Given number/string is palindrome");
        }else {
            System.out.println("Given number/string is not palindrome");
        }
    }
}
