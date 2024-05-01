package Array;

import java.util.Stack;

public class LeaderInAnArray {
    public static void main(String[] args) {
        // int[] arr = new int[]{10, 20, 30, 40, 50};
        int[] arr = new int[]{7, 10, 4, 3, 6, 5, 2};
        leaderInAnArray(arr);
        //  Arrays.stream(arrayNew).forEach(System.out::println);
    }

    private static void leaderInAnArray(int[] arr) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(arr[arr.length - 1]);
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] > stack.peek()) {
                stack.push(arr[i]);
            }
        }
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }

    }

    public static void practice(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[arr.length - 1]);

        for (int i = arr.length - 2; i > 0; i--) {
            if (arr[i] > stack.peek()) {
                stack.push(arr[i]);
            }
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
