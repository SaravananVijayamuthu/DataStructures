import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * BinaryTreeInsert
 */
public class BinaryTreeInsert {
    static class Node{
        String data;
        Node right, left;
        public Node(String data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static Scanner sc = null;
    static Node root = null;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        // Node root = createTree();
        String s = sc.nextLine();
        String arr[] = s.split(" ");
        for(int i=0; i< arr.length; i++)
        {
            insert(root, arr[i]);
        }
        preorder(root);
    }

    static void insert(Node temp, String s){
        if(temp == null)
        {
            root = new Node(s);
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(temp);
        while(!q.isEmpty()){
            temp = q.peek(); //last ele
            q.remove();
            if(temp.data.equals("N")){
                continue;
            }
            if(temp.left == null){
                temp.left = new Node(s);
                break;
            }else{
                q.add(temp.left);
            }
            if(temp.right == null){
                temp.right = new Node(s);
                break;
            }else{
                q.add(temp.right);
            }
        }
    }
    static void preorder(Node temp) { //Left -> root -> right [preorder] || root -> left -> right [inorder] || right -> left -> root [postorder]  
        if (temp == null)
            return;
        preorder(temp.left);
        System.out.println(temp.data);
        preorder(temp.right);
    }
    // static Node createTree(){
    //     Node root = null;
    //     System.out.println("Enter data -> ");
    //     int data = sc.nextInt();
    //     if(data == -1)
    //         return null;
    //     root = new Node(data);
    //     System.out.println("Enter left for "+ data);
    //     root.left = createTree();
    //     System.out.println("Enter right for "+ data);
    //     root.right = createTree();
    //     return root;
    // }
}
