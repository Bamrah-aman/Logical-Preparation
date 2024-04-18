package LogicalPrograms.ArraysJava8;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class OddPositions {

    public static void find(int[] array) {
        System.out.println("Printing the odd elements now");
        IntStream.iterate(0, i -> i+2).limit(array.length -2)
                .forEach(element -> System.out.print(array[element]+" "));
    }
    public static void main(String[] args) {
        System.out.println("Enter the five array elements: ");
        int[] array = IntStream.range(0, 5)
                .map(element -> new Scanner(System.in).nextInt())
                .toArray();

        OddPositions.find(array);
    }
}
