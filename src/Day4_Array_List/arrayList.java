package Day4_Array_List;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//      Initilized the ArrayList
        ArrayList<Integer> list = new ArrayList<>(5);

//        Adding data in ArrayList
        list.add(634);
        list.add(134);
        list.add(324);
        list.add(3423);
        list.add(343);

//      Checking element is present in the ArrayList or not
        System.out.println(list.contains(3434343));

//      Update or change any value on the specific index
        list.set(0,99);
        System.out.println(list);

//        Taking element by input
        for (int i = 0; i<5; i++){
            list.add(input.nextInt());
        }

//        Printing the elements of the ArrayList by Indexing
        for (int i = 0; i< 5; i++){
            System.out.print(list.get(i));

        }

//         Printing the element of the ArrayList without indexing
        System.out.println(list);


    }
}
