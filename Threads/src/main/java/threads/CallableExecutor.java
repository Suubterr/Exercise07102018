package threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CallableExecutor implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println("We were somewhere around Barstow in the middle of the desert" +
                ", when drugs began to take hold...");
        return Thread.currentThread().getName();
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("We cant stop here. This is bat country!");

        //runSingleThread();
        runMultipleThreads();

    }

    private static void runMultipleThreads() throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        List<Callable<String>> tasks = new ArrayList<>();

        for (int i=0;i<10;i++)tasks.add(new CallableExecutor());

        List<Future<String>> threadResults = executorService.invokeAll(tasks);

        Thread.sleep(1000);

        for (Future<String> i : threadResults) {
            System.out.println(i.get());
        }

        executorService.shutdown();

    }

    private static void runSingleThread() throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> threadResult = executorService.submit(new CallableExecutor());
        System.out.println("Medicine!! Medicine!!");

        System.out.println("And he said :" + threadResult.get());
        executorService.shutdown();
    }
}
