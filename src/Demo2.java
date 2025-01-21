import java.util.Arrays;
import java.util.List;

public class Demo2 {

    public static void main(String[] args) {
        //Identify prime numbers from list

        //get primenumbers
        List<Integer> numbers = Arrays.asList(4,5,2,3,7,6);
        List<Integer> result = getPrimeNumber(numbers);
        System.out.println("Prime Numbers :: "+result);
    }

    static List<Integer> getPrimeNumber(List<Integer> numbers){
        return numbers.stream().filter(x->isPrime(x)).toList();
    }

    static boolean isPrime(Integer num){
        if(num<=1){
            return false;
        }else {
            for (int i=2; i<=Math.sqrt(num); i++){
                if(num%i==0)
                    return false;
            }
        }
        return true;
    }
}
