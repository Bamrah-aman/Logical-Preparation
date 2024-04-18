package CoreJava.OtherBasicConcepts.Serialization;

import java.io.*;

public class CustomPersonMain {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Address address = new Address();
        address.setHouseNumber(33);

        CustomPerson customPerson = new CustomPerson();
        customPerson.setName("Amandeep Singh Bamrah");
        customPerson.setAge(26);
        customPerson.setAddress(address);

        FileOutputStream fileOutputStream = new FileOutputStream("CustomePerson.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(customPerson);
        objectOutputStream.flush();
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("CustomePerson.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        CustomPerson customPerson1 = (CustomPerson) objectInputStream.readObject();

        //Let's do the verification here
        System.out.println(customPerson.getAddress().getHouseNumber() ==
                customPerson1.getAddress().getHouseNumber());
    }
}
