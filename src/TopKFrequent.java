import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TopKFrequent {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,2,3,3,3);
        Long K = 2L;
        List<Long> result = topKFrequent(nums,K);
        System.out.println("Top "+K+" (K) elements are :: "+result);

        int[] numsArray = new int[]{1,2,2,3,3,3};
        int k = 2;
        int[] resultArray = topKFrequents(numsArray,k);
        System.out.println("Top "+k+" (k) elements are :: "+resultArray);
    }

    private static List<Long> topKFrequent(List<Integer> nums, Long k) {
        Map<Integer, Long> groupMap = nums.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return groupMap.values().stream().filter(aLong -> aLong >= k).toList();
    }

    public static int[] topKFrequents(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<Integer, Integer>();
        List<Integer>[] freq = new List[nums.length+1];

        for(int i=0; i<freq.length; i++){
            freq[i] = new ArrayList<Integer>();
        }

        for(int num : nums){
            count.put(num, count.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer, Integer> entry : count.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] result = new int[k];
        int j =0;
        for(int i=freq.length-1; i>0 && j<k; i--){
            for(int n : freq[i]){
                result[j++]=n;
                if(j==k){
                    return result;
                }
            }
        }
        return result;
    }
}
