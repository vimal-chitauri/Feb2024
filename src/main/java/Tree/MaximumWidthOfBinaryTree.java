package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumWidthOfBinaryTree {
    public static void main(String[] args) {
        TreeStructure treeStructure=  new TreeStructure();
        BinaryNode node=treeStructure.treeStructure();
        System.out.println(maximumWidthOfBinaryTree(node));

    }

    public static int maximumWidthOfBinaryTree(BinaryNode node){
        Queue<BinaryNode> queue = new LinkedList<>();
        BinaryNode curr= node;
        int maxWidth;
        if(curr!=null)
            maxWidth=0;
        else
            return 0;

        queue.add(curr);
        queue.add(null);
        while (queue.size()>1){
            int tempCount=queue.size();
            curr=queue.poll();
            if(curr==null){
                tempCount++;
                if (maxWidth<=tempCount)
                    maxWidth=tempCount;
                queue.add(null);
                continue;
            }

            if(curr.left!=null)
                queue.add(curr.left);
            if(curr.right!=null)
                queue.add(curr.right);
        }
        return maxWidth;
    }
}
