import java.util.Scanner;

/**
 * BinaryTreeHeight
 */
public class BinaryTreeHeight {
    static Scanner sc = null;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node root = createTree();
        System.out.println("Height of Tree -> " + Height(root));
    }
    static Node createTree() {
        Node root = null;
        System.out.println("Enter data -> ");
        int data = sc.nextInt();
        if(data == -1)
            return null;
        root = new Node(data);
        System.out.println("Enter for left data -> " + data);
        root.left = createTree();
        System.out.println("Enter for right data -> " + data);
        root.right = createTree();
        return root;
    }
    static int Height(Node root){
        if(root == null)
            return 0;
        return 1 + Math.max(Height(root.left), Height(root.right));
    }
}
class Node{
    int data;
    Node right, left;
    public Node(int data)
    {
        this.data = data;
    }
}