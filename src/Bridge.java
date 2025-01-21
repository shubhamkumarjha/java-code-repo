import java.util.*;

public class Bridge {
    public static void main(String[] args) {
        //5 people crossing bridge using different timezone
        List<Integer> time = Arrays.asList(15,8,14,18,6);

        Integer result = getMinimumTime(time);
        System.out.println("Minimun time required :: "+result);
    }

    private static Integer getMinimumTime(List<Integer> time) {
        time.sort(Comparator.reverseOrder());
        int n = time.size();
        int torchBearer = time.get(n-1);
        Integer result=0;
        for(int i = 0; i<n-2;i++){
            result = result+time.get(i)+torchBearer;
        }
        result+=time.get(n-2);
        return result;
    }
}
