package Searching.Easy;

public class Fair_Candy_Swap {
    static void main(String[] args) {
        int[] alice = {35,17,4,24,10};
        int[] bob = {63,21};
        fairCandySwap(alice,bob);
    }
    static public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int alice = 0;
        int bob = 0;
        int al = aliceSizes.length;
        int bl = bobSizes.length;
        int[] ans = new int[2];
        for(int num : aliceSizes){
            alice += num;
        }
        for(int num : bobSizes){
            bob += num;
        }
        int total = alice + bob;
        int compare = total/2;
        int i = 0;
        int j = 0;
        while(i <aliceSizes.length){
            int aliceCandy = alice- aliceSizes[i] + bobSizes[j];
            if(aliceCandy == compare){
                ans[0] = aliceSizes[i];
                break;
            }
            else if(aliceCandy > compare){
                i++;
            }
            else{
                j++;
            }
        }
        i = 0;
        j = 0;
        while(i <bobSizes.length){
            int bobCandy = bob- bobSizes[i] + aliceSizes[j];
            if(bobCandy == compare){
                ans[1] = bobSizes[i];
                break;
            }
            else if(bobCandy > compare){
                i++;
            }
            else{
                j++;
            }
        }
        return ans;

    }
}
