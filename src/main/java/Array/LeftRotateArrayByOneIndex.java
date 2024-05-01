package Array;

import java.util.Arrays;

public class LeftRotateArrayByOneIndex {
    public static void main(String[] args) {
        int[] arr = new int[]{10,20,0,30,0,0,90};
        leftRotate(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void leftRotate(int[] arr) {
        int temp=arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;

    }
}
