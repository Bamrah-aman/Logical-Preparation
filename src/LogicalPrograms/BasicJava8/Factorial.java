package LogicalPrograms.BasicJava8;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Factorial {

    public static int factorialCalculate(int number) {
        return IntStream.rangeClosed(1, number)
                .reduce(1, (x, y) -> x * y);
    }
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        System.out.println("Factorial of "+number+" is: "+factorialCalculate(number));
    }
}
