// How do you find the middle element of a singly linked list in one pass?
package DataStructure.Problems;

import java.util.Scanner;

public class MiddleElementOfLinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // push data
    public void push(int ndata) {
        Node newdata = new Node(ndata);
        if (head == null) {
            head = new Node(ndata);
            return;
        }
        newdata.next = null;
        Node n = head;
        while (n.next != null) {
            n = n.next;
        }
        n.next = newdata;
        return;
    }

    // mid -> here we are using two pointers
    public void mid() {
        Node st = head;
        Node nd = head;
        if (head == null) {
            System.out.print("No LinkedList");
        }
        while (nd != null && nd.next != null) {
            nd = nd.next.next;
            st = st.next;
        }
        System.out.println("The mid ele is -> " + st.data);
    }

    // print
    public void print() {
        Node n = head;
        while (n != null) {
            System.out.println(n.data + " ");
            n = n.next;
        }
    }

    // main
    public static void main(String[] args) {
        MiddleElementOfLinkedList mid = new MiddleElementOfLinkedList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            mid.push(i);
        }
        mid.print();
        mid.mid();
    }
}
