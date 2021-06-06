package Excutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(() -> System.out.println("great"));
        executorService.shutdown();
        ExecutorService executorService1 = Executors.newSingleThreadExecutor();
        executorService1.submit(() -> System.out.println("bad"));
        executorService1.shutdown();
    }
}
