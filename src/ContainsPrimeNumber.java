import java.util.Arrays;
import java.util.List;

public class ContainsPrimeNumber {

    public static void main(String[] args) {
        ContainsPrimeNumber primeNumber = new ContainsPrimeNumber();
        List<Integer> list = Arrays.asList(4, 6, 8, 10, 11, 12, 13, 14, 15);
        primeNumber.prime(list);
        primeNumber.prime1(list);
    }

    private void prime1(List<Integer> list) {
        List<Integer> primeList = list.stream().filter(this::primeNumber1).toList();
        System.out.println("Prime numbers are :: "+primeList);
    }

    private void prime(List<Integer> list) {
        boolean containsPrimeNumStream = list.stream().anyMatch(this::primeNumber1);
        System.out.println(containsPrimeNumStream);
    }

    private boolean primeNumber1(Integer number) {
        if(number<2){
            return false;
        }
        for (int i=2;i<=Math.sqrt(number); i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }

    //Checks whether input given is prime number or not
    private boolean primeNumber(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}