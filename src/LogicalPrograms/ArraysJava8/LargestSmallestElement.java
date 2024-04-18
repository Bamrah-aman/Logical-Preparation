package LogicalPrograms.ArraysJava8;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class LargestSmallestElement {

    public static void findLargestSmallestElement(int[] array) {
        System.out.println("Smallest element: "+Arrays.stream(array).min().getAsInt());
        System.out.println("Largest element: "+Arrays.stream(array).max().getAsInt());
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 10 array elements: ");
        int[] array = IntStream.range(0, 10)
                        .map( element -> scanner.nextInt()).toArray();

        LargestSmallestElement.findLargestSmallestElement(array);
    }
}
