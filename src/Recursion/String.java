package Recursion;
public class String {

    public static java.lang.String removeChar(java.lang.String str , java.lang.String target ,  int idx){
        if (str.length() == idx) return "";

        java.lang.String sAns = removeChar(str ,target , idx + 1);

        java.lang.String currentStr = java.lang.String.valueOf(str.charAt(idx));

        if (currentStr.equals(target)) return sAns;
        return str.charAt(idx) + sAns;


    }

    public static void main(String[] args) {
        System.out.println(removeChar("adarsh" , "a" , 0));


    }

}
