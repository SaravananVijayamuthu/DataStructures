package Companies.Zoho.Strings;

import java.util.Scanner;

/*
ReverseEachWord

Given a String. Reverse each word in it where the words are separated by dots.

Example 1:
Input:
S = "i.like.this.program.very.much"
Output: i.ekil.siht.margorp.yrev.hcum
Explanation: The words "i", "like",
"this", "program", "very", "much"
are all reversed.

Example 2:
Input: 
S = "pqr.mno"
Output: rqp.onm
Explanation: Both "pqr" and "mno" are
reversed.

Expected Time Complexity: O(|S|).
Expected Auxiliary Space: O(|S|).

Constraints:
1<=|S|<=105

 */

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        String arr[] = s.split("\\.");
        for( int i=0; i<arr.length; i++)
        {
            StringBuffer sb = new StringBuffer(arr[i]);
            System.out.print(sb.reverse());
            if(i != arr.length-1)
                System.out.print(".");
        }
        System.out.println();
        sc.close();
    }
}