package Companies.Zoho.Strings;

import java.util.Scanner;

/**
 * ReverseVowels
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