package CoreJava.java8;

import java.util.ArrayList;
import java.util.List;

public class PersonFlatMapExample {

    private String name;

    private int age;

    private List<List<Address>> list;

    public PersonFlatMapExample(String name, int age, List<List<Address>> list) {
        this.name = name;
        this.age = age;
        this.list = list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<List<Address>> getList() {
        return list;
    }

    public void setList(List<List<Address>> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", list=" + list +
                '}';
    }
}


class Address {
    private String city;
    private String state;

    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}


class Main {
    public static void main(String[] args) {
        List<Address> listOfAddress = new ArrayList<Address>();
        Address address = new Address("Amritsar", "Punjab");
        listOfAddress.add(address);

        PersonFlatMapExample person = new PersonFlatMapExample("Amandeep Singh Bamrah", 27, new ArrayList<>(List.of(listOfAddress, listOfAddress)));
        final List<Address> collect = person.getList().stream().flatMap(e -> e.stream()).toList();
        collect.stream().forEach(System.out::println);
    }
}