package Recursion;

public class AlternateSum {

    public static int AlternateSum(int num){

        // Find the sum of series : 1 - 2 + 3 - 4 + 5 - .... + ... n

        if (num <= 0) return 0;

        if (num % 2 == 0){
            return AlternateSum(num-1) - num;
        } else {
            return AlternateSum(num-1) + num;
        }

    }
    public static void main(String[] args) {
        System.out.println(AlternateSum(10));
    }
}
