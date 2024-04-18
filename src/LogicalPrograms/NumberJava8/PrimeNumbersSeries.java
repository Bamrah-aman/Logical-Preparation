package LogicalPrograms.NumberJava8;

import java.util.Scanner;
import java.util.stream.IntStream;

public class PrimeNumbersSeries {

    public static void printAlternatePrimeNumbers(int range) {
        IntStream.rangeClosed(2, range)
                .filter(PrimeNumbersSeries::primeNumberCheck)
                .forEach(n -> System.out.print(n+" "));
    }

    public static boolean primeNumberCheck(int number) {
        if(number <= 1) {
            return false;
        } else {
            return IntStream.rangeClosed(2, (int) Math.sqrt(number))
                    .noneMatch(element -> number % element == 0);
        }
    }
    public static void main(String[] args) {
        System.out.println("Kindly enter the range to print alternate prime numbers");
        int range = new Scanner(System.in).nextInt();
        printAlternatePrimeNumbers(range);
    }
}