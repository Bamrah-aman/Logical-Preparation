package CoreJava.MultiThreading;

import java.util.concurrent.*;

public class CallableFutureExample {

    static class Task implements Callable<String> {

        String name;

        public Task(String name) {
            this.name = name;
        }
        @Override
        public String call() throws Exception {
            Thread.sleep(2000);
            return "Task "+name+" completed";
        }
    }
    public static void main(String[] args)  {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Callable<String> callable = new Task("MultiThreading revision");
        final Future<String> future = executorService.submit(callable);
        System.out.println("main Thread is doing some stuff");
        try {
            System.out.println(future.get());
        }catch (InterruptedException | ExecutionException exception) {
            throw new RuntimeException(exception);
        }finally {
            executorService.shutdown();
        }
    }
}
