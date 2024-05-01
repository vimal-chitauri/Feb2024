package StriverArray.NextPermutation;

import java.util.Arrays;

public class NextPermutationUsingWhileLoop {
    public static void main(String[] args) {
        int[] arr= new int[]{1,2};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void nextPermutation(int[] arr) {
        // 1,1,5,4,1
        int i=arr.length-2;
        while(i>=0 && arr[i] >= arr[i+1]){
            i--;
        }
        if(i>=0){
            int j=arr.length-1;
            while(j>=0 && arr[j] <= arr[i])j--;
            swap(arr,i,j);
        }

        reverse(arr, i+1);
    }

    public static void swap(int[] arr, int i, int j){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }

    public static void reverse(int[] arr, int i){
        int start=i;
        int end=arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}
