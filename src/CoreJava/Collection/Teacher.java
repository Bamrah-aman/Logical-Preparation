package CoreJava.Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class Teacher {

    private String name;
    private String deptName;
    private static Map<String, String> cityAndState;

    public Teacher(String name, String deptName, Map<String, String> cityAndState) {
        this.name = name;
        this.deptName = deptName;
        Teacher.cityAndState = cityAndState;
    }

    public String getName() {
        return name;
    }

    public String getDeptName() {
        return deptName;
    }

    public Map<String, String> getCityAndState() {
        return cityAndState;
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher("Amanda", "Physics", Map.of("Amritsar", "Punjab"));
        Teacher teacherTwo = new Teacher("Camilla", "Chemistry", Map.of("Jalandhar", "Punjab"));
        Set<Map.Entry<String, String>> setEntry = cityAndState.entrySet();
        setEntry.forEach(e -> System.out.println(e.getKey()+"  "+e.getValue()));

    }
}
