package LinkedList.SinglyLinkedList;

import java.util.Scanner;

public class SearchLinkedList {
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

    //push
    public void push(int ndata) {
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

    // search
    public boolean search(int key) {
        Node temp = head;
        while(temp!=null)
        {
            if(temp.data==key)
                return true;
                temp = temp.next;
        }
        return false;
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
        SearchLinkedList sl = new SearchLinkedList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<n;i++)
        {
            sl.push(i);
        }
        sl.print();
        System.out.println("Enter a value to Find: ");
        int s = sc.nextInt();
        if(sl.search(s))
        {
            System.out.print(s+" --> is present");
        }
        else{
            System.out.print("no");
        }
    }
}
