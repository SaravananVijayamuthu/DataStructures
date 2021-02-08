package DataStructure.Problems;

import java.util.Scanner;

public class PrintReverse {
    static Node head;

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
            n = n.next;
        }
        n.next = newdata;
        return;
    }

    // reverse
    public void reverse(Node head) {
        if (head == null)
            return;
        reverse(head.next);
        System.out.println(head.data + " ");
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
        PrintReverse PR = new PrintReverse();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int var = sc.nextInt();
            PR.push(var);
        }
        System.out.println("Reversed Linked List");
        PR.reverse(head);
    }
}
