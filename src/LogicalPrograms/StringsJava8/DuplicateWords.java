package LogicalPrograms.StringsJava8;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateWords {

    public static void findDuplicateWords(String input) {
        String[] array = input.toLowerCase().split("\\s+");

        Map<String, Long> map = Arrays.stream(array).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<String, Long> map2 = map.entrySet().stream()
                .filter(entryset -> entryset.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry :: getKey, Map.Entry :: getValue));

        System.out.println("Duplicate Words are: "+map2);
    }
    public static void main(String[] args) {
        System.out.println("Kindly enter the String: ");
        String input = new Scanner(System.in).nextLine();

        DuplicateWords.findDuplicateWords(input);
    }
}
