package LinkedList.SinglyLinkedList;

import java.util.Scanner;

/**
 * Insertion
 */
public class Insertion {
    // Basic Structure of Node
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    // Push at beginning
    public void front(int ndata) {
        Node newdata = new Node(ndata);
        newdata.next = head;
        head = newdata;
    }

    // Push at middle get two data previous node too
    public void middle(Node predata, int ndata) {
        if(predata==null)
        {
            System.out.print("OOPS!!");
        }
        Node newdata = new Node(ndata);
        newdata.next = predata.next;
        predata.next = newdata;
    }

    // Push at end 
    public void end(int ndata) {
        Node newdata = new Node(ndata);
        if(head==null)
        {
            head = new Node(ndata);
            return;
        }
        newdata.next = null;
        Node n = head;
        while(n.next!=null)
        {
            n=n.next;
        }
        n.next = newdata;
        return;
    }

    // Print values
    public void print() {
        Node n = head;
        while(n!=null)
        {
            System.out.println(n.data+" ");
            n = n.next;
        }
    }

    // Main
    public static void main(String[] args) {
        Insertion I = new Insertion();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<n;i++)
        {
            I.end(i);
        }
        I.print();
    }
}