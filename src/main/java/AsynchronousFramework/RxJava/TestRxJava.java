package AsynchronousFramework.RxJava;

import io.reactivex.rxjava3.core.Observable;

public class TestRxJava {
    public static void main(String[] args) {
        Observable.just("Hello world").subscribe(System.out::println);
        /*An Observable can push
        data or events from virtually any source  whether it is a database query or live Twitter feeds */

        /*To
         make this Observable actually push these five strings (which are called emissions we need an Observer to
         subscribe to it and receive the items

        We can quickly create and connect an Observer by passing a lambda
        expression that specifies what to do with each string it receives:
         */
        Observable<String> myStrings = Observable.just("curry", "james", "durant");
        myStrings.subscribe(System.out::println);
        myStrings.map(s -> s.length()).subscribe(s ->
                System.out.println(s));
        /*
         *If you have used Java 8 Streams or Kotlin sequences, you might be wondering how Observable is any
         * different.
         * */
        /*
         * The key difference is that Observable pushes the items while Streams and sequences pull the items
         */

        /*
         *
         * This may seem subtle, but the impact of a push-based iteration is far more powerful than a pull-based one.
         * As we saw earlier, you can push not only data, but also events.
         */

    }
}
