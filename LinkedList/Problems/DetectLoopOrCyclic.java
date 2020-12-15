package LinkedList.Problems;

import java.util.Scanner;

public class DetectLoopOrCyclic {
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

    // Detect loop -> here two point checking whether each meets
    public boolean isCyclic() {
        Node fst = head;
        Node snd = head;
        while (fst != null && fst.next != null) {
            fst = fst.next.next;
            snd = snd.next;
            if (fst == snd) {
                return true;
            }
        }
        return false;
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
        DetectLoopOrCyclic Loc = new DetectLoopOrCyclic();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            Loc.push(i);
        }
        Loc.print();
        // Test line for making it in loop
        Loc.head.next.next.next.next = Loc.head;
        if (Loc.isCyclic()) {
            System.out.println("--> List is Cyclic");
        } else {
            System.out.println("--> List is not Cyclic");
        }
    }
}
