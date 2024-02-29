package BinarySearchTree;

import java.util.ArrayList;
import java.util.TreeMap;

public class VerticalNodeSumOfBST {
    public static void main(String[] args) {
        TreeStructure treeStructure = new TreeStructure();
        BinarySearchTreeNode bst = treeStructure.treeStructure();
        /*
        not correct
         */
        // iterativeVerticalNodeSumOfBST(bst);
        /*
        recursive Approach
         */
        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        recursiveVerticalNodeSumOfBST(bst,0,treeMap);
        System.out.println(treeMap);



    }

    private static TreeMap iterativeVerticalNodeSumOfBST(BinarySearchTreeNode bst) {

        int leftIndex=0,rightIndex=0;
        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        BinarySearchTreeNode curr = bst;
        while (curr != null) {
            if (curr == null) return null;
            if (curr.left != null) {
                curr = curr.left;
                if (treeMap.containsKey(leftIndex)) {
                    treeMap.put(leftIndex--, treeMap.get(leftIndex)+curr.key);
                }else{
                    treeMap.put(leftIndex--, curr.key);
                }
            }
            else if (curr.right != null) {
                curr = curr.right;
                if (treeMap.containsKey(rightIndex)) {
                    treeMap.put(rightIndex++, treeMap.get(rightIndex)+curr.key);
                }else{
                    treeMap.put(rightIndex++, curr.key);
                }
            }

        }
        return treeMap;
    }

    private static void recursiveVerticalNodeSumOfBST(BinarySearchTreeNode bst,int height, TreeMap<Integer,Integer> map) {
        if(bst==null)
            return;

        recursiveVerticalNodeSumOfBST(bst.left,height-1,map);
        Integer value = map.get(height);
        int verticalSum = (value != null ? value : 0);
        map.put(height,verticalSum+bst.key);
        recursiveVerticalNodeSumOfBST(bst.right,height+1,map);

    }
}
