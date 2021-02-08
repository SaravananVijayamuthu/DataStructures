import java.util.Scanner;

/**
 * BubbleSort
 * Worst and Average Case Time Complexity: O(n*n)
 * Best Case Time Complexity: O(n)
 */
public class BubbleSort {
    // sorting
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) // no of loops [pass]
        {
            int flag = 0;
            for (int j = 0; j < arr.length - 1 - i; j++) // no of swaps inside each pass
            {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = 1;
                }
            }
            if(flag == 0)
                break;
        }
    }

    // print
    public void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // main
    public static void main(String[] args) {
        BubbleSort bSort = new BubbleSort();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements to be inserted -> ");
        int n = sc.nextInt();
        System.out.print("Enter the elements -> ");
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Original array -> ");
        bSort.print(arr);
        System.out.println();
        System.out.print("Bubble sorted array -> ");
        bSort.sort(arr);
        bSort.print(arr);
    }
}