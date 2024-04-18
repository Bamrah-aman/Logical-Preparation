package LogicalPrograms.Strings;

import java.util.*;

public class MaxMinChar {

    //I know this how to do but pending
    public void minMaxChar(String string) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<string.length(); i++) {
            if(map.containsKey(string.charAt(i))){
                map.put(string.charAt(i), map.get(string.charAt(i)) +1);
            }else {
                map.put(string.charAt(i), 1);
            }
        }

        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        List<Integer> list = new ArrayList<>();
        entrySet.stream().forEachOrdered(e -> list.add(e.getValue()));
        Collections.sort(list);
        System.out.println(list);

        entrySet.stream().filter(e -> e.getValue() == list.get(0) && e.getKey() != ' ')
                .forEach(e -> System.out.println("Minimum repeating character: "+e.getKey()));

    }
    public static void main(String[] args) {
        String string = "grass is greener on the other side";
        new MaxMinChar().minMaxChar(string);
    }
}
