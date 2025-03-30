package Array;

import java.util.Scanner;

public class MultiArrayLecture2 {

    static void print2Darray(int [][] arr){

        for (int i = 0 ; i < arr.length ; i++){
            for (int j = 0 ; j < arr[i].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    static void reverseArray(int [] arr){
        int n = arr.length;
        int p1 = 0;
        int p2 = n-1;
        int temp;

        while (p1 < p2){
            temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;

            p1++;
            p2--;
        }

    }

    static void transposeOfMatrix(int [][] mat , int r , int c){

        int [][] ans = new int[r][c];

        for (int i = 0  ; i < r ; i++){
            for (int j = 0 ; j < c ; j++){
                ans[i][j] = mat[j][i];
            }
        }

        System.out.println("The transpose of the Mat is : ");
        print2Darray(ans);

    }

    static void transposeOfMatrixInPlace(int [][] mat , int r , int c){

        int temp;

        for (int i = 0 ; i < r ; i++){
            for (int j = i ; j < c ; j++){
                temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

//        System.out.println("Transpose of the matrix is : ");
//        print2Darray(mat);

    }

    static void rotateMatrix(int [][] matrix , int r , int c){
        // This is only for Square Matrix... Rotation on 90 degree

        transposeOfMatrixInPlace(matrix , r , c);

        for (int i = 0 ; i < r ; i++){
            reverseArray(matrix[i]);
        }

        System.out.println("Matrix after Rotation : ");
        print2Darray(matrix);

    }

    static void pascal(int n){

        int [][] pascal = new int[n][];

        for (int i = 0; i < n; i++) {
            pascal[i] = new int[i+1];
            pascal[i][0] = pascal[i][i] = 1;

            for (int j = 1 ; j < i ; j++){
                pascal[i][j] = pascal[i-1][j] + pascal[i-1][j-1];
            }
        }

        print2Darray(pascal);

    }

    static void printSpiral(int [][] mat , int r , int c){

        int firstRow = 0; int lastRow = r-1; int rightCol = c-1; int leftCol = 0;
        int totalElements = 0;

        while (totalElements < r * c){

            for (int j = leftCol ; j <= rightCol && totalElements < r * c ; j++){
                System.out.print(mat[firstRow][j] + " ");
                totalElements++;
            }
            firstRow++;

            for (int i = firstRow ; i <= lastRow && totalElements < r * c ; i++){
                System.out.print(mat[i][rightCol] + " ");
                totalElements++;
            }
            rightCol--;

            for (int j = rightCol ; j >= leftCol && totalElements < r * c ; j--){
                System.out.print(mat[lastRow][j] + " ");
                totalElements++;
            }
            lastRow--;

            for (int i = lastRow; i >= firstRow && totalElements < r * c ; i--) {
                System.out.print(mat[i][leftCol] + " ");
                totalElements++;
            }
            leftCol++;

        }

    }

    static void createSpiralMatrix(int n){

        int [][] ansMatrix = new int[n][n];

        int firstRow = 0;
        int lastRow = n-1;
        int rightCol = n-1;
        int leftCol = 0;

        int totalElement = 1;
        int inputVal = 1;

        while (totalElement <= n*n){

            for (int j = leftCol ; j <= rightCol && totalElement <= n*n ; j++){
                ansMatrix[firstRow][j] = inputVal;
                inputVal++;
                totalElement++;
            }
            firstRow++;

            for (int i = firstRow ; i <= lastRow && totalElement <= n*n ; i++){
                ansMatrix[i][rightCol] = inputVal;
                inputVal++;
                totalElement++;
            }
            rightCol--;

            for (int j = rightCol ; j >= leftCol && totalElement <= n*n ; j--){
                ansMatrix[lastRow][j] = inputVal;
                inputVal++;
                totalElement++;
            }
            lastRow--;

            for (int i = lastRow ; i >= firstRow && totalElement <= n*n ; i--){
                ansMatrix[i][leftCol] = inputVal;
                inputVal++;
                totalElement++;
            }
            leftCol++;
        }


        System.out.println("The final Spiral matrix is : ");
            print2Darray(ansMatrix);
//        printSpiral(ansMatrix , n , n);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter the number of rows of the matrix : ");
//        int r = sc.nextInt();
//
//        System.out.print("Enter the number of columns of the Matrix : ");
//        int c = sc.nextInt();
//
//        int [][] mat = new int[r][c];
//
//        System.out.println("Enter the values of the matrix : ");
//
//        for (int i = 0 ; i < r ; i++){
//            for (int j = 0 ; j < c ; j++){
//                mat[i][j] = sc.nextInt();
//            }
//        }

//        transposeOfMatrixInPlace(mat , r , c);

//            rotateMatrix(mat , r , c);

//        pascal(5);
//        printSpiral(mat , r , c);

        createSpiralMatrix(3);

    }
}
