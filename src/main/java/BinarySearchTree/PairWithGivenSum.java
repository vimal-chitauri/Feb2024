package BinarySearchTree;

import java.util.ArrayList;
import java.util.HashSet;

public class PairWithGivenSum {
    public static void main(String[] args) {
        TreeStructure treeStructure = new TreeStructure();
        BinarySearchTreeNode bst = treeStructure.treeStructure();
        /*
        Time Complexity for this approach is Theta(n)
         */
        ArrayList<Integer> arr = new ArrayList<>();
        pairWithGivenSum(bst, arr);
        /*for (int j = 0; j < arr.size(); j++) {
            System.out.println(arr.get(j));
        }*/
        System.out.println(findPairWithGivenSum(arr, 50));

        /*
        Efficient Approach Use Hashing i.e Hashset
        it offers constant-time average-case complexity for
        insertion and lookup operations, making the overall time complexity of the solution O(n)
         */
        HashSet<Integer> hashset = new HashSet<>();
        System.out.println(pairWithGivenSumEfficientlt(bst, 50, hashset));

    }

    private static boolean pairWithGivenSumEfficientlt(BinarySearchTreeNode bst, int sum,
                                                    HashSet<Integer> hashset) {
        if(bst==null) return false;

        pairWithGivenSumEfficientlt(bst.left,sum,hashset);
        if(hashset.contains(sum-bst.key)){
            return true;
        }else{
            hashset.add(bst.key);
        }
        return pairWithGivenSumEfficientlt(bst.right,sum,hashset);
    }


    static int i = 0;

    private static void pairWithGivenSum(BinarySearchTreeNode bst, ArrayList<Integer> arr) {
        if (bst == null) return;
        pairWithGivenSum(bst.left, arr);
        arr.add(bst.key);
        pairWithGivenSum(bst.right, arr);

    }

    static boolean findPairWithGivenSum(ArrayList<Integer> arr, int sum) {
        int left = 0;
        int right = arr.size() - 1;
        while (left < right) {
            int tempSum = arr.get(left) + arr.get(right);
            if (tempSum == sum) {
                return true;
            } else if (tempSum < sum) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }


}
