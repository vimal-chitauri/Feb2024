package BinarySearchTree;

public class SwapTwoNode {
    public static void main(String[] args) {
        Integer first = null;
        Integer second = null;
        int prev = Integer.MIN_VALUE;
        int[] arr = {4, 60, 10, 20, 8, 80, 100};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < prev) {
                if (first == null) {
                    first = prev;
                }
                second = arr[i];
            }
            prev = arr[i];


        }

        System.out.println(first);
        System.out.println(second);
    }


}
