import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IPAddress {

    public static void main(String[] args) {
        List<String> ip_addresses =Arrays.asList("123.211.102.13", "271.142.67.142", "225.217.132.58");
        getRegions(ip_addresses);
    }
    public static List<Integer> getRegions(List<String> ip_addresses) {
        List<Integer> regions = new ArrayList<>();
        System.out.println("ip_addresses :: "+ip_addresses);
        // Write your code here
        for(String ip_address : ip_addresses){
            System.out.println("ip_address :: "+ip_address);
            String[] octet = ip_address.split("\\.");
            System.out.println("Octets :: "+octet[1]);
            System.out.println("Octets :: "+octet[2]);
            System.out.println("Octets :: "+octet[3]);
            if (checkValidOctets(octet)){

                if(checkValidOctet(octet[0],0,127)){
                    regions.add(1);
                    continue;
                } else if(checkValidOctet(octet[0],128,191)){
                    regions.add(2);
                    continue;
                } else if(checkValidOctet(octet[0],192,223)){
                    regions.add(3);
                    continue;
                } else if(checkValidOctet(octet[0],224,239)){
                    regions.add(4);
                    continue;
                } else if(checkValidOctet(octet[0],240,255)){
                    regions.add(5);
                    continue;
                }
            }else{
                regions.add(-1);
            }
        }
        return regions;

    }

    //import java.io.*;
    //import java.math.*;
    //import java.security.*;
    //import java.text.*;
    //import java.util.*;
    //import java.util.concurrent.*;
    //import java.util.function.*;
    //import java.util.regex.*;
    //import java.util.stream.*;
    //import static java.util.stream.Collectors.joining;
    //import static java.util.stream.Collectors.toList;
    //
    //
    //class Result {
    //
    //    /*
    //     * Complete the 'getMinTime' function below.
    //     *
    //     * The function is expected to return an INTEGER.
    //     * The function accepts following parameters:
    //     *  1. INTEGER_ARRAY task_memory
    //     *  2. INTEGER_ARRAY task_type
    //     *  3. INTEGER max_memory
    //     */
    //
    //    public static int getMinTime(List<Integer> task_memory, List<Integer> task_type, int max_memory) {
    //    // Write your code here
    //        HashMap<Integer, String> taskDetails = new HashMap<>();
    //        for(int i=0; i<task_memory.size(); i++){
    //            taskDetails.put(task_type, task_memory);
    //        }
    //

    private static boolean checkValidOctets(String[] octet) {
        if(checkValidOctet(octet[0],0,255) &&
                checkValidOctet(octet[1],0,255) &&
                checkValidOctet(octet[2],0,255) &&
                checkValidOctet(octet[3],0,255)){
            return true;
        }
        return false;
    }

    private static boolean checkValidOctet(String octet, Integer start, Integer end) {
        Integer octetnum =Integer.parseInt(octet);
        if(octetnum>=start && octetnum<=end){
            return true;
        }
        return false;
    }
}
