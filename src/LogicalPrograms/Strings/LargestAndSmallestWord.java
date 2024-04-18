package LogicalPrograms.Strings;

public class LargestAndSmallestWord {

    public void largestAndSmallestWord(String string) {
        String[] array = string.split(" ");
        for(int i=0; i<array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int lengthFirst = array[i].length();
                int lengthSecond = array[j].length();
                if (lengthFirst < lengthSecond) {
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Largest word is: "+array[0]+" Smallest word: "+array[array.length-1]);
    }

    public static void main(String[] args) {
        String string = "Hardships often prepare ordinary people for an extraordinary destiny";
        new LargestAndSmallestWord().largestAndSmallestWord(string);
    }
}
