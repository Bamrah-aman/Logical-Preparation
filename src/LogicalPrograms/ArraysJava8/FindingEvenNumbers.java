package LogicalPrograms.ArraysJava8;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class FindingEvenNumbers {

    public static void findEvenNumbers(int[] array) {
        System.out.println("Printing the even elements");
        Arrays.stream(array).filter(element -> element % 2 == 0)
                .forEach(element -> System.out.print(element+" "));
    }

    public static void main(String[] args) {

        System.out.println("Kindly enter the array elements");
        int[] array = IntStream.range(0, 5)
                .map(element -> new Scanner(System.in).nextInt()).toArray();
        FindingEvenNumbers.findEvenNumbers(array);
    }
}
