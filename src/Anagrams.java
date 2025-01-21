import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Anagrams {

    public static void main(String[] args) {
        String[] words = {"listen", "silent", "enlist", "google", "goo"};
        String[] queries = {"inlets", "google", "goo", "abc"};

        List<Integer> result = findAnagrams(words, queries);

        // Output the results for each query
        System.out.println(result); // Output should be [3, 1, 1, 0]
    }

    private static List<Integer> findAnagrams(String[] words, String[] queries) {
        String query = null;
        String word = null;

        List<Integer> result = new ArrayList<>();
        for(int i = 0; i<queries.length;i++){
            query= queries[i];
            int anagrams=0;
            for(int j=0; j<words.length;j++){
                word = words[j];
                if(word.length()==query.length()){

                    word = getSortedString(word);
                    query = getSortedString(query);
                    if(word.equals(query)){
                        System.out.println("Matching word :: "+word+" query :: "+query);
                        anagrams++;
                    }
                }
            }
            result.add(anagrams);
        }
        return result;
    }

    private static String getSortedString(String word) {
        Optional<String> str = Arrays.stream(word.split("")).map(x -> x.charAt(0)).sorted().map(Object::toString).reduce((a, b) -> a + b);
        return str.get();
    }
}
