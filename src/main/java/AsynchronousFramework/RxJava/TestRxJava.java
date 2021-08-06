package AsynchronousFramework.RxJava;

import io.reactivex.rxjava3.core.Observable;

public class TestRxJava {
    public static void main(String[] args) {
        Observable.just("Hello world").subscribe(System.out::println);


    }
}
