package LogicalPrograms.Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWords {


    public void duplicateWords(String string) {
        String[] stringToArray = string.toLowerCase().split(" ");

        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<stringToArray.length; i++) {
            if(map.containsKey(stringToArray[i])) {
                map.put(stringToArray[i], map.get(stringToArray[i]) +1);
            }else {
                map.put(stringToArray[i], 1);
            }
        }

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

        entrySet.stream().filter(e -> e.getValue() > 1).forEach(e -> System.out.println(e.getKey()+"  "+e.getValue()));
    }
    public static void main(String[] args) {
        String string = "Big black bug bit a big black dog on his big black nose";
        new DuplicateWords().duplicateWords(string);
    }
}
