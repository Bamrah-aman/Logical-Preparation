package CoreJava.MultiThreading;

public class WaitNotifyExampleInterThreadCommunication {
    static class TestTheCode {
        private boolean conditionMet = false;
        public synchronized void waitForCondition() {
            while (!conditionMet) {
                System.out.println(Thread.currentThread().getName() +" "+"is waiting");
                try {
                    wait();
                }catch (InterruptedException ie) {
                    throw new RuntimeException(ie);
                }
            }
            System.out.println(Thread.currentThread().getName()+" has been notified");
        }
        public synchronized void setConditionAndNotified() {
            System.out.println("Condition has been met notifying the waiting thread using thread: "+Thread.currentThread().getName());
            conditionMet = true;
            notifyAll();
        }
    }

    public static void main(String[] args) {
        TestTheCode testTheCode = new TestTheCode();
        Thread thread1 = new Thread(testTheCode::waitForCondition, "Thread1" );
        Thread thread2 = new Thread(testTheCode::setConditionAndNotified, "Thread2" );
        thread1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread2.start();
    }
}
