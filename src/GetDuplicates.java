import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class GetDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,4,5,3,2,6,1);
        List<Integer> duplicates = findDuplicateElements1(numbers);
        duplicates = findDuplicateElements1(numbers);
        System.out.println("Duplicate elements :: "+duplicates);
    }

    private static List<Integer> findDuplicateElements1(List<Integer> numbers) {
        HashSet<Integer> numSet = new HashSet<Integer>();
        return numbers.stream().filter(n->(!numSet.add(n))).toList();
    }

    private static List<Integer> findDuplicateElements(List<Integer> numbers) {
        HashSet<Integer> numset = new HashSet<>();
        return numbers.stream().filter(x->!numset.add(x)).toList();
    }
}
