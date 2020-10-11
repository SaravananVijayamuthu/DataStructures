package LinkedList.SinglyLinkedList;

import java.util.HashSet;
import java.util.Scanner;

public class DetectLoopLinkedList {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    //push
    public void push(int ndata) {
        Node newdata = new Node(ndata);
        if(head == null)
        {
            head = new Node(ndata);
            return;
        }
        newdata.next = null;
        Node n = head;
        while(n.next!=null)
        {
            n = n.next;
        }
        n.next = newdata;
        return;
    }

    //detect thru HashSet
    static boolean detect(Node h) {
        HashSet<Node> d = new HashSet<Node>();
        while(h!=null)
        {
            if(d.contains(h))
                return true;
            d.add(h);
            h=h.next;
        }
        return false;
    }

    //print
    public void print() {
        Node n = head;
        while(n!=null)
        {
            System.out.println(n.data+" ");
            n=n.next;
        }
    }

    //main
    public static void main(String[] args) {
        DetectLoopLinkedList de = new DetectLoopLinkedList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<n;i++)
        {
            de.push(i);
        }
        de.print();
        
        de.head.next.next.next.next = de.head; 
        if (detect(head)) 
            System.out.println("Loop found"); 
        else
            System.out.println("No Loop"); 
    } 
}
