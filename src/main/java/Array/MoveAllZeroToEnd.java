package Array;

import java.util.Arrays;

public class MoveAllZeroToEnd {
    public static void main(String[] args) {
         int[] arr = new int[]{10,20,0,30,0,0,90};
      //  inEffSol(arr, arr.length);
     //   Arrays.stream(arr).forEach(System.out::println);

      //  effSolMoveAllZeroToEnd(arr,arr.length);
      //  Arrays.stream(arr).forEach(System.out::println);

        //AnotherEfficientSolution
        SecondWayeffSolMoveAllZeroToEnd(arr,arr.length);
        Arrays.stream(arr).forEach(System.out::println);

    }

    private static void SecondWayeffSolMoveAllZeroToEnd(int[] arr, int length) {

        int count=0;
        for (int i = 0; i < length; i++) {

            if(arr[i]!=0){
                int temp=arr[count];
                arr[count]=arr[i];
                arr[i]=temp;
                count++;
            }

        }
    }

    private static void effSolMoveAllZeroToEnd(int[] arr, int length) {
        int i=0;
        int j=length-1;
        while (i<j){
            if(arr[i]!=0){
                i++;
            }else{
                if(arr[j]==0){
                    j--;
                }else{
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                    i++;
                    j--;
                }
            }
        }
    }

    private static void inEffSol(int[] arr, int length) {
        for (int i = 0; i < length; i++) {
            if(arr[i]==0){
                for (int j = i+1; j < length; j++) {
                    if(arr[j]!=0){
                        //Swapping
                        int temp=arr[j];
                        arr[j]=arr[i];
                        arr[i]=temp;

                    }
                }
            }
        }
    }


}
