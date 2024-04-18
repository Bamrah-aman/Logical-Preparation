package CoreJava.MultiThreading;

import java.sql.SQLOutput;

public class ThreadClass {

    public static void  main(String[] args) {
        //Java Provide the API for thread like
        //JAVA.LANG.THREAD
        //JAVA.LANG.THREADGROUP
        //JAVA.LANG.RUNNABLE

        //Let's check for the main thread
        System.out.println("Thread name is: "+Thread.currentThread().getName());
        System.out.println("Thread group name is: "+Thread.currentThread().getThreadGroup().getName());
    }
}
