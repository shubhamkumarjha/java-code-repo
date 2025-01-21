import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Demo3 {

    public static void main(String[] args) {
        String s = "Shubham";
        List<Character> uniqueCharlist = findUniqueChars(s);
        List<Character> duplicateCharlist = findDuplicateChars(s);
        System.out.println("Result Unique Character:: "+uniqueCharlist+" Duplicate Character :: "+duplicateCharlist);
    }

    private static List<Character> findDuplicateChars(String s) {
        HashSet<Character> characterHashSet = new HashSet<Character>();
        return Arrays.stream(s.split("")).map(a->a.charAt(0)).filter(x->(!characterHashSet.add(x))).toList();
    }



    private static List<Character> findUniqueChars(String s) {
        HashSet<Character> charset = new HashSet<>();
        return Arrays.stream(s.split("")).map(x->x.charAt(0)).filter(charset::add).toList();
    }


}
