import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveAdjDuplicates {
    public static void main(String[] args) {
        String input = "Baangalorree";
        String result = removeAdjDuplicates(input);
        System.out.println("After filtering duplicates :: "+result);
    }

    private static String removeAdjDuplicates(String input) {
        StringBuilder result = new StringBuilder();
        for(int i=0; i<input.length()-1; i++){
            if(input.charAt(i)==input.charAt(i+1)){
                i++;
            }
            result.append(input.charAt(i));
        }
        return result.toString();
    }

}
