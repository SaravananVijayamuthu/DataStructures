package LinkedList.Problems;

import java.util.Scanner;

/**
 * MoveLastElement
 */
public class MoveLastElement {

    Node head;
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    //push
    public void push(int ndata) {
        Node newdata = new Node(ndata);
        if(head == null) {
            head = new Node(ndata);
            return;
        }
        newdata.next = null;
        Node n = head;
        while(n.next != null)
        {
            n = n.next;
        }
        n.next = newdata;
        return;
    }
    //Move
    public void move() {
        Node secLast = null;
        Node last = head;
        if(head == null)
        {
            return;
        }
        while(last.next != null)
        {
            secLast = last;
            last = last.next;
        }
        secLast.next = null;
        last.next = head;
        head = last;
    }
    //print
    public void print()
    {
        Node n = head;
        while(n !=null)
        {
            System.out.println(n.data + " ");
            n=n.next;
        }
    }
    //main
    public static void main(String[] args) {
        MoveLastElement ml = new MoveLastElement();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes -> ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++)
        {
            System.out.print("Enter data for node "+ i + " -> ");
            int var = sc.nextInt();
            ml.push(var);
        }
        System.out.println("List formed");
        ml.print();
        System.out.println("Last node moved");
        ml.move();
        ml.print();        
    }
}