import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class CharFrequency {
    public static void main(String args[])
    {
        String str = "geeksforgeeks";
        char c = 'e';
        CompletableFuture<Long> result = new CompletableFuture<>();
        result = checkFrequency(str,c);
        result = checkFrequency1(str,c);

        System.out.println("Charcter :: "+c+" occurs :: "+result);
        Long res=count(str, c);
        System.out.println("Charcter :: "+c+" occurs :: "+res);
    }

    private static CompletableFuture<Long> checkFrequency1(String str, char c) {
        return CompletableFuture.completedFuture(Arrays.stream(str.split("")).map(x->x.charAt(0)).filter(x->x==c).count());
    }

    private static CompletableFuture<Long> checkFrequency(String str, char c) {
        return CompletableFuture.completedFuture(Arrays.stream(str.split("")).map(s -> s.charAt(0)).filter(s -> s == c).count());
    }

    private static Long count(String str, char c) {
        return str.chars().filter(s->s==c).count();
    }
}
