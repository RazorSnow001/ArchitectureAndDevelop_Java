package Excutor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        /*
        * The easiest way to create ExecutorService is to use one of the factory methods of the Executors class.
        * For example, the following line of code will create a thread pool with 10 threads:
        * */
        ExecutorService executor = Executors.newFixedThreadPool(10);

        /*
        *  Creates a new ThreadPoolExecutor with the given initial parameters, the default thread factory and the default rejected execution handler.
          ! It may be more convenient to use one of the Executors factory methods instead of this general purpose constructor.
          ! Params:
          ! corePoolSize – the number of threads to keep in the pool, even if they are idle, unless allowCoreThreadTimeOut is set
          ! maximumPoolSize – the maximum number of threads to allow in the pool
          ! keepAliveTime – when the number of threads is greater than the core, this is the maximum time that excess idle threads will wait for new tasks before terminating.
          ! unit – the time unit for the keepAliveTime argument
          ! workQueue – the queue to use for holding tasks before they are executed. This queue will hold only the Runnable tasks submitted by the execute method.
        *
        * */
        ExecutorService executorService =
                new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS,
                        new LinkedBlockingQueue<Runnable>());

        /*
        !
        ! Assigning Tasks to the ExecutorService
        ! so the ExecutorService consume the Runnable and Callable tasks
          to keep things simple .

        * */
        /* so the callable <with type > is the combination of the runnable and ?
        *  ok now we use the no input parameters and we return a string . so ? that is just a match ! */
        Callable<String> callableTask = () -> {
            TimeUnit.MILLISECONDS.sleep(300);
            return "Task's execution";
        };
        List<Callable<String>> callableTasks = new ArrayList<>();
        callableTasks.add(callableTask);
        callableTasks.add(callableTask);
        callableTasks.add(callableTask);

        Runnable runnableTask = () -> {
            try {
                TimeUnit.MILLISECONDS.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        /*
        * submit() submits a Callable or a Runnable task to an ExecutorService and returns a result of type Future:
        * */
        Future<String> future =
                executorService.submit(callableTask);

        /*
        *  invokeAny() assigns a collection of tasks to an ExecutorService, causing each to run,
        *  and returns the result of a successful execution of one task (if there was a successful execution):
        * */
        String result = executorService.invokeAny(callableTasks);
        System.out.println(result);

        /*
        * invokeAll() assigns a collection of tasks to an ExecutorService, causing each to run,
        * and returns the result of all task executions in the form of a list of objects of type Future:
        * */
        List<Future<String>> futures = executorService.invokeAll(callableTasks);
        System.out.println(futures);
        futures.forEach(o-> {
            try {
                System.out.println(o.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        });

    }
}
