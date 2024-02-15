package VimalSingh;

import javax.sound.midi.Soundbank;

public class BinaryTreeBasic {
    public static void main(String[] args) {
        BinaryNode node = new BinaryNode(10);
        //left tree structure
        node.left = new BinaryNode(20);
        node.left.left= new BinaryNode(40);
        node.left.right= new BinaryNode(50);
        node.left.right.left= new BinaryNode(70);
        node.left.right.right = new BinaryNode(80);
        //right tree structure
        node.right = new BinaryNode(30);
        node.right.right= new BinaryNode(60);

        System.out.println("Traversal of tree");
        System.out.println("In Order Traversal");
        inorderTraversal(node);
        System.out.println("Pre Order Traversal");
        preOrderTraversal(node);
        System.out.println("Pre Order Traversal");
        postOrderTraversal(node);

        System.out.println("Size of a Tree");
        System.out.println(sizeOfBinaryTree(node));
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

}
