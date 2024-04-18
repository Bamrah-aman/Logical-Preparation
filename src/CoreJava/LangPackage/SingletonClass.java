package CoreJava.LangPackage;

import com.sun.security.jgss.GSSUtil;

public class SingletonClass {

    // First make the constructor private
    private SingletonClass() {
        System.out.println("Private default constructor");
    }

    // Second create a static reference variable
    private static SingletonClass reference;

    // And at last initialize the variable using the static block and that is it
    static {
        reference = new SingletonClass();
    }

    public static SingletonClass getReference() {
        return reference;
    }
}

class Main {
    public static void main(String[] args) {
        SingletonClass singletonClass = SingletonClass.getReference();
        SingletonClass singletonClass1 = SingletonClass.getReference();

        System.out.println(singletonClass.hashCode() +"   "+singletonClass1.hashCode());
    }
}
