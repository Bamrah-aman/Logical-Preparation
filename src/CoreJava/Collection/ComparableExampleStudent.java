package CoreJava.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExampleStudent implements Comparable{

    String name;
    int rollNo;
    List<String> hobbies;

    public ComparableExampleStudent(String name, int rollNo, List<String> hobbies) {
        this.name = name;
        this.rollNo = rollNo;
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    @Override
    public int compareTo(Object o) {
        ComparableExampleStudent student = (ComparableExampleStudent) o;
        //return this.rollNo - student.rollNo;
        return (this.rollNo > student.rollNo) ? -1 : ((this.rollNo < student.rollNo) ? 1 : 0);

    }

    @Override
    public String toString() {
        return "ComparableExampleStudent{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", hobbies=" + hobbies +
                '}';
    }
}

class Main {
    public static void main(String[] args) {
        ComparableExampleStudent student1 = new ComparableExampleStudent("Amandeep Singh", 21, List.of("Listening Music"));
        ComparableExampleStudent student2 = new ComparableExampleStudent("Jaspreet Singh", 13, List.of("Going Gurudwara"));
        ComparableExampleStudent student3 = new ComparableExampleStudent("Harpreet Singh", 9, List.of("Dong Exercise"));
        ComparableExampleStudent student4 = new ComparableExampleStudent("Harleen Kaur", 50, List.of("Study and reading"));
        ComparableExampleStudent student5 = new ComparableExampleStudent("Manmeet Singh", 32, List.of("Driving car"));
        List<ComparableExampleStudent> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        Collections.sort(studentList);
        System.out.println(studentList);

    }
}
