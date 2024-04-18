package LogicalPrograms.ArraysJava8;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FrequencyOfEachElement {

    public static void findFrequencyOfElements(int[] array) {
        List<Integer> list = Arrays.stream(array).boxed().toList();

        Map<Integer, Long> map = list.stream().collect(Collectors.groupingBy(
                element -> element, Collectors.counting()
        ));

        //map.entrySet().stream().forEach(element -> System.out.println(element.getKey()+" "+element.getValue()));
        map.entrySet().stream().filter( element -> element.getValue() > 1).
                forEach(element -> System.out.println(element.getKey()+" "+element.getValue()));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = IntStream.range(0, 10)
                .map( element -> {
                    System.out.print("Enter the "+(element+1)+": element: ");
                    return scanner.nextInt();
                }).toArray();

        FrequencyOfEachElement.findFrequencyOfElements(array);
    }
}
