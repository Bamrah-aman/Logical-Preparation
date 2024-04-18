package CoreJava.OtherBasicConcepts.Serialization;

import java.io.Serial;
import java.io.Serializable;

public class Person implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    static String country = "ITALY";
    private int age;

    private String name;
    transient double height;

    public static String getCountry() {
        return country;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public static void setCountry(String country) {
        Person.country = country;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
