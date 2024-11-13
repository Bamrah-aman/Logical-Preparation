package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Hello {

    private int id;
    private String name;

    private static Comparator<Hello> comparator = Comparator.comparing(Hello ::getName).reversed();
    public Hello(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static Comparator<Hello> getComparator() {
        return comparator;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<Hello> list = new ArrayList<>();
        Hello helloOne = new Hello(2, "Dua Lipa");
        Hello helloTwo = new Hello(1, "Camilla Cabbello");
        Hello helloThree = new Hello(3, "Annie Marry");
        Hello helloFour = new Hello(4, "Doja Cat");
        list.add(helloOne);
        list.add(helloTwo);
        list.add(helloThree);
        list.add(helloFour);

        Collections.sort(list, Hello.comparator);
        System.out.println(list);
        //Added new comment
    }
}