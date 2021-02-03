package DataStructure.SinglyLinkedList;

import java.util.Scanner;

public class NthnodeLinkedList {
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

    // push
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

    // nth node
    public int Nth(int ind) {
        Node temp = head;
        int count = 0;
        while(temp!=null)
        {
            if(count == ind)
                return temp.data;
            count++;
            temp=temp.next;
        }
        assert (false);
        return 0;
    }

    // print
    public void print() {
        Node n = head;
        while(n!=null)
        {
            System.out.println(n.data+" ");
            n=n.next;
        }
    }

    // main
    public static void main(String[] args) {
        NthnodeLinkedList n = new NthnodeLinkedList();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0;i<num;i++)
        {
            int var = sc.nextInt();
            n.push(var);
        }
        n.print();
        int node = sc.nextInt();
        System.out.println("Element --> "+n.Nth(node));
    }
}
