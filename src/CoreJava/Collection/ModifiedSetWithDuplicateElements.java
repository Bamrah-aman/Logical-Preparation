package CoreJava.Collection;


import java.util.HashSet;
import java.util.Set;

class Student {
    String name;
    int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        /*if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo && Objects.equals(name, student.name);*/
        return false;
    }

    @Override
    public int hashCode() {
        /*return Objects.hash(name, rollNo);*/
        return 1;
    }
}
public class ModifiedSetWithDuplicateElements {

    public static void main(String[] args) {

        Student student1 = new Student("Amandeep Singh", 21);
        Student student2 = new Student("Amandeep Singh", 21);
        Set<Student> hashSet = new HashSet<>();
        hashSet.add(student1);
        hashSet.add(student1);
        System.out.println(hashSet.size());
        System.out.println(hashSet);
    }
}
