package Tree;

/*
we need to calculate the sum of every child node is equal to their node i.e parent Node.
 */
public class ChildrenSum {

    public static void main(String[] args) {
        TreeStructure treeStructure = new TreeStructure();
        BinaryNode node =treeStructure.treeStructure();
        System.out.println(childrenSumIsTrue(node));
    }

    private static boolean childrenSumIsTrue(BinaryNode node) {
        int sum=0;
        if(node==null)
            return true;
        if(node.left==null && node.right==null)
            return true;
        if(node.left!=null)
            sum=sum+node.left.key;
        if(node.right!=null)
            sum=sum+node.right.key;

        return (sum==node.key && (!childrenSumIsTrue(node.left) && !childrenSumIsTrue(node.right)));
    }
}
