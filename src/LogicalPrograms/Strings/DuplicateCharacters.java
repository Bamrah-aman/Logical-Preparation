package LogicalPrograms.Strings;

import LogicalPrograms.Arrays.DuplicateElements;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacters {

    public void duplicate(String string) {
        Map<Character, Integer> map = new HashMap<>();
        String lowerCase = string.toLowerCase();
        for(int i=0; i<lowerCase.toLowerCase().length(); i++) {
            if(map.containsKey(lowerCase.charAt(i))) {
                map.put(lowerCase.charAt(i), map.get(lowerCase.charAt(i))+1);
            }else {
                map.put(lowerCase.charAt(i), 1);
            }
        }

        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        entrySet.stream().filter(e -> e.getValue() > 1).
                forEach(e -> System.out.println(e.getKey()+" "+e.getValue()+" times"));
    }
    public static void main(String[] args) {
        String string = "Great Responsibility";
        new DuplicateCharacters().duplicate(string);
    }
}
