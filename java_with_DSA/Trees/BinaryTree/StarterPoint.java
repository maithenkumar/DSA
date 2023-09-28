package Trees.BinaryTree;

public class StarterPoint {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree(10);
        bt.insertLeft(bt.root, 5);
        bt.insertRight(bt.root, 4);
        bt.insertLeft(bt.root.left, 9);
        bt.insertRight(bt.root.left, 6);
        bt.insertLeft(bt.root.right, 1);
        bt.insertRight(bt.root.right, 2);
        bt.preOrder(bt.root);
        System.out.println();
        bt.inOrder(bt.root);
        System.out.println();
        bt.postOrder(bt.root);
    }
}
