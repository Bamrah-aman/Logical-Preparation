package LogicalPrograms.Number;

public class SwapNumbers {

    public void swapNumbers(int num1, int num2) {
        System.out.println("Before Swapping: "+num1+" "+num2);
        //REMEMBER THE LOGIC BEHIND THIS - + - NUM2 NUM1 NUM2
        num2 = num2 - num1;
        num1 = num2 + num1;
        num2 = num2 - num1;
        System.out.println("After Swapping: "+num1+" "+num2);

    }

    public static void main(String[] args) {
        new SwapNumbers().swapNumbers(43, 2);
    }
}
