import io.reactivex.rxjava3.core.Observable;

public class Operator {
    public static void main(String[] args) {
        Observable.just(60,57,89,90,23, 98,100)
                .filter(e -> e > 75)
                .sorted()
                .subscribe(e -> System.out.println("Grade A with "+ e));

    }
}
