import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "abrakadabra";
        Map<Character, Long> charFrequency = findCharFrequncy(str);
        charFrequency = findCharFrequncy1(str);
        charFrequency = findCharFrequncy2(str);
        System.out.println("Character frequency :: "+charFrequency);

    }

    private static Map<Character, Long> findCharFrequncy2(String str) {
        return Arrays.stream(str.split("")).map(x->x.charAt(0)).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    }

    private static Map<Character, Long> findCharFrequncy1(String str) {
        return Arrays.stream(str.split("")).map(s->s.charAt(0))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
;    }

    private static Map<Character, Long> findCharFrequncy(String str) {
       List<Character> charList = Arrays.stream(str.split(""))
               .map(s->s.charAt(0))
               .toList();
        System.out.println("Characters list :: "+charList);
        Map<Character, Long> charFrequency = charList.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("Characters frequency :: "+charFrequency);
        return charFrequency;
    }


}
