import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeDecode {
    public static void main(String[] args) {
        //Input: ["neet","code","love","you"]
        List<String> input = Arrays.asList("we","say",":","yes","!@#$%^&*()");
        String encoded = encode(input);
        System.out.println("Encoded String :: "+encoded);
        List<String> decoded = decode(encoded);
        System.out.println("Decoded String :: "+decoded);
        //Output:["neet","code","love","you"]
    }

    public static String encode(List<String> strs) {
        StringBuilder result = new StringBuilder();
        for(String s : strs){
            result.append(s.length()).append("#").append(s);
        }
        return result.toString();
    }

    public static List<String> decode(String str) {
        int i = 0;
        List<String> result = new ArrayList<>();
        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int size = Integer.parseInt(str.substring(i,j++));
            //System.out.println("Index :: "+i+" size :: "+size+" Substring :: "+str.substring(j, j+size));
            result.add(str.substring(j, j+size));
            i = j+size;
        }
        return result;
    }
}
