package Recursion;

public class GCD {

//    GCD(x ,y) = GCD(y , x%y)  :- EUCLID'S ALGORITHM

    public static int GCD(int x , int y){

        if (y == 0) return x;

        return GCD(y , x%y);
    }
    public static void main(String[] args) {

        System.out.println(GCD(15 , 12));

    }
}
