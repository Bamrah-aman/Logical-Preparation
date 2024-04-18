package LogicalPrograms.Number;

public class LargestOfThree {

    public static void main(String[] args) {
        int num1 = 32;
        int num2 = 12;
        int num3 = 56;
        int largestOfThree = (num1>num2?num1:num2)>num3?(num1>num2?num1:num2):num3;
        System.out.println(largestOfThree);
    }
}
