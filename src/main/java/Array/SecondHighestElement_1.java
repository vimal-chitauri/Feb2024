package Array;

public class SecondHighestElement_1 {
    public static void main(String[] args) {

        int[] arr = new int[]{10, 20, 3, 40, 50};
        int size = arr.length;
      //  System.out.println(arr.length);
       // System.out.println(arr[3]);
        System.out.println(NaiveApproachSecondHighest(arr, size)); //check once
        System.out.println(effSolSecondHighest(arr,size));

    }

    private static int NaiveApproachSecondHighest(int[] arr, int size) {
        ArrayBasicOperation arrayBasicOperation = new ArrayBasicOperation();
        int first_Highest = arrayBasicOperation.getLargest(arr, size);
        int secondHighest = -1;
        for (int i = 0; i < size-1; i++) {
            if (arr[i] != arr[first_Highest]) {
                if (secondHighest == -1) {
                    secondHighest = i;
                }
            }
            if (arr[i] > arr[secondHighest]) {
                secondHighest = i;
            }

        }
        return secondHighest;
    }

    public static int effSolSecondHighest(int[] arr, int size) {

        int res = -1;
        int largest = 0;
        for (int i = 1; i < size; i++) {
            if (arr[i] > arr[largest]) {
                res = largest;
                largest = i;
            }else if(arr[i]!=arr[largest]){
                if(res==-1 || arr[i]<arr[largest]){
                    res=i;
                }
            }
        }
        return res;
    }


}
