package LinkedList.SinglyLinkedList;
import java.util.Scanner;

/**
 * Deletion
 */
public class Deletion {
    // Basic structure
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

    // delete with key
    public void delK(int key) {
        Node temp = head;
        Node pre = null;
        while(temp!=null && temp.data==key)
        {
            head = temp.next;
            return;
        }
        while(temp!=null && temp.data!=key)
        {
            pre = temp;
            temp = temp.next;
        }
        pre.next = temp.next;
    }

    // delete with position
    public void delP(int pos) {
        Node temp = head;
        if(head==null)
        {
            return;
        }
        if(pos==0)
        {
            head = temp.next;
            return;
        }
        for(int i=0;i<pos-1;i++)
        {
            temp = temp.next;
        }
        if(temp==null && temp.next==null)
        {
            return;
        }
        Node next = temp.next.next;
        temp.next=next;
    }

    // Print 
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
        Deletion D = new Deletion();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<n;i++)
        {
            D.push(i);
        }
        // D.delK(3);
        D.delP(1);
        D.print();
    } 
}