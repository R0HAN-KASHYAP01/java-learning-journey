package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Flipping_Image {
//    Leet Code: 832. Flipping an Image

    /*
    Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.

To flip an image horizontally means that each row of the image is reversed.

For example, flipping [1,1,0] horizontally results in [0,1,1].
To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

For example, inverting [0,1,1] results in [1,0,0].


Example 1:

Input: image = [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
     */

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the row of 2D array: ");
        int row = input.nextInt();
        System.out.println("Enter the column of 2D array: ");
        int column = input.nextInt();

        int[][] nums = new int[row][column];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i< row; i++){
            for (int j = 0; j < column; j++) {

                nums[i][j] = input.nextInt();
            }
        }
        int[][] ans = flipAndInvertImage(nums);
        for (int i = 0; i < ans.length; i++){
            System.out.println(Arrays.toString(ans[i]));
        }
    }

    static public int[][] flipAndInvertImage(int[][] image) {
        int row = image.length;
        int column = image[0].length;
        for(int i = 0; i < row; i++){
            int x = column-1;
            for(int j = 0; j<=x; j++,x--){
                int temp = 1 - image[i][j];
                image[i][j] = 1 - image[i][x];
                image[i][x] = temp;
            }
        }
        return image;
    }
}
