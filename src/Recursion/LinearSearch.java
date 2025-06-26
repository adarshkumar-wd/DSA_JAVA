package Recursion;

import java.util.ArrayList;

public class LinearSearch {

    public static boolean searchElem(int [] arr , int target , int idx){

        if (idx == arr.length) return false;

        boolean recAns = searchElem(arr , target , idx+1);

        if (arr[idx] == target) return true;
        return recAns;
    }

    public static void findIndexes(int [] arr , int target , int idx){

        if (idx >= arr.length) return;

        if (arr[idx] == target) System.out.print(idx + " ");
        findIndexes(arr , target , idx+1);

    }

    public static ArrayList<Integer> findIndices(int [] arr , int target , int idx){

        if (idx >= arr.length) return new ArrayList<Integer>();

        ArrayList<Integer> ans = new ArrayList<>();

        if (arr[idx] == target) ans.add(idx);

        ArrayList<Integer> smallAns = findIndices(arr , target , idx+1);

        ans.addAll(smallAns);
        return ans;

    }
    public static void main(String[] args) {

        int [] arr = { 2 , 10 , 16 , 2 , 2};

//        System.out.println(searchElem(arr , 5  , 0));

//        findIndexes(arr , 2 , 0);

        System.out.println(findIndices(arr , 2 , 0));

    }
}
