package Array;

import java.util.ArrayList;

public class ArrayListLecture {
    public static void main(String[] args) {

//        Integer i = Integer.valueOf(5);
        ArrayList<Integer> l1 = new ArrayList<>();

        // Add Elements...

        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);

        // Get element at Index...

//        l1.get(1);

        // Print Using Loop...

//        for (int i = 0 ; i < l1.size() ; i++){
//            System.out.print(l1.get(i) + " ");
//        }
//        System.out.println();


        // Print Directly...

        System.out.println(l1);

        // Adding element at some Index...

        l1.add(1 , 100);
//        System.out.println(l1);

        // Modify element at some Index...

        l1.set(1 , 200);
//        System.out.println(l1);

        // Removing element at some Index...
        l1.remove(1);
//        System.out.println(l1);


        // Removing an element...

        l1.remove(Integer.valueOf(7)); // Return Boolean , If value Exist and Removed The return True If The element not Exist then it returns False
//        System.out.println(l1);

        // Checking if Element Exist...

        System.out.println(l1.contains(Integer.valueOf(5)));;


    }
}
