package Recursion;

public class PrintArray {

    static  void printArr(int [] arr , int idx){
        int n = arr.length;
        if (idx == n) return;

        System.out.println(arr[idx]);
        printArr(arr , ++idx);
    }
    public static void main(String[] args) {
        int [] arr = {1 , 2 , 3 , 4 , 5};
        printArr(arr , 0);
    }
}
