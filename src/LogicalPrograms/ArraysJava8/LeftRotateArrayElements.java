package LogicalPrograms.ArraysJava8;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class LeftRotateArrayElements {

    public static void rotateArray(int[] array, int torotate) {
        int[] rotate = Arrays.stream(array).skip(torotate).toArray();
        int[] append = Arrays.stream(array).limit(torotate).toArray();

        int[] arrayFinal = new int[array.length];
        System.arraycopy(rotate, 0, arrayFinal, 0, rotate.length);
        System.arraycopy(append, 0, arrayFinal, rotate.length, append.length);

        System.out.println("Original array: "+Arrays.toString(array));
        System.out.println("Array after the rotation: "+Arrays.toString(arrayFinal));

    }

    //1, 2, 3, 4, 5 ----> 3, 4, 5, 1, 2
    public static void main(String[] args) {
        System.out.println("Kindly enter five array elements: ");
        int[] array = IntStream.range(0, 5)
                .map(e -> new Scanner(System.in).nextInt()).toArray();
        System.out.println("How many times do you want to rotate the array elements: ");
        int toRotate = new Scanner(System.in).nextInt();
        LeftRotateArrayElements.rotateArray(array, toRotate);
    }
}
