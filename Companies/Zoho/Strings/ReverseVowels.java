package Companies.Zoho.Strings;

import java.util.Scanner;

/**
ReverseVowels

Given a string consisting of lowercase english alphabets, reverse only the vowels present in it and print the resulting string.

Example 1:
Input:
S = "geeksforgeeks"
Output: geeksforgeeks
Explanation: The vowels are: e, e, o, e, e
Reverse of these is also e, e, o, e, e.

Input: 
Example 2:
S = "practice"
Output: prectica
Explanation: The vowels are a, e
Reverse of these is e, a.

Expected Time Complexity: O(|S|).
Expected Auxiliary Space: O(|S|).

Constraints:
1<=|S|<=105
*/

public class ReverseVowels {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char arr[] = s.toCharArray();
        int j = 0;
        String replace = "";
        for(int i=0; i<arr.length;i++)
        {
            if(arr[i] == 'a' || arr[i] == 'A' || arr[i] == 'e' || arr[i] == 'E' || arr[i] == 'i' || arr[i] == 'I' || arr[i] == 'o' || arr[i] == 'O' || arr[i] == 'u' || arr[i] == 'U')
            {
                j++;
                replace+=arr[i];
            }
        }
        for(int i=0; i<arr.length;i++)
        {
            if(arr[i] == 'a' || arr[i] == 'A' || arr[i] == 'e' || arr[i] == 'E' || arr[i] == 'i' || arr[i] == 'I' || arr[i] == 'o' || arr[i] == 'O' || arr[i] == 'u' || arr[i] == 'U')
            {
                arr[i] = replace.charAt(--j);
            }
        }
        System.out.print(String.valueOf(arr));
    }
}