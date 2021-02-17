import java.util.Scanner;

/**
 * PerfectBinaryTree
 */
public class PerfectBinaryTree {

static class Node {
    int data;
    Node right, left;
    public Node(int data) {
        data = this.data;
    }
}

// creation
static Node createTree() {
    Node root = null;
    System.out.print("Enter data -> ");
    int data = sc.nextInt();
    if (data == -1)
        return null;
    root = new Node(data);
    System.out.print("Enter data for left -> " + data);
    root.left = createTree();
    System.out.print("Enter data for right -> " + data);
    root.right = createTree();
    return root;
}

// depth
static int depth(Node root) {
    int d = 0;
    while (root != null) {
        d++;
        root = root.left;
    }
    return d;
}

// perfect
static int isPerfectRec(Node root, int d, int level) {
    if (root == null) {
        return 1;
    }
    if (root.left == null && root.right == null) {
        if (d == level + 1) {
            return 1;
        }
    }
    if (root.left == null || root.right == null) {
        return 0;
    }
    return isPerfectRec(root.left, d, level + 1) & isPerfectRec(root.right, d, level + 1);
}

// isPerfect
static int isPerfect(Node root) {
    int d = depth(root);
    return isPerfectRec(root, d, 0);
}

// main
static Scanner sc = null;

public static void main(String[] args) {
    sc = new Scanner(System.in);
    Node root = createTree();
    if isPerfect(root){
        System.out.println("Yes");
    }else{
        System.out.println("No");
    }
}
}