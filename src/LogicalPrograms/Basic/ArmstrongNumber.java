package LogicalPrograms.Basic;

public class ArmstrongNumber {

    public void armstrongNumberCheck(int number) {
        int length = String.valueOf(number).length();
        String numberToString =  String.valueOf(number);
        int number1 = 0;
        for(int i = 0; i<length; i++) {
            number1 = (int) (number1 + Math.pow(Character.getNumericValue(numberToString.charAt(i)),length));
        }
        if(number == number1) {
            System.out.println("The given number is Armstrong");
        }else{
            System.out.println("The given number is not Armstrong");
        }
    }

    public static void main(String[] args) {
        new ArmstrongNumber().armstrongNumberCheck(16342);
    }
}
