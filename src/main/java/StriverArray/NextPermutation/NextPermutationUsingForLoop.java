package StriverArray.NextPermutation;

import java.util.Arrays;

public class NextPermutationUsingForLoop {
    public static void main(String[] args) {
        int[] arr = new int[]{1,5,1};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void nextPermutation(int[] arr) {
        int breakPoint;
        int largest;
        for (breakPoint=arr.length-2; breakPoint >= 0; breakPoint--) {
            if(arr[breakPoint]<arr[breakPoint+1])
                break;
        }

        if(breakPoint>=0){
            for (largest = arr.length-1; largest > 0; largest--) {
                  if(arr[largest]>arr[breakPoint]){
                      swap(arr,breakPoint,largest);
                  }
            }
        }
        reverse(arr,breakPoint+1);

    }

    private static void swap(int[] arr, int start, int end){
        int tmp=arr[start];
        arr[start]=arr[end];
        arr[end]=tmp;
    }

    private static void reverse(int[] arr, int start){
        int end=arr.length-1;
        while (start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }



}
