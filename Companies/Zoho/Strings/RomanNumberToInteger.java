package Companies.Zoho.Strings;

import java.util.Scanner;

/*
Given a string in roman no format (s)  your task is to convert it to an integer . Various symbols and their values are given below.
I 1
V 5
X 10
L 50
C 100
D 500
M 1000

Example 1:
Input:
s = V
Output: 5

Example 2:
Input:
s = III 
Output: 3

Your Task:
Complete the function romanToDecimal() which takes an string as input parameter and returns the equivalent decimal number. 

Expected Time Complexity: O(|S|), |S| = length of string S.
Expected Auxiliary Space: O(1)

Constraints:
1<=roman no range<=3999
*/

class roman{
    public int value(char r)
    {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }
    public int romanToDecimal(String str) {
        int res = 0;
        for (int i = 0; i < str.length(); i++) 
        {
            int s1 = value(str.charAt(i));
            // System.out.println("---"+s1);
            if (i + 1 < str.length()) 
            {
                int s2 = value(str.charAt(i + 1));
                // System.out.println("***"+s2);
                if (s1 >= s2) 
                {
                    res = res + s1;
                }
                else
                {
                    res = res + s2 - s1;
                    i++;
                }
            }
            else {
                res = res + s1;
            }
        }
        return res;
    }
}
public class RomanNumberToInteger {
    public static void main(String[] args) {
        roman rr = new roman();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(rr.romanToDecimal(str));
    }    
}