package LogicalPrograms.Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FrequencyOfEachElementHashMap {

    public static void frequencyUsingHashMap(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i< array.length; i++) {
            if(map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) +1);
            }else {
                map.put(array[i], 1);
            }
        }

        Set<Map.Entry<Integer, Integer>> entry = map.entrySet();

        entry.forEach(n->System.out.println(n.getKey()+"  "+n.getValue()+" times"));
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 2, 1, 3, 23, 32, 23, 1};
        frequencyUsingHashMap(array);
    }
}
