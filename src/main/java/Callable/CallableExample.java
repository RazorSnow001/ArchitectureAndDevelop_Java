package Callable;

import java.util.Random;
import java.util.concurrent.Callable;

public class CallableExample implements Callable {
    @Override
    public Object call() throws Exception {
        Random generator = new Random();
        Integer randomNumber = generator.nextInt(200);
        Thread.sleep(randomNumber * 10);
        return randomNumber;
    }
}
