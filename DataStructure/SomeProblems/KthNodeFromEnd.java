package DataStructure.Problems;

import java.util.Scanner;

/**
 * KthNodeFromEnd
 */
public class KthNodeFromEnd {
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

    // get nth node
    public void getLastNode(int Key) {
        Node fst = head;
        Node snd = head;
        int count = 0;
        while (fst.next != null) {
            fst = fst.next;
            count++;
            if (count > Key) {
                snd = snd.next;
            }
        }
        System.out.println("Data -> " + snd.data + " ");
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
        KthNodeFromEnd Kth = new KthNodeFromEnd();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i < num; i++) {
            Kth.push(i);
        }
        Kth.print();
        System.out.print("Enter the Key ->");
        int Key = sc.nextInt();
        Kth.getLastNode(Key);
    }
}
