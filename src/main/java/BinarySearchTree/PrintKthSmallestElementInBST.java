package BinarySearchTree;

public class PrintKthSmallestElementInBST {
    public static void main(String[] args) {
        TreeStructure treeStructure = new TreeStructure();
        BinarySearchTreeNode bst = treeStructure.treeStructure();
        BinarySearchTreeNode bst1 = printKthSmallest(bst, 3);
        System.out.println(bst1.key);
    }

    static int count = 0;

    private static BinarySearchTreeNode printKthSmallest(BinarySearchTreeNode bst, int index) {
        if (bst == null) return null;
        printKthSmallest(bst.left, index);
        count++;
        if (count == index)
            return bst;

        return printKthSmallest(bst.right, index);

    }


}
