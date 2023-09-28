package Trees.BinarySearchtree;

public class StarterPoint {
    
   public static void main(String[] args) {
     BinarySearchtree bst=new BinarySearchtree(70);
    bst.insert(bst.root, 60);
    bst.insert(bst.root, 90);
    bst.insert(bst.root, 50);
    bst.insert(bst.root, 65);
    bst.insert(bst.root, 80);
    bst.insert(bst.root, 100);
        bst.traversel(bst.root);

   }
}
