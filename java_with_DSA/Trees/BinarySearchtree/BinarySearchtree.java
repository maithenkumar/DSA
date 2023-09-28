package Trees.BinarySearchtree;

public class BinarySearchtree {
    Node root;

    class Node {
        int data;
        Node left, right;

        Node(int val) {
            data = val;
            left = right = null;

        }

    }

    BinarySearchtree(int val) {

        root = new Node(val);
    }

    BinarySearchtree() {
        root = null;
    }

    public Node insert(Node root, int val) {

        if (root == null) {

            return new Node(val);
        }
        if (val < root.data) {
            root.left = insert(root.left, val);

        }
        if (val > root.data) {
            root.right = insert(root.right, val);

        }
        return root;
    }

    public void traversel(Node r) {
        if (r == null) {
            return;

        }
        traversel(r.left);
        System.out.print(r.data + " ");
        traversel(r.right);
    }

    public void search(Node r, int val) {

    }
}
