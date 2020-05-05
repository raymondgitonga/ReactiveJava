import io.reactivex.rxjava3.core.Observable;

public class Grouping {
    public static void main(String[] args) {
        Observable<Employee> obs = Observable.just(
                new Employee(101, "Alexa", 6000, 4.0),
                new Employee(123,"Tosh", 94000, 4.7),
                new Employee(236, "Raymond", 65000, 4.0),
                new Employee(155,"Gitonga", 85000, 4.4),
                new Employee(443,"George", 50000, 3.6),
                new Employee(127,"Principal", 50000, 4.5),
                new Employee(509, "Lucy",94000, 4.0),
                new Employee(344,"Harry", 75000, 4.7),
                new Employee(344,"Potter", 55000, 4.3),
                new Employee(509, "Tim",60000, 3.7)
        );

        obs.groupBy(e -> e.getRating())
                .flatMapSingle(e -> e.toMultimap(key -> e.getKey(), emp -> emp.getName()))
                .subscribe(System.out::println);
    }
}
