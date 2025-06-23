package Recursion;

public class problemSolving2 {

    static int sumOfDigits(int n){
        if (n >= 0 && n <=9) return n;

        return (n % 10) + sumOfDigits(n/10);
    }

    static int countDigits(int n){
        if (n >= 0 && n <= 9) return 1;
        return 1 + countDigits(n/10);
    }

    static long pow(long p , long q){
        if (q == 0) return 1;
        return p * pow(p , q-1);
    }

    static int pow2(int p , int q){
        if (q == 0) return 1;

        if (q%2 == 0){
            int smallProblem = pow2(p , q/2);
            return smallProblem * smallProblem;
        }

        int smallProblem = pow2(p , q/2);
        return p * smallProblem * smallProblem;
    }
    public static void main(String[] args) {
//        System.out.println(1/10);
//        System.out.println(sumOfDigits(240));
//        System.out.println(countDigits(240));
//        System.out.println(pow(10 , 10));
        System.out.println(pow2(2,3));

    }
}
