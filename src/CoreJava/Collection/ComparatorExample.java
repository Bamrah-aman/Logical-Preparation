package CoreJava.Collection;

import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

    String name;

    List<String> hobbies;

    public ComparatorExample(String name, List<String> hobbies) {
        this.name = name;
        this.hobbies = hobbies;
    }

    public static Comparator<ComparatorExample> comparator = Comparator.comparing(comparatorExample -> comparatorExample.hobbies.get(0));

    //public static Comparator<ComparatorExample> comparator1 = Comparator.comparing( element-> element.name);


    @Override
    public String toString() {
        return "ComparatorExample{" +
                "name='" + name + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }
}


//We can also do like this

class MainComparator {
    public static void main(String[] args) {

        ComparatorExample student1 = new ComparatorExample("Amandeep Singh", List.of("Listening Music", "Watching superheroes movies"));
        ComparatorExample student2 = new ComparatorExample("Harpreet Singh", List.of("Doing Exercise", "Watching superheroes movies"));

        List<ComparatorExample> list = new java.util.ArrayList<>(List.of(student1, student2));
        list.sort(ComparatorExample.comparator);
        System.out.println(list);
    }
}