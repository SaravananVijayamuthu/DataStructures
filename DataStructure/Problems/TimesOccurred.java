package DataStructure.Problems;

import java.util.Scanner;

/**
 * TimesOccurred 18EUCS100
 */
public class TimesOccurred {

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

    // TimesOccurred
    public int occurs(int key) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            if (temp.data == key) {
                count++;
            }
            temp = temp.next;
        }
        return count;
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
        Scanner sc = new Scanner(System.in);
        TimesOccurred to = new TimesOccurred();
        System.out.println("Enter number of nodes to be formed: ");
        int n = sc.nextInt();
        System.out.println("Enter data to be inserted: ");
        for (int i = 0; i < n; i++) {
            int var = sc.nextInt();
            to.push(var);
        }
        System.out.println("Formed Linked List: ");
        to.print();
        System.out.print("Enter number to be searched: ");
        int key = sc.nextInt();
        System.out.println("Times Occurred " + key + " --> " + to.occurs(key));
        sc.close();
    }
}