package LogicalPrograms.Number;

public class MissingNumber {

    public void missingNumber(Long number) {
        //Formula is n(2a + (n - 1)d)/2
        String string = String.valueOf(number);
        int first = Character.getNumericValue(string.charAt(0));
        int length = string.length() + 1;
        int temp = 0;
        int missingNumber = 0;

        int sum = length * ((2 * first) + ((length - 1) * 1)) / 2;
        for (int i = 0; i < string.length(); i++) {
            temp = temp + Character.getNumericValue(string.charAt(i));
        }
        missingNumber = sum - temp;
        if (sum == temp) {
            System.out.println("There is no missing number in the sequence");
        } else {
            System.out.println("Missing Number is: " + missingNumber);
        }

    }

    public static void main(String[] args) {
        Long number = 1245678L;
        new MissingNumber().missingNumber(number);
    }
}
