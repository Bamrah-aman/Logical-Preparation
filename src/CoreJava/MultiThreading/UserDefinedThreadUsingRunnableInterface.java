package CoreJava.MultiThreading;

public class UserDefinedThreadUsingRunnableInterface implements Runnable{

    public UserDefinedThreadUsingRunnableInterface() {
        Thread userdefinedThread = new Thread(this,"I am user defined thread");
        userdefinedThread.start();
    }
    @Override
    public void run() {
        for(int i=0; i<5; i++) {
            System.out.println(Thread.currentThread().getName());
            try{
                Thread.sleep(1000);
            }catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        UserDefinedThreadUsingRunnableInterface userDefinedThreadUsingRunnableInterface =
                new UserDefinedThreadUsingRunnableInterface();

        //Let's check the main thread also woohoo
        for(int i=0; i<5; i++) {
            System.out.println(Thread.currentThread().getName());
            try{
                Thread.sleep(1000);
            }catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }


}
