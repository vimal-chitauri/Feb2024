package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class PrintLeftLevel {
    public static void main(String[] args) {
        TreeStructure treeStructure = new TreeStructure();
        BinaryNode node=treeStructure.treeStructure();

        printLeftLevel(node,1);
        System.out.println("method 2");
        printLeftLevelTreeMethod2(node);
    }

    static int maxLevel=0;
    public static void printLeftLevel(BinaryNode node, int level) {
        if(node==null) return;

        if(maxLevel<level){
            System.out.println(node.key);
            maxLevel=level;
        }

        printLeftLevel(node.left,level+1);
        printLeftLevel(node.right,level+1);
    }

    static void printLeftLevelTreeMethod2(BinaryNode node){

        Queue<BinaryNode> queue = new LinkedList<>();
        BinaryNode curr= node;
        queue.add(curr);
        while (queue.isEmpty()==false){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                curr= queue.poll();
                if(i==0)
                    System.out.println(curr.key);

                if(curr.left!=null) queue.add(curr.left);
                if(curr.right!=null) queue.add(curr.right);
            }
        }


    }
}
