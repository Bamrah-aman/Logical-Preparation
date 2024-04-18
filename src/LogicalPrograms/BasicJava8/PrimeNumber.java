package LogicalPrograms.BasicJava8;

import java.util.Scanner;
import java.util.stream.IntStream;

public class PrimeNumber {

    public static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .noneMatch(element -> number % element == 0);
    }
    public static void main(String[] args) {
        System.out.println("Kindly enter the Prime Number");
        int number = new Scanner(System.in).nextInt();
        if(isPrime(number)) {
            System.out.println("Number is Prime");
        } else {
            System.out.println("Number is not Prime");
        }
    }
}
