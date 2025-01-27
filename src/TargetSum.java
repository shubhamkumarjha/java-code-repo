import java.util.Arrays;

public class TargetSum {
    public static void main(String[] args) {
        int[] arr = { 0, -1, 2, -3, 1 };
        int target = -2;


        if (twoSum(arr, target))
            System.out.println("true");
        else
            System.out.println("false");

        //Optimized solution
        if (twoSumOptimized(arr, target))
            System.out.println("Optimized true");
        else
            System.out.println("Optimized false");
    }

    private static boolean twoSumOptimized(int[] arr, int target) {
        Arrays.sort(arr);
        for(int i=0; i<arr.length-1; i++){
            int complement = target-arr[i];
            if(binarySearch(arr,i+1,arr.length,complement))
                return true;
        }
        return false;
    }

    private static boolean binarySearch(int[] arr, int left, int right, int complement) {
        while(!(left<=right)){
            int mid=left+right/2;
            if(complement==arr[mid]){
                return true;
            } else if (complement<arr[mid]) {
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return false;
    }

    private static boolean twoSum(int[] arr, int target) {
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==target) {
                    System.out.println("First :: "+arr[i]+" second number :: "+arr[j]);
                    return true;
                }
            }
        }
        return false;
    }
}
