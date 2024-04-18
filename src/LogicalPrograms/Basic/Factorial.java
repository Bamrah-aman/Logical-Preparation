package LogicalPrograms.Basic;

public class Factorial {

    public void factorialCalculate(int number) {
        int spareNumber = 1;
        for(int i = 1; i <= number; i++){
            spareNumber = spareNumber * i;
        }
        System.out.println("Factorial of "+number+" is: "+spareNumber);
    }

    public static void main(String[] args) {
        new Factorial().factorialCalculate(10);
    }
}
