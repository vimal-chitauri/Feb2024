package BinarySearchTree;

import com.sun.source.tree.Tree;

public class BinaryTreeBasicOperation {

    public static void main(String[] args) {
        TreeStructure treeStructure = new TreeStructure();
        BinarySearchTreeNode bst = treeStructure.treeStructure();
        int valueToSearch = 80;

        /*
        Search in Binary Search Tree Recursively
         */
        System.out.println(searchInBSTRecursively(bst, valueToSearch));

        /*
        Search In Binary Search Tree Iteratively
         */
        System.out.println();
        System.out.println(searchInBSTIterative(bst, valueToSearch));

        /*
        insert element in Binary Search Tree iteratively
         */
        int elementInserted = 10;
        BinarySearchTreeNode node=insertInBinarySearchTree(bst, elementInserted);
       // printBinarySearchTree(node);

    }

    private static BinarySearchTreeNode insertInBinarySearchTree(BinarySearchTreeNode bst, int elementInserted) {
        BinarySearchTreeNode curr = bst;
        while (curr != null) {
            if (curr == null) return new BinarySearchTreeNode(elementInserted);

            if (curr.key < elementInserted && curr.right != null)
                curr = curr.right;
            else if (curr.key > elementInserted && curr.left != null)
                curr = curr.left;
            else {
                return curr;
            }
            if (curr.key < elementInserted)
                curr.right = new BinarySearchTreeNode(elementInserted);
            if (curr.key > elementInserted)
                curr.left = new BinarySearchTreeNode(elementInserted);
        }
        return curr;
    }

    public static boolean searchInBSTRecursively(BinarySearchTreeNode root, int searchValue) {
        if (root == null) return false;

        if (root.key == searchValue) return true;

        if (root.key < searchValue) {
            return searchInBSTRecursively(root.right, searchValue);
        }
        return searchInBSTRecursively(root.left, searchValue);

    }

    public static boolean searchInBSTIterative(BinarySearchTreeNode root, int searchValue) {
        if (root == null) return false;
        while (root != null) {
            if (root.key == searchValue) return true;
            if (root.key < searchValue && root.right != null)
                root = root.right;
            else if (root.key > searchValue && root.left != null)
                root = root.left;
            else {
                root = null;
            }
        }
        return false;
    }

    public static void printBinarySearchTree(BinarySearchTreeNode root) {
        if (root == null) return;
        System.out.println(root.key);
        while (root != null) {

            if(root.left!=null){
                System.out.println("/");
                System.out.println(root.left.key +"");
                root= root.right;
            }else if(root.right!=null){
                System.out.println("'\'");
                System.out.println(root.right.key +"");
                root = root.left;
            }

        }
    }

}
