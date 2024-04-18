package CoreJava.MultiThreading;

public class UserDefinedThreadUsingThreadClass extends Thread{

    public UserDefinedThreadUsingThreadClass() {
        super("Hello from stranger :-)");
        start();
    }

    @Override
    public void run() {
        for(int i=0; i<5; i++) {
            System.out.println("Userdefined thread: "+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            }catch(InterruptedException ie) {
                ie.printStackTrace();
            }
            }
    }

    public static void main(String[] args) {
        UserDefinedThreadUsingThreadClass object = new UserDefinedThreadUsingThreadClass();

        //Let's check the main thread also
        for(int i=0; i<5; i++) {
            System.out.println("Main thread: "+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            }catch(InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }
}
