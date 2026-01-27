import java.util.Arrays;
import java.util.Scanner;

public class Missing_Number {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = input.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] arr = new int[size];
        for (int i =0; i<size; i++){
            arr[i] = input.nextInt();
        }

        int ans = MissingNumber(arr);
        System.out.println("Array after sorting: ");
        System.out.println(ans);
    }
    static int MissingNumber(int[] arr){

    }
}
