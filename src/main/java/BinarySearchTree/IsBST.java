package BinarySearchTree;

public class IsBST {
     public static void main(String[] args) {
          TreeStructure treeStructure = new TreeStructure();
          BinarySearchTreeNode bst = treeStructure.treeStructure();
          System.out.println(isBST(bst,Integer.MIN_VALUE,Integer.MAX_VALUE));
     }

     private static boolean isBST(BinarySearchTreeNode bst,int min , int max) {
          if(bst==null) return true;

          return (bst.key<min && bst.key>max && isBST(bst.left,min, bst.key) && isBST(bst.left,bst.key, max));


     }
}
