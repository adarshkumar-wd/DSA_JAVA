package Recursion;

import java.util.Scanner;

public class RecursionIntroduction {

    static void printIncreasing(int n){
        // 1 to n
        if (n == 1){
            System.out.print(n + " ");
            return;
        }
        printIncreasing(n-1);
        System.out.print(n + " ");

    }

    static void printDecreasing(int n){
        if (n == 1){
            System.out.print(n + " ");
            return;
        }

        System.out.print(n + " ");
        printDecreasing(n-1);


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int n = sc.nextInt();
        printIncreasing(n);
        System.out.println();
        printDecreasing(n);

    }
}
