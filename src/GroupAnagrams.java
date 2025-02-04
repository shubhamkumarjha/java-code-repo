import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] stringArrays = {"act","pots","tops","cat","stop","hat"};
        List<List<String>> result = groupAnagrams(stringArrays);
        System.out.println("Grouped Anangrams :: "+result);
    }

    private static List<List<String>> groupAnagrams(String[] stringArrays) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String element : stringArrays) {
            String sortedString = Arrays.stream(element.split("")).sorted().collect(Collectors.joining());
            map.putIfAbsent(sortedString, new ArrayList<String>());

            map.get(sortedString).add(element);
        }
        return map.values().stream().toList();
    }

}
