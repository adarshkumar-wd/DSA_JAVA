package Recursion;

public class GreaterNumberInArr {

    public static int GreaterNumberInArray(int [] arr , int idx){
        if (idx == arr.length) return 0;

        int ans = GreaterNumberInArray(arr , idx+1);

        if (ans > arr[idx]) return ans;
        return arr[idx];
    }
    public static void main(String[] args) {

        int [] arr = {151 , 2 , 34 , 4 , 100} ;
        System.out.println(GreaterNumberInArray(arr , 0));;
    }
}
