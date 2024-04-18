package LogicalPrograms.Strings;


public class Palindrome {


    public void checkPalindrome(String string) {
        String temp = "";
        for(int i=string.length()-1; i>=0; i--) {
            temp = temp+string.charAt(i);
        }
        if (string.equals(temp)) {
            System.out.println("The given string is Palindrome");
        }else{
            System.out.println("The given string is not Palindrome");
        }
    }
    public static void main(String[] args) {
        String string = "madamm";
        new Palindrome().checkPalindrome(string);
    }
}
