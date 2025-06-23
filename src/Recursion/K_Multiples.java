package Recursion;


// Prints K Multiples of n
// EX - num : 3 , k : 5
// SOLUTION - 6 , 9 , 12 , 15 , 18
public class K_Multiples {

    public static void K_Multiples(int num, int k){
        if (k == 1) {
            System.out.println(num);
            return;
        }

        K_Multiples(num , k-1);
        System.out.println(num * k);

    }
    public static void main(String[] args) {

//        System.out.println(K_Multiples(3 , 2));
        K_Multiples(3 , 5);  // 3 , 6 , 9 , 12 , 15

    }
}
