
import io.reactivex.rxjava3.core.Observable;

import java.util.List;

public class ConcatMapFlatMap {
    public static void main(String[] args) {
        List<String> list = List.of("Hello", "Reactive", "Programming");

        Observable.fromIterable(list)
                .flatMap(e -> Observable.fromArray(e.split("")))
                .subscribe(System.out::println);

    }
}
