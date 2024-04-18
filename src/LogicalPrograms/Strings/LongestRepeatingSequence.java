package LogicalPrograms.Strings;

public class LongestRepeatingSequence {

    public static void longestRepeatingSequence(String string) {
        String newTemp = "";
        String oldTemp = "";
        for(int i=0; i<string.length()-1; i++) {
            int first = string.charAt(i);
            int second = string.charAt(i+1);
            if((first+1) == second) {
               newTemp = newTemp+string.charAt(i);
            }else {
                newTemp = "";
            }
            if(newTemp.length() > oldTemp.length()) {
                   oldTemp = newTemp;
            }
        }
        System.out.println("Largest sequence is: "+oldTemp);
    }

    public static void main(String[] args) {
        String string = "abcdpqrstuvw";
        longestRepeatingSequence(string);
    }
}
