package Tree;

public class RecursiveTraversalOperation {
    public static void main(String[] args) {
        TreeStructure treeStructure = new TreeStructure();
        BinaryNode node=treeStructure.treeStructure();

        System.out.println("Traversal of tree");
        System.out.println("In Order Traversal");
        inorderTraversal(node);
        System.out.println("Pre Order Traversal");
        preOrderTraversal(node);
        System.out.println("Pre Order Traversal");
        postOrderTraversal(node);

        System.out.println("Size of a Tree");
        System.out.println(sizeOfBinaryTree(node));

        System.out.println("Maximum node in a tree");
        System.out.println(getMax(node));

        System.out.println("height of a tree");
        System.out.println(getHeight(node));
    }
    public static void inorderTraversal (BinaryNode root){

        if(root!=null){
            inorderTraversal(root.left);
            System.out.println(root.key);
            inorderTraversal(root.right);
        }
    }

    public static void preOrderTraversal(BinaryNode root){
        if(root!=null){
            System.out.println(root.key);
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }

    public static void postOrderTraversal(BinaryNode root){
        if (root!=null){
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.println(root.key);
        }
    }

    static int  sizeOfBinaryTree(BinaryNode root){
        if(root==null){
            return 0;
        }
        return 1+sizeOfBinaryTree(root.left)+sizeOfBinaryTree(root.right);
    }

    static int getMax(BinaryNode root){

        if(root==null)
            return 0;

        return Math.max(root.key, Math.max(getMax(root.left),getMax(root.right)));
    }

    public static int getHeight(BinaryNode root){
        if(root==null)
            return 0;
        /*if(root.left!=null){
            System.out.println(root.left.key);
        }
        if(root.right !=null){
            System.out.println(root.right.key);
        }*/
        return 1+ Math.max(getHeight(root.left),getHeight(root.right));
    }

}
