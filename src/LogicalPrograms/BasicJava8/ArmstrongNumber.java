package LogicalPrograms.BasicJava8;

import java.util.Scanner;
import java.util.stream.IntStream;

public class ArmstrongNumber {

    public static boolean checkArmstrong(int number) {
        //Write some logic here
        int length = String.valueOf(number).length();
        final int sum = IntStream.range(0, length )
                .map(numericValue -> Character.getNumericValue(String.valueOf(number).charAt(numericValue)))
                .map(numericValue -> (int) Math.pow(numericValue, length))
                .sum();
        return sum == number;

    }
    public static void main(String[] args) {
        System.out.println("Kindly enter the number to check whether it Armstrong or not");
        int number = new Scanner(System.in).nextInt();
        if(checkArmstrong(number)) {
            System.out.println("The number "+number+" is Armstrong");
        }else {
            System.out.println("The number "+number+" is not Armstrong");
        }
    }

}
