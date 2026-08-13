package Day9_BitWise_Math;

public class BitWise_Basic {

    /*
    AND:
        If we AND a number with 1 it always give the a.
        means: a & 1 = a
        ex: 0 & 1 = 0
        1 & 1 = 1
     */

    /*
    XOR:
        If we XOR a number with 1 then the last digit from right side will complement.
        means: 1001 ^ 1 = 1000
        1000 ^ 1 = 1001

        If we XOR a number with itself it will become zero.
        means = a ^ a = 0
        example: 2 ^ 2 = 0
        10
      ^ 10
        00

     */

    /*
    Left Shift:
        It shift all the bits toward the left side.
        It mainly used for double the number.
        example: 5 << 1 = 10
        5 in binary = 1 0 1
        shifting :  1 0 1 0 ==> 10
        means: a << b = a * 2 power of b -> [a x 2^b]

     */
    /*
    Right Shift:
        It shift all the bits toward the right side
        It mainly used for half the number.
        example: 10 >> 1 = 5
        10 in binary = 1 0 1 0
        shifting:        1 0 1 ==> 5  (here the right most bit is ignored)
        example: 7 >> 1 = 3
        7 in binary = 1 1 1
        shifting:       1 1 ==> 3
        means: a >> b = a / 2 power of b -> [b / 2^b]

     */


//    Use Case of BitWise Operator
    /*
        1. Finding the number is even or odd ?
            Logic: Every calculation in computer done in binary, and except the rightmost bit of the binary number all other bit are multipled by 2 (power of 2).
            Hence, a number is odd or even is only depend on the rightmost bit of the number is it 0 means number is even and if it is 1 then number is odd.

            example: odd-> 1  3    5    7    9      11
            binary ->      1  11  101  111  1001   1011

           even -> 2    4     6    8      10
           binary-> 10  100  110  1000   1010

           Notice, something for odd every rightmost bit is 1
           and for even it is 0.

           Now, the question is how to find the rightmost bit.
           for this we know AND a number with 1 give the same number.
           So, 5 & 1 = 1 because 5 in binary is 101.
           1 0 1
         & 0 0 1
           0 0 1  -> 1 hence number is odd

           if 4 & 1 = 0 because 4 in binary is 100
           1 0 0
         & 0 0 1
           0 0 0  -> 0 hence number is even.
     */
//     Code:
    static  public void even_odd(int n){
        if((n & 1) == 0) System.out.println("Even");
        else System.out.println("Odd");
    }


    /*
    2. Finding Non-duplicate number.
    Question: There is an array where all number are appear 2 times except one number. so we have to find that number.

    Logic: We know the XOR property that say if a number is XOR by itself then it will become 0. And XOR a number with 0 give the same number.

    So, if we travel each number and opearte XOR on each at last we get only a single number which is not appear twice.

    example: arr = [2,3,4,1,2,1,3,6,4]
    It does not depend on the order of number but it is only applicable if only exactly one number is appear 1 times.
    If there are more than 1 number appear exactly 1 times then it will not applicable.

     */

//    Code:
    public static int single(int[] arr){
        int ans = 0;  // ans = 0 because 0 ^ n = n
        for(int n : arr){
            ans ^= n;
        }
        return ans;
    }

    /*
    3. Finding the ith bit of the number.

    Question: You have a number and a postion and you have to tell at that position their is 0 or 1 in it's binary form.

    Logic 1: This is most basic logic you can think travel to the positon in binary form of number and then check the bit.
    But, we have to use a loop to travel the position and take O(length of bit) at worst time case.


    But we can improve this:
    Logic: We know that AND (&) with 1 returns the value of the Least Significant Bit (LSB) because:
       we first right shift (>>) the number by (i - 1) positions. This moves the i-th bit to the LSB (rightmost position).

    Once the required bit reaches the LSB, we perform AND with 1 to extract its value.
    In binary form we count from the right side.
    Example

Suppose:

num = 10110110
Find the 5th bit (counting from the right).

Step 1: Right shift by (5 - 1) = 4 positions
10110110 >> 4  --> 00001011

Now, the original 5th bit is at the LSB.
Step 2: AND with 1

 00001011
&00000001
----------
 00000001

Result = 1, so the 5th bit is set.
     */

    public int ithBit(int num, int pos){
        return (num >> (pos-1)) & 1;
    }


    /*
    4. Every number is appearing 3 times & one number is appearing only 1 times. then find that number.

    Logic: If every number appears 3 times, then for every bit position (0 to 31):

    Count how many numbers have that bit set.
    Since all repeated numbers appear 3 times, their contribution to the count will be a multiple of 3.
    The remaining bits belong to the unique number.

    Example
nums = [2, 2, 3, 2]

Binary:

2 = 0010
2 = 0010
3 = 0011
2 = 0010
Count bits
Bit Position   Count of 1s  Count % 3	 Answer Bit
0	                1	       1	        1
1	                4	       1	        1
2	                0	       0	        0
3	                0	       0	        0

Answer:

0011 = 3
     */

    public int singleNumber(int[] nums) {
        int ans = 0;

        // Check each bit position
        for (int i = 0; i < 32; i++) {
            int count = 0;

            // Count set bits at ith position
            for (int num : nums) {
                if (((num >> i) & 1) == 1) {
                    count++;
                }
            }

            // If count is not divisible by 3,
            // then the unique number has this bit set.
            if (count % 3 != 0) {
                ans |= (1 << i);
            }
        }

        return ans;
    }

    /*
    5. If every number in an array appear k times and only 1 number appear once.

    Logic: Suppose:

Every number appears k times.
One number appears once.

Then the algorithm becomes:

For each bit position (0 to 31):
Count how many numbers have that bit set.
Compute count % k.
If the remainder is 1, set that bit in the answer.
     */

    public int singleNumber(int[] nums, int k) {
        int ans = 0;

        for (int i = 0; i < 32; i++) {
            int count = 0;

            for (int num : nums) {
                if (((num >> i) & 1) == 1) {
                    count++;
                }
            }

            if (count % k != 0) {
                ans |= (1 << i);
            }
        }

        return ans;
    }

    /*
    6. It can Also work similar for:
    If the unique number appears m times instead of once, then:

    Every other number appears k times.
    One number appears m times.

    You need to check:  count % k == m
    instead of:   count % k != 0

    For example:
Others appear 5 times.
Unique appears 2 times.

Then:
if (count % 5 == 2) {
    ans |= (1 << i);
}
     */

    /*
    7. Find no. of digits in base b.
    formula : No. of digits in base b of number n = (int) (log n / log b) + 1
     */
    public int NoOfDigits(int n , int b){
        return (int) (Math.log(n)/Math.log(b)) +1 ;
    }

















    static void main(String[] args) {
        System.out.println(5 & (1 << 2));
    }
}
