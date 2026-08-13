package Recursion.Easy;

public class Find_Index {

//    For a given array and target. find out the index of given array if not present return -1;

    static void main(String[] args) {
        int[] arr = {1,2,3,34,23,0,87,1,4};
        System.out.println(findIndex(arr,3,0));

    }

    static int findIndex(int[] arr, int target, int index){
        if(index == arr.length) return -1;
        if(arr[index] == target) return index;
        return findIndex(arr,target,index+1);
    }
}
