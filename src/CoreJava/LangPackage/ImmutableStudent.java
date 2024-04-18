package CoreJava.LangPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class ImmutableStudent {

    //Make the field private and final
    private final String name;

    private final int rollNo;

    private final Map<String, String> metaData;

    private final List<String> hobbies;

    //Only constructor needed to add the data into the fields
    public ImmutableStudent(String name, int rollNo, Map<String, String> map, List<String> list) {
        this.name = name;
        this.rollNo = rollNo;
        this.metaData = new HashMap<>(map);

        this.hobbies = new ArrayList<>(list);
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public Map<String, String> getMetaData() {
        return new HashMap<>(this.metaData);
    }

    public List<String> getHobbies() {
        return new ArrayList<>(this.hobbies);
    }

    @Override
    public String toString() {
        return "ImmutableStudent{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", metaData=" + metaData +
                ", hobbies=" + hobbies +
                '}';
    }
}

class MainClass{

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Amritsar", "Punjab");
        List<String> list = new ArrayList<>();
        list.add("Listening music");


        ImmutableStudent student1 = new ImmutableStudent("Aman", 1, map, list);
        System.out.println(student1);


        System.out.println(student1.getMetaData());
    }
}
