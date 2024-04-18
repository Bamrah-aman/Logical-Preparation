package CoreJava.MultiThreading;

public class DeadLock {
    static final Object resource1 = new Object();
    static final Object resource2 = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread1 locked the resource1");

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                synchronized (resource2) {
                    System.out.println("Thread1 locked the resource2");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread2 locked the resource2");

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                synchronized (resource1) {
                    System.out.println("Thread2 locked the resource1");
                }
            }
        });

        thread1.start();
        thread2.start();

    }
}
