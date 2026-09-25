import java.util.*;
public class day12_trees {
    public static void main(String[] args) {
        Tree t = new Tree();
        Node root = new Node(10);
        
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.right.left = new Node(50);
        root.right.right = new Node(60);

        t.postorder(root);
        System.out.println("Height of the tree: " + t.height(root));
        System.out.println("Size of the tree: " + t.size(root));

        t.printkdis(root, 2);

        t.levelorder(root, 3);
    }
}
