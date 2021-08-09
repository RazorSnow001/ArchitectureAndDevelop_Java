package AsynchronousFramework.RxJava;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

public class TestObservablePushEvents {
    public static void main(String[] args) {
        Observable<Long> secondIntervals = Observable.interval(1, TimeUnit.SECONDS);
        secondIntervals.subscribe(s-> System.out.println(s));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    /* ! On a side note, we will get more into concurrency later, but we had to create a sleep() method
* because this Observable fires emissions on a computation thread when subscribed to. The main thread
* used to launch our application is not going to wait on this Observable since it fires on a computation
* thread, not the main thread. Therefore, we use sleep() to pause the main thread for 5000
* milliseconds and then allow it to reach the end of the main() method (which will cause the application
? to terminate). This gives Observable.interval() a chance to fire for a five second window before the
? application quits.*/

    /* ! Of course, beyond map(), there are hundreds of operators in RxJava, and we
    ! will learn about the key ones in this book. Learning which operators to use for a situation and how
    ! to combine them is the key to mastering RxJava.
*/

    /* *
    *  The first answer is when you first start out: yes! You always want to take a reactive approach. The only
 !  way to truly become a master of reactive programming is to build reactive applications from the ground
 !  up.
    *
    * Think of everything as Observable and always model your program in terms of data and event flows.
 *  When you do this, you will leverage everything reactive programming has to offer and see the quality of
 *  your applications go up significantly
    *
    * */
}




