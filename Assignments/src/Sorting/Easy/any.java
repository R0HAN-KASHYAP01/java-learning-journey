package Sorting.Easy;

public class any {
    static void main(String[] args) {
        int[] n = {7,1,5,3,6,4};
        System.out.println(maxProfit(n));
    }
    static public int maxProfit(int[] prices) {
        int min_index = 0;
        for(int i = 1; i<prices.length;i++){
            if(prices[i] < prices[min_index]){
                min_index = i;
            }
        }
        int max = 0;
        for(int i = min_index; i<prices.length;i++){
            if(prices[i] > max){
                max = prices[i];
            }
        }
        return max - prices[min_index];
    }
}
