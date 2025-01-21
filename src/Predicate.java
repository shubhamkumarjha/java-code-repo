public class Predicate {
    public static void main(String[] args) {
        Integer num = 4;

        boolean flag = checkEvenNumber(num);
        System.out.println("Number :: "+num+" is  even :: "+flag);
    }

    private static boolean checkEvenNumber(Integer number) {
        java.util.function.Predicate<Integer> isEven = n-> n%2==0;
        return isEven.test(number);
    }
}
