package Arrays.Easy;

import java.util.Scanner;

public class Maximum_Population_year {
//    LeetCode : 1854. Maximum Population Year

 /*
 You are given a 2D integer array logs where each logs[i] = [birthi, deathi] indicates the birth and death years of the ith person.

The population of some year x is the number of people alive during that year. The ith person is counted in year x's population if x is in the inclusive range [birthi, deathi - 1]. Note that the person is not counted in the year that they die.

Return the earliest year with the maximum population.


Example 1:
Input: logs = [[1993,1999],[2000,2010]]
Output: 1993
Explanation: The maximum population is 1, and 1993 is the earliest year with this population.

Example 2:
Input: logs = [[1950,1961],[1960,1971],[1970,1981]]
Output: 1960
Explanation:
The maximum population is 2, and it had happened in years 1960 and 1970.
The earlier year between them is 1960.


Constraints:
1 <= logs.length <= 100
1950 <= birthi < deathi <= 2050

  */
 static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     System.out.println("Enter the size of array: ");
     int size = in.nextInt();
     int[][] logs = new int[size][2];
     for(int i = 0; i<size; i++){
         System.out.println("Enter the birth year: ");
         logs[i][0] = in.nextInt();
         System.out.println("Enter the death year: ");
         logs[i][1] = in.nextInt();
     }
     System.out.println("Year with Maximum Population is: "+ maximumPopulation(logs));
 }
    static public int maximumPopulation(int[][] logs) {
        int[] diff = new int[101];
        for(int[] log : logs){
            diff[log[0] - 1950]++;
            diff[log[1] - 1950]--;
        }
        int maxPop = 0;
        int currPop = 0;
        int result = 1950;

        for(int i = 0; i<101;i++){
            currPop += diff[i];
            if(currPop > maxPop){
                maxPop = currPop;
                result = 1950 + i;
            }
        }
        return result;
    }
}

/*
Logic :
 we have a array with birth and death year : [[1950,1961],[1960,1971],[1970,1981]]
 So according to the question:
 people in year are:
 1950 -> 1
 1951 -> 1
 till 1959 we have only 1 person
 at 1960, Population is 2
 but 1961 is a death year so population become 1 again
 and this cycle continue.

 Constrains : starting year or smallest year is 1950
 and the last year is 2050
 This is the range of 100 years

 so we can use the frequency table to solve this.
 let, every  birth year assign to +1
 and death year assign to -1

 Now, in frequency table we assign the value by current_year - 1950 to start with 0 to 100
 for this [[1950,1961],[1960,1971],[1970,1981]]
 frequency table is :
 index : 0        10     11       20        21           31    (other  index are assign to 0)
 value : +1       +1     -1       +1        -1           -1

 now make 3 variables :
 current_population = 0
 max_population = 0
 result = 1950 (since 1950 is smallest year )

 now run a loop for frequency table
 for each index calculate current_Population , current_population += freqency table[i]
 then check if current_population > max_population
 if yes, update max_population and result to 1950 + i [1950 + i because to get the correct year]

 At end we get the smallest year with maximum population.

 */
