package Tree;

public class TreeStructure {

    public BinaryNode treeStructure(){
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
        return node;
    }

    public BinaryNode treeStructureTest2(){
        BinaryNode node = new BinaryNode(10);
        //left tree structure
        node.left = new BinaryNode(20);
        node.right= new BinaryNode(30);
        node.right.left= new BinaryNode(40);
        node.right.left.left= new BinaryNode(50);
        node.right.right= new BinaryNode(60);
        node.right.right.right = new BinaryNode(70);
        return node;
    }



}
