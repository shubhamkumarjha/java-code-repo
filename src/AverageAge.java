import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageAge {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 35)
        );
        double avg = averageAge(persons);
        avg = averageAge1(persons);
        avg = averageAge2(persons);
        System.out.println(avg);
    }

    private static double averageAge2(List<Person> persons) {
        return persons.stream().mapToInt(Person::getAge).average().getAsDouble();
    }

    private static double averageAge1(List<Person> persons) {
        return persons.stream().mapToInt(Person::getAge).average().getAsDouble();
    }

    private static double averageAge(List<Person> persons) {
        OptionalDouble avg = persons.stream().mapToInt(Person::getAge).average();
        return avg.getAsDouble();
    }
}
