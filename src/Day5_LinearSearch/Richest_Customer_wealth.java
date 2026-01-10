package Day5_LinearSearch;

public class Richest_Customer_wealth {
    static void main(String[] args) {
    int[][] accounts = {
            {1,5},
            {7,3},
            {3,5}
    };

    int ans = MaximumWealth(accounts);
        System.out.println(ans);


    }

    static int MaximumWealth(int[][] arr){
        int max = 0;
        if (arr.length < 0){
            return 0;
        }
        for (int i = 0; i< arr.length; i++){
            int sum = 0;
            for(int ele : arr[i]){
                sum += ele;
            }
            if(sum > max){
                max = sum;
            }

        }
        return max;
    }
}
