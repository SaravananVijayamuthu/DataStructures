import java.util.Scanner;

/**
 * BinaryTreeIdentical
 */
public class BinaryTreeIdentical {

    static class Node {
        int data;
        Node right, left;
        Node(int data){
            this.data = data;
        }
    }

    // creation
    static Node createTree1() {
        Node root = null;
        System.out.println("Enter data for First Tree-> ");
        int data = sc.nextInt();
        if (data == -1)
            return null;
        root = new Node(data);
        System.out.println("Enter data for left -> " + data);
        root.left = createTree1();
        System.out.println("Enter data for right -> " + data);
        root.right = createTree1();
        return root;
    }

    // creation 1
    static Node createTree2() {
        Node root1 = null;
        System.out.println("Enter data for Second tree-> ");
        int data1 = sc.nextInt();
        if (data1 == -1)
            return null;
        root1 = new Node(data1);
        System.out.println("Enter data for left -> " + data1);
        root1.left = createTree2();
        System.out.println("Enter data for right -> " + data1);
        root1.right = createTree2();
        return root1;
    }
    // identical
    static boolean Identical(Node root1, Node root2)
    {
        if(root1 == null && root2 == null)
        {
            return true;
        }
        return (root1 !=null && root2 != null) &&(root1.data == root2.data) 
        && Identical(root1.left, root2.left) && Identical(root1.right, root2.right);
    }
    // main
    static Scanner sc = null;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node root = createTree1();
        Node root1 = createTree2();
        if(Identical(root, root1)){
            System.out.println("Identical");
        }else{
            System.out.println("Not Identical");
        }
    }
}