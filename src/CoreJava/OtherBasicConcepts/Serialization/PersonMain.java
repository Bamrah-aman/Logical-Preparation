package CoreJava.OtherBasicConcepts.Serialization;

import java.io.*;

public class PersonMain {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person = new Person();
        person.setAge(27);
        person.setName("Amandeep Singh");
        person.setHeight(5.8);

        //Writing the object to the file and covnerting into the byte stream
        FileOutputStream fileOutputStream = new FileOutputStream("yourfile.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(person);
        objectOutputStream.flush();
        objectOutputStream.close();

        //Now reading the file using the input stream
        FileInputStream fileInputStream = new FileInputStream("yourfile.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Person personByteStreamToObject = (Person) objectInputStream.readObject();
        objectInputStream.close();

        //Verification
        System.out.println(personByteStreamToObject.getAge() == person.getAge());
        System.out.println(personByteStreamToObject.getName().equals(person.getName()));

    }
}
