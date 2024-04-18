package LogicalPrograms.NumberJava8;

import java.util.Scanner;
import java.util.stream.IntStream;

public class ArmstrongNumberSeries {

    public static void findArmstrongSeries(int range) {
        IntStream.range(1, range).filter(ArmstrongNumberSeries::checkArmstrong)
                .forEach(e -> System.out.print(e + " "));
    }

    private static boolean checkArmstrong(int numberToCheck) {
        int length = String.valueOf(numberToCheck).length();
        int sum = IntStream.range(0, length)
                .map(e -> (int) Math.pow(Character.getNumericValue(String.valueOf(numberToCheck).charAt(e)), length))
                .sum();
        return numberToCheck == sum;
    }

    public static void main(String[] args) {
        System.out.println("Kindly enter the range for Armstrong");
        int range = new Scanner(System.in).nextInt();
        findArmstrongSeries(range);

    }
}
