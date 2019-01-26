package threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ThreadRunner {

    public static final long MAX_VALUE = 100000000000L;

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        //execute(MAX_VALUE);
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                execute(MAX_VALUE);
            }
        });
        thread1.start();
        execute(MAX_VALUE);

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        List<Callable<String>> tasks = new ArrayList<>();

        for (int i = 0; i < 4; i ++) {
            tasks.add(new Callable<String>() {
                @Override
                public String call() throws Exception {
                    for (long i = 0; i < MAX_VALUE/5; i++) {}
                    return null;
                }
            });
        }
        long startTime = System.nanoTime();
        List<Future<String>> futures = executorService.invokeAll(tasks);
        for(Future<String>result:futures)result.get();
        long endTime = System.nanoTime();
        System.out.println(Thread.currentThread().getName()+ ' '
                + (double)((endTime - startTime)/1000000000));
        executorService.shutdown();
    }

    private static void execute(long value) {
        long startTime = System.nanoTime();
        for (long i = 0; i < value; i++) {}
        long stopTime = System.nanoTime();

        System.out.println(Thread.currentThread().getName()+ ' '
                + (double)((stopTime - startTime)/1000000000));
    }
}
