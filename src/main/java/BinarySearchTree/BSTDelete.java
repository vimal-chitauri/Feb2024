package BinarySearchTree;

public class BSTDelete {
    public static void main(String[] args) {
        TreeStructure treeStructure = new TreeStructure();
        BinarySearchTreeNode bst = treeStructure.treeStructure();
        int valueToDelete = 40;

        treeStructure.inorderTraversal(bst);
        deleteBST(bst, valueToDelete);
        System.out.println();
        treeStructure.inorderTraversal(bst);
    }

    private static BinarySearchTreeNode deleteBST(BinarySearchTreeNode root, int valueToDelete) {
        if (root == null) return null;

        if (root.key > valueToDelete)
            root.left=deleteBST(root.left, valueToDelete);
        else if (root.key < valueToDelete)
            root.right=deleteBST(root.right, valueToDelete);
        else {
            if (root.left == null) return root.right;

            else if (root.right == null) return root.left;

            else {
                BinarySearchTreeNode successor = getSuccessor(root);
                root.key=successor.key;
                root.right=deleteBST(root.right,successor.key);

            }

        }
        return root;
    }

    private static BinarySearchTreeNode getSuccessor(BinarySearchTreeNode root) {
        BinarySearchTreeNode curr = root.right;
        while (curr != null && curr.left != null)
            curr = curr.left;
        return curr;
    }
}
