import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class LongestSubstring {
    public static void main(String[] args) {
        Integer x = lengthOfLongestSubstring("abrakadabrak");
        System.out.println("Character Length :: "+x);
        String result = longestSubstring("abrakadabrak");
        System.out.println("Result :: "+result+" length :: "+result.length());
    }

    private static String longestSubstring(String str) {
        List<Character> charList = Arrays.stream(str.split("")).map(a -> a.charAt(0)).toList();
        System.out.println("Character List :: "+charList);
        String result = "";
        for(int i=0; i<charList.size()-1; i++){
            HashSet<Character> set = new HashSet<Character>();
            StringBuilder stringBuilder = new StringBuilder();
            for(int j=i; j<charList.size(); j++){
                if(set.add(charList.get(j)))
                    stringBuilder.append(charList.get(j));
                else
                    break;
            }
            if(result.length()<stringBuilder.length())
                result=stringBuilder.toString();
        }
        return result;
    }

    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, maxLength = 0;
        for (int right = 0; right < s.length(); right++) {
            if (map.containsKey(s.charAt(right))) {
                left = Math.max(map.get(s.charAt(right)) + 1, left);
            }
            map.put(s.charAt(right), right);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
