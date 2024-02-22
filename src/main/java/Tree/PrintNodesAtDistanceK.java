package Tree;

public class PrintNodesAtDistanceK {
    public static void main(String[] args) {
        TreeStructure treeStructure = new TreeStructure();
        BinaryNode node=treeStructure.treeStructure();

        pintNodesAtDistanceK(node,2);

    }

    private static int pintNodesAtDistanceK(BinaryNode node, int i) {
        if(node==null)
            return 0;
        if(i==0){
            System.out.println(node.key);
            return node.key;
        }

        else{
            if(node.left!=null){
                return pintNodesAtDistanceK(node.left,i-1);
            }
            if(node.right!=null){
                return pintNodesAtDistanceK(node.right,i-1);
            }
        }

        return i;
    }
}
