package Recursion.Easy;

import java.util.Scanner;

public class Sum_Triangle_Array {

//    GFG:
    /*
    Given an array of integers, print a sum triangle from it such that the first level has all array elements. From then, at each level number of elements is one less than the previous level and elements at the level is be the Sum of consecutive two elements in the previous level.
Example :

Input : A = {1, 2, 3, 4, 5}
Output : [48]
         [20, 28]
         [8, 12, 16]
         [3, 5, 7, 9]
         [1, 2, 3, 4, 5]

Explanation :
Here,   [48]
        [20, 28] -->(20 + 28 = 48)
        [8, 12, 16] -->(8 + 12 = 20, 12 + 16 = 28)
        [3, 5, 7, 9] -->(3 + 5 = 8, 5 + 7 = 12, 7 + 9 = 16)
        [1, 2, 3, 4, 5] -->(1 + 2 = 3, 2 + 3 = 5, 3 + 4 = 7, 4 + 5 = 9)
     */
static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter size of array: ");
    int size = in.nextInt();
    System.out.println("Enter element of arrray: ");
    int[] arr = new int[size];
    for (int i = 0; i<size; i++){
        arr[i] = in.nextInt();
    }

}

static public void Sum_arr(int[] arr){
    if(arr.length == 1) return;
    int[] temp = new int[arr.length-1];
    for(int i = 0; i<arr.length-1; i++){
        temp[i] = arr[i] + arr[i+1];
    }
    Sum_arr(arr);
    System.out.println(temp.toString());
}
}
