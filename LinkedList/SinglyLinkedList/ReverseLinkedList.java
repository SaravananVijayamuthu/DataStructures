package LinkedList.SinglyLinkedList;

import java.util.Scanner;

public class ReverseLinkedList {
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
        if(head==null)
        {
            head = new Node(ndata);
            return;
        }
        newdata.next=null;
        Node n = head;
        while(n.next!=null)
        {
            n=n.next;
        }
        n.next = newdata;
        return;
    }

    //reverse --> get pre n next node
    public Node reverse(Node node) {
        Node pre = null, next = null;
        Node temp = node;
        while(temp!=null)
        {
            next = temp.next;
            temp.next = pre;
            pre = temp;
            temp = next;
        }
        node = pre;
        return node;
    }

    //print
    void print(Node node) {
        while(node!=null)
        {
            System.out.println(node.data+" ");
            node = node.next;
        }
    }
    
    //main
    public static void main(String[] args) {
        ReverseLinkedList r = new ReverseLinkedList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<n;i++)
        {
            r.push(i);
        }
        r.print(head);
        head = r.reverse(head);
        System.out.println("reversed as follows --> ");
        r.print(head);
    }
}