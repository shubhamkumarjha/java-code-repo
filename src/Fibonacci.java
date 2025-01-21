public class Fibonacci {
    public static void main(String[] args) {
        int n= 9;
        printFibonnaci(n);
        long result = findFibonnaci(n);
        System.out.println("Fibaonacci of "+n+" is :: "+result);
    }

    private static void printFibonnaci(int n) {
        if(n<1)
            System.out.println("Invalid number");
        int n1 = 0;
        int n2 = 1;
        System.out.println("Started Fibonacci series...");
        System.out.print(n1+" ");
        if(n==1)
            return;
        System.out.print(n2+" ");
        int n3=0;
        for(int i=2; i<n; i++){
            n3=n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
        }
        System.out.println("Fibonacci series completed");
    }

    private static long findFibonnaci(int n) {
        if(n==0 || n==1 ) return 1;
        long result=1;
        for(int i = 2; i<=n; i++){
            result+=i;
        }
        return result;
    }
}
