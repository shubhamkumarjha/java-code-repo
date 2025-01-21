import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class UniqueElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(6,1,2,4,5,3,6,1,5);
        HashSet<Integer> uniqueElements = findUniqueElements(numbers);
        System.out.println("Unique elements :: "+uniqueElements);
    }

    private static HashSet<Integer> findUniqueElements(List<Integer> numbers) {
        HashSet<Integer> numset = new HashSet<Integer>();
        numbers.forEach(x->{
            if(!numset.add(x)){
                numset.remove(x);
            }
        });
        return numset;
    }
}
