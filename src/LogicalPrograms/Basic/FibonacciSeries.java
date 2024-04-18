package LogicalPrograms.Basic;

public class FibonacciSeries {

    public void fibonacciSeries(int length) {
        int firstElement = 0;
        int secondElement = 1;
        System.out.print(firstElement+" "+secondElement);
        for(int i = 0; i < length; i++) {
            int thirdElement = secondElement + firstElement;
            System.out.print(" "+thirdElement);
            firstElement = secondElement;
            secondElement = thirdElement;
        }
    }

    public static void main(String[] args) {
        new FibonacciSeries().fibonacciSeries(10);
    }
}
