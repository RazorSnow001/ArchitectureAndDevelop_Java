package Callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableFutureTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask[] randomNumberTasks = new FutureTask[5];
        for (int i = 0; i < 5; i++) {
            Callable callable = new CallableExample();
            randomNumberTasks[i] = new FutureTask<>(callable);
            Thread thread = new Thread(randomNumberTasks[i]);
            thread.start();
        }
        for (int i = 0; i < 5; i++)
        {
            // As it implements Future, we can call get()
            System.out.println(randomNumberTasks[i].get());
            // This method blocks till the result is obtained
            // The get method can throw checked exceptions
            // like when it is interrupted. This is the reason
            // for adding the throws clause to main
        }
    }
}
