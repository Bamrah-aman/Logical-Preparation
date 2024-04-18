package LogicalPrograms.StringsJava8;

import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharacters {

    public static void findDuplicateCharacters(String input) {
        //Let's write down the logic here
        //What chars() do is return equivalent Integer value of the Character

        final Map<Character, Long> map = input.chars().filter(c -> c != ' ')
                .mapToObj(c -> (char) c).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("Repeating Characters");
        map.entrySet().stream().filter(e -> e.getValue() > 1)
                .forEach(e -> System.out.print("Character: "+e.getKey()+" "+"Repeating: "+e.getValue()+" times"));

    }
    public static void main(String[] args) {
        System.out.println("Enter the String here: ");
        String input = new Scanner(System.in).nextLine();
        DuplicateCharacters.findDuplicateCharacters(input);
    }
}
