import io.reactivex.rxjava3.core.Observable;

import java.util.List;

public class OperatorsInAction {

    public static void main(String[] args) {
        Observable<Employee> obs = Observable.just(
                new Employee(101, "Alexa", 6000, 4.0),
                new Employee(123,"Tosh", 94000, 4.7),
                new Employee(236, "Raymond", 65000, 4.0),
                new Employee(155,"Gitonga", 85000, 4.4),
                new Employee(127,"Principal", 50000, 3.6),
                new Employee(143, "Daniel",60000, 4.5),
                new Employee(509, "Lucy",94000, 4.7),
                new Employee(344,"Harry", 75000, 4.3),
                new Employee(344,"Potter", 55000, 3.7),
                new Employee(509, "Tim",60000, 4.7)
        );

        obs.filter(employee -> employee.getRating() > 4.0)
                .sorted((e1,e2)-> Double.compare(e2.getRating(), e1.getRating()))
                .map(e -> e.getName())
                .take(4)
                .subscribe(System.out::println);

        List<Integer> expenses = List.of(200,500,300,340,129,999,1030,3400,890,996,789);

        Observable.fromIterable(expenses)
                .scan((a,b)->a + b)
                .subscribe(System.out::println);

        Observable.fromIterable(expenses)
                .reduce((a,b)->a + b)
                .subscribe(System.out::println);
    }
}


