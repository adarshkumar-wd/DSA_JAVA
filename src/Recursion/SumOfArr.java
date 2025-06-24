package Recursion;

public class SumOfArr {
    public static int sumOfEleOfArr(int [] arr , int idx){

        if (idx == arr.length-1) return arr[idx];

        return sumOfEleOfArr(arr , idx+1) + arr[idx];

    }
    public static void main(String[] args) {

        int [] arr = {6 , 2 , 3 , 4 , 10};
        System.out.println(sumOfEleOfArr(arr , 0));
    }
}
