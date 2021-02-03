package DataStructure.CircularLinkedList;

import java.util.Scanner;

/**
 * SplitIntoTwoHalves
 */
public class SplitIntoTwoHalves {

    static Node head, head1, head2;  
    static class Node {
        int data;
        Node next ;
    };

    //push
    public void push(int data) {
        Node ptr1 = new Node();
        Node temp = head;
        ptr1.data = data;
        ptr1.next = head;
        if(head!=null)
        {
            while(temp.next!=head)
                temp = temp.next;
            temp.next = ptr1;

        }
        else
            ptr1.next = ptr1;
        head = ptr1;
        return;
    }

    //mid
    public void mid() {
        Node st = head;
        Node nd = head;
        if(head==null)
            return;
        while(nd.next!=head && nd.next.next!=head)
        {
            nd = nd.next.next;
            st = st.next;
        }
        //even 
        if(nd.next.next==head)
            nd = nd.next;
        //1st half
        head1 = head;
        if(head.next!=head)
            head2 = st.next;
        nd.next = st.next;
        st.next = head;
    }

    //print
    public void print(Node n) {
        Node temp = n;
        if(n!=null)
            do
            {
                System.out.println(temp.data+" ");
                temp = temp.next;
            }
            while(temp!=n);
    }

    //main
    public static void main(String[] args) {
        SplitIntoTwoHalves S = new SplitIntoTwoHalves();
        Scanner sc = new Scanner(System.in);
        try{
            int n = sc.nextInt();
            for(int i=0;i<n;i++)
            {
                S.push(i);
            }
            System.out.println("original -> ");
            S.print(head);
            S.mid();
            System.out.println("1st half -> ");
            S.print(head2);
            System.out.println("2nd half ->");
            S.print(head1);
        }
        finally{
            sc.close();
        }        
    }
}