import io.reactivex.rxjava3.core.Observable;

import java.util.List;

public class CreateObservable {
    public static void main(String[] args) {

        //create
        Observable<Integer> source = Observable.create(
                e -> {
                    e.onNext(10);
                    e.onNext(11);
                    e.onComplete();
                }
        );

        source.subscribe(System.out::println);

        //just
        Observable<Integer> just = Observable.just(1,2,3);

        just.subscribe(System.out::println);

        //fromIterable
        List<String> list = List.of("Tosh", "Gitonga", "Raymond");

        Observable<String> fromIterable = Observable.fromIterable(list);

        fromIterable.subscribe(System.out::println);
    }
}
