import io.reactivex.rxjava3.core.Observable;

public class Buffering {
    public static void main(String[] args) {

        ///produces list
        Observable.range(1, 30)
                .buffer(4)
                .subscribe(System.out::println);


        
    }
}
