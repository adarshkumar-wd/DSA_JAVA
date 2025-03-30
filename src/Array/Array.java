package Array;

import java.util.Scanner;

public class Array {

    static void print2Darray(int [][] arr , int r , int c){

        for (int i = 0 ; i < r ; i++){
            for (int j = 0 ; j < c ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    static void AdditionOfMatrices(int[][]arr1 , int r1 , int c1 , int[][]arr2 , int r2 , int c2){

        int [][] ans = new int[r1][c1];

        for (int i = 0 ; i < r1 ; i++){
            for (int j = 0 ; j < c1 ; j++){
                ans[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.out.println("The sum of the Matrices are : ");
        print2Darray(ans , r1 , c1);
    }

    static void multiplyMatrices(int [][] arr1 , int r1 , int c1 , int [][] arr2 , int r2 , int c2){

        if (c1 != r2){
            System.out.println("Please provide the valid Dimensions ");
            return;
        }

        int [][] mul = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0 ; j < c2 ; j++){
                for (int k = 0 ; k < c1 ; k++){
                    mul[i][j] += arr1[i][k] + arr2[k][j];
                }
            }
        }

        System.out.println("Multiplication of two matrices are : ");
        print2Darray(mul , r1 , c2);

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows of first matrix : ");
        int r1 = sc.nextInt();

        System.out.print("Enter the number of columns of the first Matrix : ");
        int c1 = sc.nextInt();

        int [][] arr1 = new int[r1][c1];

        System.out.print("Enter the number of rows of second matrix : ");
        int r2 = sc.nextInt();

        System.out.print("Enter the number of columns of the Second Matrix : ");
        int c2 = sc.nextInt();

        int [][] arr2 = new int[r2][c2];

        System.out.println("Enter the values of the first array : ");

        for (int i = 0 ; i < r1 ; i++){
            for (int j = 0 ; j < c1 ; j++){
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the values of the second array : ");

        for (int i = 0 ; i < r2 ; i++){
            for (int j = 0 ; j < c2 ; j++){
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Values of the first Matrix are :");
        print2Darray(arr1 , r1 , c1);

        System.out.println("Values of the second Matrix are :");
        print2Darray(arr2 , r2 , c2);

//        AdditionOfMatrices(arr1 , r1 , c1 , arr1 , r2 , c2);

        multiplyMatrices(arr1 , r1 , c1 , arr2 , r2 , c2);

    }
}
