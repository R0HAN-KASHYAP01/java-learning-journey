package Day4_Array_List;

import java.util.ArrayList;
import java.util.Scanner;

public class Mulit_ArrayList {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        Initilized a MultiDimension ArrayList

        ArrayList<ArrayList<Integer>> List = new ArrayList<>();
        for (int i = 0; i< 3; i++){
            List.add(new ArrayList<>());
        }

//        Taking input
        for (int i = 0; i<3; i++){
            for (int j = 0; j<3; j++){
                List.get(i).add(input.nextInt());
            }
        }

//        Printing
        System.out.println(List);

    }
}
