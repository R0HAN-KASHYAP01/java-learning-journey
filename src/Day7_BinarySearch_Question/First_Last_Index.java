package Day7_BinarySearch_Question;

import java.util.Arrays;
import java.util.Scanner;

public class First_Last_Index {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i<size; i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the target element: ");
        int target = input.nextInt();
        int[] ans = firstLastIndex(arr,target);
        System.out.println("Start ans Last index is:");
        System.out.println(Arrays.toString(ans));

    }
    static int[] firstLastIndex(int[] arr, int target){
        int[] ans = {-1,-1};
        ans[0] = searchIndex(arr,target,true);
        ans[1] = searchIndex(arr,target,false);
        return ans;
    }
    static  int searchIndex(int[] arr, int target, boolean FindStart){
        int index = -1;
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target< arr[mid]){
                end = mid -1;
            }
            else if(target > arr[mid]){
                start = mid +1;
            }
            else{
                index = mid;
                if (FindStart){
                    end = mid -1;
                }
                else{
                    start = mid +1;
                }
            }
        }
        return index;
    }
}
