import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Nth value !!");

        int N=scanner.nextInt();

        int fib=fibonacciNumber(N);
        System.out.println(fib);

    }

    private static int fibonacciNumber(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibonacciNumber(n-1)+fibonacciNumber(n-2);
    }
}