import java.util.*;

public class SecondHighestNumber {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5,2,6,1,4);
        Optional<Integer> secondHighest = numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        Integer thirdHighest = numbers.stream().sorted(Comparator.reverseOrder()).skip(2).findFirst().get();
        System.out.println(secondHighest.get());
        System.out.println(thirdHighest);
    }
}
