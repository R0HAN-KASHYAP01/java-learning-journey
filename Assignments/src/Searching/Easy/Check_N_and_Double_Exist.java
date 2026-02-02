package Searching.Easy;

import java.util.Scanner;

public class Check_N_and_Double_Exist {
//    LeetCode: 1346. Check If N and Its Double Exist

    /*
    Given an array arr of integers, check if there exist two indices i and j such that :

        i != j
        0 <= i, j < arr.length
        arr[i] == 2 * arr[j]


        Example 1:

        Input: arr = [10,2,5,3]
        Output: true
        Explanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]
        Example 2:

        Input: arr = [3,1,7,11]
        Output: false
        Explanation: There is no i and j that satisfy the conditions.


        Constraints:

        2 <= arr.length <= 500
        -103 <= arr[i] <= 103
     */
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = input.nextInt();
        System.out.println("Enter the elements in the array: ");
        int[] arr = new int[size];
        for (int i = 0; i<size; i++){
            arr[i] = input.nextInt();
        }
        System.out.println(checkIfExist(arr));
    }
    static public boolean checkIfExist(int[] arr) {
        int i =0;
        int j  = 1;
        int size = arr.length;
        while(i < size){
            if(j <size){
                if(arr[j] * 2 == arr[i] && i != j){
                    return true;
                }
                j++;
            }
            else{
                i++;
                j = 0;
            }
        }
        return false;
    }
}
