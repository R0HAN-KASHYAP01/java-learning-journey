package Strings.Easy;

import java.util.Scanner;

public class Defanging_IP_Address {
//    LeetCode: 1108. Defanging an IP Address

    /*
    Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".



Example 1:
Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"

Example 2:
Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"


Constraints:
The given address is a valid IPv4 address.
     */

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = input.nextLine();
        System.out.println(defangIPaddr(str));
    }
    static public String defangIPaddr(String address) {
        String result = address.replace(".", "[.]");
        return result;
    }
}
