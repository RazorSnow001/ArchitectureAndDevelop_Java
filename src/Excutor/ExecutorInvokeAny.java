package Excutor;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.*;

public class ExecutorInvokeAny {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Set<Callable<String>> callables = new HashSet<>();
        callables.add(() -> "task 1");
        callables.add(() -> "task 2");
        callables.add(() -> "task 3");
        String result = executorService.invokeAny(callables);
        System.out.println(result);
        executorService.shutdown();
    }
}
