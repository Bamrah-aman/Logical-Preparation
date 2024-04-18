package LogicalPrograms.BasicJava8;

import java.util.Scanner;
import java.util.stream.Stream;

public class FibonnaciSeries {

    public static void fibonnaciSeries(int limit) {
        Stream.iterate(new int[] {0, 1}, e -> new int[] {e[1], e[0] + e[1]})
                .limit(limit)
                .mapToInt(e -> e[0]).forEach(e -> System.out.print(e+" "));
    }
    public static void main(String[] args) {
        System.out.println("Kindly enter the limit for fibonacci series");
        int limit = new Scanner(System.in).nextInt();
        fibonnaciSeries(limit);
    }
}
