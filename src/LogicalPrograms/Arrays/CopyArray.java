package LogicalPrograms.Arrays;

import java.util.Arrays;

public class CopyArray {

    public void copyArray(int[] array1, int[] array2) {
        int counter = 0;
        for(int i=0; i<array1.length; i++) {
            array2[counter++] = array1[i];
        }
        Arrays.stream(array2).forEach(System.out::println);
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = new int[array1.length];
        new CopyArray().copyArray(array1, array2);
    }
}
