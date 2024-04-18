package CoreJava.LangPackage;



class A {
    int a;

    //Parameter constructor
    public A(int a) {
        this.a = a;
    }

}
class B implements Cloneable{
        int b;
        A a1;

    public B(int b, A a1) {
        this.b = b;
        this.a1 = a1;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class ShallowClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        A object1 = new A(5);
        B object2 = new B(10, object1);

        B cloneObject = (B) object2.clone();
        System.out.println(object2.hashCode());
        System.out.println(cloneObject.hashCode());

        System.out.println(object2.a1.hashCode()+"  "+cloneObject.a1.hashCode());


    }
}
