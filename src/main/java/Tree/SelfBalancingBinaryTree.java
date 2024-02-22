package Tree;

public class SelfBalancingBinaryTree {

    public static void main(String[] args) {
       TreeStructure treeStructure= new TreeStructure();
        BinaryNode nodeFalse = treeStructure.treeStructure();
        System.out.println(selfBalancingBinayTree(nodeFalse));

        /*
        Another test Case Data set
         */
        BinaryNode node = new BinaryNode(20);
        node.left= new BinaryNode(40);
        node.right= new BinaryNode(50);
        node.right.left= new BinaryNode(70);
        node.right.right = new BinaryNode(80);
        System.out.println(selfBalancingBinayTree(node));
    }
    public static boolean selfBalancingBinayTree(BinaryNode node){
        if(node==null) return true;


        int lh=0;
        int rh=0;
        if(node.left!=null)
            lh= getHeight(node.left);
        if(node.right!=null)
            rh= getHeight(node.right);

        return ((lh-rh<=0)&& selfBalancingBinayTree(node.left) && selfBalancingBinayTree(node.right));
    }

    public static int getHeight(BinaryNode node){

        if(node==null){
            return 0;
        }

        return 1+getHeight(node.left)+getHeight(node.right);
    }

}
