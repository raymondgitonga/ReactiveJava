import io.reactivex.rxjava3.core.Observable;

import java.util.Arrays;
import java.util.stream.Stream;

public class HelloRxJava {
    public static void main(String[] args) {
        Observable<String> source = Observable.create(
                e -> {
                    e.onNext("Hello");
                    e.onNext("RxJava");
                }
        );

        source.subscribe(e -> System.out.println("Observer 1: " + e + "Thread name " + Thread.currentThread().getName()));

        source.subscribe(e -> System.out.println("Observer 2: " + e +  "Thread name " + Thread.currentThread().getName()));
    }
}
