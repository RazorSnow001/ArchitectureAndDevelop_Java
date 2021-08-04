package AsynchronousFramework.CompletableFuture;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


/*
* The answer involves changing the API to an asynchronous API.
6
 Instead of allowing
a method to return its result at the same time that it physically returns to the caller
(synchronously), you allow it to return physically before producing its result
* */
public class TestAsyn {
    public static int f(Integer x) {
        return  x * x;
    }

    public static int g(int y) {
        return 3 * y;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int x = 1000;
        int y = 100;
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Integer> k = executorService.submit(() -> f(x));
        Future<Integer> z = executorService.submit(() -> g(y));
        System.out.println(k.get() + z.get());
        executorService.shutdown();
    }
}
