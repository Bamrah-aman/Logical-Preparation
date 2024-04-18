package LogicalPrograms.ArraysJava8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DuplicateElements {

    public static void findDuplicates(int[] array) {
        List<Integer> list = Arrays.stream(array).boxed().toList();
        Map<Integer, Long> map = list.stream().collect(Collectors.groupingBy(
                element -> element, Collectors.counting()
        ));

        List<Integer> duplicates = map.entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println("Duplicate Elements: "+duplicates);
    }
    public static void main(String[] args) {
        System.out.println("Enter the array elements");
        Scanner scanner = new Scanner(System.in);
        int[] array = IntStream.range(0, 10).map(
                (e) -> {
                    System.out.print("Enter the "+(e+1)+" element: ");
                    return scanner.nextInt();
                }
        ).toArray();
        DuplicateElements.findDuplicates(array);
    }
}
