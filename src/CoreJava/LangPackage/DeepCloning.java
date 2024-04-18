package CoreJava.LangPackage;


class C {

    int a;
     public C(int a) {
         this.a = a;
     }
}

class D implements Cloneable{
    int b;
    C c1;

    public D(int b, C c1) {
        this.b = b;
        this.c1 = c1;
    }

    @Override
    public Object clone() {

        Class[] cls = this.getClass().getInterfaces();
        if(cls[0].getSimpleName().equals("Cloneable")) {
            C cc = new C(c1.a);
            D dd = new D(this.b, cc);
            return dd;
        }else {
            try {
                throw new CloneNotSupportedException();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class DeepCloning {

    public static void main(String[] args) throws CloneNotSupportedException{

        C object1 = new C(5);
        D object2 = new D(10, object1);
        System.out.println("Hashcode of D: "+object2.hashCode());
        System.out.println("Hashcode of C: "+object2.c1.hashCode());

        //Deep Cloning
        D cloneObject2 = (D)object2.clone();
        System.out.println("Hashcode of clone D: "+cloneObject2.hashCode());
        System.out.println("Hashcode of clone C: "+cloneObject2.c1.hashCode());

        System.out.println("value of c: "+object2.c1.a);
        System.out.println("value of clone c: "+cloneObject2.c1.a);

        object2.c1.a = 12;

        System.out.println();

        System.out.println("value of c: "+object2.c1.a);
        System.out.println("value of clone c: "+cloneObject2.c1.a);
    }
}
