package Recursion;

import java.util.Scanner;

public class ProblemSolving1 {
    //  5! = 5 * 4 * 3 * 2 * 1
    //     = n * (n-1) * (n-2)....* 1
    static int factorial(int n){
        if (n == 0){
            return 1;
        }
        return n * factorial(n-1);

    }

    static int fibonacci(int n){
        if (n == 0 || n == 1) return n;

        return fibonacci(n-1) + fibonacci(n-2);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

//        System.out.println(factorial(0));
        System.out.println(fibonacci(n));
    }
}
