package LogicalPrograms.Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateElementsHashMap {

    public static void duplicateElements(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<array.length; i++) {
            if(map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) +1);
            }else {
                map.put(array[i], 1);
            }
        }

        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        entrySet.stream()
                .filter(key -> key.getValue() > 1)
                .forEach(e->System.out.print(e.getKey()+" "));
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 1, 5, 5};
        duplicateElements(array);
    }
}
