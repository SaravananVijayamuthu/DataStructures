package DataStructure.SinglyLinkedList;

import java.util.Scanner;

public class NthReverseLinkedList {
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
        n.next=newdata;
        return;
    }

    // reverse
    public void reverseFind(int key) {
        Node temp = head;
        int count = 0;
        while(temp!=null)
        {
            temp=temp.next;
            count++;
        }
        if(count<key)
            return;
        temp = head;

        for(int i=1;i<count-key+1;i++)
        {
            temp = temp.next;
            System.out.print(temp.data);
        }
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
        NthReverseLinkedList re = new NthReverseLinkedList();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1;i<num;i++)
        {
            re.push(i);
        }
        re.print();
        System.out.print("Element --> ");
        int f = sc.nextInt();
        re.reverseFind(f);
    }

	public String nth(int ind) {
		return null;
	}
}
