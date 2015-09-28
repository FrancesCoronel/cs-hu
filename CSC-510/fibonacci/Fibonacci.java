/**
 * Fibonacci Sequence
 * FVCproductions
 * 09.08.2015
 */

public class Fibonacci {
    public static long fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        else return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        int N = 50; // terribly expensive but does work eventually!
        for (int i = 0; i <= N; i++) {
            System.out.println(fib(i));
        }
    }
}