package Tree;

import java.util.Stack;

public class IterativeBinayTreeBasicOperation {

    public static void main(String[] args) {
        TreeStructure treeStructure = new TreeStructure();
        BinaryNode node=treeStructure.treeStructure();

        System.out.println("Traversal of tree");
        System.out.println("In Order Traversal");
        iterativeInOrderTraversal(node);
        System.out.println("Pre Order Traversal");
        iterativePreOrderTraversal(node);
        System.out.println("post Order Traversal");
        iterativePostOrderTraversal(node);
    }

    private static void iterativeInOrderTraversal(BinaryNode node) {
        Stack<BinaryNode> stack = new Stack<>();
        BinaryNode curr = node;

        while (curr!=null || !stack.isEmpty()) {

            while (curr!=null){
                stack.push(curr);
                curr= curr.left;
            }

            curr = stack.pop();
            System.out.println(curr.key);
            curr = curr.right;
        }
    }

    private static void iterativePreOrderTraversal(BinaryNode node) {
        Stack<BinaryNode> stack = new Stack<>();
        BinaryNode curr = node;

        while (curr!=null || !stack.isEmpty()) {
                while(curr!=null){
                    stack.push(curr);
                    System.out.println(curr.key);
                    curr= curr.left;
                }
            curr = stack.pop();
            curr = curr.right;
        }

    }

    //not completed
    private static void iterativePostOrderTraversal(BinaryNode node) {
        Stack<BinaryNode> stack = new Stack<>();
        BinaryNode curr = node;

        while (curr!=null || !stack.isEmpty()) {
            while(curr!=null){
                stack.push(curr);
                curr= curr.left;
            }
            curr = stack.pop();
          //  curr=curr.right;
            System.out.println(curr.key);

        }

    }


}
