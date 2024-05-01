package Array;

import java.util.Arrays;

public class LeftRotateArrayByDIndex {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30, 40, 50};
        int[] tempArray = leftRotateByD(arr, 3);
        Arrays.stream(tempArray).forEach(System.out::println);
    }

    private static int[] leftRotateByD(int[] arr, int d) {
        int size = arr.length - 1;
        int[] tempArray = new int[size + 1];
        for (int i = 0; i < d; i++) {
            if ((d + i + 1) <= size)
                tempArray[d + i + 1] = arr[i];
        }
        for (int i = 0; i <= size; i++) {
            if ((size - d + i) <= size)
                tempArray[i] = arr[size - d + i];
            // arr[i] = arr[size - i];


        }
        return tempArray;
    }
}
