package LinkedList.Problems;

import java.util.Scanner;

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

    /*get nthLastNode -> here two pointers make one pointer to reach end count will also incre. 
    At the time of end another pointer will be in nth position */
    public void getLastN(int Key) {
        Node fst = head;
        Node snd = head;
        int count = 0;
        while (fst != null) {
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
        int n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            Kth.push(i);
        }
        Kth.print();
        System.out.print("Enter Key -> ");
        int Key = sc.nextInt();
        Kth.getLastN(Key);
    }
}
