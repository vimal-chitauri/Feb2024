package Recursion;

public class CountSubsetSum {
    public static void main(String[] args) {
        int[] arr= new int[]{10,20,15};
        System.out.println(countSubsetSum(arr,3,9));
     //   System.out.println(countSubsetSum1(arr,5,8));

    }

    private static int countSubsetSum1(int[] arr, int n, int sum) {
        if(n==0)
            return sum;

        return sum+countSubsetSum1(arr,n-1,sum);
    }

    private static int countSubsetSum(int[] arr, int n, int sum) {
        if(n==0)
            return (sum==0)?1:0;

        return countSubsetSum(arr,n-1,sum)+countSubsetSum(arr,n-1,sum-arr[n-1]);
    }
}
