package LogicalPrograms.Number;

public class ReverseNumber {

    public void reverseNumber(int number){
        int spare = 0;
        int remainder = 0;
        while(number > 0) {
            remainder = number % 10;
            spare = (spare*10) + remainder;
            number = number/10;
        }
        System.out.println(spare);
    }

    public static void main(String[] args) {
        new ReverseNumber().reverseNumber(123);
    }
}
