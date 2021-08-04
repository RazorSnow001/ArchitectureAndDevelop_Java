package AsynchronousFramework.CompletableFuture;

import java.util.concurrent.CompletableFuture;

public class TestCompletableFuture {
    public static void main(String[] args) {
        CompletableFuture.runAsync(()-> System.out.println("Run async in completable future " + Thread.currentThread()));
        CompletableFuture.supplyAsync(()-> 5);
    }
}
