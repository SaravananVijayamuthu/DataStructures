package Companies.Zoho.Strings;

import java.util.Scanner;

/**
 * PalindromeString
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