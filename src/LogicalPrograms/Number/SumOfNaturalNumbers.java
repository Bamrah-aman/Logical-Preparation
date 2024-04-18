package LogicalPrograms.Number;

public class SumOfNaturalNumbers {

    public void sumOfNaturalNumbers(int numbers) {
        //FORMULA N(N+1)/2
        int sum = numbers*(numbers + 1)/2;
        System.out.println(sum);
    }
    public static void main(String[] args) {
        new SumOfNaturalNumbers().sumOfNaturalNumbers(10);
    }
}
