package Array;

import java.util.Scanner;

public class ArraySingleDimension {


    // HELPER METHODS
    static void printArray(int [] arr){
        int n = arr.length;

        for (int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void reversePartialArray(int [] arr , int p1 , int p2){

        while(p1 < p2){
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;
            p2--;
        }

    }

    static void swapElementsOfArray(int p1 , int p2 , int [] arr){
        int temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;
    }

    // FUNCTIONAL METHODS

    static void findLargestNumberInArray(int [] arr){
        int n = arr.length;
        int ans = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > ans) ans = num;
        }
        System.out.println(ans);
    }

    static void findSecondLargestNumberOfTheArray(int [] arr){
        int n = arr.length;
        int ans = Integer.MIN_VALUE;
        int index = 0;

        for (int i = 0 ; i < n ; i++){
            if (arr[i] > ans){
                ans = arr[i];
                index = i;
            }
        }

        arr[index] = 0;

        findLargestNumberInArray(arr);

    }

    static int findRepeatedNumber(int [] arr){
        int n = arr.length;

        for (int i = 0 ; i < n ; i++){
            for (int j = i+1 ; j < n ; j++){
                if (arr[i] == arr[j]) return arr[j];
            }
        }
        return -1;
    }

    static void reverseArray(int [] arr){
        int n = arr.length;
        int p1 = 0;
        int p2 = n-1;

        while(p1 < p2){
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;
            p2--;
        }

//        System.out.print("The revershed array is : ");
//        printArray(arr);

    }

    static int twoSumProblem(int [] arr , int target){
        int n = arr.length;
        int numberOfPairs = 0;

        for (int i = 0 ; i < n ; i++){
            for (int j = i+1 ; j < n ; j++){
                if (arr[i] + arr[j] == target){
                    numberOfPairs++;
                }
            }
        }
        return numberOfPairs;
    }

    static void rotateArrayKTimes(int [] arr , int k){
        int n = arr.length;
        k = k % n ;
        int [] ansArray = new int[n];
        int index = 0;

        for (int i = n-k ; i < n ; i++){
            ansArray[index++] = arr[i];
        }

        for (int i = 0 ; i < n-k ; i++){
            ansArray[index++] = arr[i];
        }

        System.out.print("Rotated Array : ");
        printArray(ansArray);

    }

    static void rotateArrayKTimes2(int [] arr , int k){
        int n = arr.length;
        k = k % n;

        reversePartialArray(arr , 0 , n-k-1);
        reversePartialArray(arr , n-k , n-1);
        reverseArray(arr);

        System.out.print("The rotated array is : ");
        printArray(arr);

    }

    static void frequencyArray(int [] arr , int target){
        int n = arr.length;
        int [] freq = new int[1005];

        for (int i = 0 ; i < n ; i++){
            freq[arr[i]] += 1;
        }

        System.out.println("The frequency of " + target + " is " + freq[target]);

    }

    static void sortZeroAndOne(int [] arr){
        int n = arr.length;
        int count = 0;

        for (int i = 0 ; i < n ; i++){
            if (arr[i] == 0) count++;
        }

        for (int i = 0 ; i < n ; i++){
            if (count > 0){
                arr[i] = 0;
                count--;
            } else {
                arr[i] = 1;
            }
        }

        printArray(arr);

    }

    static void sortZeroAndOne2(int [] arr){
        int n = arr.length;
        int p1 = 0;
        int p2 = n-1;

        while (p1 < p2){
            if (arr[p1] == 1 && arr[p2] == 0) swapElementsOfArray(p1 , p2 , arr);
            p1++;
            p2--;

            if (arr[p1] == 0){
                p1++;
            }

            if (arr[p2] == 1){
                p2--;
            }
        }

        printArray(arr);

    }

    static void sortOddAndEvenNumbers(int [] arr){
        int n = arr.length;
        int p1 = 0;
        int p2 = n-1;

        while (p1 < p2){

            if (arr[p1] % 2 == 0 && arr[p2] % 2 != 0) {
                swapElementsOfArray(p1 , p2 , arr);
                p1++;
                p2--;
            }

            if (arr[p1] % 2 != 0) p1++;
            if (arr[p2] % 2 == 0) p2--;

        }
        System.out.print("The Sorted Array is : ");
        printArray(arr);

    }

    static int[] prefixSum(int [] arr){
        int n = arr.length;

        for (int i = 1 ; i < n ; i++){
            arr[i] += arr[i-1];
        }

        return arr;

    }

    static int sumOfElementsOfArray(int [] arr , int startingIndex , int lastIndex){
        int [] prefixArray = prefixSum(arr);

        return prefixArray[lastIndex] - prefixArray[startingIndex-1];

    }

    // SPLIT THE ARRAY IN TWO EQUALS PART SUCH THAT THE SUM OF ELEMENTS OF BOTH THE ARRAYS ARE EQUALS
    static boolean splitArray(int [] arr){
        int n = arr.length;
        int [] prefix = prefixSum(arr);

        for (int i = 0 ; i < n ; i++){
            if (prefix[i] == sumOfElementsOfArray(arr , i+1 , n-1)) return true;
        }
        return false;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Length of the array : ");
        int n = sc.nextInt();
        int [] array = new int[n];

        System.out.print("Enter the values of the Array : ");
        for (int i = 0 ; i < n ; i++){
            array[i] = sc.nextInt();
        }

//        System.out.print("The largest value of the array is : ");
//        findLargestNumberInArray(array);

//        System.out.print("The second largest value of the array is : ");
//        findSecondLargestNumberOfTheArray(array);

//        System.out.print("The repeated number in the array is : ");
//        System.out.println(findRepeatedNumber(array));;

//        reverseArray(array);

//        System.out.println("Number of pairs are : " + twoSumProblem(array , 6));

//        rotateArrayKTimes2(array , 4);

//        System.out.print("Enter the number of queries : ");
//        int queries = sc.nextInt();
//
//        while (queries > 0){
//            System.out.print("Enter the number you wants to count : ");
//            int target = sc.nextInt();
//            frequencyArray(array , target);
//            queries--;
//        }

//        sortZeroAndOne2(array);
//        sortOddAndEvenNumbers(array);

//      prefixSum(array);

//        System.out.println("Sum of the Elements are : " + sumOfElementsOfArray(array , 3 , 5));

        System.out.println(splitArray(array));

    }
}
