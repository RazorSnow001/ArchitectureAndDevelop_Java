package AsynchronousFramework.RxJava;

import io.reactivex.rxjava3.core.Observable;

public class TestObservable {
    public static void main(String[] args) {
        Observable<String> source = Observable.create(emitter -> {
            emitter.onNext("Alpha");
            emitter.onNext("Beta");
            emitter.onNext("Gamma");
            emitter.onNext("Delta");
            emitter.onNext("Epsilon");
            emitter.onComplete();
        });
        source.subscribe(s -> System.out.println("RECEIVED: " + s));

        String[] letters = {"a", "b", "c", "d", "e", "f", "g"};
        Observable<String> observable = Observable.fromArray(letters);



/* ? Note that the Observable contract dictates that
 !  emissions must be passed sequentially and one at a time. Emissions cannot be passed by
 !  an Observable concurrently or in parallel. This may seem like a limitation, but it does in
 !  fact simplify programs and make Rx easier to reason with. We will learn some powerful
 !  tricks to effectively leverage concurrency and parallelization in Chapter 6, Concurrency
 !  and Parallelization , without breaking the Observable contract.
*/
    }
}
