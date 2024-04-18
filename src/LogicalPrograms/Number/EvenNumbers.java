package LogicalPrograms.Number;

public class EvenNumbers {

    public void printEvenNumbers(int range) {
        for(int i=0; i<=100; i= i+2) {
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        new EvenNumbers().printEvenNumbers(100);
    }
}
