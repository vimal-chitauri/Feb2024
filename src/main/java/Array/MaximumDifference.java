package Array;

public class MaximumDifference {
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,-8,7,-1,2,3};

        maximumDifference(arr);
    }

    private static void maximumDifference(int[] arr) {
        int sum=arr[0];
        int res=0;
        for (int i = 1; i < arr.length; i++) {
            sum=Math.max(sum+arr[i],arr[i]);
            res=Math.max(sum,res);

        }
        System.out.println(res);
    }
}
