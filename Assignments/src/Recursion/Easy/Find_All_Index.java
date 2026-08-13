package Recursion.Easy;

import java.util.ArrayList;

public class Find_All_Index {

    // Find all the index of target element in the given array.

    static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 4, 5};
//        findAll(arr,4,0);
//        System.out.println(lst);
//        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<Integer> ans = findAll2(arr,4,0,list);
//        System.out.println(list);
        System.out.println(findAll3(arr,4,0));

    }

    // To solve this there 3 ways:

//    1. Creating an ArrayList at global scope
    static ArrayList<Integer> lst = new ArrayList<>();
    static int findAll(int[] arr,int target,int index){
        if(index == arr.length) return -1;
        if(arr[index] == target) lst.add(index);
        return findAll(arr,target,index+1);
    }


//    2. Passing ArrayList in Argument of function

    static ArrayList<Integer> findAll2(int[] arr, int target,int index, ArrayList<Integer> lst){
        if(index == arr.length) return lst;
        if(arr[index] == target) lst.add(index);
        return findAll2(arr,target,index+1,lst);
    }

//    3. Creating ArrayList inside the function
    static ArrayList<Integer> findAll3(int[] arr, int target, int index){
        ArrayList<Integer> ans = new ArrayList<>();
        if(index == arr.length) return lst;
        if(arr[index] == target) ans.add(index);

        ArrayList<Integer> belowCalls = findAll3(arr,target,index+1);
        ans.addAll(belowCalls);
        return ans;

    }
}
