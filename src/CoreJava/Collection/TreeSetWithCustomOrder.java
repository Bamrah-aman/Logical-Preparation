package CoreJava.Collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetWithCustomOrder {
    private Set<String> city;

    public TreeSetWithCustomOrder(Set<String> city) {
        this.city = city;
    }

    public Set<String> getCity() {
        return city;
    }


    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>(Comparator.reverseOrder());
        treeSet.add("Amritsar"); treeSet.add("Toronto"); treeSet.add("New Wales");
        treeSet.add("Colorado"); treeSet.add("New Delhi"); treeSet.add("Mumbai");
        TreeSetWithCustomOrder customOrder = new TreeSetWithCustomOrder(treeSet);
        System.out.println(customOrder.getCity());
    }
}
