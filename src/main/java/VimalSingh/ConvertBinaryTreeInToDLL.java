package VimalSingh;
/*
Converting Binary Tree into DLL (DOUBLY LL)
Constraint:
    1. do not use extra m/m
    2. In Order Traversal
 */

public class ConvertBinaryTreeInToDLL {


    public static void main(String[] args) {
        TreeStructure treeStructure = new TreeStructure();
        BinaryNode node = treeStructure.treeStructure();
        convertInToDLL(node);
    }

    public static BinaryNode prev = null;
    public static BinaryNode head = null;


    public static BinaryNode convertInToDLL(BinaryNode root) {
        if (root == null) return null;
        head = convertInToDLL(root.left);
        if (prev == null) {
            head = root;
        } else {
            prev.right = root;
            root.left = prev;

        }
        prev = root;
        convertInToDLL(root.right);

        return root;
    }
}
