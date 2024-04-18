package LogicalPrograms.ArraysJava8;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class RightRotate {

    public static void rotate(int[] array, int toRotate) {
        int[] rotate = Arrays.stream(array).skip(array.length - toRotate).toArray();
        int[] append = Arrays.stream(array).limit(array.length - toRotate).toArray();

        int[] finalArray = new int[array.length];

        System.arraycopy(rotate, 0, finalArray, 0, rotate.length);
        System.arraycopy(append, 0, finalArray, toRotate, append.length);

        System.out.println("Before rotation: "+Arrays.toString(array));
        System.out.println("After rotation: "+Arrays.toString(finalArray));

    }
    public static void main(String[] args) {
        System.out.println("Enter the five array elements: ");
        int[] array = IntStream.range(0, 5)
                .map(element -> new Scanner(System.in).nextInt())
                .toArray();
        System.out.println("How many times do you want to rotate the array?");
        int toRotate = new Scanner(System.in).nextInt();
        RightRotate.rotate(array, toRotate);
    }
}

// 1, 2, 3, 4, 5 ---> 5, 4, 1, 2, 3
