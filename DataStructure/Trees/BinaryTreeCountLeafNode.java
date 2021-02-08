import java.util.Scanner;

/**
 * BinaryTreeCountLeafNode
 */
public class BinaryTreeCountLeafNode {

    static class Node {
        int data;
        Node right, left;

        public Node(int data) {
            this.data = data;
        }
    }

    // main
    static Scanner sc = null;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node root = createTree();
        System.out.print("Number of leaf nodes -> "+ countLeaf(root));
    }

    // creation
    static Node createTree() {
        Node root = null;
        System.out.println("Enter data -> ");
        int data = sc.nextInt();
        if (data == -1)
            return null;
        root = new Node(data);
        System.out.println("Enter data  for left -> " + data);
        root.left = createTree();
        System.out.println("Enter data for right -> " + data);
        root.right = createTree();
        return root;
    }

    // number of leaf nodes
    static int countLeaf(Node root)
    {
        if(root == null)
            return 0;
        if(root.left == null && root.right == null)
        {
            return 1;
        }
        return countLeaf(root.left) + countLeaf(root.right);
    }
}