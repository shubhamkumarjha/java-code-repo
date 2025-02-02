import java.util.Arrays;
import java.util.List;

public class JumpPossible {
    public static void main(String[] args) {
        //List<Integer> jumps = Arrays.asList(2, 3, 1, 1, 4);
        List<Integer> jumps = Arrays.asList(3, 2, 1, 0, 4);
        int N = jumps.size();

        // Function call
        if (isPossibleLastIndex(jumps, N))
            System.out.println("True");
        else
            System.out.println("False");
    }

    private static boolean isPossibleLastIndex(List<Integer> jumps, int n) {
        int lastPos = n-1;
        int far = 0;
        for(int i=n-2; i>=0; i--){
            far = jumps.get(i)+i;
            if(far>=lastPos){
                lastPos=i;
            }
        }
        return lastPos==0;
    }

}
