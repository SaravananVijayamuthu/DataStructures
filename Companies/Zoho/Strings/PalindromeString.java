package Companies.Zoho.Strings;

import java.util.Scanner;

/**
PalindromeString

Given a string S, check if it is palindrome or not.

Example 1:
Input: S = "abba"
Output: 1
Explanation: S is a palindrome

Example 2:
Input: S = "abc" 
Output: 0
Explanation: S is not a palindrome

Expected Time Complexity: O(Length of S) 
Expected Auxiliary Space: O(1) 

Constraints:
1 <= Length of S <= 105 
 */

public class PalindromeString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        if(sb.toString().equals(s))
        {
            System.out.print("True"); 
        }else
        {
            System.out.print("False");
        }
        sc.close();
    }
}