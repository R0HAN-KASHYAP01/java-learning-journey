package Arrays.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class Spiral_Matrix_II {

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of matrix: ");
        int n = input.nextInt();
        int[][] result = generateMatrix(n);
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(result[i]));
        }
    }
    static public int[][] generateMatrix(int n) {
        int top = 0, bottom = n-1;
        int left = 0, right = n-1;
        int[][] mat = new int[n][n];
        int k = 1;

        while(top <= bottom && left <= right){
            for(int i = left; i<=right;i++ ){
                mat[top][i] = k;
                k++;
            }
            top++;
            for(int i = top; i<=bottom; i++){
                mat[i][right] = k;
                k++;
            }
            right--;
            if(top<=bottom){
                for(int i = right; i>= left; i--){
                    mat[bottom][i] = k;
                    k++;
                }
                bottom--;
            }
            if(left<= right){
                for(int i= bottom; i>= top; i--){
                    mat[i][left] =k;
                    k++;
                }
                left++;
            }
        }
        return mat;
    }
}
