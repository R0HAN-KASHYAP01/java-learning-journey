package Strings.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Count_Items_Matching_Rule {
//    LeetCode: 1773. Count Items Matching a Rule

    /*
    You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.

The ith item is said to match the rule if one of the following is true:

ruleKey == "type" and ruleValue == typei.
ruleKey == "color" and ruleValue == colori.
ruleKey == "name" and ruleValue == namei.
Return the number of items that match the given rule.



Example 1:
Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
Output: 1
Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].

Example 2:
Input: items = [["phone","blue","pixel"],["computer","silver","phone"],["phone","gold","iphone"]], ruleKey = "type", ruleValue = "phone"
Output: 2
Explanation: There are only two items matching the given rule, which are ["phone","blue","pixel"] and ["phone","gold","iphone"]. Note that the item ["computer","silver","phone"] does not match.


Constraints:
1 <= items.length <= 104
1 <= typei.length, colori.length, namei.length, ruleValue.length <= 10
ruleKey is equal to either "type", "color", or "name".
All strings consist only of lowercase letters.
     */

    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of List: ");
        int size = in.nextInt();
        List<List<String>> items = new ArrayList<>();
            System.out.println("Enter items: ");
        for(int i = 0; i<size; i++){
            String type = in.nextLine();
            String color = in.nextLine();
            String name = in.nextLine();
            items.add(Arrays.asList(type,color,name));
        }
        System.out.println("Enter the ruleKey: ");
        String rk = in.nextLine();
        System.out.println("Enter the ruleValue: ");
        String rv = in.nextLine();
        System.out.println("Matched: "+ countMatches(items,rk,rv));
    }
    static public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ind = 0;

        if(ruleKey.equals("color")) ind = 1;
        else if(ruleKey.equals("name")) ind = 2;

        int count = 0;

        for(List<String> item : items) {
            if(item.get(ind).equals(ruleValue)) {
                count++;
            }
        }

        return count;
    }
}
