package Array;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListQuestions {

    static void reverse(ArrayList<Integer> l1){
        int p1 = 0 ; int p2 = l1.size()-1;

        while (p1 < p2) {
            Integer temp = Integer.valueOf(l1.get(p1));
            l1.set(p1 , l1.get(p2));
            l1.set(p2 , temp);
            p1++;
            p2--;
        }
    }
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(12);
        list.add(24);
        list.add(34);
        list.add(4);
        list.add(53);
        list.add(26);
        list.add(14);
        list.add(64);

        System.out.println("Original List : " + list);
//        reverse(list);
        Collections.reverse(list);
        System.out.println("Reversed List : " + list);
        Collections.sort(list);
        System.out.println("Ascending  order : " + list);
        Collections.sort(list , Collections.reverseOrder());
        System.out.println("Ascending  order : " + list);


        ArrayList<String> str = new ArrayList<>();

        str.add("Welcome");
        str.add("To");
        str.add("Physics");
        str.add("Wallah");

        System.out.println("Before Sorting : " + str);
        Collections.sort(str);
        System.out.println("After Sorting : " + str);

    }
}
