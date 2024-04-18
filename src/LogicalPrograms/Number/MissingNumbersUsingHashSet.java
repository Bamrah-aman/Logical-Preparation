package LogicalPrograms.Number;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingNumbersUsingHashSet {

    public static void findMissingNumbers(int[] array) {
        Set<Integer> set = new HashSet<>();

        Arrays.stream(array).forEach(e -> set.add(e));
        System.out.println("Missing elements in the array");
        for(int i=0; i<10; i++) {
            if(!set.contains(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 8, 10};
        findMissingNumbers(array);
    }
}
