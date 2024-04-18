package CoreJava.MultiThreading;

public class SynchronizedExample {

    static class Counter {

        //Synchronized method here
        public void increment() {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " " + "count is " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ie) {
                    throw new RuntimeException(ie);
                }
            }
        }
    }

    public static void main(String[] args) {

        Counter object1 = new Counter();
        Counter object2 = new Counter();

        Thread thread1 = new Thread(object1::increment,"Thread1");
        Thread thread2 = new Thread(object2::increment, "Thread2");

        //Now starting the both threads
        thread1.start();
        thread2.start();
    }
}
