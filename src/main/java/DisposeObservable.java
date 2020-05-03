import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.TimeUnit;

public class DisposeObservable {

    private static CompositeDisposable disposable = new CompositeDisposable();
    public static void main(String[] args) throws InterruptedException {

        Observable<Long> src = Observable.interval(1, TimeUnit.SECONDS);

        Disposable d = src.subscribe(e -> System.out.println("What is going on"+ e));

        Thread.sleep(10000);

        disposable.add(d);
        disposable.dispose();
    }



}

