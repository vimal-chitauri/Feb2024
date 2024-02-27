package BinarySearchTree;

import java.util.TreeSet;

public class LeftCeiling {
    public static void main(String[] args) {
        int[] input = {2, 8, 30, 15, 25, 12};
        int[] output = new int[input.length];

        output[0] = -1;
        for (int i = 1; i < input.length; i++) {
            int res = Integer.MAX_VALUE;
            for (int j = 0; j <= i; j++) {
                if (input[j] > input[i])
                    res = Math.min(res, input[j] - input[i]);
            }
            if (res == Integer.MAX_VALUE) {
                output[i] = -1;
            } else {
                output[i] = input[i] + res;
            }
        }


        for (int no : output) {
            System.out.println(no);
        }
        int[] efficientOutput=efficientSol(input);
        for (int no : efficientOutput) {
            System.out.println(no);
        }
    }

    public static int[] efficientSol(int[] input) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        int[] output= new int[input.length];
        treeSet.add(input[0]);
        output[0]=-1;
        for (int i = 1; i < input.length; i++) {
            Integer ceiling = treeSet.ceiling(input[i]);
            if (ceiling != null) {
                output[i] = ceiling;
            } else {
                output[i] = -1;
            }
            treeSet.add(input[i]);
        }
        return output;
    }


}


