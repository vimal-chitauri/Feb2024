package Tree;

public class DiameterInBinartTree {

    public static void main(String[] args) {
        TreeStructure treeStructure = new TreeStructure();
        BinaryNode node = treeStructure.treeStructureTest2();
        int n = diameterInBinaryTree(node);
        System.out.println(n);


    }
   // static int res=0;
    private static int diameterInBinaryTree(BinaryNode node) {

        if (node == null) return 0;
        int root= 1+BinaryTreeBasic.getHeight(node.left)+BinaryTreeBasic.getHeight(node.left);
        int lh = diameterInBinaryTree(node.left);
        int rh = diameterInBinaryTree(node.right);

        return Math.max(root, Math.max(lh,rh));
       // return res;
    }


}
