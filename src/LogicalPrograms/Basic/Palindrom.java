package LogicalPrograms.Basic;

public class Palindrom {

    public void checkPalindrome(int number) {
        int numberToCheck = number;
        int toCompare = 0;
        while (number > 0) {
            int remainder = number % 10;
            toCompare = (toCompare * 10) + remainder;
            number = number / 10;
        }
        if(numberToCheck == toCompare)
            System.out.println("The given number is Palindrom");
        else
            System.out.println("The Number is not Palindrom");
    }

    public static void main(String[] args) {
        new Palindrom().checkPalindrome(5455);
    }
}
