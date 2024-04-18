package LogicalPrograms.Strings;

public class CharactersCount {

    public void characterCount(String countCharacter) {
        int counter = 0;
        for(int i=0; i<countCharacter.length(); i++) {
            if(countCharacter.charAt(i) == ' ') {
                continue;
            }else {
                counter++;
            }
        }
        System.out.println("Number of characters: "+counter);
    }
    public static void main(String[] args) {
        String string = "I will be rich one day for sure hehe";
        new CharactersCount().characterCount(string);
    }
}
