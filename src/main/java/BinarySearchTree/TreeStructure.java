package BinarySearchTree;

import BinarySearchTree.BinarySearchTreeNode;

public class TreeStructure {

    public BinarySearchTreeNode treeStructure(){
        BinarySearchTreeNode node = new BinarySearchTreeNode(20);
        //left tree structure
        node.left = new BinarySearchTreeNode(15);
        node.left.left= new BinarySearchTreeNode(12);
        node.left.right= new BinarySearchTreeNode(18);
        node.left.left.left= new BinarySearchTreeNode(7);
       // node.left.right.right = new BinarySearchTreeNode(80);
        //right tree structure
        node.right = new BinarySearchTreeNode(30);
        node.right.right= new BinarySearchTreeNode(40);
        node.right.right.left= new BinarySearchTreeNode(35);
        node.right.right.right= new BinarySearchTreeNode(50);
        node.right.right.right.right= new BinarySearchTreeNode(80);
        return node;
    }

    public BinarySearchTreeNode treeStructureTest2(){
        BinarySearchTreeNode node = new BinarySearchTreeNode(10);
        //left tree structure
        node.left = new BinarySearchTreeNode(20);
        node.right= new BinarySearchTreeNode(30);
        node.right.left= new BinarySearchTreeNode(40);
        node.right.left.left= new BinarySearchTreeNode(50);
        node.right.right= new BinarySearchTreeNode(60);
        node.right.right.right = new BinarySearchTreeNode(70);
        return node;
    }

    public static void inorderTraversal (BinarySearchTreeNode root){

        if(root!=null){
            inorderTraversal(root.left);
            System.out.println(root.key);
            inorderTraversal(root.right);
        }
    }


}
