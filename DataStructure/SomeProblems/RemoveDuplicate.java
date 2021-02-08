package DataStructure.Problems;

import java.util.Scanner;

public class RemoveDuplicate {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Remove Duplicate create a ref node and compare this node with other nodes
    public void Remove() {
        Node curr = head;
        while (curr != null) {
            Node temp = curr;
            while (temp != null && temp.data == curr.data) {
                temp = temp.next;
            }
            curr.next = temp;
            curr = curr.next;
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
        RemoveDuplicate RD = new RemoveDuplicate();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of nodes to be inserted -> ");
        int n = sc.nextInt();
        RD.push(8);
        for (int i = 0; i < n; i++) {
            int var = sc.nextInt();
            RD.push(var);
        }
        System.out.println("Nodes with duplicate elements");
        RD.print();
        RD.Remove();
        System.out.println("Duplicated elements Removed");
        RD.print();
    }
}
