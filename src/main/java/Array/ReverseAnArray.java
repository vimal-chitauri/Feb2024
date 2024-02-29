package Array;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {

        int[] arr = new int[]{10, 20, 3, 40, 50};

        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            i++;
            j--;
        }

        Arrays.stream(arr).forEach(System.out::println);
    }

}
