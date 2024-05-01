package Array;

public class MaxSumArray {
    public static void main(String[] args) {
        int [] arr= new int[]{2,3,-8,7,-1,2,3};
        System.out.println(maxSumArray(arr));
       // System.out.println(maxSumArrayEfficient(arr));
    }

    private static int maxSumArray(int[] arr) {
        int res=arr[0];


        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = i; j < arr.length; j++) {
                sum=sum+arr[j];
                res=Math.max(sum,res);
            }
        }
        return res;
    }


}
