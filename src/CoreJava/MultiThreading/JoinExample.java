package CoreJava.MultiThreading;

public class JoinExample {

    public static void main(String[] args) {

        Thread thread1 = new Thread( ()-> {
            for(int i=0; i<5; i++) {
                System.out.println("Thread 1 - count: "+i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        } );

        Thread thread2 = new Thread( ()-> {
            for(int i=0; i<5; i++) {
                System.out.println("Thread 2 - count: "+i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        } );

        thread1.start();
        try {
            //When we use join with parameter the Thread1 is going to join immediately for 1000 mill and other threads will wait and after finish the time other threads wil run
            thread1.join(5000);
            //thread1.join();
        }catch (InterruptedException ie) {
            throw new RuntimeException(ie);
        }
        thread2.start();

        System.out.println("Main Thread Continues..");
    }
}
