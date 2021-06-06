package Excutor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.*;

public class ExecutorInvokeAll {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Set<Callable<String>> callables = new HashSet<>();
        callables.add(() -> "task 1");
        callables.add(() -> "task 2");
        callables.add(() -> "task 3");
        List<Future<String>> futures = executorService.invokeAll(callables);
        for (Future<String> future :
                futures) {
            System.out.println(future.get());
        }
        executorService.shutdown();
    }
}
