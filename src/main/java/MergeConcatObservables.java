import io.reactivex.rxjava3.core.Observable;
import java.util.concurrent.TimeUnit;

public class MergeConcatObservables {
    public static void main(String[] args) throws InterruptedException {
//        Observable<String> src1 = Observable.just("Ella", "Alexa","Lilly");
//        Observable<String> src2 = Observable.just("Tosh", "Mellisa");

        Observable<String> src1 = Observable.interval(1, TimeUnit.SECONDS).map(e -> "src1 : "+  e).take(10);
        Observable<String> src2 = Observable.interval(1, TimeUnit.SECONDS).map(e -> "src2 : "+  e).take(10);

//        src1.mergeWith(src2)
//                .subscribe(System.out::println);

        src1.concatWith(src2)
                .subscribe(System.out::println);

        Thread.sleep(20000);

//        Observable.concat(src1, src2)
//                .subscribe(System.out::println);
    }
}
