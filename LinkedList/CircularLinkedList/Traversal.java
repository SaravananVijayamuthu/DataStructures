package LinkedList.CircularLinkedList;

import java.util.Scanner;

/**
 * Traversal
 */
public class Traversal {
    Node head;
    static class Node{
        int data;
        Node next;
    };

    //push
    public void push(int data) {
        Node ptr1 = new Node();     //creating a new node
        Node temp = head;       //making temp as head_ref i.e., (null) @start
        ptr1.data = data;           //assigning data to new node from parameter 
        ptr1.next = head;       
        if(head!=null)      //if part works if it's not null
        {
            while(temp.next!=head)      //traversing
                temp = temp.next;
            temp.next = ptr1;       //connecting d last node i.e., temp.next to ptr1 first node since circular
        }
        else        //else part works only if head is null or no node present
            ptr1.next = ptr1;  //connecting d same node since circular
        head = ptr1;
        return;
    }

    //print
    public void print() {
        Node n = head;
        if(head!=null)
        {
            do
            {
                System.out.println(n.data+" ");
                n=n.next;
            }
            while(n!=head);
        }
    }

    //main
    public static void main(String[] args) {
        Traversal T = new Traversal();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<n;i++)
        {
            T.push(i);
        }
        // T.push(11);
        T.print();
    }
}