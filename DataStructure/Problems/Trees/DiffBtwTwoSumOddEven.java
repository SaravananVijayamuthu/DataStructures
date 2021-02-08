import java.util.Scanner;

/*DiffBtwTwoSumOddEven
Find the difference between sum of all nodes present at odd and even levels in a binary tree
                  1
                /   \
               /     \
              2       3
             /      /  \
            /      /    \
           4      5      6
                 / \
                /   \
               7     8
*/
public class DiffBtwTwoSumOddEven {

    static class Node {
        int data;
        Node right, left;

        public Node(int data) {
            this.data = data;
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
        System.out.println("Enter data for left -> " + root.data);
        root.left = createTree();
        System.out.println("Enter data for right -> " + root.data);
        root.right = createTree();
        return root;
    }

    // Find diff
    static int findDiff(Node root, int diff, int level) {
        if (root == null)
            return diff;
        if (level % 2 == 1) {
            diff = diff + root.data;
        } else {
            diff = diff - root.data;
        }
        diff = findDiff(root.left, diff, level + 1);
        diff = findDiff(root.right, diff, level + 1);
        return diff;
    }

    static int findDiff(Node root) {
        return findDiff(root, 0, 1);
    }

    // main
    static Scanner sc = null;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node root = createTree();
        System.out.print(findDiff(root));
    }
}