import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestString {
    public static void main(String[] args) {
        List<String> strings = Arrays
                .asList("apple", "banana", "cherry", "date", "grapefruit");
        String result = findLongestString(strings);
        System.out.println(strings.stream().sorted(Comparator.comparingInt(String::length)).findFirst());
        System.out.println(strings.stream().max(Comparator.comparingInt(String::length)).get());
        System.out.println(result);
    }

    private static String findLongestString(List<String> strings) {
        String result = "";
        Optional<String> optionalString = strings.stream().max(Comparator.comparingInt(String::length));
        optionalString.ifPresent(System.out::println);
        return result;
    }
}
