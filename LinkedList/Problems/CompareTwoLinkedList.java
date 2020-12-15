package LinkedList.Problems;

import java.util.Scanner;

/**
 * CompareTwoLinkedList
 */
public class CompareTwoLinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // push
    public void push(int ndata) {
        Node newdata = new Node(ndata);
        if (head == null) {
            head = new Node(ndata);
            return;
        }
        newdata.next = null;
        Node n = head;
        while (n.next != null) {
            n.next = newdata;
            return;
        }
    }

    // compare
    static boolean compare(Node head1, Node head2) {
        if (head1 != null && head2 != null)
            if (head1.data == head2.data)
                return compare(head1.next, head2.next);
            else
                return false;
        else if (head1 == null && head2 == null)
            return true;
        else
            return false;
    }

    // print
    // public void print() {
    // Node n = head;
    // while(n!=null){
    // System.out.println(n.data+" ");
    // n=n.next;
    // }
    // }
    // main
    public static void main(String[] args) {
        CompareTwoLinkedList CTL = new CompareTwoLinkedList();
        CompareTwoLinkedList CTL1 = new CompareTwoLinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of nodes to be inserted for 1st list -> ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int var = sc.nextInt();
            CTL.push(var);
        }
        System.out.print("Enter the number of nodes to be inserted for 2nd list -> ");
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int var1 = sc.nextInt();
            CTL1.push(var1);
        }
        boolean res = compare(CTL.head, CTL1.head);
        System.out.print("Status -> "+String.valueOf(res ? 1 : 0));
        // CTL.print();
    }
}