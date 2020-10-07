package LinkedList.SinglyLinkedList;
import java.util.Scanner;

public class LengthOfLinkedList {
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

    // push data
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
            n = n.next;
        }
        n.next = newdata;
        return;
    }

    // length
    public int length() {
        Node temp = head;
        int count = 0;
        while(temp!=null)
        {
            count++;
            temp = temp.next;
        }
        return count;
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
        LengthOfLinkedList len = new LengthOfLinkedList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<n;i++)
        {
            len.push(i);
        }
        len.print();
        System.out.println("Length --> "+len.length());
    }
}
