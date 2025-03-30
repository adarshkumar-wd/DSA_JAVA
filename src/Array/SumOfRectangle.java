package Array;

import java.util.Scanner;

public class SumOfRectangle {

    static void createPrifixSumArray(int [] arr){
        int n = arr.length;
        for (int i = 1 ; i < n ; i++){
            arr[i] += arr[i-1];
        }
    }

    static void sumUsingBruitApproch(int [][] matrix , int r1 , int c1 , int r2 , int c2){
        int sum = 0;

        for (int i = r1 ; i <= c2 ; i++){
            for (int j = c1 ; j <= r2 ; j++){
                sum += matrix[i][j];
            }
        }
        System.out.println(sum);
    }

    static void sumUsingBetterApproch(int [][] matrix , int r1 , int c1 , int r2 , int c2){
        int sum = 0;

        for (int i = 0 ; i < matrix.length ; i++){
            createPrifixSumArray(matrix[i]);
        }

        for (int i = r1 ; i <= r2 ; i++){
            if (r1 >= 1){
                sum += matrix[i][c2] - matrix[i][c1-1];
            } else {
                sum += matrix[i][c2];
            }
        }

        System.out.println(sum);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows of the matrix : ");
        int r = sc.nextInt();

        System.out.print("Enter the number of columns of the Matrix : ");
        int c = sc.nextInt();

        int [][] mat = new int[r][c];

        System.out.println("Enter the values of the matrix : ");

        for (int i = 0 ; i < r ; i++){
            for (int j = 0 ; j < c ; j++){
                mat[i][j] = sc.nextInt();
            }
        }

//        sumUsingBruitApproch(mat , 1 , 1 , 3 , 4);

        sumUsingBetterApproch(mat , 1 , 1 , 2 , 2);

    }
}
