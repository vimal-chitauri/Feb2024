package Array;

public class MaxEvenOdd {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 12, 14, 7, 8};

        maximumEvenOdd(arr);
    }

    private static void maximumEvenOdd(int[] arr) {

        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if((arr[j]%2==0 && arr[j-1]%2!=0) || (arr[j]%2!=0 && arr[j-1]%2==0)){
                    count++;
                }else{
                    break;
                }
            }
            res=Math.max(res,count);
        }
        System.out.println(res);
    }

}
