package Sorting.Easy;

import java.util.Scanner;

public class Average_Salary_Excluding_MIn_MAx {
//    LeetCode: 1491. Average Salary Excluding the Minimum and Maximum Salary
    /*
    You are given an array of unique integers salary where salary[i] is the salary of the ith employee.

Return the average salary of employees excluding the minimum and maximum salary. Answers within 10-5 of the actual answer will be accepted.



Example 1:
Input: salary = [4000,3000,1000,2000]
Output: 2500.00000
Explanation: Minimum salary and maximum salary are 1000 and 4000 respectively.
Average salary excluding minimum and maximum salary is (2000+3000) / 2 = 2500

Example 2:
Input: salary = [1000,2000,3000]
Output: 2000.00000
Explanation: Minimum salary and maximum salary are 1000 and 3000 respectively.
Average salary excluding minimum and maximum salary is (2000) / 1 = 2000


Constraints:
3 <= salary.length <= 100
1000 <= salary[i] <= 106
All the integers of salary are unique.
     */

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = input.nextInt();
        int[] num = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i<n; i++){
            num[i] = input.nextInt();
        }
        System.out.println(average(num));
    }
    static public double average(int[] salary) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int size = salary.length;
        double sum = 0;
        for(int n: salary){
            if(n > max){
                max = n;
            }
            if(n < min){
                min = n;
            }
            sum += n;
        }
        sum = sum - min-max;
        return sum/(size-2);

    }
}
