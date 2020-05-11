import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

public class Replay {
    public static void main(String[] args) throws InterruptedException {
        Observable<Long> src = Observable.interval(1, TimeUnit.SECONDS)
                .replay(1)
                .autoConnect();

        src.subscribe(e -> System.out.println("Observer 1  "+ e));

        Thread.sleep(5000);

        src.subscribe(e -> System.out.println("Observer 2  "+ e));

        Thread.sleep(5000);
    }
}
